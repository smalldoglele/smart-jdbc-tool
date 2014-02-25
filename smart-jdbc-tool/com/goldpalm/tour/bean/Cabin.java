package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Cabin entity for t_cabin table.
 * 
 * 
 * @since 2014-02-17 17:24:36.055
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_cabin")	
public class Cabin implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uteamid")
	private String uteamid;
	
	@Column(name="cproject")
	private String cproject;
	
	@Column(name="csequence")
	private String csequence;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="coptype")
	private String coptype;
	
	@Column(name="inum")
	private Integer inum;
	
	@Column(name="irecommandseat")
	private Integer irecommandseat;
	
	@Column(name="imaxseat")
	private Integer imaxseat;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="dcreate")
	private Date dcreate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUteamid(String uteamid){
	    this.uteamid=uteamid;
	}
	public String getUteamid(){
	    return uteamid;
	}
	public void setCproject(String cproject){
	    this.cproject=cproject;
	}
	public String getCproject(){
	    return cproject;
	}
	public void setCsequence(String csequence){
	    this.csequence=csequence;
	}
	public String getCsequence(){
	    return csequence;
	}
	public void setCname(String cname){
	    this.cname=cname;
	}
	public String getCname(){
	    return cname;
	}
	public void setCoptype(String coptype){
	    this.coptype=coptype;
	}
	public String getCoptype(){
	    return coptype;
	}
	public void setInum(Integer inum){
	    this.inum=inum;
	}
	public Integer getInum(){
	    return inum;
	}
	public void setIrecommandseat(Integer irecommandseat){
	    this.irecommandseat=irecommandseat;
	}
	public Integer getIrecommandseat(){
	    return irecommandseat;
	}
	public void setImaxseat(Integer imaxseat){
	    this.imaxseat=imaxseat;
	}
	public Integer getImaxseat(){
	    return imaxseat;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
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
	public void setDcreate(Date dcreate){
	    this.dcreate=dcreate;
	}
	public Date getDcreate(){
	    return dcreate;
	}
}