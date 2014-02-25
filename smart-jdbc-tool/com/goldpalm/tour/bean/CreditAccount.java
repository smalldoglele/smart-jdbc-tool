package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CreditAccount entity for t_credit_account table.
 * 
 * 
 * @since 2014-02-17 17:24:37.800
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_credit_account")	
public class CreditAccount implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="correlation_id")
	private String correlationId;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="noverdraft")
	private Double noverdraft;
	
	@Column(name="cstate")
	private String cstate;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="ndeposit")
	private Double ndeposit;
	
	@Column(name="nborrow")
	private Double nborrow;
	
	@Column(name="nguaranty")
	private Double nguaranty;
	
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
	
	@Column(name="uupdate")
	private Date uupdate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCorrelationId(String correlationId){
	    this.correlationId=correlationId;
	}
	public String getCorrelationId(){
	    return correlationId;
	}
	public void setCname(String cname){
	    this.cname=cname;
	}
	public String getCname(){
	    return cname;
	}
	public void setNoverdraft(Double noverdraft){
	    this.noverdraft=noverdraft;
	}
	public Double getNoverdraft(){
	    return noverdraft;
	}
	public void setCstate(String cstate){
	    this.cstate=cstate;
	}
	public String getCstate(){
	    return cstate;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setNdeposit(Double ndeposit){
	    this.ndeposit=ndeposit;
	}
	public Double getNdeposit(){
	    return ndeposit;
	}
	public void setNborrow(Double nborrow){
	    this.nborrow=nborrow;
	}
	public Double getNborrow(){
	    return nborrow;
	}
	public void setNguaranty(Double nguaranty){
	    this.nguaranty=nguaranty;
	}
	public Double getNguaranty(){
	    return nguaranty;
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
	public void setUupdate(Date uupdate){
	    this.uupdate=uupdate;
	}
	public Date getUupdate(){
	    return uupdate;
	}
}