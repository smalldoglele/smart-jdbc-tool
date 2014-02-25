package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * TeamcoderuleShzl entity for t_teamcoderule_shzl table.
 * 
 * 
 * @since 2014-02-17 17:24:44.311
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_teamcoderule_shzl")	
public class TeamcoderuleShzl implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="cdatemode")
	private String cdatemode;
	
	@Column(name="cserialflag")
	private String cserialflag;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="cmemo")
	private String cmemo;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
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
	public void setCcode(String ccode){
	    this.ccode=ccode;
	}
	public String getCcode(){
	    return ccode;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setCdatemode(String cdatemode){
	    this.cdatemode=cdatemode;
	}
	public String getCdatemode(){
	    return cdatemode;
	}
	public void setCserialflag(String cserialflag){
	    this.cserialflag=cserialflag;
	}
	public String getCserialflag(){
	    return cserialflag;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
}