package ${beanPackage};	


<#list bean.imports as import>
import ${import};
</#list>	
import java.io.Serializable;
import com.goldpalm.core.base.persistence.TableMapper;
import com.goldpalm.core.base.persistence.NotFieldMapper;
import com.goldpalm.core.base.persistence.PrimaryKeyMapper;
	
@TableMapper("${bean.tableName}")	
public class ${bean.beanName}  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	<#list bean.fields as field>
	<#if field.annotaction??>${field.annotaction}</#if>
	private ${field.type} ${field.name};
	
	</#list>
	<#list bean.fields as field>
	
	public void ${field.setterMethodName}(${field.type} ${field.name}) {
	    this.${field.name} = ${field.name};
	}
	
	public ${field.type} ${field.getterMethodName}() {
	    return ${field.name};
	}
	</#list>	
}