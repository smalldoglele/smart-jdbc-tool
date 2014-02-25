package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * InterfaceParameter entity for t_interface_parameter table.
 * 
 * 
 * @since 2014-02-17 17:24:39.408
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_interface_parameter")	
public class InterfaceParameter implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uinterfaceid")
	private String uinterfaceid;
	
	@Column(name="cparameter")
	private String cparameter;
	
	@Column(name="cvalue")
	private String cvalue;
	
	@Column(name="cmemo")
	private String cmemo;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUinterfaceid(String uinterfaceid){
	    this.uinterfaceid=uinterfaceid;
	}
	public String getUinterfaceid(){
	    return uinterfaceid;
	}
	public void setCparameter(String cparameter){
	    this.cparameter=cparameter;
	}
	public String getCparameter(){
	    return cparameter;
	}
	public void setCvalue(String cvalue){
	    this.cvalue=cvalue;
	}
	public String getCvalue(){
	    return cvalue;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
}