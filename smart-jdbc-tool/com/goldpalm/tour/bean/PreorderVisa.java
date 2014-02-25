package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * PreorderVisa entity for t_preorder_visa table.
 * 
 * 
 * @since 2014-02-17 17:24:42.427
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_preorder_visa")	
public class PreorderVisa implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="upreorderid")
	private String upreorderid;
	
	@Column(name="upreorderrouteid")
	private String upreorderrouteid;
	
	@Column(name="cpricesource")
	private String cpricesource;
	
	@Column(name="uvisapriceid")
	private String uvisapriceid;
	
	@Column(name="nprice")
	private Double nprice;
	
	@Column(name="cpricepolicy")
	private String cpricepolicy;
	
	@Column(name="npolicyparam")
	private Double npolicyparam;
	
	@Column(name="cdestcountry")
	private String cdestcountry;
	
	@Column(name="cvisatype")
	private String cvisatype;
	
	@Column(name="cvalidcount")
	private String cvalidcount;
	
	@Column(name="iqty")
	private Integer iqty;
	
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
	public void setUvisapriceid(String uvisapriceid){
	    this.uvisapriceid=uvisapriceid;
	}
	public String getUvisapriceid(){
	    return uvisapriceid;
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
	public void setNpolicyparam(Double npolicyparam){
	    this.npolicyparam=npolicyparam;
	}
	public Double getNpolicyparam(){
	    return npolicyparam;
	}
	public void setCdestcountry(String cdestcountry){
	    this.cdestcountry=cdestcountry;
	}
	public String getCdestcountry(){
	    return cdestcountry;
	}
	public void setCvisatype(String cvisatype){
	    this.cvisatype=cvisatype;
	}
	public String getCvisatype(){
	    return cvisatype;
	}
	public void setCvalidcount(String cvalidcount){
	    this.cvalidcount=cvalidcount;
	}
	public String getCvalidcount(){
	    return cvalidcount;
	}
	public void setIqty(Integer iqty){
	    this.iqty=iqty;
	}
	public Integer getIqty(){
	    return iqty;
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