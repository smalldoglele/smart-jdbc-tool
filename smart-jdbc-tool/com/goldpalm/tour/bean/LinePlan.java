package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * LinePlan entity for t_line_plan table.
 * 
 * 
 * @since 2014-02-17 17:24:39.771
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_line_plan")	
public class LinePlan implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ulineid")
	private String ulineid;
	
	@Column(name="dbgndate")
	private Date dbgndate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="cisvalid")
	private String cisvalid;
	
	@Column(name="coutrule")
	private String coutrule;
	
	@Column(name="coutparam")
	private String coutparam;
	
	@Column(name="doutdate")
	private Date doutdate;
	
	@Column(name="cpricepolicy")
	private String cpricepolicy;
	
	@Column(name="cpolicyparam")
	private Double cpolicyparam;
	
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
	public void setUlineid(String ulineid){
	    this.ulineid=ulineid;
	}
	public String getUlineid(){
	    return ulineid;
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
	public void setCisvalid(String cisvalid){
	    this.cisvalid=cisvalid;
	}
	public String getCisvalid(){
	    return cisvalid;
	}
	public void setCoutrule(String coutrule){
	    this.coutrule=coutrule;
	}
	public String getCoutrule(){
	    return coutrule;
	}
	public void setCoutparam(String coutparam){
	    this.coutparam=coutparam;
	}
	public String getCoutparam(){
	    return coutparam;
	}
	public void setDoutdate(Date doutdate){
	    this.doutdate=doutdate;
	}
	public Date getDoutdate(){
	    return doutdate;
	}
	public void setCpricepolicy(String cpricepolicy){
	    this.cpricepolicy=cpricepolicy;
	}
	public String getCpricepolicy(){
	    return cpricepolicy;
	}
	public void setCpolicyparam(Double cpolicyparam){
	    this.cpolicyparam=cpolicyparam;
	}
	public Double getCpolicyparam(){
	    return cpolicyparam;
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