package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Activity entity for t_activity table.
 * 
 * 
 * @since 2014-02-17 17:24:34.970
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_activity")	
public class Activity implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ctitle")
	private String ctitle;
	
	@Column(name="cdemand")
	private String cdemand;
	
	@Column(name="dbegindate")
	private Date dbegindate;
	
	@Column(name="dendate")
	private Date dendate;
	
	@Column(name="nlimitpoint")
	private Integer nlimitpoint;
	
	@Column(name="cdesc")
	private String cdesc;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="dcreate")
	private Date dcreate;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="cisvalid")
	private String cisvalid;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="cpicpath")
	private String cpicpath;
	
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
	public void setCdemand(String cdemand){
	    this.cdemand=cdemand;
	}
	public String getCdemand(){
	    return cdemand;
	}
	public void setDbegindate(Date dbegindate){
	    this.dbegindate=dbegindate;
	}
	public Date getDbegindate(){
	    return dbegindate;
	}
	public void setDendate(Date dendate){
	    this.dendate=dendate;
	}
	public Date getDendate(){
	    return dendate;
	}
	public void setNlimitpoint(Integer nlimitpoint){
	    this.nlimitpoint=nlimitpoint;
	}
	public Integer getNlimitpoint(){
	    return nlimitpoint;
	}
	public void setCdesc(String cdesc){
	    this.cdesc=cdesc;
	}
	public String getCdesc(){
	    return cdesc;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setDcreate(Date dcreate){
	    this.dcreate=dcreate;
	}
	public Date getDcreate(){
	    return dcreate;
	}
	public void setUuserid(String uuserid){
	    this.uuserid=uuserid;
	}
	public String getUuserid(){
	    return uuserid;
	}
	public void setUroleid(String uroleid){
	    this.uroleid=uroleid;
	}
	public String getUroleid(){
	    return uroleid;
	}
	public void setUdeptid(String udeptid){
	    this.udeptid=udeptid;
	}
	public String getUdeptid(){
	    return udeptid;
	}
	public void setCisvalid(String cisvalid){
	    this.cisvalid=cisvalid;
	}
	public String getCisvalid(){
	    return cisvalid;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setCpicpath(String cpicpath){
	    this.cpicpath=cpicpath;
	}
	public String getCpicpath(){
	    return cpicpath;
	}
}