package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Cabinseat entity for t_cabinseat table.
 * 
 * 
 * @since 2014-02-17 17:24:36.136
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_cabinseat")	
public class Cabinseat implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ccabincode")
	private String ccabincode;
	
	@Column(name="ucabinid")
	private String ucabinid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="csellflag")
	private String csellflag;
	
	@Column(name="ioccupation")
	private Integer ioccupation;
	
	@Column(name="ccombinedflag")
	private String ccombinedflag;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCcabincode(String ccabincode){
	    this.ccabincode=ccabincode;
	}
	public String getCcabincode(){
	    return ccabincode;
	}
	public void setUcabinid(String ucabinid){
	    this.ucabinid=ucabinid;
	}
	public String getUcabinid(){
	    return ucabinid;
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
	public void setCsellflag(String csellflag){
	    this.csellflag=csellflag;
	}
	public String getCsellflag(){
	    return csellflag;
	}
	public void setIoccupation(Integer ioccupation){
	    this.ioccupation=ioccupation;
	}
	public Integer getIoccupation(){
	    return ioccupation;
	}
	public void setCcombinedflag(String ccombinedflag){
	    this.ccombinedflag=ccombinedflag;
	}
	public String getCcombinedflag(){
	    return ccombinedflag;
	}
}