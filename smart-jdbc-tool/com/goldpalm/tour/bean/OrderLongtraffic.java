package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * OrderLongtraffic entity for t_order_longtraffic table.
 * 
 * 
 * @since 2014-02-17 17:24:41.489
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_order_longtraffic")	
public class OrderLongtraffic implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uorderid")
	private String uorderid;
	
	@Column(name="ulongtrafficid")
	private String ulongtrafficid;
	
	@Column(name="cbooktype")
	private String cbooktype;
	
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
	
	@Column(name="cenname")
	private String cenname;
	
	@Column(name="cidcard")
	private String cidcard;
	
	@Column(name="csex")
	private String csex;
	
	@Column(name="cdemand")
	private String cdemand;
	
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
	public void setUorderid(String uorderid){
	    this.uorderid=uorderid;
	}
	public String getUorderid(){
	    return uorderid;
	}
	public void setUlongtrafficid(String ulongtrafficid){
	    this.ulongtrafficid=ulongtrafficid;
	}
	public String getUlongtrafficid(){
	    return ulongtrafficid;
	}
	public void setCbooktype(String cbooktype){
	    this.cbooktype=cbooktype;
	}
	public String getCbooktype(){
	    return cbooktype;
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
	public void setCenname(String cenname){
	    this.cenname=cenname;
	}
	public String getCenname(){
	    return cenname;
	}
	public void setCidcard(String cidcard){
	    this.cidcard=cidcard;
	}
	public String getCidcard(){
	    return cidcard;
	}
	public void setCsex(String csex){
	    this.csex=csex;
	}
	public String getCsex(){
	    return csex;
	}
	public void setCdemand(String cdemand){
	    this.cdemand=cdemand;
	}
	public String getCdemand(){
	    return cdemand;
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