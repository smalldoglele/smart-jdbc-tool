package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * VisaAttachments entity for t_visa_attachments table.
 * 
 * 
 * @since 2014-02-17 17:24:45.133
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_visa_attachments")	
public class VisaAttachments implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uvisaid")
	private String uvisaid;
	
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
	public void setUvisaid(String uvisaid){
	    this.uvisaid=uvisaid;
	}
	public String getUvisaid(){
	    return uvisaid;
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