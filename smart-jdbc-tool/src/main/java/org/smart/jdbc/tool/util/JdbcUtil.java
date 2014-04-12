package org.smart.jdbc.tool.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.smart.jdbc.tool.object.ColumnDefined;
import org.smart.jdbc.tool.object.TableDefined;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcUtil implements IMetaData {
    
    private DriverManagerDataSource dataSource = new DriverManagerDataSource(Constant.JDBC_URL, Constant.JDBC_USER, Constant.JDBC_PASSWROD);
    
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
    
    public JdbcUtil() {
        dataSource.setDriverClassName(Constant.JDBC_DRIVER);
    }
    
    public DriverManagerDataSource getDataSource() {
        return dataSource;
    }
    
    public void setDataSource(DriverManagerDataSource dataSource) {
        this.dataSource = dataSource;
    }
    
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    public List<ColumnDefined> getColumnDefinedsByTableName(final String tableName) {
        return jdbcTemplate.execute(new ConnectionCallback<List<ColumnDefined>>() {
            
            public List<ColumnDefined> doInConnection(Connection con) throws SQLException, DataAccessException {
                List<ColumnDefined> columnDefineds = new ArrayList<ColumnDefined>();
                DatabaseMetaData dbMetaData = con.getMetaData();
                ResultSet rs = dbMetaData.getColumns(null, null, tableName, null);
                while (rs.next()) {
                    ColumnDefined columnDefined = new ColumnDefined();
                    columnDefined.setColumnName(rs.getString("COLUMN_NAME"));
                    columnDefined.setColumnType(rs.getString("TYPE_NAME"));
                    columnDefined.setColumnNumber(rs.getString("ORDINAL_POSITION"));
                    columnDefined.setDefaultValue(rs.getString("COLUMN_DEF"));
                    columnDefined.setIsnullable(rs.getInt("NULLABLE"));
                    columnDefined.setLength(rs.getInt("CHAR_OCTET_LENGTH"));
                    columnDefined.setPrecision(rs.getInt("DECIMAL_DIGITS"));
                    columnDefined.setScale(rs.getInt("COLUMN_SIZE"));
                    columnDefined.setIsautoincrement("YES".equals(rs.getString("IS_AUTOINCREMENT")) ? 1 : 0);
                    columnDefined.setColumnComment(rs.getString("REMARKS"));
                    columnDefineds.add(columnDefined);
                }
                return columnDefineds;
            }
        });
    }
    
    public List<String> getPrimaryKeysByTableName(final String tableName) {
        return jdbcTemplate.execute(new ConnectionCallback<List<String>>() {
            
            public List<String> doInConnection(Connection con) throws SQLException, DataAccessException {
                List<String> primaryKeys = new ArrayList<String>();
                DatabaseMetaData dbMetaData = con.getMetaData();
                ResultSet rs = dbMetaData.getPrimaryKeys(null, null, tableName);
                while (rs.next()) {
                    primaryKeys.add(rs.getString("COLUMN_NAME"));
                }
                return primaryKeys;
            }
        });
    }
    
    public List<TableDefined> getTableDefineds() {
        return jdbcTemplate.execute(new ConnectionCallback<List<TableDefined>>() {
            
            public List<TableDefined> doInConnection(Connection con) throws SQLException, DataAccessException {
                List<TableDefined> tableDefineds = new ArrayList<TableDefined>();
                DatabaseMetaData dbMetaData = con.getMetaData();
                ResultSet rs = dbMetaData.getTables(null, null, Constant.TABLE_FILTER, new String[]{"TABLE", "VIEW"});
                while (rs.next()) {
                    TableDefined tableDefined = new TableDefined();
                    tableDefined.setTableName(rs.getString("TABLE_NAME"));
                    tableDefined.setTableComment(rs.getString("REMARKS"));
                    tableDefineds.add(tableDefined);
                }
                return tableDefineds;
            }
        });
    }
    
}
