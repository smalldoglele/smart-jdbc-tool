package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * SmsSendStatus entity for t_sms_send_status table.
 * 
 * 
 * @since 2014-02-17 17:24:43.083
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_sms_send_status")	
public class SmsSendStatus implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="usmssendid")
	private String usmssendid;
	
	@Column(name="cmsgid")
	private String cmsgid;
	
	@Column(name="csendstatus")
	private String csendstatus;
	
	@Column(name="dsendtime")
	private Date dsendtime;
	
	@Column(name="crecvstatus")
	private String crecvstatus;
	
	@Column(name="drecvtime")
	private Date drecvtime;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUsmssendid(String usmssendid){
	    this.usmssendid=usmssendid;
	}
	public String getUsmssendid(){
	    return usmssendid;
	}
	public void setCmsgid(String cmsgid){
	    this.cmsgid=cmsgid;
	}
	public String getCmsgid(){
	    return cmsgid;
	}
	public void setCsendstatus(String csendstatus){
	    this.csendstatus=csendstatus;
	}
	public String getCsendstatus(){
	    return csendstatus;
	}
	public void setDsendtime(Date dsendtime){
	    this.dsendtime=dsendtime;
	}
	public Date getDsendtime(){
	    return dsendtime;
	}
	public void setCrecvstatus(String crecvstatus){
	    this.crecvstatus=crecvstatus;
	}
	public String getCrecvstatus(){
	    return crecvstatus;
	}
	public void setDrecvtime(Date drecvtime){
	    this.drecvtime=drecvtime;
	}
	public Date getDrecvtime(){
	    return drecvtime;
	}
}