package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CcardLog entity for t_ccard_log table.
 * 
 * 
 * @since 2014-02-17 17:24:36.696
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_ccard_log")	
public class CcardLog implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ucardid")
	private String ucardid;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="namount")
	private Double namount;
	
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
	
	@Column(name="urpid")
	private String urpid;
	
	@Column(name="nrpamount")
	private Double nrpamount;
	
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
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setNamount(Double namount){
	    this.namount=namount;
	}
	public Double getNamount(){
	    return namount;
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
	public void setUrpid(String urpid){
	    this.urpid=urpid;
	}
	public String getUrpid(){
	    return urpid;
	}
	public void setNrpamount(Double nrpamount){
	    this.nrpamount=nrpamount;
	}
	public Double getNrpamount(){
	    return nrpamount;
	}
}