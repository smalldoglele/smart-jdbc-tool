package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * PreorderBudget entity for t_preorder_budget table.
 * 
 * 
 * @since 2014-02-17 17:24:41.972
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_preorder_budget")	
public class PreorderBudget implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="upreorderid")
	private String upreorderid;
	
	@Column(name="citemtype")
	private String citemtype;
	
	@Column(name="citem")
	private String citem;
	
	@Column(name="usupplierid")
	private String usupplierid;
	
	@Column(name="usupplierpriceid")
	private String usupplierpriceid;
	
	@Column(name="nsupplierprice")
	private Double nsupplierprice;
	
	@Column(name="ndivideqty")
	private Double ndivideqty;
	
	@Column(name="nunitprice")
	private Double nunitprice;
	
	@Column(name="ndays")
	private Double ndays;
	
	@Column(name="nqty")
	private Double nqty;
	
	@Column(name="ccur")
	private String ccur;
	
	@Column(name="nexchangerate")
	private Double nexchangerate;
	
	@Column(name="namountf")
	private Double namountf;
	
	@Column(name="namount")
	private Double namount;
	
	@Column(name="csummary")
	private String csummary;
	
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
	public void setCitemtype(String citemtype){
	    this.citemtype=citemtype;
	}
	public String getCitemtype(){
	    return citemtype;
	}
	public void setCitem(String citem){
	    this.citem=citem;
	}
	public String getCitem(){
	    return citem;
	}
	public void setUsupplierid(String usupplierid){
	    this.usupplierid=usupplierid;
	}
	public String getUsupplierid(){
	    return usupplierid;
	}
	public void setUsupplierpriceid(String usupplierpriceid){
	    this.usupplierpriceid=usupplierpriceid;
	}
	public String getUsupplierpriceid(){
	    return usupplierpriceid;
	}
	public void setNsupplierprice(Double nsupplierprice){
	    this.nsupplierprice=nsupplierprice;
	}
	public Double getNsupplierprice(){
	    return nsupplierprice;
	}
	public void setNdivideqty(Double ndivideqty){
	    this.ndivideqty=ndivideqty;
	}
	public Double getNdivideqty(){
	    return ndivideqty;
	}
	public void setNunitprice(Double nunitprice){
	    this.nunitprice=nunitprice;
	}
	public Double getNunitprice(){
	    return nunitprice;
	}
	public void setNdays(Double ndays){
	    this.ndays=ndays;
	}
	public Double getNdays(){
	    return ndays;
	}
	public void setNqty(Double nqty){
	    this.nqty=nqty;
	}
	public Double getNqty(){
	    return nqty;
	}
	public void setCcur(String ccur){
	    this.ccur=ccur;
	}
	public String getCcur(){
	    return ccur;
	}
	public void setNexchangerate(Double nexchangerate){
	    this.nexchangerate=nexchangerate;
	}
	public Double getNexchangerate(){
	    return nexchangerate;
	}
	public void setNamountf(Double namountf){
	    this.namountf=namountf;
	}
	public Double getNamountf(){
	    return namountf;
	}
	public void setNamount(Double namount){
	    this.namount=namount;
	}
	public Double getNamount(){
	    return namount;
	}
	public void setCsummary(String csummary){
	    this.csummary=csummary;
	}
	public String getCsummary(){
	    return csummary;
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