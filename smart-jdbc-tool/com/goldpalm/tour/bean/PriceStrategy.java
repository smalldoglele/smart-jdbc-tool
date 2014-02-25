package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * PriceStrategy entity for t_price_strategy table.
 * 
 * 
 * @since 2014-02-17 17:24:42.464
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_price_strategy")	
public class PriceStrategy implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="upriceid")
	private String upriceid;
	
	@Column(name="ucustomerid")
	private String ucustomerid;
	
	@Column(name="nprice")
	private Double nprice;
	
	@Column(name="ncost")
	private Double ncost;
	
	@Column(name="iassignqty")
	private Integer iassignqty;
	
	@Column(name="dbgndate")
	private Date dbgndate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="dcreate")
	private Date dcreate;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="cdisable")
	private String cdisable;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUpriceid(String upriceid){
	    this.upriceid=upriceid;
	}
	public String getUpriceid(){
	    return upriceid;
	}
	public void setUcustomerid(String ucustomerid){
	    this.ucustomerid=ucustomerid;
	}
	public String getUcustomerid(){
	    return ucustomerid;
	}
	public void setNprice(Double nprice){
	    this.nprice=nprice;
	}
	public Double getNprice(){
	    return nprice;
	}
	public void setNcost(Double ncost){
	    this.ncost=ncost;
	}
	public Double getNcost(){
	    return ncost;
	}
	public void setIassignqty(Integer iassignqty){
	    this.iassignqty=iassignqty;
	}
	public Integer getIassignqty(){
	    return iassignqty;
	}
	public void setDbgndate(Date dbgndate){
	    this.dbgndate=dbgndate;
	}
	public Date getDbgndate(){
	    return dbgndate;
	}
	public void setDenddate(Date denddate){
	    this.denddate=denddate;
	}
	public Date getDenddate(){
	    return denddate;
	}
	public void setDcreate(Date dcreate){
	    this.dcreate=dcreate;
	}
	public Date getDcreate(){
	    return dcreate;
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
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setCdisable(String cdisable){
	    this.cdisable=cdisable;
	}
	public String getCdisable(){
	    return cdisable;
	}
}