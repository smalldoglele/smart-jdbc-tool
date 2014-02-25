package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * VehicleDriver entity for t_vehicle_driver table.
 * 
 * 
 * @since 2014-02-17 17:24:44.950
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_vehicle_driver")	
public class VehicleDriver implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uvehicleid")
	private String uvehicleid;
	
	@Column(name="udriverid")
	private String udriverid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUvehicleid(String uvehicleid){
	    this.uvehicleid=uvehicleid;
	}
	public String getUvehicleid(){
	    return uvehicleid;
	}
	public void setUdriverid(String udriverid){
	    this.udriverid=udriverid;
	}
	public String getUdriverid(){
	    return udriverid;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
}