package com.goldpalm.tour.dao;	

import org.smart.jdbc.BaseDao;
import com.goldpalm.tour.bean.News;
import org.springframework.stereotype.Repository;	

/**
 *  数据访问对象
 * @since 2014-02-17 17:24:40.678
 * @author smart-jdbc-tool
 */	
	
@Repository
public class NewsDao  extends BaseDao<News,String> {	

}