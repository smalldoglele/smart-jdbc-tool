package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * AdvertisingLink entity for t_advertising_link table.
 * 
 * 
 * @since 2014-02-17 17:24:35.028
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_advertising_link")	
public class AdvertisingLink implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cposition")
	private String cposition;
	
	@Column(name="cadname")
	private String cadname;
	
	@Column(name="cadjumpurl")
	private String cadjumpurl;
	
	@Column(name="cadpicurl")
	private String cadpicurl;
	
	@Column(name="iaddisplaywidth")
	private Integer iaddisplaywidth;
	
	@Column(name="iaddisplayheight")
	private Integer iaddisplayheight;
	
	@Column(name="dbgndate")
	private Date dbgndate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="iaccesscount")
	private Integer iaccesscount;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCposition(String cposition){
	    this.cposition=cposition;
	}
	public String getCposition(){
	    return cposition;
	}
	public void setCadname(String cadname){
	    this.cadname=cadname;
	}
	public String getCadname(){
	    return cadname;
	}
	public void setCadjumpurl(String cadjumpurl){
	    this.cadjumpurl=cadjumpurl;
	}
	public String getCadjumpurl(){
	    return cadjumpurl;
	}
	public void setCadpicurl(String cadpicurl){
	    this.cadpicurl=cadpicurl;
	}
	public String getCadpicurl(){
	    return cadpicurl;
	}
	public void setIaddisplaywidth(Integer iaddisplaywidth){
	    this.iaddisplaywidth=iaddisplaywidth;
	}
	public Integer getIaddisplaywidth(){
	    return iaddisplaywidth;
	}
	public void setIaddisplayheight(Integer iaddisplayheight){
	    this.iaddisplayheight=iaddisplayheight;
	}
	public Integer getIaddisplayheight(){
	    return iaddisplayheight;
	}
	public void setDbgndate(Date dbgndate){
	    this.dbgndate=dbgndate;
	}
	public Date getDbgndate(){
	    return dbgndate;
	}
	public void setDenddate(Date denddate){
	    this.denddate=denddate;
	}
	public Date getDenddate(){
	    return denddate;
	}
	public void setIaccesscount(Integer iaccesscount){
	    this.iaccesscount=iaccesscount;
	}
	public Integer getIaccesscount(){
	    return iaccesscount;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
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
}