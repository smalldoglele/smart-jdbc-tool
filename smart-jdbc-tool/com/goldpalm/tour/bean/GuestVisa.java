package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * GuestVisa entity for t_guest_visa table.
 * 
 * 
 * @since 2014-02-17 17:24:38.610
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_guest_visa")	
public class GuestVisa implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uorderguestid")
	private String uorderguestid;
	
	@Column(name="cvisaname")
	private String cvisaname;
	
	@Column(name="dplansq")
	private Date dplansq;
	
	@Column(name="dplancq")
	private Date dplancq;
	
	@Column(name="dcq")
	private Date dcq;
	
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
	
	@Column(name="dcreate")
	private Date dcreate;
	
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
	public void setCvisaname(String cvisaname){
	    this.cvisaname=cvisaname;
	}
	public String getCvisaname(){
	    return cvisaname;
	}
	public void setDplansq(Date dplansq){
	    this.dplansq=dplansq;
	}
	public Date getDplansq(){
	    return dplansq;
	}
	public void setDplancq(Date dplancq){
	    this.dplancq=dplancq;
	}
	public Date getDplancq(){
	    return dplancq;
	}
	public void setDcq(Date dcq){
	    this.dcq=dcq;
	}
	public Date getDcq(){
	    return dcq;
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
	public void setDcreate(Date dcreate){
	    this.dcreate=dcreate;
	}
	public Date getDcreate(){
	    return dcreate;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
}