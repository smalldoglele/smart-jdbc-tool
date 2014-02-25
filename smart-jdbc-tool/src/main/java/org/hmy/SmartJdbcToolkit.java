package org.hmy;

import java.util.List;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.Parser;
import org.hmy.bean.ColumnDefined;
import org.hmy.bean.EntityBean;
import org.hmy.bean.TableDefined;
import org.hmy.util.Constant;
import org.hmy.util.JdbcUtil;

public class SmartJdbcToolkit {
    
    public static void main(String[] args) {
        try {
            Options opts = new Options();
            opts.addOption("h", "help", false, "显示smart-jdbc-tool使用说明");
            opts.addOption("s", "src", true, "需要生成的POJO类的项目的源代码根目录路径，如：{project}/src/main/java,默认使用config.properties中的[global.srcPath]项的设置值。");
            opts.addOption("p", "package", true, "该工具生成的POJO类的包声明，如：org.walden.bean.po,默认使用config.properties中的[global.beanPackage]项的设置值。");
            opts.addOption("g", "go", false, "根据config.properties和-s，-p参数的配置生成POJO类。");
            Parser parser = new BasicParser();
            CommandLine cli = parser.parse(opts, args);
            if (cli.getOptions().length > 0 && (cli.getOptions().length == 1 && !cli.hasOption('h'))) {
                if (cli.hasOption('s')) {
                    System.out.println(cli.getOptionValue("s"));
                    Constant.SRC_PATH = cli.getOptionValue("s");
                }
                if (cli.hasOption('p')) {
                    System.out.println(cli.getOptionValue("p"));
                    Constant.BEAN_PACKAGE = cli.getOptionValue("p");
                }
                if (cli.hasOption('g')) {
                    go();
                }
            } else {
                HelpFormatter hf = new HelpFormatter();
                hf.printHelp("smbt(推荐)|smart-jdbc-tool", opts, true);
            }
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
    }
    
    /**
     * 方法执行的主题
     * @author walden
     */
    public static void go() {
        JdbcUtil jdbcUtitl = new JdbcUtil();
        List<TableDefined> tableDefineds = jdbcUtitl.getTableDefineds();
        for (TableDefined table : tableDefineds) {
            String tableName = table.getTableName();
            List<String> primaryKeys = jdbcUtitl.getPrimaryKeysByTableName(tableName);
            List<ColumnDefined> columnDefineds = jdbcUtitl.getColumnsByTableName(tableName);
            EntityBeanBuilder builder = new EntityBeanBuilder(table, primaryKeys, columnDefineds);
            EntityBeanRender.render(builder.builder());
        }
        System.out.println("生成成功("+EntityBeanRender.pojoCount+")POJO,("+EntityBeanRender.daoCount+")DAO类!");
    }
}
