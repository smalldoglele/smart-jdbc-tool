package org.hmy.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hmy.bean.ColumnDefined;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcUtil {
	private DriverManagerDataSource dataSource = new DriverManagerDataSource(Constant.JDBC_URL, Constant.JDBC_USER, Constant.JDBC_PASSWROD);
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

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

	/**
	 * 获得所有数据库表的名称
	 * 
	 * @return
	 */
	public List<String> getTableNames() {
		return jdbcTemplate.execute(new ConnectionCallback<List<String>>() {
			public List<String> doInConnection(Connection con) throws SQLException, DataAccessException {
				List<String> tableNames = new ArrayList<String>();
				DatabaseMetaData dbMetaData = con.getMetaData();
				ResultSet rs = dbMetaData.getTables(null, null, Constant.TABLE_FILTER, new String[] { "TABLE" });
				while (rs.next()) {
					tableNames.add(rs.getString("TABLE_NAME"));
				}
				return tableNames;
			}
		});
	}

	/**
	 * 根据表名获得所有列属性
	 * 
	 * @param tableName
	 * @return
	 */
	public List<ColumnDefined> getColumnsByTableName(final String tableName) {
		return jdbcTemplate.execute(new ConnectionCallback<List<ColumnDefined>>() {
			public List<ColumnDefined> doInConnection(Connection con) throws SQLException, DataAccessException {
				List<ColumnDefined> columns = new ArrayList<ColumnDefined>();
				DatabaseMetaData dbMetaData = con.getMetaData();
				ResultSet rs = dbMetaData.getColumns(null, null, tableName, null);
				while (rs.next()) {
					ColumnDefined column = new ColumnDefined();
					column.setColumnName(rs.getString("COLUMN_NAME"));
					column.setColumnType(rs.getString("TYPE_NAME"));
					// System.out.println(rs.getString("COLUMN_NAME")+" "+rs.getString("TYPE_NAME"));
					columns.add(column);
				}
				return columns;
			}
		});
	}

	/**
	 * 根据表名获得主键值
	 * 
	 * @param tableName
	 * @return
	 */
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
}
