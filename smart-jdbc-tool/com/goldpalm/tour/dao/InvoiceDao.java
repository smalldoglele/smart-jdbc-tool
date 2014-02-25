package com.goldpalm.tour.dao;	

import org.smart.jdbc.BaseDao;
import com.goldpalm.tour.bean.Invoice;
import org.springframework.stereotype.Repository;	

/**
 *  数据访问对象
 * @since 2014-02-17 17:24:39.453
 * @author smart-jdbc-tool
 */	
	
@Repository
public class InvoiceDao  extends BaseDao<Invoice,String> {	

}