package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * VisaType entity for t_visa_type table.
 * 
 * 
 * @since 2014-02-17 17:24:45.204
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_visa_type")	
public class VisaType implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cdestcountry")
	private String cdestcountry;
	
	@Column(name="cvisatype")
	private String cvisatype;
	
	@Column(name="cvisasubtype")
	private String cvisasubtype;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="usourceid")
	private String usourceid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCdestcountry(String cdestcountry){
	    this.cdestcountry=cdestcountry;
	}
	public String getCdestcountry(){
	    return cdestcountry;
	}
	public void setCvisatype(String cvisatype){
	    this.cvisatype=cvisatype;
	}
	public String getCvisatype(){
	    return cvisatype;
	}
	public void setCvisasubtype(String cvisasubtype){
	    this.cvisasubtype=cvisasubtype;
	}
	public String getCvisasubtype(){
	    return cvisasubtype;
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
	public void setUsourceid(String usourceid){
	    this.usourceid=usourceid;
	}
	public String getUsourceid(){
	    return usourceid;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
}