package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CustomerLinkman entity for t_customer_linkman table.
 * 
 * 
 * @since 2014-02-17 17:24:38.133
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_customer_linkman")	
public class CustomerLinkman implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ucustomerid")
	private String ucustomerid;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cnameen")
	private String cnameen;
	
	@Column(name="csex")
	private String csex;
	
	@Column(name="cmobile")
	private String cmobile;
	
	@Column(name="ctelephone")
	private String ctelephone;
	
	@Column(name="cemail")
	private String cemail;
	
	@Column(name="cfax")
	private String cfax;
	
	@Column(name="cmsn")
	private String cmsn;
	
	@Column(name="cqq")
	private String cqq;
	
	@Column(name="cdept")
	private String cdept;
	
	@Column(name="cduty")
	private String cduty;
	
	@Column(name="ctitle")
	private String ctitle;
	
	@Column(name="dbirthday")
	private Date dbirthday;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="cisvalid")
	private String cisvalid;
	
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
	public void setUcustomerid(String ucustomerid){
	    this.ucustomerid=ucustomerid;
	}
	public String getUcustomerid(){
	    return ucustomerid;
	}
	public void setCname(String cname){
	    this.cname=cname;
	}
	public String getCname(){
	    return cname;
	}
	public void setCnameen(String cnameen){
	    this.cnameen=cnameen;
	}
	public String getCnameen(){
	    return cnameen;
	}
	public void setCsex(String csex){
	    this.csex=csex;
	}
	public String getCsex(){
	    return csex;
	}
	public void setCmobile(String cmobile){
	    this.cmobile=cmobile;
	}
	public String getCmobile(){
	    return cmobile;
	}
	public void setCtelephone(String ctelephone){
	    this.ctelephone=ctelephone;
	}
	public String getCtelephone(){
	    return ctelephone;
	}
	public void setCemail(String cemail){
	    this.cemail=cemail;
	}
	public String getCemail(){
	    return cemail;
	}
	public void setCfax(String cfax){
	    this.cfax=cfax;
	}
	public String getCfax(){
	    return cfax;
	}
	public void setCmsn(String cmsn){
	    this.cmsn=cmsn;
	}
	public String getCmsn(){
	    return cmsn;
	}
	public void setCqq(String cqq){
	    this.cqq=cqq;
	}
	public String getCqq(){
	    return cqq;
	}
	public void setCdept(String cdept){
	    this.cdept=cdept;
	}
	public String getCdept(){
	    return cdept;
	}
	public void setCduty(String cduty){
	    this.cduty=cduty;
	}
	public String getCduty(){
	    return cduty;
	}
	public void setCtitle(String ctitle){
	    this.ctitle=ctitle;
	}
	public String getCtitle(){
	    return ctitle;
	}
	public void setDbirthday(Date dbirthday){
	    this.dbirthday=dbirthday;
	}
	public Date getDbirthday(){
	    return dbirthday;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setCisvalid(String cisvalid){
	    this.cisvalid=cisvalid;
	}
	public String getCisvalid(){
	    return cisvalid;
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