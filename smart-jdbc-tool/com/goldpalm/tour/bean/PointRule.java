package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * PointRule entity for t_point_rule table.
 * 
 * 
 * @since 2014-02-17 17:24:41.738
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_point_rule")	
public class PointRule implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ceventtype")
	private String ceventtype;
	
	@Column(name="cisvaild")
	private String cisvaild;
	
	@Column(name="cproducttype")
	private String cproducttype;
	
	@Column(name="cpionttype")
	private String cpionttype;
	
	@Column(name="npoint")
	private Double npoint;
	
	@Column(name="dbgndate")
	private Date dbgndate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="dopdate")
	private Date dopdate;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="rulecmemo")
	private String rulecmemo;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCeventtype(String ceventtype){
	    this.ceventtype=ceventtype;
	}
	public String getCeventtype(){
	    return ceventtype;
	}
	public void setCisvaild(String cisvaild){
	    this.cisvaild=cisvaild;
	}
	public String getCisvaild(){
	    return cisvaild;
	}
	public void setCproducttype(String cproducttype){
	    this.cproducttype=cproducttype;
	}
	public String getCproducttype(){
	    return cproducttype;
	}
	public void setCpionttype(String cpionttype){
	    this.cpionttype=cpionttype;
	}
	public String getCpionttype(){
	    return cpionttype;
	}
	public void setNpoint(Double npoint){
	    this.npoint=npoint;
	}
	public Double getNpoint(){
	    return npoint;
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
	public void setDopdate(Date dopdate){
	    this.dopdate=dopdate;
	}
	public Date getDopdate(){
	    return dopdate;
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
	public void setRulecmemo(String rulecmemo){
	    this.rulecmemo=rulecmemo;
	}
	public String getRulecmemo(){
	    return rulecmemo;
	}
}