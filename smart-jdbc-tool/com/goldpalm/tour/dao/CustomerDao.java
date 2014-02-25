package com.goldpalm.tour.dao;	

import org.smart.jdbc.BaseDao;
import com.goldpalm.tour.bean.Customer;
import org.springframework.stereotype.Repository;	

/**
 *  数据访问对象
 * @since 2014-02-17 17:24:38.083
 * @author smart-jdbc-tool
 */	
	
@Repository
public class CustomerDao  extends BaseDao<Customer,String> {	

}