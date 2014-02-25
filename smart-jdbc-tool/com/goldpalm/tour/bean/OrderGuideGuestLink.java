package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * OrderGuideGuestLink entity for t_order_guide_guest_link table.
 * 
 * 
 * @since 2014-02-17 17:24:41.259
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_order_guide_guest_link")	
public class OrderGuideGuestLink implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uorderguideid")
	private String uorderguideid;
	
	@Column(name="uorderguestid")
	private String uorderguestid;
	
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
	public void setUorderguideid(String uorderguideid){
	    this.uorderguideid=uorderguideid;
	}
	public String getUorderguideid(){
	    return uorderguideid;
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
	public void setUdeptid(String udeptid){
	    this.udeptid=udeptid;
	}
	public String getUdeptid(){
	    return udeptid;
	}
}