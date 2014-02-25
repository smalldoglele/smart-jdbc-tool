package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * GuidePrice entity for t_guide_price table.
 * 
 * 
 * @since 2014-02-17 17:24:38.703
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_guide_price")	
public class GuidePrice implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uguideid")
	private String uguideid;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="isdisabled")
	private String isdisabled;
	
	@Column(name="nprice")
	private Double nprice;
	
	@Column(name="dbegandate")
	private Date dbegandate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dcreatedate")
	private Date dcreatedate;
	
	@Column(name="cmemo")
	private String cmemo;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUguideid(String uguideid){
	    this.uguideid=uguideid;
	}
	public String getUguideid(){
	    return uguideid;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setIsdisabled(String isdisabled){
	    this.isdisabled=isdisabled;
	}
	public String getIsdisabled(){
	    return isdisabled;
	}
	public void setNprice(Double nprice){
	    this.nprice=nprice;
	}
	public Double getNprice(){
	    return nprice;
	}
	public void setDbegandate(Date dbegandate){
	    this.dbegandate=dbegandate;
	}
	public Date getDbegandate(){
	    return dbegandate;
	}
	public void setDenddate(Date denddate){
	    this.denddate=denddate;
	}
	public Date getDenddate(){
	    return denddate;
	}
	public void setUuserid(String uuserid){
	    this.uuserid=uuserid;
	}
	public String getUuserid(){
	    return uuserid;
	}
	public void setUroleid(String uroleid){
	    this.uroleid=uroleid;
	}
	public String getUroleid(){
	    return uroleid;
	}
	public void setUdeptid(String udeptid){
	    this.udeptid=udeptid;
	}
	public String getUdeptid(){
	    return udeptid;
	}
	public void setDcreatedate(Date dcreatedate){
	    this.dcreatedate=dcreatedate;
	}
	public Date getDcreatedate(){
	    return dcreatedate;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
}