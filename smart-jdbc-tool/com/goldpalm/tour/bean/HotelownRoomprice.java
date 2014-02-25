package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * HotelownRoomprice entity for t_hotelown_roomprice table.
 * 
 * 
 * @since 2014-02-17 17:24:39.110
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_hotelown_roomprice")	
public class HotelownRoomprice implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uhotelid")
	private String uhotelid;
	
	@Column(name="croomtypename")
	private String croomtypename;
	
	@Column(name="croomdescribe")
	private String croomdescribe;
	
	@Column(name="inumber")
	private Integer inumber;
	
	@Column(name="iextrabed")
	private Integer iextrabed;
	
	@Column(name="availdate")
	private Date availdate;
	
	@Column(name="cur")
	private String cur;
	
	@Column(name="nprice")
	private Double nprice;
	
	@Column(name="nextrabedprice")
	private Double nextrabedprice;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="usupplierid")
	private String usupplierid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUhotelid(String uhotelid){
	    this.uhotelid=uhotelid;
	}
	public String getUhotelid(){
	    return uhotelid;
	}
	public void setCroomtypename(String croomtypename){
	    this.croomtypename=croomtypename;
	}
	public String getCroomtypename(){
	    return croomtypename;
	}
	public void setCroomdescribe(String croomdescribe){
	    this.croomdescribe=croomdescribe;
	}
	public String getCroomdescribe(){
	    return croomdescribe;
	}
	public void setInumber(Integer inumber){
	    this.inumber=inumber;
	}
	public Integer getInumber(){
	    return inumber;
	}
	public void setIextrabed(Integer iextrabed){
	    this.iextrabed=iextrabed;
	}
	public Integer getIextrabed(){
	    return iextrabed;
	}
	public void setAvaildate(Date availdate){
	    this.availdate=availdate;
	}
	public Date getAvaildate(){
	    return availdate;
	}
	public void setCur(String cur){
	    this.cur=cur;
	}
	public String getCur(){
	    return cur;
	}
	public void setNprice(Double nprice){
	    this.nprice=nprice;
	}
	public Double getNprice(){
	    return nprice;
	}
	public void setNextrabedprice(Double nextrabedprice){
	    this.nextrabedprice=nextrabedprice;
	}
	public Double getNextrabedprice(){
	    return nextrabedprice;
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
	public void setUsupplierid(String usupplierid){
	    this.usupplierid=usupplierid;
	}
	public String getUsupplierid(){
	    return usupplierid;
	}
}