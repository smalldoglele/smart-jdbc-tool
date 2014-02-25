package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * SmsSend entity for t_sms_send table.
 * 
 * 
 * @since 2014-02-17 17:24:43.051
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_sms_send")	
public class SmsSend implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cfromno")
	private String cfromno;
	
	@Column(name="ctono")
	private String ctono;
	
	@Column(name="cmessage")
	private String cmessage;
	
	@Column(name="cmsgtype")
	private String cmsgtype;
	
	@Column(name="ismscount")
	private Integer ismscount;
	
	@Column(name="ulinkid")
	private String ulinkid;
	
	@Column(name="dtimer")
	private Date dtimer;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="cguestname")
	private String cguestname;
	
	@Column(name="dcreate")
	private Date dcreate;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="coriginusername")
	private String coriginusername;
	
	@Column(name="corigindeptname")
	private String corigindeptname;
	
	@Column(name="corigincorpname")
	private String corigincorpname;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCfromno(String cfromno){
	    this.cfromno=cfromno;
	}
	public String getCfromno(){
	    return cfromno;
	}
	public void setCtono(String ctono){
	    this.ctono=ctono;
	}
	public String getCtono(){
	    return ctono;
	}
	public void setCmessage(String cmessage){
	    this.cmessage=cmessage;
	}
	public String getCmessage(){
	    return cmessage;
	}
	public void setCmsgtype(String cmsgtype){
	    this.cmsgtype=cmsgtype;
	}
	public String getCmsgtype(){
	    return cmsgtype;
	}
	public void setIsmscount(Integer ismscount){
	    this.ismscount=ismscount;
	}
	public Integer getIsmscount(){
	    return ismscount;
	}
	public void setUlinkid(String ulinkid){
	    this.ulinkid=ulinkid;
	}
	public String getUlinkid(){
	    return ulinkid;
	}
	public void setDtimer(Date dtimer){
	    this.dtimer=dtimer;
	}
	public Date getDtimer(){
	    return dtimer;
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
	public void setCguestname(String cguestname){
	    this.cguestname=cguestname;
	}
	public String getCguestname(){
	    return cguestname;
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
	public void setCoriginusername(String coriginusername){
	    this.coriginusername=coriginusername;
	}
	public String getCoriginusername(){
	    return coriginusername;
	}
	public void setCorigindeptname(String corigindeptname){
	    this.corigindeptname=corigindeptname;
	}
	public String getCorigindeptname(){
	    return corigindeptname;
	}
	public void setCorigincorpname(String corigincorpname){
	    this.corigincorpname=corigincorpname;
	}
	public String getCorigincorpname(){
	    return corigincorpname;
	}
}