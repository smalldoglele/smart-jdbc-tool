package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * MacAuthorize entity for t_mac_authorize table.
 * 
 * 
 * @since 2014-02-17 17:24:40.257
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_mac_authorize")	
public class MacAuthorize implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cmac")
	private String cmac;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="cmemo")
	private String cmemo;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCmac(String cmac){
	    this.cmac=cmac;
	}
	public String getCmac(){
	    return cmac;
	}
	public void setUdeptid(String udeptid){
	    this.udeptid=udeptid;
	}
	public String getUdeptid(){
	    return udeptid;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
}