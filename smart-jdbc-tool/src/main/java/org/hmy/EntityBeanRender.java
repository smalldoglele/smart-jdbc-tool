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

public class EntityBeanRender {
    
    public static String srcPath = Constant.SRC_PATH;
    
    public static String beanPackage = Constant.BEAN_PACKAGE;
    
<<<<<<< HEAD
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
        render(root, beanPackage, bean.getPojoFileName(), "beanTemplate.ftl");
        render(root, daoPackage, bean.getDaoFileName(), "daoTemplate.ftl");
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
=======
    static {
        System.out.println("[" + slashPath(srcPath) + "]文件夹为需要生成POJO项目的源代码根目录!");
        System.out.println("将[" + beanPackage + "]文件夹作为POJO生成类的包!");
    }
    
    public static void render(EntityBean bean) {
        Configuration cfg = new Configuration();
        cfg.setTemplateLoader(new ClassTemplateLoader(EntityBeanRender.class, "/"));
        cfg.setObjectWrapper(new DefaultObjectWrapper());
        Map<String, Object> root = new HashMap<String, Object>();
        root.put("bean", bean);
        root.put("beanPackage", beanPackage);
        
        try {
            String beanDirPath = slashPath(srcPath) + pathFromPackage(beanPackage);
>>>>>>> a5d9b447770b69da96a88138d53f0df76c629b76
            File beanDir = new File(beanDirPath);
            if (!beanDir.exists()) {
                System.out.println("创建[" + beanDirPath + "]文件夹,可以将该文件下的文件夹及文件复制到项目源代码的根目录中去!");
                beanDir.mkdirs();
            }
<<<<<<< HEAD
            File javaFile = new File(beanDir + "/" + javaFileName);
=======
            
            File javaFile = new File(beanDir + "/" + bean.getBeanName() + ".java");
>>>>>>> a5d9b447770b69da96a88138d53f0df76c629b76
            if (Constant.SAFE_MODE && javaFile.exists()) {// 安全模式下如果目标文件存在不覆盖
                System.out.println(javaFile + "文件已经存在，跳过执行!");
            } else {
                Writer fileWriter = new BufferedWriter(new FileWriter(javaFile));
<<<<<<< HEAD
                Template temp = cfg.getTemplate(classTemplate);
                temp.process(root, fileWriter);
                System.out.println("生成" + pagckage + "." + javaFileName + " 成功!");
=======
                Template temp = cfg.getTemplate("beanTemplate.ftl");
                temp.process(root, fileWriter);
                System.out.println("生成" + Constant.BEAN_PACKAGE + "." + bean.getBeanName() + ".java 成功!");
                
>>>>>>> a5d9b447770b69da96a88138d53f0df76c629b76
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
<<<<<<< HEAD
=======
        
>>>>>>> a5d9b447770b69da96a88138d53f0df76c629b76
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
