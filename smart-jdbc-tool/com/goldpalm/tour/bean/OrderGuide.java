package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * OrderGuide entity for t_order_guide table.
 * 
 * 
 * @since 2014-02-17 17:24:41.206
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_order_guide")	
public class OrderGuide implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uorderid")
	private String uorderid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="iperson")
	private Integer iperson;
	
	@Column(name="idays")
	private Integer idays;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="ccsmemo")
	private String ccsmemo;
	
	@Column(name="dbgndate")
	private Date dbgndate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="namount")
	private Double namount;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="cpaystatus")
	private String cpaystatus;
	
	@Column(name="cconfirmmode")
	private String cconfirmmode;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="dcreatetime")
	private Date dcreatetime;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uguideid")
	private String uguideid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUorderid(String uorderid){
	    this.uorderid=uorderid;
	}
	public String getUorderid(){
	    return uorderid;
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
	public void setIperson(Integer iperson){
	    this.iperson=iperson;
	}
	public Integer getIperson(){
	    return iperson;
	}
	public void setIdays(Integer idays){
	    this.idays=idays;
	}
	public Integer getIdays(){
	    return idays;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setCcsmemo(String ccsmemo){
	    this.ccsmemo=ccsmemo;
	}
	public String getCcsmemo(){
	    return ccsmemo;
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
	public void setNamount(Double namount){
	    this.namount=namount;
	}
	public Double getNamount(){
	    return namount;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
	public void setCpaystatus(String cpaystatus){
	    this.cpaystatus=cpaystatus;
	}
	public String getCpaystatus(){
	    return cpaystatus;
	}
	public void setCconfirmmode(String cconfirmmode){
	    this.cconfirmmode=cconfirmmode;
	}
	public String getCconfirmmode(){
	    return cconfirmmode;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setDcreatetime(Date dcreatetime){
	    this.dcreatetime=dcreatetime;
	}
	public Date getDcreatetime(){
	    return dcreatetime;
	}
	public void setUroleid(String uroleid){
	    this.uroleid=uroleid;
	}
	public String getUroleid(){
	    return uroleid;
	}
	public void setUguideid(String uguideid){
	    this.uguideid=uguideid;
	}
	public String getUguideid(){
	    return uguideid;
	}
}