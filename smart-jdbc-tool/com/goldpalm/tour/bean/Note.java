package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Note entity for t_note table.
 * 
 * 
 * @since 2014-02-17 17:24:40.715
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_note")	
public class Note implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="ctitle")
	private String ctitle;
	
	@Column(name="ccontent")
	private String ccontent;
	
	@Column(name="dbegindate")
	private Date dbegindate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="ilevel")
	private Integer ilevel;
	
	@Column(name="creply")
	private String creply;
	
	@Column(name="cpicpath")
	private String cpicpath;
	
	@Column(name="cmicropicpath")
	private String cmicropicpath;
	
	@Column(name="cattachpath")
	private String cattachpath;
	
	@Column(name="cattachmemo")
	private String cattachmemo;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setCtitle(String ctitle){
	    this.ctitle=ctitle;
	}
	public String getCtitle(){
	    return ctitle;
	}
	public void setCcontent(String ccontent){
	    this.ccontent=ccontent;
	}
	public String getCcontent(){
	    return ccontent;
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
	public void setIlevel(Integer ilevel){
	    this.ilevel=ilevel;
	}
	public Integer getIlevel(){
	    return ilevel;
	}
	public void setCreply(String creply){
	    this.creply=creply;
	}
	public String getCreply(){
	    return creply;
	}
	public void setCpicpath(String cpicpath){
	    this.cpicpath=cpicpath;
	}
	public String getCpicpath(){
	    return cpicpath;
	}
	public void setCmicropicpath(String cmicropicpath){
	    this.cmicropicpath=cmicropicpath;
	}
	public String getCmicropicpath(){
	    return cmicropicpath;
	}
	public void setCattachpath(String cattachpath){
	    this.cattachpath=cattachpath;
	}
	public String getCattachpath(){
	    return cattachpath;
	}
	public void setCattachmemo(String cattachmemo){
	    this.cattachmemo=cattachmemo;
	}
	public String getCattachmemo(){
	    return cattachmemo;
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
}