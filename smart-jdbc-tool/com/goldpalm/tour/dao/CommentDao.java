package com.goldpalm.tour.dao;	

import org.smart.jdbc.BaseDao;
import com.goldpalm.tour.bean.Comment;
import org.springframework.stereotype.Repository;	

/**
 *  数据访问对象
 * @since 2014-02-17 17:24:37.036
 * @author smart-jdbc-tool
 */	
	
@Repository
public class CommentDao  extends BaseDao<Comment,String> {	

}