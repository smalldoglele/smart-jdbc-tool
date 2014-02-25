package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * LineVisa entity for t_line_visa table.
 * 
 * 
 * @since 2014-02-17 17:24:39.967
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_line_visa")	
public class LineVisa implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ulineid")
	private String ulineid;
	
	@Column(name="cvisaname")
	private String cvisaname;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dcreate")
	private Date dcreate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUlineid(String ulineid){
	    this.ulineid=ulineid;
	}
	public String getUlineid(){
	    return ulineid;
	}
	public void setCvisaname(String cvisaname){
	    this.cvisaname=cvisaname;
	}
	public String getCvisaname(){
	    return cvisaname;
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
	public void setDcreate(Date dcreate){
	    this.dcreate=dcreate;
	}
	public Date getDcreate(){
	    return dcreate;
	}
}