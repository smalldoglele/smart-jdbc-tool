package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * PreorderHotel entity for t_preorder_hotel table.
 * 
 * 
 * @since 2014-02-17 17:24:42.161
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_preorder_hotel")	
public class PreorderHotel implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="upreorderid")
	private String upreorderid;
	
	@Column(name="upreorderrouteid")
	private String upreorderrouteid;
	
	@Column(name="chotelname")
	private String chotelname;
	
	@Column(name="cenname")
	private String cenname;
	
	@Column(name="cstarlevel")
	private String cstarlevel;
	
	@Column(name="cnation")
	private String cnation;
	
	@Column(name="ccity")
	private String ccity;
	
	@Column(name="caddress")
	private String caddress;
	
	@Column(name="ctel")
	private String ctel;
	
	@Column(name="cpricesource")
	private String cpricesource;
	
	@Column(name="uhotelroompirceid")
	private String uhotelroompirceid;
	
	@Column(name="croomtypename")
	private String croomtypename;
	
	@Column(name="nprice")
	private Double nprice;
	
	@Column(name="nextrabedprice")
	private Double nextrabedprice;
	
	@Column(name="cpricepolicy")
	private String cpricepolicy;
	
	@Column(name="npolicyparam")
	private Double npolicyparam;
	
	@Column(name="croomdescribe")
	private String croomdescribe;
	
	@Column(name="irooms")
	private Integer irooms;
	
	@Column(name="iextrabed")
	private Integer iextrabed;
	
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
	public void setChotelname(String chotelname){
	    this.chotelname=chotelname;
	}
	public String getChotelname(){
	    return chotelname;
	}
	public void setCenname(String cenname){
	    this.cenname=cenname;
	}
	public String getCenname(){
	    return cenname;
	}
	public void setCstarlevel(String cstarlevel){
	    this.cstarlevel=cstarlevel;
	}
	public String getCstarlevel(){
	    return cstarlevel;
	}
	public void setCnation(String cnation){
	    this.cnation=cnation;
	}
	public String getCnation(){
	    return cnation;
	}
	public void setCcity(String ccity){
	    this.ccity=ccity;
	}
	public String getCcity(){
	    return ccity;
	}
	public void setCaddress(String caddress){
	    this.caddress=caddress;
	}
	public String getCaddress(){
	    return caddress;
	}
	public void setCtel(String ctel){
	    this.ctel=ctel;
	}
	public String getCtel(){
	    return ctel;
	}
	public void setCpricesource(String cpricesource){
	    this.cpricesource=cpricesource;
	}
	public String getCpricesource(){
	    return cpricesource;
	}
	public void setUhotelroompirceid(String uhotelroompirceid){
	    this.uhotelroompirceid=uhotelroompirceid;
	}
	public String getUhotelroompirceid(){
	    return uhotelroompirceid;
	}
	public void setCroomtypename(String croomtypename){
	    this.croomtypename=croomtypename;
	}
	public String getCroomtypename(){
	    return croomtypename;
	}
	public void setNprice(Double nprice){
	    this.nprice=nprice;
	}
	public Double getNprice(){
	    return nprice;
	}
	public void setNextrabedprice(Double nextrabedprice){
	    this.nextrabedprice=nextrabedprice;
	}
	public Double getNextrabedprice(){
	    return nextrabedprice;
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
	public void setCroomdescribe(String croomdescribe){
	    this.croomdescribe=croomdescribe;
	}
	public String getCroomdescribe(){
	    return croomdescribe;
	}
	public void setIrooms(Integer irooms){
	    this.irooms=irooms;
	}
	public Integer getIrooms(){
	    return irooms;
	}
	public void setIextrabed(Integer iextrabed){
	    this.iextrabed=iextrabed;
	}
	public Integer getIextrabed(){
	    return iextrabed;
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