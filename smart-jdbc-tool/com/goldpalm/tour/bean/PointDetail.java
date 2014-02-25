package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * PointDetail entity for t_point_detail table.
 * 
 * 
 * @since 2014-02-17 17:24:41.707
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_point_detail")	
public class PointDetail implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cassid")
	private String cassid;
	
	@Column(name="upointruleid")
	private String upointruleid;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="dopdate")
	private Date dopdate;
	
	@Column(name="npoint")
	private Double npoint;
	
	@Column(name="uorderid")
	private String uorderid;
	
	@Column(name="dbgndate")
	private Date dbgndate;
	
	@Column(name="denddate")
	private Date denddate;
	
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
	public void setCassid(String cassid){
	    this.cassid=cassid;
	}
	public String getCassid(){
	    return cassid;
	}
	public void setUpointruleid(String upointruleid){
	    this.upointruleid=upointruleid;
	}
	public String getUpointruleid(){
	    return upointruleid;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setDopdate(Date dopdate){
	    this.dopdate=dopdate;
	}
	public Date getDopdate(){
	    return dopdate;
	}
	public void setNpoint(Double npoint){
	    this.npoint=npoint;
	}
	public Double getNpoint(){
	    return npoint;
	}
	public void setUorderid(String uorderid){
	    this.uorderid=uorderid;
	}
	public String getUorderid(){
	    return uorderid;
	}
	public void setDbgndate(Date dbgndate){
	    this.dbgndate=dbgndate;
	}
	public Date getDbgndate(){
	    return dbgndate;
	}
	public void setDenddate(Date denddate){
	    this.denddate=denddate;
	}
	public Date getDenddate(){
	    return denddate;
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