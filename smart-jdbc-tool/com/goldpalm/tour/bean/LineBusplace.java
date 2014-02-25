package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * LineBusplace entity for t_line_busplace table.
 * 
 * 
 * @since 2014-02-17 17:24:39.726
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_line_busplace")	
public class LineBusplace implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ulineid")
	private String ulineid;
	
	@Column(name="ubusplaceid")
	private String ubusplaceid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUlineid(String ulineid){
	    this.ulineid=ulineid;
	}
	public String getUlineid(){
	    return ulineid;
	}
	public void setUbusplaceid(String ubusplaceid){
	    this.ubusplaceid=ubusplaceid;
	}
	public String getUbusplaceid(){
	    return ubusplaceid;
	}
}