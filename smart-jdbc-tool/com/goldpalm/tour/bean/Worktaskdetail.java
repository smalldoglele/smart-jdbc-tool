package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Worktaskdetail entity for t_worktaskdetail table.
 * 
 * 
 * @since 2014-02-17 17:24:45.356
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_worktaskdetail")	
public class Worktaskdetail implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="uid")
	private String uid;
	
	@Column(name="utaskid")
	private String utaskid;
	
	@Column(name="ibusinesstype")
	private String ibusinesstype;
	
	@Column(name="ubusinessid")
	private String ubusinessid;
	
	@Column(name="idealway")
	private Integer idealway;
	
	@Column(name="istatus")
	private Integer istatus;
	
	@Column(name="udealuserid")
	private String udealuserid;
	
	@Column(name="ddealtime")
	private Date ddealtime;
	
	@Column(name="ctaskmemo")
	private String ctaskmemo;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUtaskid(String utaskid){
	    this.utaskid=utaskid;
	}
	public String getUtaskid(){
	    return utaskid;
	}
	public void setIbusinesstype(String ibusinesstype){
	    this.ibusinesstype=ibusinesstype;
	}
	public String getIbusinesstype(){
	    return ibusinesstype;
	}
	public void setUbusinessid(String ubusinessid){
	    this.ubusinessid=ubusinessid;
	}
	public String getUbusinessid(){
	    return ubusinessid;
	}
	public void setIdealway(Integer idealway){
	    this.idealway=idealway;
	}
	public Integer getIdealway(){
	    return idealway;
	}
	public void setIstatus(Integer istatus){
	    this.istatus=istatus;
	}
	public Integer getIstatus(){
	    return istatus;
	}
	public void setUdealuserid(String udealuserid){
	    this.udealuserid=udealuserid;
	}
	public String getUdealuserid(){
	    return udealuserid;
	}
	public void setDdealtime(Date ddealtime){
	    this.ddealtime=ddealtime;
	}
	public Date getDdealtime(){
	    return ddealtime;
	}
	public void setCtaskmemo(String ctaskmemo){
	    this.ctaskmemo=ctaskmemo;
	}
	public String getCtaskmemo(){
	    return ctaskmemo;
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
}