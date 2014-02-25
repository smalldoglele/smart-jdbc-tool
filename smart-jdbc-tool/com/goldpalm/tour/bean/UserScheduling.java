package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * UserScheduling entity for t_user_scheduling table.
 * 
 * 
 * @since 2014-02-17 17:24:44.752
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_user_scheduling")	
public class UserScheduling implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="dvaildbgntime")
	private Date dvaildbgntime;
	
	@Column(name="dvaildendtime")
	private Date dvaildendtime;
	
	@Column(name="ivaild")
	private Integer ivaild;
	
	@Column(name="dlogintime")
	private Date dlogintime;
	
	@Column(name="cloginip")
	private String cloginip;
	
	@Column(name="dlogouttime")
	private Date dlogouttime;
	
	@Column(name="clogoutip")
	private String clogoutip;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="ctimename")
	private String ctimename;
	
	@Column(name="cleavereasons")
	private String cleavereasons;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUuserid(String uuserid){
	    this.uuserid=uuserid;
	}
	public String getUuserid(){
	    return uuserid;
	}
	public void setDvaildbgntime(Date dvaildbgntime){
	    this.dvaildbgntime=dvaildbgntime;
	}
	public Date getDvaildbgntime(){
	    return dvaildbgntime;
	}
	public void setDvaildendtime(Date dvaildendtime){
	    this.dvaildendtime=dvaildendtime;
	}
	public Date getDvaildendtime(){
	    return dvaildendtime;
	}
	public void setIvaild(Integer ivaild){
	    this.ivaild=ivaild;
	}
	public Integer getIvaild(){
	    return ivaild;
	}
	public void setDlogintime(Date dlogintime){
	    this.dlogintime=dlogintime;
	}
	public Date getDlogintime(){
	    return dlogintime;
	}
	public void setCloginip(String cloginip){
	    this.cloginip=cloginip;
	}
	public String getCloginip(){
	    return cloginip;
	}
	public void setDlogouttime(Date dlogouttime){
	    this.dlogouttime=dlogouttime;
	}
	public Date getDlogouttime(){
	    return dlogouttime;
	}
	public void setClogoutip(String clogoutip){
	    this.clogoutip=clogoutip;
	}
	public String getClogoutip(){
	    return clogoutip;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setCtimename(String ctimename){
	    this.ctimename=ctimename;
	}
	public String getCtimename(){
	    return ctimename;
	}
	public void setCleavereasons(String cleavereasons){
	    this.cleavereasons=cleavereasons;
	}
	public String getCleavereasons(){
	    return cleavereasons;
	}
}