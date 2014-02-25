package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * OrderGuestStuff entity for t_order_guest_stuff table.
 * 
 * 
 * @since 2014-02-17 17:24:41.164
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_order_guest_stuff")	
public class OrderGuestStuff implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uorderguestid")
	private String uorderguestid;
	
	@Column(name="cstuffname")
	private String cstuffname;
	
	@Column(name="cstuffkeeper")
	private String cstuffkeeper;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUorderguestid(String uorderguestid){
	    this.uorderguestid=uorderguestid;
	}
	public String getUorderguestid(){
	    return uorderguestid;
	}
	public void setCstuffname(String cstuffname){
	    this.cstuffname=cstuffname;
	}
	public String getCstuffname(){
	    return cstuffname;
	}
	public void setCstuffkeeper(String cstuffkeeper){
	    this.cstuffkeeper=cstuffkeeper;
	}
	public String getCstuffkeeper(){
	    return cstuffkeeper;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setUroleid(String uroleid){
	    this.uroleid=uroleid;
	}
	public String getUroleid(){
	    return uroleid;
	}
	public void setUuserid(String uuserid){
	    this.uuserid=uuserid;
	}
	public String getUuserid(){
	    return uuserid;
	}
	public void setUdeptid(String udeptid){
	    this.udeptid=udeptid;
	}
	public String getUdeptid(){
	    return udeptid;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
}