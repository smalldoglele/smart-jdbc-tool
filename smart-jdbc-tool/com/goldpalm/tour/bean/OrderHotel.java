package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * OrderHotel entity for t_order_hotel table.
 * 
 * 
 * @since 2014-02-17 17:24:41.329
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_order_hotel")	
public class OrderHotel implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uorderid")
	private String uorderid;
	
	@Column(name="uhotelid")
	private String uhotelid;
	
	@Column(name="chotelcode")
	private String chotelcode;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="ccheckintime")
	private Date ccheckintime;
	
	@Column(name="ccheckouttime")
	private Date ccheckouttime;
	
	@Column(name="irooms")
	private Integer irooms;
	
	@Column(name="iadults")
	private Integer iadults;
	
	@Column(name="cdemand")
	private String cdemand;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="croomtypecode")
	private String croomtypecode;
	
	@Column(name="cconfnum")
	private String cconfnum;
	
	@Column(name="cratedesc")
	private String cratedesc;
	
	@Column(name="carrivetime")
	private String carrivetime;
	
	@Column(name="crealcheckouttime")
	private Date crealcheckouttime;
	
	@Column(name="ihotelorderstatus")
	private Integer ihotelorderstatus;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="crealirooms")
	private Integer crealirooms;
	
	@Column(name="chotelxml")
	private String chotelxml;
	
	@Column(name="csumprice")
	private Double csumprice;
	
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
	public void setUhotelid(String uhotelid){
	    this.uhotelid=uhotelid;
	}
	public String getUhotelid(){
	    return uhotelid;
	}
	public void setChotelcode(String chotelcode){
	    this.chotelcode=chotelcode;
	}
	public String getChotelcode(){
	    return chotelcode;
	}
	public void setCname(String cname){
	    this.cname=cname;
	}
	public String getCname(){
	    return cname;
	}
	public void setCcheckintime(Date ccheckintime){
	    this.ccheckintime=ccheckintime;
	}
	public Date getCcheckintime(){
	    return ccheckintime;
	}
	public void setCcheckouttime(Date ccheckouttime){
	    this.ccheckouttime=ccheckouttime;
	}
	public Date getCcheckouttime(){
	    return ccheckouttime;
	}
	public void setIrooms(Integer irooms){
	    this.irooms=irooms;
	}
	public Integer getIrooms(){
	    return irooms;
	}
	public void setIadults(Integer iadults){
	    this.iadults=iadults;
	}
	public Integer getIadults(){
	    return iadults;
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
	public void setCroomtypecode(String croomtypecode){
	    this.croomtypecode=croomtypecode;
	}
	public String getCroomtypecode(){
	    return croomtypecode;
	}
	public void setCconfnum(String cconfnum){
	    this.cconfnum=cconfnum;
	}
	public String getCconfnum(){
	    return cconfnum;
	}
	public void setCratedesc(String cratedesc){
	    this.cratedesc=cratedesc;
	}
	public String getCratedesc(){
	    return cratedesc;
	}
	public void setCarrivetime(String carrivetime){
	    this.carrivetime=carrivetime;
	}
	public String getCarrivetime(){
	    return carrivetime;
	}
	public void setCrealcheckouttime(Date crealcheckouttime){
	    this.crealcheckouttime=crealcheckouttime;
	}
	public Date getCrealcheckouttime(){
	    return crealcheckouttime;
	}
	public void setIhotelorderstatus(Integer ihotelorderstatus){
	    this.ihotelorderstatus=ihotelorderstatus;
	}
	public Integer getIhotelorderstatus(){
	    return ihotelorderstatus;
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
	public void setCrealirooms(Integer crealirooms){
	    this.crealirooms=crealirooms;
	}
	public Integer getCrealirooms(){
	    return crealirooms;
	}
	public void setChotelxml(String chotelxml){
	    this.chotelxml=chotelxml;
	}
	public String getChotelxml(){
	    return chotelxml;
	}
	public void setCsumprice(Double csumprice){
	    this.csumprice=csumprice;
	}
	public Double getCsumprice(){
	    return csumprice;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
}