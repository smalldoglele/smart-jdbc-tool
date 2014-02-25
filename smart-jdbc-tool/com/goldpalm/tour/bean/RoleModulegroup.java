package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * RoleModulegroup entity for t_role_modulegroup table.
 * 
 * 
 * @since 2014-02-17 17:24:42.926
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_role_modulegroup")	
public class RoleModulegroup implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="umodulegroupid")
	private String umodulegroupid;
	
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
	public void setUmodulegroupid(String umodulegroupid){
	    this.umodulegroupid=umodulegroupid;
	}
	public String getUmodulegroupid(){
	    return umodulegroupid;
	}
}