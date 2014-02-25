package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * VehiclePattern entity for t_vehicle_pattern table.
 * 
 * 
 * @since 2014-02-17 17:24:45.029
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_vehicle_pattern")	
public class VehiclePattern implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="ctoppicurl")
	private String ctoppicurl;
	
	@Column(name="cbottompicurl")
	private String cbottompicurl;
	
	@Column(name="dupdate")
	private Date dupdate;
	
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
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setCname(String cname){
	    this.cname=cname;
	}
	public String getCname(){
	    return cname;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setCtoppicurl(String ctoppicurl){
	    this.ctoppicurl=ctoppicurl;
	}
	public String getCtoppicurl(){
	    return ctoppicurl;
	}
	public void setCbottompicurl(String cbottompicurl){
	    this.cbottompicurl=cbottompicurl;
	}
	public String getCbottompicurl(){
	    return cbottompicurl;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
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