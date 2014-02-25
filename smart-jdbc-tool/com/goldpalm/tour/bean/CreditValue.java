package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CreditValue entity for t_credit_value table.
 * 
 * 
 * @since 2014-02-17 17:24:37.977
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_credit_value")	
public class CreditValue implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="creditvalue")
	private Double creditvalue;
	
	@Column(name="startdate")
	private Date startdate;
	
	@Column(name="stopdate")
	private Date stopdate;
	
	@Column(name="auditorone")
	private String auditorone;
	
	@Column(name="checkonedate")
	private Date checkonedate;
	
	@Column(name="auditortwo")
	private String auditortwo;
	
	@Column(name="checktwodate")
	private Date checktwodate;
	
	@Column(name="ucreditmangerid")
	private String ucreditmangerid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="dcreatedate")
	private Date dcreatedate;
	
	@Column(name="ctype")
	private String ctype;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCreditvalue(Double creditvalue){
	    this.creditvalue=creditvalue;
	}
	public Double getCreditvalue(){
	    return creditvalue;
	}
	public void setStartdate(Date startdate){
	    this.startdate=startdate;
	}
	public Date getStartdate(){
	    return startdate;
	}
	public void setStopdate(Date stopdate){
	    this.stopdate=stopdate;
	}
	public Date getStopdate(){
	    return stopdate;
	}
	public void setAuditorone(String auditorone){
	    this.auditorone=auditorone;
	}
	public String getAuditorone(){
	    return auditorone;
	}
	public void setCheckonedate(Date checkonedate){
	    this.checkonedate=checkonedate;
	}
	public Date getCheckonedate(){
	    return checkonedate;
	}
	public void setAuditortwo(String auditortwo){
	    this.auditortwo=auditortwo;
	}
	public String getAuditortwo(){
	    return auditortwo;
	}
	public void setChecktwodate(Date checktwodate){
	    this.checktwodate=checktwodate;
	}
	public Date getChecktwodate(){
	    return checktwodate;
	}
	public void setUcreditmangerid(String ucreditmangerid){
	    this.ucreditmangerid=ucreditmangerid;
	}
	public String getUcreditmangerid(){
	    return ucreditmangerid;
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
	public void setDcreatedate(Date dcreatedate){
	    this.dcreatedate=dcreatedate;
	}
	public Date getDcreatedate(){
	    return dcreatedate;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
}