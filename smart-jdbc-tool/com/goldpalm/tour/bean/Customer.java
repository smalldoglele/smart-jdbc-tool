package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Customer entity for t_customer table.
 * 
 * 
 * @since 2014-02-17 17:24:38.083
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_customer")	
public class Customer implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cnameen")
	private String cnameen;
	
	@Column(name="cnameab")
	private String cnameab;
	
	@Column(name="carea")
	private String carea;
	
	@Column(name="cnation")
	private String cnation;
	
	@Column(name="cprovince")
	private String cprovince;
	
	@Column(name="ccity")
	private String ccity;
	
	@Column(name="csection")
	private String csection;
	
	@Column(name="caccountcode")
	private String caccountcode;
	
	@Column(name="cprincipal")
	private String cprincipal;
	
	@Column(name="ctaxno")
	private String ctaxno;
	
	@Column(name="caddr")
	private String caddr;
	
	@Column(name="czip")
	private String czip;
	
	@Column(name="cfax")
	private String cfax;
	
	@Column(name="ctelgeneral")
	private String ctelgeneral;
	
	@Column(name="ctelguard")
	private String ctelguard;
	
	@Column(name="cemail")
	private String cemail;
	
	@Column(name="cwebsite")
	private String cwebsite;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="ckind")
	private String ckind;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="crpmode")
	private String crpmode;
	
	@Column(name="ccustomerCode")
	private String ccustomerCode;
	
	@Column(name="yuejie")
	private String yuejie;
	
	@Column(name="cagentlevel")
	private String cagentlevel;
	
	@Column(name="basecustomerid")
	private String basecustomerid;
	
	@Column(name="ctype")
	private String ctype;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
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
	public void setCnameab(String cnameab){
	    this.cnameab=cnameab;
	}
	public String getCnameab(){
	    return cnameab;
	}
	public void setCarea(String carea){
	    this.carea=carea;
	}
	public String getCarea(){
	    return carea;
	}
	public void setCnation(String cnation){
	    this.cnation=cnation;
	}
	public String getCnation(){
	    return cnation;
	}
	public void setCprovince(String cprovince){
	    this.cprovince=cprovince;
	}
	public String getCprovince(){
	    return cprovince;
	}
	public void setCcity(String ccity){
	    this.ccity=ccity;
	}
	public String getCcity(){
	    return ccity;
	}
	public void setCsection(String csection){
	    this.csection=csection;
	}
	public String getCsection(){
	    return csection;
	}
	public void setCaccountcode(String caccountcode){
	    this.caccountcode=caccountcode;
	}
	public String getCaccountcode(){
	    return caccountcode;
	}
	public void setCprincipal(String cprincipal){
	    this.cprincipal=cprincipal;
	}
	public String getCprincipal(){
	    return cprincipal;
	}
	public void setCtaxno(String ctaxno){
	    this.ctaxno=ctaxno;
	}
	public String getCtaxno(){
	    return ctaxno;
	}
	public void setCaddr(String caddr){
	    this.caddr=caddr;
	}
	public String getCaddr(){
	    return caddr;
	}
	public void setCzip(String czip){
	    this.czip=czip;
	}
	public String getCzip(){
	    return czip;
	}
	public void setCfax(String cfax){
	    this.cfax=cfax;
	}
	public String getCfax(){
	    return cfax;
	}
	public void setCtelgeneral(String ctelgeneral){
	    this.ctelgeneral=ctelgeneral;
	}
	public String getCtelgeneral(){
	    return ctelgeneral;
	}
	public void setCtelguard(String ctelguard){
	    this.ctelguard=ctelguard;
	}
	public String getCtelguard(){
	    return ctelguard;
	}
	public void setCemail(String cemail){
	    this.cemail=cemail;
	}
	public String getCemail(){
	    return cemail;
	}
	public void setCwebsite(String cwebsite){
	    this.cwebsite=cwebsite;
	}
	public String getCwebsite(){
	    return cwebsite;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
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
	public void setCkind(String ckind){
	    this.ckind=ckind;
	}
	public String getCkind(){
	    return ckind;
	}
	public void setCcode(String ccode){
	    this.ccode=ccode;
	}
	public String getCcode(){
	    return ccode;
	}
	public void setCrpmode(String crpmode){
	    this.crpmode=crpmode;
	}
	public String getCrpmode(){
	    return crpmode;
	}
	public void setCcustomerCode(String ccustomerCode){
	    this.ccustomerCode=ccustomerCode;
	}
	public String getCcustomerCode(){
	    return ccustomerCode;
	}
	public void setYuejie(String yuejie){
	    this.yuejie=yuejie;
	}
	public String getYuejie(){
	    return yuejie;
	}
	public void setCagentlevel(String cagentlevel){
	    this.cagentlevel=cagentlevel;
	}
	public String getCagentlevel(){
	    return cagentlevel;
	}
	public void setBasecustomerid(String basecustomerid){
	    this.basecustomerid=basecustomerid;
	}
	public String getBasecustomerid(){
	    return basecustomerid;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
}