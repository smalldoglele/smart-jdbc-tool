package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CardPointReward entity for t_card_point_reward table.
 * 
 * 
 * @since 2014-02-17 17:24:36.548
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_card_point_reward")	
public class CardPointReward implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ucardpointid")
	private String ucardpointid;
	
	@Column(name="ucardrewardid")
	private String ucardrewardid;
	
	@Column(name="ipoint")
	private Integer ipoint;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUcardpointid(String ucardpointid){
	    this.ucardpointid=ucardpointid;
	}
	public String getUcardpointid(){
	    return ucardpointid;
	}
	public void setUcardrewardid(String ucardrewardid){
	    this.ucardrewardid=ucardrewardid;
	}
	public String getUcardrewardid(){
	    return ucardrewardid;
	}
	public void setIpoint(Integer ipoint){
	    this.ipoint=ipoint;
	}
	public Integer getIpoint(){
	    return ipoint;
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
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
}