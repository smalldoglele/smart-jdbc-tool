package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CreditBill entity for t_credit_bill table.
 * 
 * 
 * @since 2014-02-17 17:24:37.838
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_credit_bill")	
public class CreditBill implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cbillno")
	private String cbillno;
	
	@Column(name="ddate")
	private Date ddate;
	
	@Column(name="uaccountid")
	private String uaccountid;
	
	@Column(name="namountf")
	private Double namountf;
	
	@Column(name="ccurrency")
	private String ccurrency;
	
	@Column(name="nexchangrate")
	private Double nexchangrate;
	
	@Column(name="namount")
	private Double namount;
	
	@Column(name="cpayment")
	private String cpayment;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="dtime")
	private Date dtime;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="uteamid")
	private String uteamid;
	
	@Column(name="uarpid")
	private String uarpid;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="dposttime")
	private Date dposttime;
	
	@Column(name="upost_userid")
	private String upostUserid;
	
	@Column(name="upost_roleid")
	private String upostRoleid;
	
	@Column(name="upost_deptid")
	private String upostDeptid;
	
	@Column(name="upost_corpid")
	private String upostCorpid;
	
	@Column(name="ucancel_userid")
	private String ucancelUserid;
	
	@Column(name="ucancel_roleid")
	private String ucancelRoleid;
	
	@Column(name="dcancel_time")
	private Date dcancelTime;
	
	@Column(name="ucancel_depid")
	private String ucancelDepid;
	
	@Column(name="ucancel_corpid")
	private String ucancelCorpid;
	
	@Column(name="usourceid")
	private String usourceid;
	
	@Column(name="cstatus")
	private String cstatus;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCbillno(String cbillno){
	    this.cbillno=cbillno;
	}
	public String getCbillno(){
	    return cbillno;
	}
	public void setDdate(Date ddate){
	    this.ddate=ddate;
	}
	public Date getDdate(){
	    return ddate;
	}
	public void setUaccountid(String uaccountid){
	    this.uaccountid=uaccountid;
	}
	public String getUaccountid(){
	    return uaccountid;
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
	public void setCpayment(String cpayment){
	    this.cpayment=cpayment;
	}
	public String getCpayment(){
	    return cpayment;
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
	public void setDtime(Date dtime){
	    this.dtime=dtime;
	}
	public Date getDtime(){
	    return dtime;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setUteamid(String uteamid){
	    this.uteamid=uteamid;
	}
	public String getUteamid(){
	    return uteamid;
	}
	public void setUarpid(String uarpid){
	    this.uarpid=uarpid;
	}
	public String getUarpid(){
	    return uarpid;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setDposttime(Date dposttime){
	    this.dposttime=dposttime;
	}
	public Date getDposttime(){
	    return dposttime;
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
	public void setDcancelTime(Date dcancelTime){
	    this.dcancelTime=dcancelTime;
	}
	public Date getDcancelTime(){
	    return dcancelTime;
	}
	public void setUcancelDepid(String ucancelDepid){
	    this.ucancelDepid=ucancelDepid;
	}
	public String getUcancelDepid(){
	    return ucancelDepid;
	}
	public void setUcancelCorpid(String ucancelCorpid){
	    this.ucancelCorpid=ucancelCorpid;
	}
	public String getUcancelCorpid(){
	    return ucancelCorpid;
	}
	public void setUsourceid(String usourceid){
	    this.usourceid=usourceid;
	}
	public String getUsourceid(){
	    return usourceid;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
}