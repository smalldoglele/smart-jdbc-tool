package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * VehicleUnitPattern entity for t_vehicle_unit_pattern table.
 * 
 * 
 * @since 2014-02-17 17:24:45.057
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_vehicle_unit_pattern")	
public class VehicleUnitPattern implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uvehiclelevelid")
	private String uvehiclelevelid;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="ixpos")
	private Integer ixpos;
	
	@Column(name="iypos")
	private Integer iypos;
	
	@Column(name="irecommandseat")
	private Integer irecommandseat;
	
	@Column(name="imaxseat")
	private Integer imaxseat;
	
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
	public void setUvehiclelevelid(String uvehiclelevelid){
	    this.uvehiclelevelid=uvehiclelevelid;
	}
	public String getUvehiclelevelid(){
	    return uvehiclelevelid;
	}
	public void setCcode(String ccode){
	    this.ccode=ccode;
	}
	public String getCcode(){
	    return ccode;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setIxpos(Integer ixpos){
	    this.ixpos=ixpos;
	}
	public Integer getIxpos(){
	    return ixpos;
	}
	public void setIypos(Integer iypos){
	    this.iypos=iypos;
	}
	public Integer getIypos(){
	    return iypos;
	}
	public void setIrecommandseat(Integer irecommandseat){
	    this.irecommandseat=irecommandseat;
	}
	public Integer getIrecommandseat(){
	    return irecommandseat;
	}
	public void setImaxseat(Integer imaxseat){
	    this.imaxseat=imaxseat;
	}
	public Integer getImaxseat(){
	    return imaxseat;
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