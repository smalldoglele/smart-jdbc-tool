package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * RoleAccess entity for t_role_access table.
 * 
 * 
 * @since 2014-02-17 17:24:42.866
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_role_access")	
public class RoleAccess implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uaccessroleid")
	private String uaccessroleid;
	
	@Column(name="iaccess")
	private Short iaccess;
	
	@Column(name="iaudit")
	private Short iaudit;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUroleid(String uroleid){
	    this.uroleid=uroleid;
	}
	public String getUroleid(){
	    return uroleid;
	}
	public void setUaccessroleid(String uaccessroleid){
	    this.uaccessroleid=uaccessroleid;
	}
	public String getUaccessroleid(){
	    return uaccessroleid;
	}
	public void setIaccess(Short iaccess){
	    this.iaccess=iaccess;
	}
	public Short getIaccess(){
	    return iaccess;
	}
	public void setIaudit(Short iaudit){
	    this.iaudit=iaudit;
	}
	public Short getIaudit(){
	    return iaudit;
	}
}