package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Accesslog entity for t_accesslog table.
 * 
 * 
 * @since 2014-02-17 17:24:34.527
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_accesslog")	
public class Accesslog implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cservername")
	private String cservername;
	
	@Column(name="cremoteaddr")
	private String cremoteaddr;
	
	@Column(name="csessionid")
	private String csessionid;
	
	@Column(name="dcreated")
	private Date dcreated;
	
	@Column(name="dlastaccess")
	private Date dlastaccess;
	
	@Column(name="cbrowsecore")
	private String cbrowsecore;
	
	@Column(name="cbrowsename")
	private String cbrowsename;
	
	@Column(name="costype")
	private String costype;
	
	@Column(name="creferer")
	private String creferer;
	
	@Column(name="cuseragent")
	private String cuseragent;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCservername(String cservername){
	    this.cservername=cservername;
	}
	public String getCservername(){
	    return cservername;
	}
	public void setCremoteaddr(String cremoteaddr){
	    this.cremoteaddr=cremoteaddr;
	}
	public String getCremoteaddr(){
	    return cremoteaddr;
	}
	public void setCsessionid(String csessionid){
	    this.csessionid=csessionid;
	}
	public String getCsessionid(){
	    return csessionid;
	}
	public void setDcreated(Date dcreated){
	    this.dcreated=dcreated;
	}
	public Date getDcreated(){
	    return dcreated;
	}
	public void setDlastaccess(Date dlastaccess){
	    this.dlastaccess=dlastaccess;
	}
	public Date getDlastaccess(){
	    return dlastaccess;
	}
	public void setCbrowsecore(String cbrowsecore){
	    this.cbrowsecore=cbrowsecore;
	}
	public String getCbrowsecore(){
	    return cbrowsecore;
	}
	public void setCbrowsename(String cbrowsename){
	    this.cbrowsename=cbrowsename;
	}
	public String getCbrowsename(){
	    return cbrowsename;
	}
	public void setCostype(String costype){
	    this.costype=costype;
	}
	public String getCostype(){
	    return costype;
	}
	public void setCreferer(String creferer){
	    this.creferer=creferer;
	}
	public String getCreferer(){
	    return creferer;
	}
	public void setCuseragent(String cuseragent){
	    this.cuseragent=cuseragent;
	}
	public String getCuseragent(){
	    return cuseragent;
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
}