package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Teamquery entity for t_teamquery table.
 * 
 * 
 * @since 2014-02-17 17:24:44.343
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_teamquery")	
public class Teamquery implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="uid")
	private String uid;
	
	@Column(name="uteamid")
	private String uteamid;
	
	@Column(name="channel")
	private String channel;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="nextproduct")
	private String nextproduct;
	
	@Column(name="purpose")
	private String purpose;
	
	@Column(name="standards")
	private String standards;
	
	@Column(name="satisfaction")
	private String satisfaction;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
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
	public void setChannel(String channel){
	    this.channel=channel;
	}
	public String getChannel(){
	    return channel;
	}
	public void setDestination(String destination){
	    this.destination=destination;
	}
	public String getDestination(){
	    return destination;
	}
	public void setNextproduct(String nextproduct){
	    this.nextproduct=nextproduct;
	}
	public String getNextproduct(){
	    return nextproduct;
	}
	public void setPurpose(String purpose){
	    this.purpose=purpose;
	}
	public String getPurpose(){
	    return purpose;
	}
	public void setStandards(String standards){
	    this.standards=standards;
	}
	public String getStandards(){
	    return standards;
	}
	public void setSatisfaction(String satisfaction){
	    this.satisfaction=satisfaction;
	}
	public String getSatisfaction(){
	    return satisfaction;
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
	public void setUcorpid(String ucorpid){
	    this.ucorpid=ucorpid;
	}
	public String getUcorpid(){
	    return ucorpid;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
}