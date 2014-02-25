package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * TeamStuff entity for t_team_stuff table.
 * 
 * 
 * @since 2014-02-17 17:24:43.990
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_team_stuff")	
public class TeamStuff implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uteamid")
	private String uteamid;
	
	@Column(name="cstuffname")
	private String cstuffname;
	
	@Column(name="igroupno")
	private Integer igroupno;
	
	@Column(name="cneed")
	private String cneed;
	
	@Column(name="cmemo")
	private String cmemo;
	
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
	public void setCstuffname(String cstuffname){
	    this.cstuffname=cstuffname;
	}
	public String getCstuffname(){
	    return cstuffname;
	}
	public void setIgroupno(Integer igroupno){
	    this.igroupno=igroupno;
	}
	public Integer getIgroupno(){
	    return igroupno;
	}
	public void setCneed(String cneed){
	    this.cneed=cneed;
	}
	public String getCneed(){
	    return cneed;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
}