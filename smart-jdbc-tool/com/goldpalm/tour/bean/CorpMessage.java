package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CorpMessage entity for t_corp_message table.
 * 
 * 
 * @since 2014-02-17 17:24:37.575
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_corp_message")	
public class CorpMessage implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="ucorpfriendid")
	private String ucorpfriendid;
	
	@Column(name="cType")
	private String cType;
	
	@Column(name="ccontent")
	private String ccontent;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="uuserfriendid")
	private String uuserfriendid;
	
	@Column(name="udeptfriendid")
	private String udeptfriendid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUcorpid(String ucorpid){
	    this.ucorpid=ucorpid;
	}
	public String getUcorpid(){
	    return ucorpid;
	}
	public void setUcorpfriendid(String ucorpfriendid){
	    this.ucorpfriendid=ucorpfriendid;
	}
	public String getUcorpfriendid(){
	    return ucorpfriendid;
	}
	public void setCType(String cType){
	    this.cType=cType;
	}
	public String getCType(){
	    return cType;
	}
	public void setCcontent(String ccontent){
	    this.ccontent=ccontent;
	}
	public String getCcontent(){
	    return ccontent;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
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
	public void setUuserfriendid(String uuserfriendid){
	    this.uuserfriendid=uuserfriendid;
	}
	public String getUuserfriendid(){
	    return uuserfriendid;
	}
	public void setUdeptfriendid(String udeptfriendid){
	    this.udeptfriendid=udeptfriendid;
	}
	public String getUdeptfriendid(){
	    return udeptfriendid;
	}
}