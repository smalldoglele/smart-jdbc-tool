package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * DocLink entity for t_doc_link table.
 * 
 * 
 * @since 2014-02-17 17:24:38.474
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_doc_link")	
public class DocLink implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="uid")
	private String uid;
	
	@Column(name="udocid")
	private String udocid;
	
	@Column(name="ulinkid")
	private String ulinkid;
	
	@Column(name="clinktable")
	private String clinktable;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUdocid(String udocid){
	    this.udocid=udocid;
	}
	public String getUdocid(){
	    return udocid;
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
	public void setUroleid(String uroleid){
	    this.uroleid=uroleid;
	}
	public String getUroleid(){
	    return uroleid;
	}
	public void setUcorpid(String ucorpid){
	    this.ucorpid=ucorpid;
	}
	public String getUcorpid(){
	    return ucorpid;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
}