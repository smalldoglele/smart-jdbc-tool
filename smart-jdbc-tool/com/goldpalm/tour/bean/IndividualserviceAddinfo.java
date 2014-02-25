package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * IndividualserviceAddinfo entity for t_individualservice_addinfo table.
 * 
 * 
 * @since 2014-02-17 17:24:39.225
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_individualservice_addinfo")	
public class IndividualserviceAddinfo implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uindividualserviceid")
	private String uindividualserviceid;
	
	@Column(name="ino")
	private Integer ino;
	
	@Column(name="cattachpath")
	private String cattachpath;
	
	@Column(name="cattachmemo")
	private String cattachmemo;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUindividualserviceid(String uindividualserviceid){
	    this.uindividualserviceid=uindividualserviceid;
	}
	public String getUindividualserviceid(){
	    return uindividualserviceid;
	}
	public void setIno(Integer ino){
	    this.ino=ino;
	}
	public Integer getIno(){
	    return ino;
	}
	public void setCattachpath(String cattachpath){
	    this.cattachpath=cattachpath;
	}
	public String getCattachpath(){
	    return cattachpath;
	}
	public void setCattachmemo(String cattachmemo){
	    this.cattachmemo=cattachmemo;
	}
	public String getCattachmemo(){
	    return cattachmemo;
	}
	public void setUuserid(String uuserid){
	    this.uuserid=uuserid;
	}
	public String getUuserid(){
	    return uuserid;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
}