package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * PreorderIndividualservice entity for t_preorder_individualservice table.
 * 
 * 
 * @since 2014-02-17 17:24:42.198
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_preorder_individualservice")	
public class PreorderIndividualservice implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="upreorderid")
	private String upreorderid;
	
	@Column(name="upreorderrouteid")
	private String upreorderrouteid;
	
	@Column(name="cpricesource")
	private String cpricesource;
	
	@Column(name="uindividualserviceid")
	private String uindividualserviceid;
	
	@Column(name="nprice")
	private Double nprice;
	
	@Column(name="cpricepolicy")
	private String cpricepolicy;
	
	@Column(name="cpriceunit")
	private String cpriceunit;
	
	@Column(name="npolicyparam")
	private Double npolicyparam;
	
	@Column(name="cservicename")
	private String cservicename;
	
	@Column(name="cservicetype")
	private String cservicetype;
	
	@Column(name="ccity")
	private String ccity;
	
	@Column(name="cisneeddate")
	private String cisneeddate;
	
	@Column(name="iqty")
	private Integer iqty;
	
	@Column(name="dneeddate")
	private Date dneeddate;
	
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
	public void setUpreorderid(String upreorderid){
	    this.upreorderid=upreorderid;
	}
	public String getUpreorderid(){
	    return upreorderid;
	}
	public void setUpreorderrouteid(String upreorderrouteid){
	    this.upreorderrouteid=upreorderrouteid;
	}
	public String getUpreorderrouteid(){
	    return upreorderrouteid;
	}
	public void setCpricesource(String cpricesource){
	    this.cpricesource=cpricesource;
	}
	public String getCpricesource(){
	    return cpricesource;
	}
	public void setUindividualserviceid(String uindividualserviceid){
	    this.uindividualserviceid=uindividualserviceid;
	}
	public String getUindividualserviceid(){
	    return uindividualserviceid;
	}
	public void setNprice(Double nprice){
	    this.nprice=nprice;
	}
	public Double getNprice(){
	    return nprice;
	}
	public void setCpricepolicy(String cpricepolicy){
	    this.cpricepolicy=cpricepolicy;
	}
	public String getCpricepolicy(){
	    return cpricepolicy;
	}
	public void setCpriceunit(String cpriceunit){
	    this.cpriceunit=cpriceunit;
	}
	public String getCpriceunit(){
	    return cpriceunit;
	}
	public void setNpolicyparam(Double npolicyparam){
	    this.npolicyparam=npolicyparam;
	}
	public Double getNpolicyparam(){
	    return npolicyparam;
	}
	public void setCservicename(String cservicename){
	    this.cservicename=cservicename;
	}
	public String getCservicename(){
	    return cservicename;
	}
	public void setCservicetype(String cservicetype){
	    this.cservicetype=cservicetype;
	}
	public String getCservicetype(){
	    return cservicetype;
	}
	public void setCcity(String ccity){
	    this.ccity=ccity;
	}
	public String getCcity(){
	    return ccity;
	}
	public void setCisneeddate(String cisneeddate){
	    this.cisneeddate=cisneeddate;
	}
	public String getCisneeddate(){
	    return cisneeddate;
	}
	public void setIqty(Integer iqty){
	    this.iqty=iqty;
	}
	public Integer getIqty(){
	    return iqty;
	}
	public void setDneeddate(Date dneeddate){
	    this.dneeddate=dneeddate;
	}
	public Date getDneeddate(){
	    return dneeddate;
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