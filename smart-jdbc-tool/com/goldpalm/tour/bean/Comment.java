package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Comment entity for t_comment table.
 * 
 * 
 * @since 2014-02-17 17:24:37.036
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_comment")	
public class Comment implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ulineid")
	private String ulineid;
	
	@Column(name="umemberid")
	private String umemberid;
	
	@Column(name="ilevel")
	private Integer ilevel;
	
	@Column(name="ccontent")
	private String ccontent;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="unewsid")
	private String unewsid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUlineid(String ulineid){
	    this.ulineid=ulineid;
	}
	public String getUlineid(){
	    return ulineid;
	}
	public void setUmemberid(String umemberid){
	    this.umemberid=umemberid;
	}
	public String getUmemberid(){
	    return umemberid;
	}
	public void setIlevel(Integer ilevel){
	    this.ilevel=ilevel;
	}
	public Integer getIlevel(){
	    return ilevel;
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
	public void setUnewsid(String unewsid){
	    this.unewsid=unewsid;
	}
	public String getUnewsid(){
	    return unewsid;
	}
}