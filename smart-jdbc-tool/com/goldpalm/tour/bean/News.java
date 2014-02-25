package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * News entity for t_news table.
 * 
 * 
 * @since 2014-02-17 17:24:40.678
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_news")	
public class News implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ccolumn")
	private String ccolumn;
	
	@Column(name="ctitle")
	private String ctitle;
	
	@Column(name="ccontent")
	private String ccontent;
	
	@Column(name="cpicpath")
	private String cpicpath;
	
	@Column(name="icount")
	private Integer icount;
	
	@Column(name="cisvalid")
	private String cisvalid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="cauthor")
	private String cauthor;
	
	@Column(name="csource")
	private String csource;
	
	@Column(name="umemberid")
	private String umemberid;
	
	@Column(name="ulineid")
	private String ulineid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCcolumn(String ccolumn){
	    this.ccolumn=ccolumn;
	}
	public String getCcolumn(){
	    return ccolumn;
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
	public void setCpicpath(String cpicpath){
	    this.cpicpath=cpicpath;
	}
	public String getCpicpath(){
	    return cpicpath;
	}
	public void setIcount(Integer icount){
	    this.icount=icount;
	}
	public Integer getIcount(){
	    return icount;
	}
	public void setCisvalid(String cisvalid){
	    this.cisvalid=cisvalid;
	}
	public String getCisvalid(){
	    return cisvalid;
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
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setCauthor(String cauthor){
	    this.cauthor=cauthor;
	}
	public String getCauthor(){
	    return cauthor;
	}
	public void setCsource(String csource){
	    this.csource=csource;
	}
	public String getCsource(){
	    return csource;
	}
	public void setUmemberid(String umemberid){
	    this.umemberid=umemberid;
	}
	public String getUmemberid(){
	    return umemberid;
	}
	public void setUlineid(String ulineid){
	    this.ulineid=ulineid;
	}
	public String getUlineid(){
	    return ulineid;
	}
}