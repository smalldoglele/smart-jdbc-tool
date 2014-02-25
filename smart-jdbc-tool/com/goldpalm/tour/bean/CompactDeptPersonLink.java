package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CompactDeptPersonLink entity for t_compact_dept_person_link table.
 * 
 * 
 * @since 2014-02-17 17:24:37.151
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_compact_dept_person_link")	
public class CompactDeptPersonLink implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uuid;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="ulinkid")
	private String ulinkid;
	
	@Column(name="ucompactid")
	private String ucompactid;
	
	@Column(name="dassigndate")
	private Date dassigndate;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	public void setUuid(String uuid){
	    this.uuid=uuid;
	}
	public String getUuid(){
	    return uuid;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setUlinkid(String ulinkid){
	    this.ulinkid=ulinkid;
	}
	public String getUlinkid(){
	    return ulinkid;
	}
	public void setUcompactid(String ucompactid){
	    this.ucompactid=ucompactid;
	}
	public String getUcompactid(){
	    return ucompactid;
	}
	public void setDassigndate(Date dassigndate){
	    this.dassigndate=dassigndate;
	}
	public Date getDassigndate(){
	    return dassigndate;
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
	public void setUroleid(String uroleid){
	    this.uroleid=uroleid;
	}
	public String getUroleid(){
	    return uroleid;
	}
}