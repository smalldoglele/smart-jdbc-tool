package ${daoPackage};	

import org.smart.jdbc.BaseDao;
import ${beanPackage}.${bean.beanName};
<#if bean.idJavaType=='NonId'>
import org.smart.jdbc.object.NonId;
</#if>
import org.springframework.stereotype.Repository;	

/**
 * ${bean.tableComment.label} 数据访问对象
 * @since ${bean.createDate}
 * @author smart-jdbc-tool
 */	
	
@Repository
public class ${bean.beanName}Dao  extends BaseDao<${bean.beanName},${bean.idJavaType}> {
	
<#if bean.idJavaType=='NonId'>
	public ${bean.beanName} get(NonId id) {
        throw new UnsupportedOperationException("[${bean.beanName}Dao]对应的表没有主键，不支持get(ID id)方法!");
    }
    
    public int delete(NonId id) {
        throw new UnsupportedOperationException("[${bean.beanName}Dao]对应的表没有主键，不支持delete(ID id)方法!");
    }
</#if>
}