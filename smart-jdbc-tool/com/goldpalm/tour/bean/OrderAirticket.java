package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * OrderAirticket entity for t_order_airticket table.
 * 
 * 
 * @since 2014-02-17 17:24:40.987
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_order_airticket")	
public class OrderAirticket implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uorderid")
	private String uorderid;
	
	@Column(name="cpnr")
	private String cpnr;
	
	@Column(name="cpnrxml")
	private String cpnrxml;
	
	@Column(name="cagentoffice")
	private String cagentoffice;
	
	@Column(name="cflighttype")
	private String cflighttype;
	
	@Column(name="celecticket")
	private String celecticket;
	
	@Column(name="cbooktype")
	private String cbooktype;
	
	@Column(name="cticketno")
	private String cticketno;
	
	@Column(name="cticketstatus")
	private String cticketstatus;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="iperson")
	private Integer iperson;
	
	@Column(name="imailreceipt")
	private String imailreceipt;
	
	@Column(name="cmailname")
	private String cmailname;
	
	@Column(name="cmailaddress")
	private String cmailaddress;
	
	@Column(name="cmailzip")
	private String cmailzip;
	
	@Column(name="cflightinfo")
	private String cflightinfo;
	
	@Column(name="nfare")
	private Double nfare;
	
	@Column(name="ntaxcn")
	private Double ntaxcn;
	
	@Column(name="ntaxyq")
	private Double ntaxyq;
	
	@Column(name="ncommrate")
	private Double ncommrate;
	
	@Column(name="ddeparturedate")
	private Date ddeparturedate;
	
	@Column(name="cflightno")
	private String cflightno;
	
	@Column(name="cclasscode")
	private String cclasscode;
	
	@Column(name="ddeparturedate2")
	private Date ddeparturedate2;
	
	@Column(name="cflightno2")
	private String cflightno2;
	
	@Column(name="cclasscode2")
	private String cclasscode2;
	
	@Column(name="dpnrvaliddate")
	private Date dpnrvaliddate;
	
	@Column(name="ceimemo")
	private String ceimemo;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUorderid(String uorderid){
	    this.uorderid=uorderid;
	}
	public String getUorderid(){
	    return uorderid;
	}
	public void setCpnr(String cpnr){
	    this.cpnr=cpnr;
	}
	public String getCpnr(){
	    return cpnr;
	}
	public void setCpnrxml(String cpnrxml){
	    this.cpnrxml=cpnrxml;
	}
	public String getCpnrxml(){
	    return cpnrxml;
	}
	public void setCagentoffice(String cagentoffice){
	    this.cagentoffice=cagentoffice;
	}
	public String getCagentoffice(){
	    return cagentoffice;
	}
	public void setCflighttype(String cflighttype){
	    this.cflighttype=cflighttype;
	}
	public String getCflighttype(){
	    return cflighttype;
	}
	public void setCelecticket(String celecticket){
	    this.celecticket=celecticket;
	}
	public String getCelecticket(){
	    return celecticket;
	}
	public void setCbooktype(String cbooktype){
	    this.cbooktype=cbooktype;
	}
	public String getCbooktype(){
	    return cbooktype;
	}
	public void setCticketno(String cticketno){
	    this.cticketno=cticketno;
	}
	public String getCticketno(){
	    return cticketno;
	}
	public void setCticketstatus(String cticketstatus){
	    this.cticketstatus=cticketstatus;
	}
	public String getCticketstatus(){
	    return cticketstatus;
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
	public void setIperson(Integer iperson){
	    this.iperson=iperson;
	}
	public Integer getIperson(){
	    return iperson;
	}
	public void setImailreceipt(String imailreceipt){
	    this.imailreceipt=imailreceipt;
	}
	public String getImailreceipt(){
	    return imailreceipt;
	}
	public void setCmailname(String cmailname){
	    this.cmailname=cmailname;
	}
	public String getCmailname(){
	    return cmailname;
	}
	public void setCmailaddress(String cmailaddress){
	    this.cmailaddress=cmailaddress;
	}
	public String getCmailaddress(){
	    return cmailaddress;
	}
	public void setCmailzip(String cmailzip){
	    this.cmailzip=cmailzip;
	}
	public String getCmailzip(){
	    return cmailzip;
	}
	public void setCflightinfo(String cflightinfo){
	    this.cflightinfo=cflightinfo;
	}
	public String getCflightinfo(){
	    return cflightinfo;
	}
	public void setNfare(Double nfare){
	    this.nfare=nfare;
	}
	public Double getNfare(){
	    return nfare;
	}
	public void setNtaxcn(Double ntaxcn){
	    this.ntaxcn=ntaxcn;
	}
	public Double getNtaxcn(){
	    return ntaxcn;
	}
	public void setNtaxyq(Double ntaxyq){
	    this.ntaxyq=ntaxyq;
	}
	public Double getNtaxyq(){
	    return ntaxyq;
	}
	public void setNcommrate(Double ncommrate){
	    this.ncommrate=ncommrate;
	}
	public Double getNcommrate(){
	    return ncommrate;
	}
	public void setDdeparturedate(Date ddeparturedate){
	    this.ddeparturedate=ddeparturedate;
	}
	public Date getDdeparturedate(){
	    return ddeparturedate;
	}
	public void setCflightno(String cflightno){
	    this.cflightno=cflightno;
	}
	public String getCflightno(){
	    return cflightno;
	}
	public void setCclasscode(String cclasscode){
	    this.cclasscode=cclasscode;
	}
	public String getCclasscode(){
	    return cclasscode;
	}
	public void setDdeparturedate2(Date ddeparturedate2){
	    this.ddeparturedate2=ddeparturedate2;
	}
	public Date getDdeparturedate2(){
	    return ddeparturedate2;
	}
	public void setCflightno2(String cflightno2){
	    this.cflightno2=cflightno2;
	}
	public String getCflightno2(){
	    return cflightno2;
	}
	public void setCclasscode2(String cclasscode2){
	    this.cclasscode2=cclasscode2;
	}
	public String getCclasscode2(){
	    return cclasscode2;
	}
	public void setDpnrvaliddate(Date dpnrvaliddate){
	    this.dpnrvaliddate=dpnrvaliddate;
	}
	public Date getDpnrvaliddate(){
	    return dpnrvaliddate;
	}
	public void setCeimemo(String ceimemo){
	    this.ceimemo=ceimemo;
	}
	public String getCeimemo(){
	    return ceimemo;
	}
}