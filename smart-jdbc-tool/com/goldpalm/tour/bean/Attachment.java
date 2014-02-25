package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Attachment entity for t_attachment table.
 * 
 * 
 * @since 2014-02-17 17:24:35.847
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_attachment")	
public class Attachment implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ulinkid")
	private String ulinkid;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="cfilename")
	private String cfilename;
	
	@Column(name="cdisplaytype")
	private String cdisplaytype;
	
	@Column(name="cdescribe")
	private String cdescribe;
	
	@Column(name="cpicpath")
	private String cpicpath;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="dcreate")
	private Date dcreate;
	
	@Column(name="clinktable")
	private String clinktable;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUlinkid(String ulinkid){
	    this.ulinkid=ulinkid;
	}
	public String getUlinkid(){
	    return ulinkid;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setCfilename(String cfilename){
	    this.cfilename=cfilename;
	}
	public String getCfilename(){
	    return cfilename;
	}
	public void setCdisplaytype(String cdisplaytype){
	    this.cdisplaytype=cdisplaytype;
	}
	public String getCdisplaytype(){
	    return cdisplaytype;
	}
	public void setCdescribe(String cdescribe){
	    this.cdescribe=cdescribe;
	}
	public String getCdescribe(){
	    return cdescribe;
	}
	public void setCpicpath(String cpicpath){
	    this.cpicpath=cpicpath;
	}
	public String getCpicpath(){
	    return cpicpath;
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
	public void setDcreate(Date dcreate){
	    this.dcreate=dcreate;
	}
	public Date getDcreate(){
	    return dcreate;
	}
	public void setClinktable(String clinktable){
	    this.clinktable=clinktable;
	}
	public String getClinktable(){
	    return clinktable;
	}
}