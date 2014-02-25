package com.goldpalm.tour.dao;	

import org.smart.jdbc.BaseDao;
import com.goldpalm.tour.bean.TeamArrangeLongtraffic;
import org.springframework.stereotype.Repository;	

/**
 *  数据访问对象
 * @since 2014-02-17 17:12:13.135
 * @author smart-jdbc-tool
 */	
	
@Repository
public class TeamArrangeLongtrafficDao  extends BaseDao<TeamArrangeLongtraffic,
Expression bean.idJavaType is undefined on line 14, column 70 in daoTemplate.ftl.
The problematic instruction:
----------
==> ${bean.idJavaType} [on line 14, column 68 in daoTemplate.ftl]
----------

Java backtrace for programmers:
----------
freemarker.core.InvalidReferenceException: Expression bean.idJavaType is undefined on line 14, column 70 in daoTemplate.ftl.
	at freemarker.core.TemplateObject.assertNonNull(TemplateObject.java:125)
	at freemarker.core.Expression.getStringValue(Expression.java:118)
	at freemarker.core.Expression.getStringValue(Expression.java:93)
	at freemarker.core.DollarVariable.accept(DollarVariable.java:76)
	at freemarker.core.Environment.visit(Environment.java:221)
	at freemarker.core.MixedContent.accept(MixedContent.java:92)
	at freemarker.core.Environment.visit(Environment.java:221)
	at freemarker.core.Environment.process(Environment.java:199)
	at freemarker.template.Template.process(Template.java:259)
	at org.hmy.EntityBeanRender.render(EntityBeanRender.java:71)
	at org.hmy.EntityBeanRender.render(EntityBeanRender.java:39)
	at org.hmy.SmartJdbcToolkit.go(SmartJdbcToolkit.java:60)
	at org.hmy.SmartJdbcToolkit.main(SmartJdbcToolkit.java:37)
