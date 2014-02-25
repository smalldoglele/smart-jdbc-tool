package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Commission entity for t_commission table.
 * 
 * 
 * @since 2014-02-17 17:24:37.070
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_commission")	
public class Commission implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="umemberid")
	private String umemberid;
	
	@Column(name="dapplydate")
	private Date dapplydate;
	
	@Column(name="uconfirmuserid")
	private String uconfirmuserid;
	
	@Column(name="uconfirmroleid")
	private String uconfirmroleid;
	
	@Column(name="uconfirmdeptid")
	private String uconfirmdeptid;
	
	@Column(name="uorderid")
	private String uorderid;
	
	@Column(name="ncommission")
	private Double ncommission;
	
	@Column(name="ndiscount")
	private Double ndiscount;
	
	@Column(name="namount")
	private Double namount;
	
	@Column(name="caccounttype")
	private String caccounttype;
	
	@Column(name="cstatus")
	private String cstatus;
	
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
	
	@Column(name="uspplierid")
	private String uspplierid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUmemberid(String umemberid){
	    this.umemberid=umemberid;
	}
	public String getUmemberid(){
	    return umemberid;
	}
	public void setDapplydate(Date dapplydate){
	    this.dapplydate=dapplydate;
	}
	public Date getDapplydate(){
	    return dapplydate;
	}
	public void setUconfirmuserid(String uconfirmuserid){
	    this.uconfirmuserid=uconfirmuserid;
	}
	public String getUconfirmuserid(){
	    return uconfirmuserid;
	}
	public void setUconfirmroleid(String uconfirmroleid){
	    this.uconfirmroleid=uconfirmroleid;
	}
	public String getUconfirmroleid(){
	    return uconfirmroleid;
	}
	public void setUconfirmdeptid(String uconfirmdeptid){
	    this.uconfirmdeptid=uconfirmdeptid;
	}
	public String getUconfirmdeptid(){
	    return uconfirmdeptid;
	}
	public void setUorderid(String uorderid){
	    this.uorderid=uorderid;
	}
	public String getUorderid(){
	    return uorderid;
	}
	public void setNcommission(Double ncommission){
	    this.ncommission=ncommission;
	}
	public Double getNcommission(){
	    return ncommission;
	}
	public void setNdiscount(Double ndiscount){
	    this.ndiscount=ndiscount;
	}
	public Double getNdiscount(){
	    return ndiscount;
	}
	public void setNamount(Double namount){
	    this.namount=namount;
	}
	public Double getNamount(){
	    return namount;
	}
	public void setCaccounttype(String caccounttype){
	    this.caccounttype=caccounttype;
	}
	public String getCaccounttype(){
	    return caccounttype;
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
	public void setUspplierid(String uspplierid){
	    this.uspplierid=uspplierid;
	}
	public String getUspplierid(){
	    return uspplierid;
	}
}