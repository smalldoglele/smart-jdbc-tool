package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Worktask entity for t_worktask table.
 * 
 * 
 * @since 2014-02-17 17:24:45.327
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_worktask")	
public class Worktask implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="itasksource")
	private Integer itasksource;
	
	@Column(name="ceventid")
	private String ceventid;
	
	@Column(name="itasktype")
	private Integer itasktype;
	
	@Column(name="ctaskno")
	private String ctaskno;
	
	@Column(name="ctaskcontent")
	private String ctaskcontent;
	
	@Column(name="cassid")
	private String cassid;
	
	@Column(name="ccontactname")
	private String ccontactname;
	
	@Column(name="cmobile")
	private String cmobile;
	
	@Column(name="ctel")
	private String ctel;
	
	@Column(name="cfax")
	private String cfax;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="istate")
	private String istate;
	
	@Column(name="cdeptname")
	private String cdeptname;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setItasksource(Integer itasksource){
	    this.itasksource=itasksource;
	}
	public Integer getItasksource(){
	    return itasksource;
	}
	public void setCeventid(String ceventid){
	    this.ceventid=ceventid;
	}
	public String getCeventid(){
	    return ceventid;
	}
	public void setItasktype(Integer itasktype){
	    this.itasktype=itasktype;
	}
	public Integer getItasktype(){
	    return itasktype;
	}
	public void setCtaskno(String ctaskno){
	    this.ctaskno=ctaskno;
	}
	public String getCtaskno(){
	    return ctaskno;
	}
	public void setCtaskcontent(String ctaskcontent){
	    this.ctaskcontent=ctaskcontent;
	}
	public String getCtaskcontent(){
	    return ctaskcontent;
	}
	public void setCassid(String cassid){
	    this.cassid=cassid;
	}
	public String getCassid(){
	    return cassid;
	}
	public void setCcontactname(String ccontactname){
	    this.ccontactname=ccontactname;
	}
	public String getCcontactname(){
	    return ccontactname;
	}
	public void setCmobile(String cmobile){
	    this.cmobile=cmobile;
	}
	public String getCmobile(){
	    return cmobile;
	}
	public void setCtel(String ctel){
	    this.ctel=ctel;
	}
	public String getCtel(){
	    return ctel;
	}
	public void setCfax(String cfax){
	    this.cfax=cfax;
	}
	public String getCfax(){
	    return cfax;
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
	public void setIstate(String istate){
	    this.istate=istate;
	}
	public String getIstate(){
	    return istate;
	}
	public void setCdeptname(String cdeptname){
	    this.cdeptname=cdeptname;
	}
	public String getCdeptname(){
	    return cdeptname;
	}
}