package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * TeamGuide entity for t_team_guide table.
 * 
 * 
 * @since 2014-02-17 17:24:43.805
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_team_guide")	
public class TeamGuide implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uteamid")
	private String uteamid;
	
	@Column(name="uguideid")
	private String uguideid;
	
	@Column(name="ccardcode")
	private String ccardcode;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="iroomno")
	private Integer iroomno;
	
	@Column(name="iprintno")
	private Integer iprintno;
	
	@Column(name="icarno")
	private Integer icarno;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUteamid(String uteamid){
	    this.uteamid=uteamid;
	}
	public String getUteamid(){
	    return uteamid;
	}
	public void setUguideid(String uguideid){
	    this.uguideid=uguideid;
	}
	public String getUguideid(){
	    return uguideid;
	}
	public void setCcardcode(String ccardcode){
	    this.ccardcode=ccardcode;
	}
	public String getCcardcode(){
	    return ccardcode;
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
	public void setIroomno(Integer iroomno){
	    this.iroomno=iroomno;
	}
	public Integer getIroomno(){
	    return iroomno;
	}
	public void setIprintno(Integer iprintno){
	    this.iprintno=iprintno;
	}
	public Integer getIprintno(){
	    return iprintno;
	}
	public void setIcarno(Integer icarno){
	    this.icarno=icarno;
	}
	public Integer getIcarno(){
	    return icarno;
	}
}