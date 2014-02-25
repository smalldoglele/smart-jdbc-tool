package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * VisaPrice entity for t_visa_price table.
 * 
 * 
 * @since 2014-02-17 17:24:45.167
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_visa_price")	
public class VisaPrice implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uvisaid")
	private String uvisaid;
	
	@Column(name="cprcitem")
	private String cprcitem;
	
	@Column(name="cprctype")
	private String cprctype;
	
	@Column(name="ccur")
	private String ccur;
	
	@Column(name="nprice")
	private Double nprice;
	
	@Column(name="nprice1")
	private Double nprice1;
	
	@Column(name="nprice2")
	private Double nprice2;
	
	@Column(name="nprice3")
	private Double nprice3;
	
	@Column(name="cmemo")
	private String cmemo;
	
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
	public void setUvisaid(String uvisaid){
	    this.uvisaid=uvisaid;
	}
	public String getUvisaid(){
	    return uvisaid;
	}
	public void setCprcitem(String cprcitem){
	    this.cprcitem=cprcitem;
	}
	public String getCprcitem(){
	    return cprcitem;
	}
	public void setCprctype(String cprctype){
	    this.cprctype=cprctype;
	}
	public String getCprctype(){
	    return cprctype;
	}
	public void setCcur(String ccur){
	    this.ccur=ccur;
	}
	public String getCcur(){
	    return ccur;
	}
	public void setNprice(Double nprice){
	    this.nprice=nprice;
	}
	public Double getNprice(){
	    return nprice;
	}
	public void setNprice1(Double nprice1){
	    this.nprice1=nprice1;
	}
	public Double getNprice1(){
	    return nprice1;
	}
	public void setNprice2(Double nprice2){
	    this.nprice2=nprice2;
	}
	public Double getNprice2(){
	    return nprice2;
	}
	public void setNprice3(Double nprice3){
	    this.nprice3=nprice3;
	}
	public Double getNprice3(){
	    return nprice3;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
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