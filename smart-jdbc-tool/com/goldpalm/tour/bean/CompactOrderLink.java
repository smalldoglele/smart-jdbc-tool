package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CompactOrderLink entity for t_compact_order_link table.
 * 
 * 
 * @since 2014-02-17 17:24:37.184
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_compact_order_link")	
public class CompactOrderLink implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uuid;
	
	@Column(name="uorderid")
	private String uorderid;
	
	@Column(name="ucompactid")
	private String ucompactid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	public void setUuid(String uuid){
	    this.uuid=uuid;
	}
	public String getUuid(){
	    return uuid;
	}
	public void setUorderid(String uorderid){
	    this.uorderid=uorderid;
	}
	public String getUorderid(){
	    return uorderid;
	}
	public void setUcompactid(String ucompactid){
	    this.ucompactid=ucompactid;
	}
	public String getUcompactid(){
	    return ucompactid;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
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
	public void setUcorpid(String ucorpid){
	    this.ucorpid=ucorpid;
	}
	public String getUcorpid(){
	    return ucorpid;
	}
	public void setUroleid(String uroleid){
	    this.uroleid=uroleid;
	}
	public String getUroleid(){
	    return uroleid;
	}
}