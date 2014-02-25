package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * PreorderLongtrafficRoute entity for t_preorder_longtraffic_route table.
 * 
 * 
 * @since 2014-02-17 17:24:42.282
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_preorder_longtraffic_route")	
public class PreorderLongtrafficRoute implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="upreorderlongtrafficid")
	private String upreorderlongtrafficid;
	
	@Column(name="ulongtrafficrouteid")
	private String ulongtrafficrouteid;
	
	@Column(name="ino")
	private Integer ino;
	
	@Column(name="ccarriername")
	private String ccarriername;
	
	@Column(name="cdepartcity")
	private String cdepartcity;
	
	@Column(name="carrivecity")
	private String carrivecity;
	
	@Column(name="clineno")
	private String clineno;
	
	@Column(name="ctrafficmodel")
	private String ctrafficmodel;
	
	@Column(name="cboardport")
	private String cboardport;
	
	@Column(name="coffport")
	private String coffport;
	
	@Column(name="cboardtime")
	private String cboardtime;
	
	@Column(name="cofftime")
	private String cofftime;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="iadddays")
	private Integer iadddays;
	
	@Column(name="cdepartflag")
	private String cdepartflag;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUpreorderlongtrafficid(String upreorderlongtrafficid){
	    this.upreorderlongtrafficid=upreorderlongtrafficid;
	}
	public String getUpreorderlongtrafficid(){
	    return upreorderlongtrafficid;
	}
	public void setUlongtrafficrouteid(String ulongtrafficrouteid){
	    this.ulongtrafficrouteid=ulongtrafficrouteid;
	}
	public String getUlongtrafficrouteid(){
	    return ulongtrafficrouteid;
	}
	public void setIno(Integer ino){
	    this.ino=ino;
	}
	public Integer getIno(){
	    return ino;
	}
	public void setCcarriername(String ccarriername){
	    this.ccarriername=ccarriername;
	}
	public String getCcarriername(){
	    return ccarriername;
	}
	public void setCdepartcity(String cdepartcity){
	    this.cdepartcity=cdepartcity;
	}
	public String getCdepartcity(){
	    return cdepartcity;
	}
	public void setCarrivecity(String carrivecity){
	    this.carrivecity=carrivecity;
	}
	public String getCarrivecity(){
	    return carrivecity;
	}
	public void setClineno(String clineno){
	    this.clineno=clineno;
	}
	public String getClineno(){
	    return clineno;
	}
	public void setCtrafficmodel(String ctrafficmodel){
	    this.ctrafficmodel=ctrafficmodel;
	}
	public String getCtrafficmodel(){
	    return ctrafficmodel;
	}
	public void setCboardport(String cboardport){
	    this.cboardport=cboardport;
	}
	public String getCboardport(){
	    return cboardport;
	}
	public void setCoffport(String coffport){
	    this.coffport=coffport;
	}
	public String getCoffport(){
	    return coffport;
	}
	public void setCboardtime(String cboardtime){
	    this.cboardtime=cboardtime;
	}
	public String getCboardtime(){
	    return cboardtime;
	}
	public void setCofftime(String cofftime){
	    this.cofftime=cofftime;
	}
	public String getCofftime(){
	    return cofftime;
	}
	public void setUuserid(String uuserid){
	    this.uuserid=uuserid;
	}
	public String getUuserid(){
	    return uuserid;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setIadddays(Integer iadddays){
	    this.iadddays=iadddays;
	}
	public Integer getIadddays(){
	    return iadddays;
	}
	public void setCdepartflag(String cdepartflag){
	    this.cdepartflag=cdepartflag;
	}
	public String getCdepartflag(){
	    return cdepartflag;
	}
}