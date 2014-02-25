package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CardPoint entity for t_card_point table.
 * 
 * 
 * @since 2014-02-17 17:24:36.497
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_card_point")	
public class CardPoint implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ucardid")
	private String ucardid;
	
	@Column(name="cpointtype")
	private String cpointtype;
	
	@Column(name="ulinkid")
	private String ulinkid;
	
	@Column(name="isinglepoint")
	private Integer isinglepoint;
	
	@Column(name="iqty")
	private Integer iqty;
	
	@Column(name="ipoint")
	private Integer ipoint;
	
	@Column(name="dbegindate")
	private Date dbegindate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="csummary")
	private String csummary;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="ipointr")
	private Integer ipointr;
	
	@Column(name="dcreate")
	private Date dcreate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUcardid(String ucardid){
	    this.ucardid=ucardid;
	}
	public String getUcardid(){
	    return ucardid;
	}
	public void setCpointtype(String cpointtype){
	    this.cpointtype=cpointtype;
	}
	public String getCpointtype(){
	    return cpointtype;
	}
	public void setUlinkid(String ulinkid){
	    this.ulinkid=ulinkid;
	}
	public String getUlinkid(){
	    return ulinkid;
	}
	public void setIsinglepoint(Integer isinglepoint){
	    this.isinglepoint=isinglepoint;
	}
	public Integer getIsinglepoint(){
	    return isinglepoint;
	}
	public void setIqty(Integer iqty){
	    this.iqty=iqty;
	}
	public Integer getIqty(){
	    return iqty;
	}
	public void setIpoint(Integer ipoint){
	    this.ipoint=ipoint;
	}
	public Integer getIpoint(){
	    return ipoint;
	}
	public void setDbegindate(Date dbegindate){
	    this.dbegindate=dbegindate;
	}
	public Date getDbegindate(){
	    return dbegindate;
	}
	public void setDenddate(Date denddate){
	    this.denddate=denddate;
	}
	public Date getDenddate(){
	    return denddate;
	}
	public void setCsummary(String csummary){
	    this.csummary=csummary;
	}
	public String getCsummary(){
	    return csummary;
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
	public void setUroleid(String uroleid){
	    this.uroleid=uroleid;
	}
	public String getUroleid(){
	    return uroleid;
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
	public void setIpointr(Integer ipointr){
	    this.ipointr=ipointr;
	}
	public Integer getIpointr(){
	    return ipointr;
	}
	public void setDcreate(Date dcreate){
	    this.dcreate=dcreate;
	}
	public Date getDcreate(){
	    return dcreate;
	}
}