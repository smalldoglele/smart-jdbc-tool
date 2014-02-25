package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Accesscount entity for t_accesscount table.
 * 
 * 
 * @since 2014-02-17 17:24:30.215
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_accesscount")	
public class Accesscount implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uinfoid")
	private String uinfoid;
	
	@Column(name="cinfoname")
	private String cinfoname;
	
	@Column(name="icount")
	private Integer icount;
	
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
	public void setUinfoid(String uinfoid){
	    this.uinfoid=uinfoid;
	}
	public String getUinfoid(){
	    return uinfoid;
	}
	public void setCinfoname(String cinfoname){
	    this.cinfoname=cinfoname;
	}
	public String getCinfoname(){
	    return cinfoname;
	}
	public void setIcount(Integer icount){
	    this.icount=icount;
	}
	public Integer getIcount(){
	    return icount;
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