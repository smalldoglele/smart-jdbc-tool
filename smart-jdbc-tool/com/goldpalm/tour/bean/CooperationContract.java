package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CooperationContract entity for t_cooperation_contract table.
 * 
 * 
 * @since 2014-02-17 17:24:37.314
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_cooperation_contract")	
public class CooperationContract implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ucustomerid")
	private String ucustomerid;
	
	@Column(name="ccontractno")
	private String ccontractno;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="cfilename")
	private String cfilename;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="duploaddate")
	private Date duploaddate;
	
	@Column(name="uaudituserid")
	private String uaudituserid;
	
	@Column(name="uauditdeptid")
	private String uauditdeptid;
	
	@Column(name="dauditdate")
	private Date dauditdate;
	
	@Column(name="startdate")
	private Date startdate;
	
	@Column(name="stopdate")
	private Date stopdate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUcustomerid(String ucustomerid){
	    this.ucustomerid=ucustomerid;
	}
	public String getUcustomerid(){
	    return ucustomerid;
	}
	public void setCcontractno(String ccontractno){
	    this.ccontractno=ccontractno;
	}
	public String getCcontractno(){
	    return ccontractno;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
	public void setCfilename(String cfilename){
	    this.cfilename=cfilename;
	}
	public String getCfilename(){
	    return cfilename;
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
	public void setDuploaddate(Date duploaddate){
	    this.duploaddate=duploaddate;
	}
	public Date getDuploaddate(){
	    return duploaddate;
	}
	public void setUaudituserid(String uaudituserid){
	    this.uaudituserid=uaudituserid;
	}
	public String getUaudituserid(){
	    return uaudituserid;
	}
	public void setUauditdeptid(String uauditdeptid){
	    this.uauditdeptid=uauditdeptid;
	}
	public String getUauditdeptid(){
	    return uauditdeptid;
	}
	public void setDauditdate(Date dauditdate){
	    this.dauditdate=dauditdate;
	}
	public Date getDauditdate(){
	    return dauditdate;
	}
	public void setStartdate(Date startdate){
	    this.startdate=startdate;
	}
	public Date getStartdate(){
	    return startdate;
	}
	public void setStopdate(Date stopdate){
	    this.stopdate=stopdate;
	}
	public Date getStopdate(){
	    return stopdate;
	}
}