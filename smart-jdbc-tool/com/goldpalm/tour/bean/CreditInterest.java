package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CreditInterest entity for t_credit_interest table.
 * 
 * 
 * @since 2014-02-17 17:24:37.877
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_credit_interest")	
public class CreditInterest implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cinterestno")
	private String cinterestno;
	
	@Column(name="ubillid")
	private String ubillid;
	
	@Column(name="cbillno")
	private String cbillno;
	
	@Column(name="cstate")
	private String cstate;
	
	@Column(name="cpayment")
	private String cpayment;
	
	@Column(name="namountf")
	private Double namountf;
	
	@Column(name="ccurrency")
	private String ccurrency;
	
	@Column(name="nexchangrate")
	private Double nexchangrate;
	
	@Column(name="namount")
	private Double namount;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="dcreatedate")
	private Date dcreatedate;
	
	@Column(name="upost_userid")
	private String upostUserid;
	
	@Column(name="upost_roleid")
	private String upostRoleid;
	
	@Column(name="upost_deptid")
	private String upostDeptid;
	
	@Column(name="upost_corpid")
	private String upostCorpid;
	
	@Column(name="dpostdate")
	private Date dpostdate;
	
	@Column(name="ucancel_userid")
	private String ucancelUserid;
	
	@Column(name="ucancel_roleid")
	private String ucancelRoleid;
	
	@Column(name="ucancel_deptid")
	private String ucancelDeptid;
	
	@Column(name="ucancel_corpid")
	private String ucancelCorpid;
	
	@Column(name="dcanceldate")
	private Date dcanceldate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCinterestno(String cinterestno){
	    this.cinterestno=cinterestno;
	}
	public String getCinterestno(){
	    return cinterestno;
	}
	public void setUbillid(String ubillid){
	    this.ubillid=ubillid;
	}
	public String getUbillid(){
	    return ubillid;
	}
	public void setCbillno(String cbillno){
	    this.cbillno=cbillno;
	}
	public String getCbillno(){
	    return cbillno;
	}
	public void setCstate(String cstate){
	    this.cstate=cstate;
	}
	public String getCstate(){
	    return cstate;
	}
	public void setCpayment(String cpayment){
	    this.cpayment=cpayment;
	}
	public String getCpayment(){
	    return cpayment;
	}
	public void setNamountf(Double namountf){
	    this.namountf=namountf;
	}
	public Double getNamountf(){
	    return namountf;
	}
	public void setCcurrency(String ccurrency){
	    this.ccurrency=ccurrency;
	}
	public String getCcurrency(){
	    return ccurrency;
	}
	public void setNexchangrate(Double nexchangrate){
	    this.nexchangrate=nexchangrate;
	}
	public Double getNexchangrate(){
	    return nexchangrate;
	}
	public void setNamount(Double namount){
	    this.namount=namount;
	}
	public Double getNamount(){
	    return namount;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setUuserid(String uuserid){
	    this.uuserid=uuserid;
	}
	public String getUuserid(){
	    return uuserid;
	}
	public void setUroleid(String uroleid){
	    this.uroleid=uroleid;
	}
	public String getUroleid(){
	    return uroleid;
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
	public void setDcreatedate(Date dcreatedate){
	    this.dcreatedate=dcreatedate;
	}
	public Date getDcreatedate(){
	    return dcreatedate;
	}
	public void setUpostUserid(String upostUserid){
	    this.upostUserid=upostUserid;
	}
	public String getUpostUserid(){
	    return upostUserid;
	}
	public void setUpostRoleid(String upostRoleid){
	    this.upostRoleid=upostRoleid;
	}
	public String getUpostRoleid(){
	    return upostRoleid;
	}
	public void setUpostDeptid(String upostDeptid){
	    this.upostDeptid=upostDeptid;
	}
	public String getUpostDeptid(){
	    return upostDeptid;
	}
	public void setUpostCorpid(String upostCorpid){
	    this.upostCorpid=upostCorpid;
	}
	public String getUpostCorpid(){
	    return upostCorpid;
	}
	public void setDpostdate(Date dpostdate){
	    this.dpostdate=dpostdate;
	}
	public Date getDpostdate(){
	    return dpostdate;
	}
	public void setUcancelUserid(String ucancelUserid){
	    this.ucancelUserid=ucancelUserid;
	}
	public String getUcancelUserid(){
	    return ucancelUserid;
	}
	public void setUcancelRoleid(String ucancelRoleid){
	    this.ucancelRoleid=ucancelRoleid;
	}
	public String getUcancelRoleid(){
	    return ucancelRoleid;
	}
	public void setUcancelDeptid(String ucancelDeptid){
	    this.ucancelDeptid=ucancelDeptid;
	}
	public String getUcancelDeptid(){
	    return ucancelDeptid;
	}
	public void setUcancelCorpid(String ucancelCorpid){
	    this.ucancelCorpid=ucancelCorpid;
	}
	public String getUcancelCorpid(){
	    return ucancelCorpid;
	}
	public void setDcanceldate(Date dcanceldate){
	    this.dcanceldate=dcanceldate;
	}
	public Date getDcanceldate(){
	    return dcanceldate;
	}
}