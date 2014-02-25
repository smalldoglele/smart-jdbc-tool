package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Driver entity for t_driver table.
 * 
 * 
 * @since 2014-02-17 17:24:38.540
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_driver")	
public class Driver implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="csex")
	private String csex;
	
	@Column(name="ccertificatetype")
	private String ccertificatetype;
	
	@Column(name="ccertificateid")
	private String ccertificateid;
	
	@Column(name="cmobile")
	private String cmobile;
	
	@Column(name="ccontactinfo")
	private String ccontactinfo;
	
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
	public void setCname(String cname){
	    this.cname=cname;
	}
	public String getCname(){
	    return cname;
	}
	public void setCsex(String csex){
	    this.csex=csex;
	}
	public String getCsex(){
	    return csex;
	}
	public void setCcertificatetype(String ccertificatetype){
	    this.ccertificatetype=ccertificatetype;
	}
	public String getCcertificatetype(){
	    return ccertificatetype;
	}
	public void setCcertificateid(String ccertificateid){
	    this.ccertificateid=ccertificateid;
	}
	public String getCcertificateid(){
	    return ccertificateid;
	}
	public void setCmobile(String cmobile){
	    this.cmobile=cmobile;
	}
	public String getCmobile(){
	    return cmobile;
	}
	public void setCcontactinfo(String ccontactinfo){
	    this.ccontactinfo=ccontactinfo;
	}
	public String getCcontactinfo(){
	    return ccontactinfo;
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