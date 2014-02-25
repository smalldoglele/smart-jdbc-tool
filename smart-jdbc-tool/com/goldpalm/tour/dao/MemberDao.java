package com.goldpalm.tour.dao;	

import org.smart.jdbc.BaseDao;
import com.goldpalm.tour.bean.Member;
import org.springframework.stereotype.Repository;	

/**
 *  数据访问对象
 * @since 2014-02-17 17:24:40.379
 * @author smart-jdbc-tool
 */	
	
@Repository
public class MemberDao  extends BaseDao<Member,String> {	

}