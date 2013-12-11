package ${beanPackage};	

import java.io.Serializable;	
<#list bean.imports as import>
import ${import};
</#list>

/**
 * ${bean.beanName} entity for ${bean.tableName} table.
 * ${bean.tableComment.label}
 * ${bean.tableComment.content}
 * @since ${bean.createDate}
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "${bean.tableName}")	
public class ${bean.beanName} implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	<#list bean.fields as field>
	
	<#if field.annotaction??>${field.annotaction}</#if>
	private ${field.type} ${field.name};<#if field.comment.label?? && field.comment.label!=''>/*${field.comment.label}*/</#if>
	</#list>
	<#list bean.fields as field>
	<#if field.comment.label?? && field.comment.label!=''>
	/**
	 * 设置 ${field.comment.label} <#if field.comment.content?? && field.comment.content!=''>${field.comment.content}</#if>
	 * @param ${field.name}
	 */
	</#if>
	public void ${field.setterMethodName}(${field.type} ${field.name}){
	    this.${field.name}=${field.name};
	}
	<#if field.comment.label?? && field.comment.label!=''>
	/**
	 * 获取 ${field.comment.label} <#if field.comment.content?? && field.comment.content!=''>${field.comment.content}</#if>
	 * @return ${field.name} ${field.comment.label}
	 */
	</#if>
	public ${field.type} ${field.getterMethodName}(){
	    return ${field.name};
	}
	</#list>	
}