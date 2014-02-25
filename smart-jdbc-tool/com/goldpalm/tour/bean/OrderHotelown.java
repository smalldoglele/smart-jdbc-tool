package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * OrderHotelown entity for t_order_hotelown table.
 * 
 * 
 * @since 2014-02-17 17:24:41.418
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_order_hotelown")	
public class OrderHotelown implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uorderid")
	private String uorderid;
	
	@Column(name="uhotelownid")
	private String uhotelownid;
	
	@Column(name="carrivetime")
	private String carrivetime;
	
	@Column(name="irooms")
	private Integer irooms;
	
	@Column(name="dbgndate")
	private Date dbgndate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="iperson")
	private Integer iperson;
	
	@Column(name="inobedperson")
	private Integer inobedperson;
	
	@Column(name="cdemand")
	private String cdemand;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="cstatus")
	private String cstatus;
	
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
	public void setUhotelownid(String uhotelownid){
	    this.uhotelownid=uhotelownid;
	}
	public String getUhotelownid(){
	    return uhotelownid;
	}
	public void setCarrivetime(String carrivetime){
	    this.carrivetime=carrivetime;
	}
	public String getCarrivetime(){
	    return carrivetime;
	}
	public void setIrooms(Integer irooms){
	    this.irooms=irooms;
	}
	public Integer getIrooms(){
	    return irooms;
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
	public void setIperson(Integer iperson){
	    this.iperson=iperson;
	}
	public Integer getIperson(){
	    return iperson;
	}
	public void setInobedperson(Integer inobedperson){
	    this.inobedperson=inobedperson;
	}
	public Integer getInobedperson(){
	    return inobedperson;
	}
	public void setCdemand(String cdemand){
	    this.cdemand=cdemand;
	}
	public String getCdemand(){
	    return cdemand;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
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