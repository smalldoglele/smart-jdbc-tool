package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CardConsume entity for t_card_consume table.
 * 
 * 
 * @since 2014-02-17 17:24:36.323
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_card_consume")	
public class CardConsume implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ucardid")
	private String ucardid;
	
	@Column(name="cconsumetype")
	private String cconsumetype;
	
	@Column(name="uconsumeid")
	private String uconsumeid;
	
	@Column(name="nsingleamount")
	private Double nsingleamount;
	
	@Column(name="iqty")
	private Integer iqty;
	
	@Column(name="namount")
	private Double namount;
	
	@Column(name="csummary")
	private String csummary;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="dcreate")
	private Date dcreate;
	
	@Column(name="cmemo")
	private String cmemo;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUcardid(String ucardid){
	    this.ucardid=ucardid;
	}
	public String getUcardid(){
	    return ucardid;
	}
	public void setCconsumetype(String cconsumetype){
	    this.cconsumetype=cconsumetype;
	}
	public String getCconsumetype(){
	    return cconsumetype;
	}
	public void setUconsumeid(String uconsumeid){
	    this.uconsumeid=uconsumeid;
	}
	public String getUconsumeid(){
	    return uconsumeid;
	}
	public void setNsingleamount(Double nsingleamount){
	    this.nsingleamount=nsingleamount;
	}
	public Double getNsingleamount(){
	    return nsingleamount;
	}
	public void setIqty(Integer iqty){
	    this.iqty=iqty;
	}
	public Integer getIqty(){
	    return iqty;
	}
	public void setNamount(Double namount){
	    this.namount=namount;
	}
	public Double getNamount(){
	    return namount;
	}
	public void setCsummary(String csummary){
	    this.csummary=csummary;
	}
	public String getCsummary(){
	    return csummary;
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
	public void setUroleid(String uroleid){
	    this.uroleid=uroleid;
	}
	public String getUroleid(){
	    return uroleid;
	}
	public void setUcorpid(String ucorpid){
	    this.ucorpid=ucorpid;
	}
	public String getUcorpid(){
	    return ucorpid;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setDcreate(Date dcreate){
	    this.dcreate=dcreate;
	}
	public Date getDcreate(){
	    return dcreate;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
}