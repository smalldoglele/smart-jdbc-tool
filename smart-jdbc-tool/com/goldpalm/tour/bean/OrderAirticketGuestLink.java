package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * OrderAirticketGuestLink entity for t_order_airticket_guest_link table.
 * 
 * 
 * @since 2014-02-17 17:24:41.054
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_order_airticket_guest_link")	
public class OrderAirticketGuestLink implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uorderairticketid")
	private String uorderairticketid;
	
	@Column(name="uorderguestid")
	private String uorderguestid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="cticketno")
	private String cticketno;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUorderairticketid(String uorderairticketid){
	    this.uorderairticketid=uorderairticketid;
	}
	public String getUorderairticketid(){
	    return uorderairticketid;
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
	public void setCticketno(String cticketno){
	    this.cticketno=cticketno;
	}
	public String getCticketno(){
	    return cticketno;
	}
}