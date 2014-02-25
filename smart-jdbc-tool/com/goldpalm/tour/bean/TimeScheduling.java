package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * TimeScheduling entity for t_time_scheduling table.
 * 
 * 
 * @since 2014-02-17 17:24:44.514
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_time_scheduling")	
public class TimeScheduling implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ctimename")
	private String ctimename;
	
	@Column(name="cvaildbgntime")
	private String cvaildbgntime;
	
	@Column(name="cvaildendtime")
	private String cvaildendtime;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCtimename(String ctimename){
	    this.ctimename=ctimename;
	}
	public String getCtimename(){
	    return ctimename;
	}
	public void setCvaildbgntime(String cvaildbgntime){
	    this.cvaildbgntime=cvaildbgntime;
	}
	public String getCvaildbgntime(){
	    return cvaildbgntime;
	}
	public void setCvaildendtime(String cvaildendtime){
	    this.cvaildendtime=cvaildendtime;
	}
	public String getCvaildendtime(){
	    return cvaildendtime;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
}