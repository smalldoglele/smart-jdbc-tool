package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * InvoiceRp entity for t_invoice_rp table.
 * 
 * 
 * @since 2014-02-17 17:24:39.523
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_invoice_rp")	
public class InvoiceRp implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uinvoiceid")
	private String uinvoiceid;
	
	@Column(name="urpid")
	private String urpid;
	
	@Column(name="namount")
	private Double namount;
	
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
	public void setUinvoiceid(String uinvoiceid){
	    this.uinvoiceid=uinvoiceid;
	}
	public String getUinvoiceid(){
	    return uinvoiceid;
	}
	public void setUrpid(String urpid){
	    this.urpid=urpid;
	}
	public String getUrpid(){
	    return urpid;
	}
	public void setNamount(Double namount){
	    this.namount=namount;
	}
	public Double getNamount(){
	    return namount;
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