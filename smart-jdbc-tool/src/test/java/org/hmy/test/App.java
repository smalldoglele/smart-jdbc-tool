package org.hmy.test;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.hmy.EntityBeanBuilder;
import org.hmy.bean.EntityBean;
import org.hmy.util.Constant;
import org.hmy.util.JdbcUtil;

import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class App {

	/**
	 * @param args
	 * @throws TemplateException 
	 * @throws IOException 
	 */
//	public static void main(String[] args) throws IOException, TemplateException {
//		freemarkerTest();
//	}

	public static void freemarkerTest() throws IOException, TemplateException {
		JdbcUtil jdbcUtitl = new JdbcUtil();
		String tableName="xx_admin";
		EntityBeanBuilder builder = new EntityBeanBuilder();
		builder.setTableName(tableName);
		builder.setPrimaryKeys(jdbcUtitl.getPrimaryKeysByTableName(tableName));
		builder.setColumnDefineds(jdbcUtitl.getColumnsByTableName(tableName));
		StringWriter out=new StringWriter();
		Configuration cfg=new Configuration();
		cfg.setTemplateLoader(new ClassTemplateLoader(App.class, "/"));
		cfg.setObjectWrapper(new DefaultObjectWrapper());
		Map<String,Object> root=new HashMap<String,Object>();
		EntityBean entityBean=builder.builder();
		root.put("bean",entityBean);
		root.put("beanPackage", Constant.BEAN_PACKAGE);
		Template temp=cfg.getTemplate("beanTemplate.ftl");
		temp.process(root, out);
		System.out.println(out);
	}
}
