package com.goldpalm.tour.dao;	

import org.smart.jdbc.BaseDao;
import com.goldpalm.tour.bean.Account;
import org.springframework.stereotype.Repository;	

/**
 *  数据访问对象
 * @since 2014-02-17 17:24:34.651
 * @author smart-jdbc-tool
 */	
	
@Repository
public class AccountDao  extends BaseDao<Account,String> {	

}