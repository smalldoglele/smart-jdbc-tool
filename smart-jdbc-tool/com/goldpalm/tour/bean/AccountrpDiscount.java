package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * AccountrpDiscount entity for t_accountrp_discount table.
 * 
 * 
 * @since 2014-02-17 17:24:34.910
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_accountrp_discount")	
public class AccountrpDiscount implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uAccountRPID")
	private String uAccountRPID;
	
	@Column(name="iNo")
	private Integer iNo;
	
	@Column(name="cDiscountType")
	private String cDiscountType;
	
	@Column(name="nDiscountRate")
	private Double nDiscountRate;
	
	@Column(name="nDiscount")
	private Double nDiscount;
	
	@Column(name="cAudit")
	private String cAudit;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="ucardid")
	private String ucardid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUAccountRPID(String uAccountRPID){
	    this.uAccountRPID=uAccountRPID;
	}
	public String getUAccountRPID(){
	    return uAccountRPID;
	}
	public void setINo(Integer iNo){
	    this.iNo=iNo;
	}
	public Integer getINo(){
	    return iNo;
	}
	public void setCDiscountType(String cDiscountType){
	    this.cDiscountType=cDiscountType;
	}
	public String getCDiscountType(){
	    return cDiscountType;
	}
	public void setNDiscountRate(Double nDiscountRate){
	    this.nDiscountRate=nDiscountRate;
	}
	public Double getNDiscountRate(){
	    return nDiscountRate;
	}
	public void setNDiscount(Double nDiscount){
	    this.nDiscount=nDiscount;
	}
	public Double getNDiscount(){
	    return nDiscount;
	}
	public void setCAudit(String cAudit){
	    this.cAudit=cAudit;
	}
	public String getCAudit(){
	    return cAudit;
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
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setUcardid(String ucardid){
	    this.ucardid=ucardid;
	}
	public String getUcardid(){
	    return ucardid;
	}
}