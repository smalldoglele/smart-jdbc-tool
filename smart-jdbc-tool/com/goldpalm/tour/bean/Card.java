package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Card entity for t_card table.
 * 
 * 
 * @since 2014-02-17 17:24:36.245
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_card")	
public class Card implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ccardno")
	private String ccardno;
	
	@Column(name="ccardnorule")
	private String ccardnorule;
	
	@Column(name="umemberid")
	private String umemberid;
	
	@Column(name="cno")
	private String cno;
	
	@Column(name="ccardtype")
	private String ccardtype;
	
	@Column(name="ccardname")
	private String ccardname;
	
	@Column(name="ccardlevel")
	private String ccardlevel;
	
	@Column(name="npointrate")
	private Double npointrate;
	
	@Column(name="isumtimes")
	private Integer isumtimes;
	
	@Column(name="nsumamount")
	private Double nsumamount;
	
	@Column(name="isumpoint")
	private Integer isumpoint;
	
	@Column(name="iusepoint")
	private Integer iusepoint;
	
	@Column(name="ncreditmax")
	private Double ncreditmax;
	
	@Column(name="ncreditamount")
	private Double ncreditamount;
	
	@Column(name="ureceivedeptid")
	private String ureceivedeptid;
	
	@Column(name="ureceiveuserid")
	private String ureceiveuserid;
	
	@Column(name="ucarduserid")
	private String ucarduserid;
	
	@Column(name="ucarddeptid")
	private String ucarddeptid;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="dkkdate")
	private Date dkkdate;
	
	@Column(name="cmagcardno")
	private String cmagcardno;
	
	@Column(name="urpid")
	private String urpid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCcardno(String ccardno){
	    this.ccardno=ccardno;
	}
	public String getCcardno(){
	    return ccardno;
	}
	public void setCcardnorule(String ccardnorule){
	    this.ccardnorule=ccardnorule;
	}
	public String getCcardnorule(){
	    return ccardnorule;
	}
	public void setUmemberid(String umemberid){
	    this.umemberid=umemberid;
	}
	public String getUmemberid(){
	    return umemberid;
	}
	public void setCno(String cno){
	    this.cno=cno;
	}
	public String getCno(){
	    return cno;
	}
	public void setCcardtype(String ccardtype){
	    this.ccardtype=ccardtype;
	}
	public String getCcardtype(){
	    return ccardtype;
	}
	public void setCcardname(String ccardname){
	    this.ccardname=ccardname;
	}
	public String getCcardname(){
	    return ccardname;
	}
	public void setCcardlevel(String ccardlevel){
	    this.ccardlevel=ccardlevel;
	}
	public String getCcardlevel(){
	    return ccardlevel;
	}
	public void setNpointrate(Double npointrate){
	    this.npointrate=npointrate;
	}
	public Double getNpointrate(){
	    return npointrate;
	}
	public void setIsumtimes(Integer isumtimes){
	    this.isumtimes=isumtimes;
	}
	public Integer getIsumtimes(){
	    return isumtimes;
	}
	public void setNsumamount(Double nsumamount){
	    this.nsumamount=nsumamount;
	}
	public Double getNsumamount(){
	    return nsumamount;
	}
	public void setIsumpoint(Integer isumpoint){
	    this.isumpoint=isumpoint;
	}
	public Integer getIsumpoint(){
	    return isumpoint;
	}
	public void setIusepoint(Integer iusepoint){
	    this.iusepoint=iusepoint;
	}
	public Integer getIusepoint(){
	    return iusepoint;
	}
	public void setNcreditmax(Double ncreditmax){
	    this.ncreditmax=ncreditmax;
	}
	public Double getNcreditmax(){
	    return ncreditmax;
	}
	public void setNcreditamount(Double ncreditamount){
	    this.ncreditamount=ncreditamount;
	}
	public Double getNcreditamount(){
	    return ncreditamount;
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
	public void setUcarduserid(String ucarduserid){
	    this.ucarduserid=ucarduserid;
	}
	public String getUcarduserid(){
	    return ucarduserid;
	}
	public void setUcarddeptid(String ucarddeptid){
	    this.ucarddeptid=ucarddeptid;
	}
	public String getUcarddeptid(){
	    return ucarddeptid;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
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
	public void setUroleid(String uroleid){
	    this.uroleid=uroleid;
	}
	public String getUroleid(){
	    return uroleid;
	}
	public void setUcorpid(String ucorpid){
	    this.ucorpid=ucorpid;
	}
	public String getUcorpid(){
	    return ucorpid;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setDkkdate(Date dkkdate){
	    this.dkkdate=dkkdate;
	}
	public Date getDkkdate(){
	    return dkkdate;
	}
	public void setCmagcardno(String cmagcardno){
	    this.cmagcardno=cmagcardno;
	}
	public String getCmagcardno(){
	    return cmagcardno;
	}
	public void setUrpid(String urpid){
	    this.urpid=urpid;
	}
	public String getUrpid(){
	    return urpid;
	}
}