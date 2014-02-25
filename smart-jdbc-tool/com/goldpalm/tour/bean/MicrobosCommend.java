package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * MicrobosCommend entity for t_microbos_commend table.
 * 
 * 
 * @since 2014-02-17 17:24:40.532
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_microbos_commend")	
public class MicrobosCommend implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ino")
	private Integer ino;
	
	@Column(name="ctitle")
	private String ctitle;
	
	@Column(name="unewsid")
	private String unewsid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setIno(Integer ino){
	    this.ino=ino;
	}
	public Integer getIno(){
	    return ino;
	}
	public void setCtitle(String ctitle){
	    this.ctitle=ctitle;
	}
	public String getCtitle(){
	    return ctitle;
	}
	public void setUnewsid(String unewsid){
	    this.unewsid=unewsid;
	}
	public String getUnewsid(){
	    return unewsid;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
}