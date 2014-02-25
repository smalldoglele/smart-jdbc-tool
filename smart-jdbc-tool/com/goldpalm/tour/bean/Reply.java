package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Reply entity for t_reply table.
 * 
 * 
 * @since 2014-02-17 17:24:42.667
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_reply")	
public class Reply implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ucommentid")
	private String ucommentid;
	
	@Column(name="umemberid")
	private String umemberid;
	
	@Column(name="ccontent")
	private String ccontent;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUcommentid(String ucommentid){
	    this.ucommentid=ucommentid;
	}
	public String getUcommentid(){
	    return ucommentid;
	}
	public void setUmemberid(String umemberid){
	    this.umemberid=umemberid;
	}
	public String getUmemberid(){
	    return umemberid;
	}
	public void setCcontent(String ccontent){
	    this.ccontent=ccontent;
	}
	public String getCcontent(){
	    return ccontent;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
}