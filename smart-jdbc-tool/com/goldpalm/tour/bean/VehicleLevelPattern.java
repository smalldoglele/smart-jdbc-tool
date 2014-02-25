package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * VehicleLevelPattern entity for t_vehicle_level_pattern table.
 * 
 * 
 * @since 2014-02-17 17:24:44.992
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_vehicle_level_pattern")	
public class VehicleLevelPattern implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uvehiclepatternid")
	private String uvehiclepatternid;
	
	@Column(name="clevel")
	private String clevel;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="iwidth")
	private Integer iwidth;
	
	@Column(name="iheight")
	private Integer iheight;
	
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
	public void setUvehiclepatternid(String uvehiclepatternid){
	    this.uvehiclepatternid=uvehiclepatternid;
	}
	public String getUvehiclepatternid(){
	    return uvehiclepatternid;
	}
	public void setClevel(String clevel){
	    this.clevel=clevel;
	}
	public String getClevel(){
	    return clevel;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setIwidth(Integer iwidth){
	    this.iwidth=iwidth;
	}
	public Integer getIwidth(){
	    return iwidth;
	}
	public void setIheight(Integer iheight){
	    this.iheight=iheight;
	}
	public Integer getIheight(){
	    return iheight;
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