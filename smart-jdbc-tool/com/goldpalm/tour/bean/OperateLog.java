package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * OperateLog entity for t_operate_log table.
 * 
 * 
 * @since 2014-02-17 17:24:40.860
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_operate_log")	
public class OperateLog implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="doperatetime")
	private Date doperatetime;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="coperateip")
	private String coperateip;
	
	@Column(name="coperateurl")
	private String coperateurl;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="clinktable")
	private String clinktable;
	
	@Column(name="ulinktableid")
	private String ulinktableid;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="cchoice")
	private String cchoice;
	
	@Column(name="ccancel")
	private String ccancel;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setDoperatetime(Date doperatetime){
	    this.doperatetime=doperatetime;
	}
	public Date getDoperatetime(){
	    return doperatetime;
	}
	public void setUuserid(String uuserid){
	    this.uuserid=uuserid;
	}
	public String getUuserid(){
	    return uuserid;
	}
	public void setCoperateip(String coperateip){
	    this.coperateip=coperateip;
	}
	public String getCoperateip(){
	    return coperateip;
	}
	public void setCoperateurl(String coperateurl){
	    this.coperateurl=coperateurl;
	}
	public String getCoperateurl(){
	    return coperateurl;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setClinktable(String clinktable){
	    this.clinktable=clinktable;
	}
	public String getClinktable(){
	    return clinktable;
	}
	public void setUlinktableid(String ulinktableid){
	    this.ulinktableid=ulinktableid;
	}
	public String getUlinktableid(){
	    return ulinktableid;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
	public void setCchoice(String cchoice){
	    this.cchoice=cchoice;
	}
	public String getCchoice(){
	    return cchoice;
	}
	public void setCcancel(String ccancel){
	    this.ccancel=ccancel;
	}
	public String getCcancel(){
	    return ccancel;
	}
}