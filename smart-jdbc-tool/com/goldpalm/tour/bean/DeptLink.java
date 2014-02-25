package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * DeptLink entity for t_dept_link table.
 * 
 * 
 * @since 2014-02-17 17:24:38.233
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_dept_link")	
public class DeptLink implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="clinktable")
	private String clinktable;
	
	@Column(name="ulinktableid")
	private String ulinktableid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="crange")
	private String crange;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
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
	public void setUdeptid(String udeptid){
	    this.udeptid=udeptid;
	}
	public String getUdeptid(){
	    return udeptid;
	}
	public void setUuserid(String uuserid){
	    this.uuserid=uuserid;
	}
	public String getUuserid(){
	    return uuserid;
	}
	public void setUroleid(String uroleid){
	    this.uroleid=uroleid;
	}
	public String getUroleid(){
	    return uroleid;
	}
	public void setCrange(String crange){
	    this.crange=crange;
	}
	public String getCrange(){
	    return crange;
	}
	public void setUcorpid(String ucorpid){
	    this.ucorpid=ucorpid;
	}
	public String getUcorpid(){
	    return ucorpid;
	}
}