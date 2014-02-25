package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * SupplierPrice entity for t_supplier_price table.
 * 
 * 
 * @since 2014-02-17 17:24:43.208
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_supplier_price")	
public class SupplierPrice implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="usupplierid")
	private String usupplierid;
	
	@Column(name="citemtype")
	private String citemtype;
	
	@Column(name="citem")
	private String citem;
	
	@Column(name="cpricetype")
	private String cpricetype;
	
	@Column(name="cunit")
	private String cunit;
	
	@Column(name="ndivideqty")
	private Double ndivideqty;
	
	@Column(name="ccur")
	private String ccur;
	
	@Column(name="namount")
	private Double namount;
	
	@Column(name="csummary")
	private String csummary;
	
	@Column(name="dbgndate")
	private Date dbgndate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="cvaliddate")
	private String cvaliddate;
	
	@Column(name="cdisable")
	private String cdisable;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="uresourceid")
	private String uresourceid;
	
	@Column(name="cmemo")
	private String cmemo;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUsupplierid(String usupplierid){
	    this.usupplierid=usupplierid;
	}
	public String getUsupplierid(){
	    return usupplierid;
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
	public void setCpricetype(String cpricetype){
	    this.cpricetype=cpricetype;
	}
	public String getCpricetype(){
	    return cpricetype;
	}
	public void setCunit(String cunit){
	    this.cunit=cunit;
	}
	public String getCunit(){
	    return cunit;
	}
	public void setNdivideqty(Double ndivideqty){
	    this.ndivideqty=ndivideqty;
	}
	public Double getNdivideqty(){
	    return ndivideqty;
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
	public void setDbgndate(Date dbgndate){
	    this.dbgndate=dbgndate;
	}
	public Date getDbgndate(){
	    return dbgndate;
	}
	public void setDenddate(Date denddate){
	    this.denddate=denddate;
	}
	public Date getDenddate(){
	    return denddate;
	}
	public void setCvaliddate(String cvaliddate){
	    this.cvaliddate=cvaliddate;
	}
	public String getCvaliddate(){
	    return cvaliddate;
	}
	public void setCdisable(String cdisable){
	    this.cdisable=cdisable;
	}
	public String getCdisable(){
	    return cdisable;
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
	public void setUresourceid(String uresourceid){
	    this.uresourceid=uresourceid;
	}
	public String getUresourceid(){
	    return uresourceid;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
}