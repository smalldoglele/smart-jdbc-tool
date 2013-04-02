package org.hmy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.hmy.bean.EntityBean;
import org.hmy.util.Constant;

import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class EntityBeanRender implements Render<EntityBean> {

	public void render(EntityBean bean) {
		Configuration cfg = new Configuration();
		cfg.setTemplateLoader(new ClassTemplateLoader(EntityBeanRender.class, "/"));
		cfg.setObjectWrapper(new DefaultObjectWrapper());
		Map<String, Object> root = new HashMap<String, Object>();
		root.put("bean", bean);
		root.put("beanPackage", Constant.BEAN_PACKAGE);

		try {
			File beanDir = new File(Constant.BEAN_PATH);
			if (!beanDir.exists())
				beanDir.mkdirs();
			File javaFile = new File(beanDir + "\\" + bean.getBeanName() + ".java");
			Writer fileWriter = new BufferedWriter(new FileWriter(javaFile));
			Template temp = cfg.getTemplate("beanTemplate.ftl");
			temp.process(root, fileWriter);
			System.out.println("生成"+Constant.BEAN_PACKAGE+"."+bean.getBeanName()+".java 成功!");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}

	}

}
