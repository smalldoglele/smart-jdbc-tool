package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * LoginLog entity for t_login_log table.
 * 
 * 
 * @since 2014-02-17 17:24:40.063
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_login_log")	
public class LoginLog implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="dlogintime")
	private Date dlogintime;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="cloginip")
	private String cloginip;
	
	@Column(name="cloginurl")
	private String cloginurl;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="cmac")
	private String cmac;
	
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
	public void setDlogintime(Date dlogintime){
	    this.dlogintime=dlogintime;
	}
	public Date getDlogintime(){
	    return dlogintime;
	}
	public void setUuserid(String uuserid){
	    this.uuserid=uuserid;
	}
	public String getUuserid(){
	    return uuserid;
	}
	public void setCloginip(String cloginip){
	    this.cloginip=cloginip;
	}
	public String getCloginip(){
	    return cloginip;
	}
	public void setCloginurl(String cloginurl){
	    this.cloginurl=cloginurl;
	}
	public String getCloginurl(){
	    return cloginurl;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setCmac(String cmac){
	    this.cmac=cmac;
	}
	public String getCmac(){
	    return cmac;
	}
}