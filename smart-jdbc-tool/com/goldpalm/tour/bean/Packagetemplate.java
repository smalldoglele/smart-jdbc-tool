package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Packagetemplate entity for t_packagetemplate table.
 * 
 * 
 * @since 2014-02-17 17:24:41.638
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_packagetemplate")	
public class Packagetemplate implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="uresourceid")
	private String uresourceid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="ulinerouteid")
	private String ulinerouteid;
	
	@Column(name="cisdefault")
	private String cisdefault;
	
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
	public void setUresourceid(String uresourceid){
	    this.uresourceid=uresourceid;
	}
	public String getUresourceid(){
	    return uresourceid;
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
	public void setUlinerouteid(String ulinerouteid){
	    this.ulinerouteid=ulinerouteid;
	}
	public String getUlinerouteid(){
	    return ulinerouteid;
	}
	public void setCisdefault(String cisdefault){
	    this.cisdefault=cisdefault;
	}
	public String getCisdefault(){
	    return cisdefault;
	}
}