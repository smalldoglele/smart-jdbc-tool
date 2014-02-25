package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Corp entity for t_corp table.
 * 
 * 
 * @since 2014-02-17 17:24:37.353
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_corp")	
public class Corp implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cnameen")
	private String cnameen;
	
	@Column(name="cnameab")
	private String cnameab;
	
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
	
	@Column(name="ccity")
	private String ccity;
	
	@Column(name="ctype1")
	private String ctype1;
	
	@Column(name="ctype2")
	private String ctype2;
	
	@Column(name="ctype3")
	private String ctype3;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="ncreditlimit")
	private Double ncreditlimit;
	
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
	public void setCnameab(String cnameab){
	    this.cnameab=cnameab;
	}
	public String getCnameab(){
	    return cnameab;
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
	public void setCcity(String ccity){
	    this.ccity=ccity;
	}
	public String getCcity(){
	    return ccity;
	}
	public void setCtype1(String ctype1){
	    this.ctype1=ctype1;
	}
	public String getCtype1(){
	    return ctype1;
	}
	public void setCtype2(String ctype2){
	    this.ctype2=ctype2;
	}
	public String getCtype2(){
	    return ctype2;
	}
	public void setCtype3(String ctype3){
	    this.ctype3=ctype3;
	}
	public String getCtype3(){
	    return ctype3;
	}
	public void setUcorpid(String ucorpid){
	    this.ucorpid=ucorpid;
	}
	public String getUcorpid(){
	    return ucorpid;
	}
	public void setNcreditlimit(Double ncreditlimit){
	    this.ncreditlimit=ncreditlimit;
	}
	public Double getNcreditlimit(){
	    return ncreditlimit;
	}
}