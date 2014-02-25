package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * ThemeLink entity for t_theme_link table.
 * 
 * 
 * @since 2014-02-17 17:24:44.447
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_theme_link")	
public class ThemeLink implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uthemeid")
	private String uthemeid;
	
	@Column(name="ulinkid")
	private String ulinkid;
	
	@Column(name="clinktable")
	private String clinktable;
	
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
	public void setUthemeid(String uthemeid){
	    this.uthemeid=uthemeid;
	}
	public String getUthemeid(){
	    return uthemeid;
	}
	public void setUlinkid(String ulinkid){
	    this.ulinkid=ulinkid;
	}
	public String getUlinkid(){
	    return ulinkid;
	}
	public void setClinktable(String clinktable){
	    this.clinktable=clinktable;
	}
	public String getClinktable(){
	    return clinktable;
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