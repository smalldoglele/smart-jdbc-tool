package ${daoPackage};	

import org.smart.jdbc.BaseDao;
import ${beanPackage}.${bean.beanName};
import org.springframework.stereotype.Repository;	

/**
 * ${bean.tableComment.label} 数据访问对象
 * @since ${bean.createDate}
 * @author smart-jdbc-tool
 */	
	
@Repository
public class ${bean.beanName}Dao  extends BaseDao<${bean.beanName}> {	

}