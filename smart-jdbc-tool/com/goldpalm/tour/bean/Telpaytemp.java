package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Telpaytemp entity for t_telpaytemp table.
 * 
 * 
 * @since 2014-02-17 17:24:44.378
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_telpaytemp")	
public class Telpaytemp implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cnumtype")
	private String cnumtype;
	
	@Column(name="cnumber")
	private String cnumber;
	
	@Column(name="ccvv2")
	private String ccvv2;
	
	@Column(name="cvaild")
	private String cvaild;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCnumtype(String cnumtype){
	    this.cnumtype=cnumtype;
	}
	public String getCnumtype(){
	    return cnumtype;
	}
	public void setCnumber(String cnumber){
	    this.cnumber=cnumber;
	}
	public String getCnumber(){
	    return cnumber;
	}
	public void setCcvv2(String ccvv2){
	    this.ccvv2=ccvv2;
	}
	public String getCcvv2(){
	    return ccvv2;
	}
	public void setCvaild(String cvaild){
	    this.cvaild=cvaild;
	}
	public String getCvaild(){
	    return cvaild;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
}