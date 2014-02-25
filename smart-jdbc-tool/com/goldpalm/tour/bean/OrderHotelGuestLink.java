package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * OrderHotelGuestLink entity for t_order_hotel_guest_link table.
 * 
 * 
 * @since 2014-02-17 17:24:41.357
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_order_hotel_guest_link")	
public class OrderHotelGuestLink implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uorderhotelid")
	private String uorderhotelid;
	
	@Column(name="uorderguestid")
	private String uorderguestid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
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
	public void setUorderguestid(String uorderguestid){
	    this.uorderguestid=uorderguestid;
	}
	public String getUorderguestid(){
	    return uorderguestid;
	}
	public void setUuserid(String uuserid){
	    this.uuserid=uuserid;
	}
	public String getUuserid(){
	    return uuserid;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
}