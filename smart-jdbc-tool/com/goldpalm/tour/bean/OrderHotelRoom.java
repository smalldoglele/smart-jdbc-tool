package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * OrderHotelRoom entity for t_order_hotel_room table.
 * 
 * 
 * @since 2014-02-17 17:24:41.388
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_order_hotel_room")	
public class OrderHotelRoom implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uorderhotelid")
	private String uorderhotelid;
	
	@Column(name="ccheckintime")
	private Date ccheckintime;
	
	@Column(name="singlerates")
	private Double singlerates;
	
	@Column(name="doublerates")
	private Double doublerates;
	
	@Column(name="triplerates")
	private Double triplerates;
	
	@Column(name="quanrates")
	private Double quanrates;
	
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
	public void setUorderhotelid(String uorderhotelid){
	    this.uorderhotelid=uorderhotelid;
	}
	public String getUorderhotelid(){
	    return uorderhotelid;
	}
	public void setCcheckintime(Date ccheckintime){
	    this.ccheckintime=ccheckintime;
	}
	public Date getCcheckintime(){
	    return ccheckintime;
	}
	public void setSinglerates(Double singlerates){
	    this.singlerates=singlerates;
	}
	public Double getSinglerates(){
	    return singlerates;
	}
	public void setDoublerates(Double doublerates){
	    this.doublerates=doublerates;
	}
	public Double getDoublerates(){
	    return doublerates;
	}
	public void setTriplerates(Double triplerates){
	    this.triplerates=triplerates;
	}
	public Double getTriplerates(){
	    return triplerates;
	}
	public void setQuanrates(Double quanrates){
	    this.quanrates=quanrates;
	}
	public Double getQuanrates(){
	    return quanrates;
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