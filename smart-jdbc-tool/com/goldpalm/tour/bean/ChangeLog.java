package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * ChangeLog entity for t_change_log table.
 * 
 * 
 * @since 2014-02-17 17:24:36.748
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_change_log")	
public class ChangeLog implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="clinktable")
	private String clinktable;
	
	@Column(name="ulinktableid")
	private String ulinktableid;
	
	@Column(name="cchangebatchno")
	private String cchangebatchno;
	
	@Column(name="cchangeitem")
	private String cchangeitem;
	
	@Column(name="coriginalvalue")
	private String coriginalvalue;
	
	@Column(name="cchangevalue")
	private String cchangevalue;
	
	@Column(name="cchoice")
	private String cchoice;
	
	@Column(name="dchoicetime")
	private Date dchoicetime;
	
	@Column(name="uchoiceuserid")
	private String uchoiceuserid;
	
	@Column(name="ccancel")
	private String ccancel;
	
	@Column(name="dcanceltime")
	private Date dcanceltime;
	
	@Column(name="ucanceluserid")
	private String ucanceluserid;
	
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
	
	@Column(name="cchangeitemname")
	private String cchangeitemname;
	
	@Column(name="cchangeitemtype")
	private String cchangeitemtype;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setClinktable(String clinktable){
	    this.clinktable=clinktable;
	}
	public String getClinktable(){
	    return clinktable;
	}
	public void setUlinktableid(String ulinktableid){
	    this.ulinktableid=ulinktableid;
	}
	public String getUlinktableid(){
	    return ulinktableid;
	}
	public void setCchangebatchno(String cchangebatchno){
	    this.cchangebatchno=cchangebatchno;
	}
	public String getCchangebatchno(){
	    return cchangebatchno;
	}
	public void setCchangeitem(String cchangeitem){
	    this.cchangeitem=cchangeitem;
	}
	public String getCchangeitem(){
	    return cchangeitem;
	}
	public void setCoriginalvalue(String coriginalvalue){
	    this.coriginalvalue=coriginalvalue;
	}
	public String getCoriginalvalue(){
	    return coriginalvalue;
	}
	public void setCchangevalue(String cchangevalue){
	    this.cchangevalue=cchangevalue;
	}
	public String getCchangevalue(){
	    return cchangevalue;
	}
	public void setCchoice(String cchoice){
	    this.cchoice=cchoice;
	}
	public String getCchoice(){
	    return cchoice;
	}
	public void setDchoicetime(Date dchoicetime){
	    this.dchoicetime=dchoicetime;
	}
	public Date getDchoicetime(){
	    return dchoicetime;
	}
	public void setUchoiceuserid(String uchoiceuserid){
	    this.uchoiceuserid=uchoiceuserid;
	}
	public String getUchoiceuserid(){
	    return uchoiceuserid;
	}
	public void setCcancel(String ccancel){
	    this.ccancel=ccancel;
	}
	public String getCcancel(){
	    return ccancel;
	}
	public void setDcanceltime(Date dcanceltime){
	    this.dcanceltime=dcanceltime;
	}
	public Date getDcanceltime(){
	    return dcanceltime;
	}
	public void setUcanceluserid(String ucanceluserid){
	    this.ucanceluserid=ucanceluserid;
	}
	public String getUcanceluserid(){
	    return ucanceluserid;
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
	public void setCchangeitemname(String cchangeitemname){
	    this.cchangeitemname=cchangeitemname;
	}
	public String getCchangeitemname(){
	    return cchangeitemname;
	}
	public void setCchangeitemtype(String cchangeitemtype){
	    this.cchangeitemtype=cchangeitemtype;
	}
	public String getCchangeitemtype(){
	    return cchangeitemtype;
	}
}