package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * LinePriceBudget entity for t_line_price_budget table.
 * 
 * 
 * @since 2014-02-17 17:24:39.860
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_line_price_budget")	
public class LinePriceBudget implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ulinepriceid")
	private String ulinepriceid;
	
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
	
	@Column(name="ndays")
	private Double ndays;
	
	@Column(name="ccur")
	private String ccur;
	
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
	
	@Column(name="nexchangerate")
	private Double nexchangerate;
	
	@Column(name="namountf")
	private Double namountf;
	
	@Column(name="nunitprice")
	private Double nunitprice;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUlinepriceid(String ulinepriceid){
	    this.ulinepriceid=ulinepriceid;
	}
	public String getUlinepriceid(){
	    return ulinepriceid;
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
	public void setNdays(Double ndays){
	    this.ndays=ndays;
	}
	public Double getNdays(){
	    return ndays;
	}
	public void setCcur(String ccur){
	    this.ccur=ccur;
	}
	public String getCcur(){
	    return ccur;
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
	public void setNunitprice(Double nunitprice){
	    this.nunitprice=nunitprice;
	}
	public Double getNunitprice(){
	    return nunitprice;
	}
}