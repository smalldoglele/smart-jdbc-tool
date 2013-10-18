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
            File beanDir = new File(slashPath(Constant.SRC_PATH) + pathFromPackage(Constant.BEAN_PACKAGE));
            if (!beanDir.exists()) beanDir.mkdirs();
            File javaFile = new File(beanDir + "/" + bean.getBeanName() + ".java");
            if (Constant.SAFE_MODE && javaFile.exists()) {// 安全模式下如果目标文件存在不覆盖
                System.out.println(javaFile + "文件已经存在，跳过执行!");
            } else {
                Writer fileWriter = new BufferedWriter(new FileWriter(javaFile));
                Template temp = cfg.getTemplate("beanTemplate.ftl");
                temp.process(root, fileWriter);
                System.out.println("生成" + Constant.BEAN_PACKAGE + "." + bean.getBeanName() + ".java 成功!");
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
        
    }
    
    /**
     * 将包路径处理成类路径
     * <p>
     * ie:org.walden.bean.po 得到 org/walden/bean/po
     * @param beanPackage
     * @return
     * @author walden
     */
    private String pathFromPackage(String beanPackage) {
        return beanPackage.replace(".", "/");
    }
    
    /**
     * 将含有反斜杠的路径替换成正斜杠（ window里面的路径是反斜杠， *nux里面的都是正斜杠） 且确保末尾以/结束。
     * @param path
     * @return
     * @author walden
     */
    private String slashPath(String backslashPath) {
        backslashPath = backslashPath.replace("\\", "/");
        return backslashPath.endsWith("/") ? backslashPath : backslashPath + "/";
    }
}
