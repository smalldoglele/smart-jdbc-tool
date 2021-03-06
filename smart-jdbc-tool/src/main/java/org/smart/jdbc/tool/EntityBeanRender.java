package org.smart.jdbc.tool;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.smart.jdbc.tool.object.EntityBean;
import org.smart.jdbc.tool.util.Constant;

import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class EntityBeanRender {
    
    public static String srcPath = Constant.SRC_PATH;
    
    public static String beanPackage = Constant.BEAN_PACKAGE;
    
    public static String daoPackage = Constant.DAO_PACKAGE;
    
    static {
        System.out.println("[" + slashPath(srcPath) + "]文件夹为需要生成POJO项目的源代码根目录!");
        System.out.println("将[" + beanPackage + "]生成java bean的对象,[" + daoPackage + "]生成DAO对象!");
    }
    
    public static void render(EntityBean bean) {
        Map<String, Object> root = new HashMap<String, Object>();
        root.put("bean", bean);
        root.put("beanPackage", beanPackage);
        root.put("daoPackage", daoPackage);
        if (bean.getIdJavaType() != null) {
            render(root, beanPackage, bean.getPojoFileName(), "beanTemplate.ftl");
            if ("NonID".equals(bean.getIdJavaType())) {
                System.out.print(bean.getBeanName() + " 没有主键,使用NonID");
            }
            render(root, daoPackage, bean.getDaoFileName(), "daoTemplate.ftl");
        }
    }
    
    /**
     * 生成pojo或者对象
     * @param bean
     * @param classTemplate
     * @param pagckage
     * @author walden
     */
    private static void render(Map<String, Object> root, String pagckage, String javaFileName, String classTemplate) {
        Configuration cfg = new Configuration();
        cfg.setTemplateLoader(new ClassTemplateLoader(EntityBeanRender.class, "/"));
        cfg.setObjectWrapper(new DefaultObjectWrapper());
        
        try {
            String beanDirPath = slashPath(srcPath) + pathFromPackage(pagckage);
            
            File beanDir = new File(beanDirPath);
            if (!beanDir.exists()) {
                System.out.println("创建[" + beanDirPath + "]文件夹,可以将该文件下的文件夹及文件复制到项目源代码的根目录中去!");
                beanDir.mkdirs();
            }
            
            File javaFile = new File(beanDir + "/" + javaFileName + ".java");
            
            if (Constant.SAFE_MODE && javaFile.exists()) {// 安全模式下如果目标文件存在不覆盖
                System.out.println(javaFile + "文件已经存在，跳过执行!");
            } else {
                Writer fileWriter = new BufferedWriter(new FileWriter(javaFile));
                
                Template temp = cfg.getTemplate(classTemplate);
                temp.process(root, fileWriter);
                System.out.println("生成" + Constant.BEAN_PACKAGE + "." + javaFileName + ".java 成功!");
                
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
    private static String pathFromPackage(String beanPackage) {
        return beanPackage.replace(".", "/");
    }
    
    /**
     * 将含有反斜杠的路径替换成正斜杠（ window里面的路径是反斜杠， *nux里面的都是正斜杠） 且确保末尾以/结束。
     * @param path
     * @return
     * @author walden
     */
    private static String slashPath(String backslashPath) {
        backslashPath = backslashPath.replace("\\", "/");
        return backslashPath.endsWith("/") ? backslashPath : backslashPath + "/";
    }
}
