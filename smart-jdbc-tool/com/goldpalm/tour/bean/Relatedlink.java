package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Relatedlink entity for t_relatedlink table.
 * 
 * 
 * @since 2014-02-17 17:24:42.633
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_relatedlink")	
public class Relatedlink implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ino")
	private Integer ino;
	
	@Column(name="ucolumnid")
	private String ucolumnid;
	
	@Column(name="ctitle")
	private String ctitle;
	
	@Column(name="curl")
	private String curl;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="cpicpath")
	private String cpicpath;
	
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
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setIno(Integer ino){
	    this.ino=ino;
	}
	public Integer getIno(){
	    return ino;
	}
	public void setUcolumnid(String ucolumnid){
	    this.ucolumnid=ucolumnid;
	}
	public String getUcolumnid(){
	    return ucolumnid;
	}
	public void setCtitle(String ctitle){
	    this.ctitle=ctitle;
	}
	public String getCtitle(){
	    return ctitle;
	}
	public void setCurl(String curl){
	    this.curl=curl;
	}
	public String getCurl(){
	    return curl;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setCpicpath(String cpicpath){
	    this.cpicpath=cpicpath;
	}
	public String getCpicpath(){
	    return cpicpath;
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
}