package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CompactPackage entity for t_compact_package table.
 * 
 * 
 * @since 2014-02-17 17:24:37.218
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_compact_package")	
public class CompactPackage implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cnum")
	private Double cnum;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="compactpackageno")
	private String compactpackageno;
	
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
	
	@Column(name="cvalid")
	private String cvalid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCnum(Double cnum){
	    this.cnum=cnum;
	}
	public Double getCnum(){
	    return cnum;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setCompactpackageno(String compactpackageno){
	    this.compactpackageno=compactpackageno;
	}
	public String getCompactpackageno(){
	    return compactpackageno;
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
	public void setCvalid(String cvalid){
	    this.cvalid=cvalid;
	}
	public String getCvalid(){
	    return cvalid;
	}
}