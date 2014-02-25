package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * PreorderLongtraffic entity for t_preorder_longtraffic table.
 * 
 * 
 * @since 2014-02-17 17:24:42.239
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_preorder_longtraffic")	
public class PreorderLongtraffic implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="upreorderid")
	private String upreorderid;
	
	@Column(name="upreorderrouteid")
	private String upreorderrouteid;
	
	@Column(name="cdescribe")
	private String cdescribe;
	
	@Column(name="cpricesource")
	private String cpricesource;
	
	@Column(name="ulongtrafficpriceid")
	private String ulongtrafficpriceid;
	
	@Column(name="cpassengertype")
	private String cpassengertype;
	
	@Column(name="cclasscode")
	private String cclasscode;
	
	@Column(name="nprice")
	private Double nprice;
	
	@Column(name="ntax")
	private Double ntax;
	
	@Column(name="nprice1")
	private Double nprice1;
	
	@Column(name="ntax1")
	private Double ntax1;
	
	@Column(name="iqty")
	private Integer iqty;
	
	@Column(name="iqty1")
	private Integer iqty1;
	
	@Column(name="cpricepolicy")
	private String cpricepolicy;
	
	@Column(name="npolicyparam")
	private Double npolicyparam;
	
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
	public void setCdescribe(String cdescribe){
	    this.cdescribe=cdescribe;
	}
	public String getCdescribe(){
	    return cdescribe;
	}
	public void setCpricesource(String cpricesource){
	    this.cpricesource=cpricesource;
	}
	public String getCpricesource(){
	    return cpricesource;
	}
	public void setUlongtrafficpriceid(String ulongtrafficpriceid){
	    this.ulongtrafficpriceid=ulongtrafficpriceid;
	}
	public String getUlongtrafficpriceid(){
	    return ulongtrafficpriceid;
	}
	public void setCpassengertype(String cpassengertype){
	    this.cpassengertype=cpassengertype;
	}
	public String getCpassengertype(){
	    return cpassengertype;
	}
	public void setCclasscode(String cclasscode){
	    this.cclasscode=cclasscode;
	}
	public String getCclasscode(){
	    return cclasscode;
	}
	public void setNprice(Double nprice){
	    this.nprice=nprice;
	}
	public Double getNprice(){
	    return nprice;
	}
	public void setNtax(Double ntax){
	    this.ntax=ntax;
	}
	public Double getNtax(){
	    return ntax;
	}
	public void setNprice1(Double nprice1){
	    this.nprice1=nprice1;
	}
	public Double getNprice1(){
	    return nprice1;
	}
	public void setNtax1(Double ntax1){
	    this.ntax1=ntax1;
	}
	public Double getNtax1(){
	    return ntax1;
	}
	public void setIqty(Integer iqty){
	    this.iqty=iqty;
	}
	public Integer getIqty(){
	    return iqty;
	}
	public void setIqty1(Integer iqty1){
	    this.iqty1=iqty1;
	}
	public Integer getIqty1(){
	    return iqty1;
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