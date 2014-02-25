package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * OrderLongtrafficbook entity for t_order_longtrafficbook table.
 * 
 * 
 * @since 2014-02-17 17:24:41.520
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_order_longtrafficbook")	
public class OrderLongtrafficbook implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uorderid")
	private String uorderid;
	
	@Column(name="ulongtrafficbookid")
	private String ulongtrafficbookid;
	
	@Column(name="iqty")
	private Integer iqty;
	
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
	public void setUorderid(String uorderid){
	    this.uorderid=uorderid;
	}
	public String getUorderid(){
	    return uorderid;
	}
	public void setUlongtrafficbookid(String ulongtrafficbookid){
	    this.ulongtrafficbookid=ulongtrafficbookid;
	}
	public String getUlongtrafficbookid(){
	    return ulongtrafficbookid;
	}
	public void setIqty(Integer iqty){
	    this.iqty=iqty;
	}
	public Integer getIqty(){
	    return iqty;
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