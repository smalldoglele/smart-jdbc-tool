package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Tag entity for t_tag table.
 * 
 * 
 * @since 2014-02-17 17:24:43.240
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_tag")	
public class Tag implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ctagtype")
	private String ctagtype;
	
	@Column(name="ctagname")
	private String ctagname;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="coptype")
	private String coptype;
	
	@Column(name="ccorp")
	private String ccorp;
	
	@Column(name="ino")
	private Integer ino;
	
	@Column(name="cvisible")
	private String cvisible;
	
	@Column(name="hottag")
	private String hottag;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCtagtype(String ctagtype){
	    this.ctagtype=ctagtype;
	}
	public String getCtagtype(){
	    return ctagtype;
	}
	public void setCtagname(String ctagname){
	    this.ctagname=ctagname;
	}
	public String getCtagname(){
	    return ctagname;
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
	public void setCoptype(String coptype){
	    this.coptype=coptype;
	}
	public String getCoptype(){
	    return coptype;
	}
	public void setCcorp(String ccorp){
	    this.ccorp=ccorp;
	}
	public String getCcorp(){
	    return ccorp;
	}
	public void setIno(Integer ino){
	    this.ino=ino;
	}
	public Integer getIno(){
	    return ino;
	}
	public void setCvisible(String cvisible){
	    this.cvisible=cvisible;
	}
	public String getCvisible(){
	    return cvisible;
	}
	public void setHottag(String hottag){
	    this.hottag=hottag;
	}
	public String getHottag(){
	    return hottag;
	}
}