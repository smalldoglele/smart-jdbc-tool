package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Onlineqa entity for t_onlineqa table.
 * 
 * 
 * @since 2014-02-17 17:24:40.788
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_onlineqa")	
public class Onlineqa implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ctitle")
	private String ctitle;
	
	@Column(name="ccontent")
	private String ccontent;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="ctel")
	private String ctel;
	
	@Column(name="cemail")
	private String cemail;
	
	@Column(name="dcreatetime")
	private Date dcreatetime;
	
	@Column(name="cisvalid")
	private String cisvalid;
	
	@Column(name="creply")
	private String creply;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dreplytime")
	private Date dreplytime;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
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
	public void setCname(String cname){
	    this.cname=cname;
	}
	public String getCname(){
	    return cname;
	}
	public void setCtel(String ctel){
	    this.ctel=ctel;
	}
	public String getCtel(){
	    return ctel;
	}
	public void setCemail(String cemail){
	    this.cemail=cemail;
	}
	public String getCemail(){
	    return cemail;
	}
	public void setDcreatetime(Date dcreatetime){
	    this.dcreatetime=dcreatetime;
	}
	public Date getDcreatetime(){
	    return dcreatetime;
	}
	public void setCisvalid(String cisvalid){
	    this.cisvalid=cisvalid;
	}
	public String getCisvalid(){
	    return cisvalid;
	}
	public void setCreply(String creply){
	    this.creply=creply;
	}
	public String getCreply(){
	    return creply;
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
	public void setDreplytime(Date dreplytime){
	    this.dreplytime=dreplytime;
	}
	public Date getDreplytime(){
	    return dreplytime;
	}
}