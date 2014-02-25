package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * TradeOrder entity for t_trade_order table.
 * 
 * 
 * @since 2014-02-17 17:24:44.653
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_trade_order")	
public class TradeOrder implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="clinename")
	private String clinename;
	
	@Column(name="csupplier")
	private String csupplier;
	
	@Column(name="idays")
	private Integer idays;
	
	@Column(name="dbgndate")
	private Date dbgndate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="nprice")
	private Double nprice;
	
	@Column(name="ncost")
	private Double ncost;
	
	@Column(name="cdepartcity")
	private String cdepartcity;
	
	@Column(name="coptype")
	private String coptype;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="ndownpayment")
	private Double ndownpayment;
	
	@Column(name="cmemo")
	private String cmemo;
	
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
	public void setClinename(String clinename){
	    this.clinename=clinename;
	}
	public String getClinename(){
	    return clinename;
	}
	public void setCsupplier(String csupplier){
	    this.csupplier=csupplier;
	}
	public String getCsupplier(){
	    return csupplier;
	}
	public void setIdays(Integer idays){
	    this.idays=idays;
	}
	public Integer getIdays(){
	    return idays;
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
	public void setNprice(Double nprice){
	    this.nprice=nprice;
	}
	public Double getNprice(){
	    return nprice;
	}
	public void setNcost(Double ncost){
	    this.ncost=ncost;
	}
	public Double getNcost(){
	    return ncost;
	}
	public void setCdepartcity(String cdepartcity){
	    this.cdepartcity=cdepartcity;
	}
	public String getCdepartcity(){
	    return cdepartcity;
	}
	public void setCoptype(String coptype){
	    this.coptype=coptype;
	}
	public String getCoptype(){
	    return coptype;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setNdownpayment(Double ndownpayment){
	    this.ndownpayment=ndownpayment;
	}
	public Double getNdownpayment(){
	    return ndownpayment;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
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