使用说明：
#smbt 生成pojo对象
#使用maven打包后的目录结构如下：
	readme.txt
	smart-jdbc-tool.bat
	smart-jdbc-tool.jar
	smbt.bat
	lib
即要将smart-jdbc-tool.jar!/doc下的所有文件拷贝到与smart-jdbc-tool.jar同一个目录下面才可以执行smbt命令。
#smbt --help可以查看帮助文档
	usage: smbt(推荐)|smart-jdbc-tool [-g] [-h] [-p <arg>] [-s <arg>]
	 -g,--go              根据config.properties和-s，-p参数的配置生成POJO类。
	 -h,--help            显示smart-jdbc-tool使用说明
	 -p,--package <arg>
						  该工具生成的POJO类的包声明，如：org.walden.bean.po,默认使用config.prop
						  erties中的[global.beanPackage]项的设置值。
	 -s,--src <arg>
						  需要生成的POJO类的项目的源代码根目录路径，如：{project}/src/main/java,默认使
						  用config.properties中的[global.srcPath]项的设置值。