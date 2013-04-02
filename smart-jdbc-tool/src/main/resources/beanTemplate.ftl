package ${beanPackage};	
	
<#list bean.imports as import>
import ${import};
</#list>	
	
@Entity	
@Table(name = "${bean.tableName}")	
public class ${bean.beanName}{	
	
	<#list bean.fields as field>
	<#if field.annotaction??>${field.annotaction}</#if>
	private ${field.type} ${field.name};
	</#list>
	<#list bean.fields as field>
	
	public void ${field.setterMethodName}(${field.type} ${field.name}){
	    this.${field.name}=${field.name};
	}
	
	public ${field.type} ${field.getterMethodName}(){
	    return ${field.name};
	}
	</#list>	
}