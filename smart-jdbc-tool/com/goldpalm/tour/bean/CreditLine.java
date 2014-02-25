package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CreditLine entity for t_credit_line table.
 * 
 * 
 * @since 2014-02-17 17:24:37.912
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_credit_line")	
public class CreditLine implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="cquotatype")
	private String cquotatype;
	
	@Column(name="uquotaid")
	private String uquotaid;
	
	@Column(name="namount")
	private Double namount;
	
	@Column(name="dbegindate")
	private Date dbegindate;
	
	@Column(name="denddate")
	private Date denddate;
	
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
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setCquotatype(String cquotatype){
	    this.cquotatype=cquotatype;
	}
	public String getCquotatype(){
	    return cquotatype;
	}
	public void setUquotaid(String uquotaid){
	    this.uquotaid=uquotaid;
	}
	public String getUquotaid(){
	    return uquotaid;
	}
	public void setNamount(Double namount){
	    this.namount=namount;
	}
	public Double getNamount(){
	    return namount;
	}
	public void setDbegindate(Date dbegindate){
	    this.dbegindate=dbegindate;
	}
	public Date getDbegindate(){
	    return dbegindate;
	}
	public void setDenddate(Date denddate){
	    this.denddate=denddate;
	}
	public Date getDenddate(){
	    return denddate;
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
}