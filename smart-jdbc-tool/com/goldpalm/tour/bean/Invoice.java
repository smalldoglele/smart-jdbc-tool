package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Invoice entity for t_invoice table.
 * 
 * 
 * @since 2014-02-17 17:24:39.453
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_invoice")	
public class Invoice implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cinvoicecode")
	private String cinvoicecode;
	
	@Column(name="ctaxno")
	private String ctaxno;
	
	@Column(name="ccorpname")
	private String ccorpname;
	
	@Column(name="ureceivedeptid")
	private String ureceivedeptid;
	
	@Column(name="ureceiveuserid")
	private String ureceiveuserid;
	
	@Column(name="uinvoicecustomerid")
	private String uinvoicecustomerid;
	
	@Column(name="cinvoicecustomer")
	private String cinvoicecustomer;
	
	@Column(name="namount")
	private Double namount;
	
	@Column(name="dinvoicedate")
	private Date dinvoicedate;
	
	@Column(name="uinvoiceuserid")
	private String uinvoiceuserid;
	
	@Column(name="uinvoicedeptid")
	private String uinvoicedeptid;
	
	@Column(name="csummary")
	private String csummary;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="namountlimit")
	private Double namountlimit;
	
	@Column(name="dinvoicecanceldate")
	private Date dinvoicecanceldate;
	
	@Column(name="uinvoiceroleid")
	private String uinvoiceroleid;
	
	@Column(name="ibackflag")
	private Integer ibackflag;
	
	@Column(name="uinvoiceid")
	private String uinvoiceid;
	
	@Column(name="cinvoiceprintcode")
	private String cinvoiceprintcode;
	
	@Column(name="cinvoiceprintno")
	private String cinvoiceprintno;
	
	@Column(name="uorderid")
	private String uorderid;
	
	@Column(name="cinvoiceno")
	private String cinvoiceno;
	
	@Column(name="iisborrow")
	private Integer iisborrow;
	
	@Column(name="cborrowstatus")
	private String cborrowstatus;
	
	@Column(name="cborrowtype")
	private String cborrowtype;
	
	@Column(name="cborrowcsummary")
	private String cborrowcsummary;
	
	@Column(name="cmemo")
	private String cmemo;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCinvoicecode(String cinvoicecode){
	    this.cinvoicecode=cinvoicecode;
	}
	public String getCinvoicecode(){
	    return cinvoicecode;
	}
	public void setCtaxno(String ctaxno){
	    this.ctaxno=ctaxno;
	}
	public String getCtaxno(){
	    return ctaxno;
	}
	public void setCcorpname(String ccorpname){
	    this.ccorpname=ccorpname;
	}
	public String getCcorpname(){
	    return ccorpname;
	}
	public void setUreceivedeptid(String ureceivedeptid){
	    this.ureceivedeptid=ureceivedeptid;
	}
	public String getUreceivedeptid(){
	    return ureceivedeptid;
	}
	public void setUreceiveuserid(String ureceiveuserid){
	    this.ureceiveuserid=ureceiveuserid;
	}
	public String getUreceiveuserid(){
	    return ureceiveuserid;
	}
	public void setUinvoicecustomerid(String uinvoicecustomerid){
	    this.uinvoicecustomerid=uinvoicecustomerid;
	}
	public String getUinvoicecustomerid(){
	    return uinvoicecustomerid;
	}
	public void setCinvoicecustomer(String cinvoicecustomer){
	    this.cinvoicecustomer=cinvoicecustomer;
	}
	public String getCinvoicecustomer(){
	    return cinvoicecustomer;
	}
	public void setNamount(Double namount){
	    this.namount=namount;
	}
	public Double getNamount(){
	    return namount;
	}
	public void setDinvoicedate(Date dinvoicedate){
	    this.dinvoicedate=dinvoicedate;
	}
	public Date getDinvoicedate(){
	    return dinvoicedate;
	}
	public void setUinvoiceuserid(String uinvoiceuserid){
	    this.uinvoiceuserid=uinvoiceuserid;
	}
	public String getUinvoiceuserid(){
	    return uinvoiceuserid;
	}
	public void setUinvoicedeptid(String uinvoicedeptid){
	    this.uinvoicedeptid=uinvoicedeptid;
	}
	public String getUinvoicedeptid(){
	    return uinvoicedeptid;
	}
	public void setCsummary(String csummary){
	    this.csummary=csummary;
	}
	public String getCsummary(){
	    return csummary;
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
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setNamountlimit(Double namountlimit){
	    this.namountlimit=namountlimit;
	}
	public Double getNamountlimit(){
	    return namountlimit;
	}
	public void setDinvoicecanceldate(Date dinvoicecanceldate){
	    this.dinvoicecanceldate=dinvoicecanceldate;
	}
	public Date getDinvoicecanceldate(){
	    return dinvoicecanceldate;
	}
	public void setUinvoiceroleid(String uinvoiceroleid){
	    this.uinvoiceroleid=uinvoiceroleid;
	}
	public String getUinvoiceroleid(){
	    return uinvoiceroleid;
	}
	public void setIbackflag(Integer ibackflag){
	    this.ibackflag=ibackflag;
	}
	public Integer getIbackflag(){
	    return ibackflag;
	}
	public void setUinvoiceid(String uinvoiceid){
	    this.uinvoiceid=uinvoiceid;
	}
	public String getUinvoiceid(){
	    return uinvoiceid;
	}
	public void setCinvoiceprintcode(String cinvoiceprintcode){
	    this.cinvoiceprintcode=cinvoiceprintcode;
	}
	public String getCinvoiceprintcode(){
	    return cinvoiceprintcode;
	}
	public void setCinvoiceprintno(String cinvoiceprintno){
	    this.cinvoiceprintno=cinvoiceprintno;
	}
	public String getCinvoiceprintno(){
	    return cinvoiceprintno;
	}
	public void setUorderid(String uorderid){
	    this.uorderid=uorderid;
	}
	public String getUorderid(){
	    return uorderid;
	}
	public void setCinvoiceno(String cinvoiceno){
	    this.cinvoiceno=cinvoiceno;
	}
	public String getCinvoiceno(){
	    return cinvoiceno;
	}
	public void setIisborrow(Integer iisborrow){
	    this.iisborrow=iisborrow;
	}
	public Integer getIisborrow(){
	    return iisborrow;
	}
	public void setCborrowstatus(String cborrowstatus){
	    this.cborrowstatus=cborrowstatus;
	}
	public String getCborrowstatus(){
	    return cborrowstatus;
	}
	public void setCborrowtype(String cborrowtype){
	    this.cborrowtype=cborrowtype;
	}
	public String getCborrowtype(){
	    return cborrowtype;
	}
	public void setCborrowcsummary(String cborrowcsummary){
	    this.cborrowcsummary=cborrowcsummary;
	}
	public String getCborrowcsummary(){
	    return cborrowcsummary;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
}