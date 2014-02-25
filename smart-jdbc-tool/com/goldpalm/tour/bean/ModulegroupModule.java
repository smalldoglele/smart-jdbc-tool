package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * ModulegroupModule entity for t_modulegroup_module table.
 * 
 * 
 * @since 2014-02-17 17:24:40.636
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_modulegroup_module")	
public class ModulegroupModule implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="umodulegroupid")
	private String umodulegroupid;
	
	@Column(name="umoduleid")
	private String umoduleid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUmodulegroupid(String umodulegroupid){
	    this.umodulegroupid=umodulegroupid;
	}
	public String getUmodulegroupid(){
	    return umodulegroupid;
	}
	public void setUmoduleid(String umoduleid){
	    this.umoduleid=umoduleid;
	}
	public String getUmoduleid(){
	    return umoduleid;
	}
}