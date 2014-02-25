package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Theme entity for t_theme table.
 * 
 * 
 * @since 2014-02-17 17:24:44.416
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_theme")	
public class Theme implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cdescribe")
	private String cdescribe;
	
	@Column(name="cpicpath")
	private String cpicpath;
	
	@Column(name="ino")
	private Integer ino;
	
	@Column(name="cisvalid")
	private String cisvalid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="curl")
	private String curl;
	
	@Column(name="cimgpath")
	private String cimgpath;
	
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
	public void setIno(Integer ino){
	    this.ino=ino;
	}
	public Integer getIno(){
	    return ino;
	}
	public void setCisvalid(String cisvalid){
	    this.cisvalid=cisvalid;
	}
	public String getCisvalid(){
	    return cisvalid;
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
	public void setCurl(String curl){
	    this.curl=curl;
	}
	public String getCurl(){
	    return curl;
	}
	public void setCimgpath(String cimgpath){
	    this.cimgpath=cimgpath;
	}
	public String getCimgpath(){
	    return cimgpath;
	}
}