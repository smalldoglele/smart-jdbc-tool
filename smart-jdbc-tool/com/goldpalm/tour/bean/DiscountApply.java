package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * DiscountApply entity for t_discount_apply table.
 * 
 * 
 * @since 2014-02-17 17:24:38.400
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_discount_apply")	
public class DiscountApply implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uaccountrpid")
	private String uaccountrpid;
	
	@Column(name="cdiscountpolicy")
	private String cdiscountpolicy;
	
	@Column(name="ndiscountparam")
	private Double ndiscountparam;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="clookmind")
	private String clookmind;
	
	@Column(name="ulookmanid")
	private String ulookmanid;
	
	@Column(name="dlooktime")
	private Date dlooktime;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="dcreate")
	private Date dcreate;
	
	@Column(name="cmemo")
	private String cmemo;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUaccountrpid(String uaccountrpid){
	    this.uaccountrpid=uaccountrpid;
	}
	public String getUaccountrpid(){
	    return uaccountrpid;
	}
	public void setCdiscountpolicy(String cdiscountpolicy){
	    this.cdiscountpolicy=cdiscountpolicy;
	}
	public String getCdiscountpolicy(){
	    return cdiscountpolicy;
	}
	public void setNdiscountparam(Double ndiscountparam){
	    this.ndiscountparam=ndiscountparam;
	}
	public Double getNdiscountparam(){
	    return ndiscountparam;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
	public void setClookmind(String clookmind){
	    this.clookmind=clookmind;
	}
	public String getClookmind(){
	    return clookmind;
	}
	public void setUlookmanid(String ulookmanid){
	    this.ulookmanid=ulookmanid;
	}
	public String getUlookmanid(){
	    return ulookmanid;
	}
	public void setDlooktime(Date dlooktime){
	    this.dlooktime=dlooktime;
	}
	public Date getDlooktime(){
	    return dlooktime;
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
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
}