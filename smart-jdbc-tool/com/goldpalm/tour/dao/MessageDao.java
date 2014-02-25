package com.goldpalm.tour.dao;	

import org.smart.jdbc.BaseDao;
import com.goldpalm.tour.bean.Message;
import org.springframework.stereotype.Repository;	

/**
 *  数据访问对象
 * @since 2014-02-17 17:24:40.495
 * @author smart-jdbc-tool
 */	
	
@Repository
public class MessageDao  extends BaseDao<Message,String> {	

}