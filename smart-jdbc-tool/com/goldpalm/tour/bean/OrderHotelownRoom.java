package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * OrderHotelownRoom entity for t_order_hotelown_room table.
 * 
 * 
 * @since 2014-02-17 17:24:41.452
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_order_hotelown_room")	
public class OrderHotelownRoom implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uorderid")
	private String uorderid;
	
	@Column(name="uorderhotelownid")
	private String uorderhotelownid;
	
	@Column(name="uhotelownid")
	private String uhotelownid;
	
	@Column(name="dusedate")
	private Date dusedate;
	
	@Column(name="croomtypename")
	private String croomtypename;
	
	@Column(name="uroompriceid")
	private String uroompriceid;
	
	@Column(name="irooms")
	private Integer irooms;
	
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
	
	@Column(name="dcreate")
	private Date dcreate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUorderid(String uorderid){
	    this.uorderid=uorderid;
	}
	public String getUorderid(){
	    return uorderid;
	}
	public void setUorderhotelownid(String uorderhotelownid){
	    this.uorderhotelownid=uorderhotelownid;
	}
	public String getUorderhotelownid(){
	    return uorderhotelownid;
	}
	public void setUhotelownid(String uhotelownid){
	    this.uhotelownid=uhotelownid;
	}
	public String getUhotelownid(){
	    return uhotelownid;
	}
	public void setDusedate(Date dusedate){
	    this.dusedate=dusedate;
	}
	public Date getDusedate(){
	    return dusedate;
	}
	public void setCroomtypename(String croomtypename){
	    this.croomtypename=croomtypename;
	}
	public String getCroomtypename(){
	    return croomtypename;
	}
	public void setUroompriceid(String uroompriceid){
	    this.uroompriceid=uroompriceid;
	}
	public String getUroompriceid(){
	    return uroompriceid;
	}
	public void setIrooms(Integer irooms){
	    this.irooms=irooms;
	}
	public Integer getIrooms(){
	    return irooms;
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
	public void setDcreate(Date dcreate){
	    this.dcreate=dcreate;
	}
	public Date getDcreate(){
	    return dcreate;
	}
}