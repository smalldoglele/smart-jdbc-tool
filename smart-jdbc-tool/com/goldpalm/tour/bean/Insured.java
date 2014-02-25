package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Insured entity for t_insured table.
 * 
 * 
 * @since 2014-02-17 17:24:39.333
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_insured")	
public class Insured implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="upolicyid")
	private String upolicyid;
	
	@Column(name="uguestid")
	private String uguestid;
	
	@Column(name="cinsured")
	private String cinsured;
	
	@Column(name="cfirstname")
	private String cfirstname;
	
	@Column(name="clastname")
	private String clastname;
	
	@Column(name="ccertificatetype")
	private String ccertificatetype;
	
	@Column(name="ccertificateno")
	private String ccertificateno;
	
	@Column(name="dbirthday")
	private Date dbirthday;
	
	@Column(name="csex")
	private String csex;
	
	@Column(name="cmobile")
	private String cmobile;
	
	@Column(name="cemail")
	private String cemail;
	
	@Column(name="caddress")
	private String caddress;
	
	@Column(name="czip")
	private String czip;
	
	@Column(name="cletteraddress")
	private String cletteraddress;
	
	@Column(name="cletterzip")
	private String cletterzip;
	
	@Column(name="cphone")
	private String cphone;
	
	@Column(name="cemergencylinker")
	private String cemergencylinker;
	
	@Column(name="cemergencyphone")
	private String cemergencyphone;
	
	@Column(name="cisapplicant")
	private String cisapplicant;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUpolicyid(String upolicyid){
	    this.upolicyid=upolicyid;
	}
	public String getUpolicyid(){
	    return upolicyid;
	}
	public void setUguestid(String uguestid){
	    this.uguestid=uguestid;
	}
	public String getUguestid(){
	    return uguestid;
	}
	public void setCinsured(String cinsured){
	    this.cinsured=cinsured;
	}
	public String getCinsured(){
	    return cinsured;
	}
	public void setCfirstname(String cfirstname){
	    this.cfirstname=cfirstname;
	}
	public String getCfirstname(){
	    return cfirstname;
	}
	public void setClastname(String clastname){
	    this.clastname=clastname;
	}
	public String getClastname(){
	    return clastname;
	}
	public void setCcertificatetype(String ccertificatetype){
	    this.ccertificatetype=ccertificatetype;
	}
	public String getCcertificatetype(){
	    return ccertificatetype;
	}
	public void setCcertificateno(String ccertificateno){
	    this.ccertificateno=ccertificateno;
	}
	public String getCcertificateno(){
	    return ccertificateno;
	}
	public void setDbirthday(Date dbirthday){
	    this.dbirthday=dbirthday;
	}
	public Date getDbirthday(){
	    return dbirthday;
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
	public void setCemail(String cemail){
	    this.cemail=cemail;
	}
	public String getCemail(){
	    return cemail;
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
	public void setCletteraddress(String cletteraddress){
	    this.cletteraddress=cletteraddress;
	}
	public String getCletteraddress(){
	    return cletteraddress;
	}
	public void setCletterzip(String cletterzip){
	    this.cletterzip=cletterzip;
	}
	public String getCletterzip(){
	    return cletterzip;
	}
	public void setCphone(String cphone){
	    this.cphone=cphone;
	}
	public String getCphone(){
	    return cphone;
	}
	public void setCemergencylinker(String cemergencylinker){
	    this.cemergencylinker=cemergencylinker;
	}
	public String getCemergencylinker(){
	    return cemergencylinker;
	}
	public void setCemergencyphone(String cemergencyphone){
	    this.cemergencyphone=cemergencyphone;
	}
	public String getCemergencyphone(){
	    return cemergencyphone;
	}
	public void setCisapplicant(String cisapplicant){
	    this.cisapplicant=cisapplicant;
	}
	public String getCisapplicant(){
	    return cisapplicant;
	}
}