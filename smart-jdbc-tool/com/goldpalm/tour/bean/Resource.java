package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Resource entity for t_resource table.
 * 
 * 
 * @since 2014-02-17 17:24:42.752
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_resource")	
public class Resource implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cnameen")
	private String cnameen;
	
	@Column(name="cshortname")
	private String cshortname;
	
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
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="cprincipal")
	private String cprincipal;
	
	@Column(name="cuppercorp")
	private String cuppercorp;
	
	@Column(name="caddress")
	private String caddress;
	
	@Column(name="czip")
	private String czip;
	
	@Column(name="cwebsite")
	private String cwebsite;
	
	@Column(name="ctelephone")
	private String ctelephone;
	
	@Column(name="cfax")
	private String cfax;
	
	@Column(name="ncredit")
	private Double ncredit;
	
	@Column(name="clevel")
	private String clevel;
	
	@Column(name="chealth")
	private String chealth;
	
	@Column(name="chardware")
	private String chardware;
	
	@Column(name="cmanner")
	private String cmanner;
	
	@Column(name="cspeed")
	private String cspeed;
	
	@Column(name="cquality")
	private String cquality;
	
	@Column(name="cservice")
	private String cservice;
	
	@Column(name="cfeature")
	private String cfeature;
	
	@Column(name="nsingleprice")
	private Double nsingleprice;
	
	@Column(name="cenvironment")
	private String cenvironment;
	
	@Column(name="ctraffic")
	private String ctraffic;
	
	@Column(name="cbrief")
	private String cbrief;
	
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
	
	@Column(name="nlongitude")
	private Double nlongitude;
	
	@Column(name="ndimension")
	private Double ndimension;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCcode(String ccode){
	    this.ccode=ccode;
	}
	public String getCcode(){
	    return ccode;
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
	public void setCshortname(String cshortname){
	    this.cshortname=cshortname;
	}
	public String getCshortname(){
	    return cshortname;
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
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setCprincipal(String cprincipal){
	    this.cprincipal=cprincipal;
	}
	public String getCprincipal(){
	    return cprincipal;
	}
	public void setCuppercorp(String cuppercorp){
	    this.cuppercorp=cuppercorp;
	}
	public String getCuppercorp(){
	    return cuppercorp;
	}
	public void setCaddress(String caddress){
	    this.caddress=caddress;
	}
	public String getCaddress(){
	    return caddress;
	}
	public void setCzip(String czip){
	    this.czip=czip;
	}
	public String getCzip(){
	    return czip;
	}
	public void setCwebsite(String cwebsite){
	    this.cwebsite=cwebsite;
	}
	public String getCwebsite(){
	    return cwebsite;
	}
	public void setCtelephone(String ctelephone){
	    this.ctelephone=ctelephone;
	}
	public String getCtelephone(){
	    return ctelephone;
	}
	public void setCfax(String cfax){
	    this.cfax=cfax;
	}
	public String getCfax(){
	    return cfax;
	}
	public void setNcredit(Double ncredit){
	    this.ncredit=ncredit;
	}
	public Double getNcredit(){
	    return ncredit;
	}
	public void setClevel(String clevel){
	    this.clevel=clevel;
	}
	public String getClevel(){
	    return clevel;
	}
	public void setChealth(String chealth){
	    this.chealth=chealth;
	}
	public String getChealth(){
	    return chealth;
	}
	public void setChardware(String chardware){
	    this.chardware=chardware;
	}
	public String getChardware(){
	    return chardware;
	}
	public void setCmanner(String cmanner){
	    this.cmanner=cmanner;
	}
	public String getCmanner(){
	    return cmanner;
	}
	public void setCspeed(String cspeed){
	    this.cspeed=cspeed;
	}
	public String getCspeed(){
	    return cspeed;
	}
	public void setCquality(String cquality){
	    this.cquality=cquality;
	}
	public String getCquality(){
	    return cquality;
	}
	public void setCservice(String cservice){
	    this.cservice=cservice;
	}
	public String getCservice(){
	    return cservice;
	}
	public void setCfeature(String cfeature){
	    this.cfeature=cfeature;
	}
	public String getCfeature(){
	    return cfeature;
	}
	public void setNsingleprice(Double nsingleprice){
	    this.nsingleprice=nsingleprice;
	}
	public Double getNsingleprice(){
	    return nsingleprice;
	}
	public void setCenvironment(String cenvironment){
	    this.cenvironment=cenvironment;
	}
	public String getCenvironment(){
	    return cenvironment;
	}
	public void setCtraffic(String ctraffic){
	    this.ctraffic=ctraffic;
	}
	public String getCtraffic(){
	    return ctraffic;
	}
	public void setCbrief(String cbrief){
	    this.cbrief=cbrief;
	}
	public String getCbrief(){
	    return cbrief;
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
	public void setNlongitude(Double nlongitude){
	    this.nlongitude=nlongitude;
	}
	public Double getNlongitude(){
	    return nlongitude;
	}
	public void setNdimension(Double ndimension){
	    this.ndimension=ndimension;
	}
	public Double getNdimension(){
	    return ndimension;
	}
}