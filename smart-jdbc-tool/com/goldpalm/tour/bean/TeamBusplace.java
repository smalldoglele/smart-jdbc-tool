package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * TeamBusplace entity for t_team_busplace table.
 * 
 * 
 * @since 2014-02-17 17:24:43.731
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_team_busplace")	
public class TeamBusplace implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uteamid")
	private String uteamid;
	
	@Column(name="ubusplaceid")
	private String ubusplaceid;
	
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
	public void setUbusplaceid(String ubusplaceid){
	    this.ubusplaceid=ubusplaceid;
	}
	public String getUbusplaceid(){
	    return ubusplaceid;
	}
}