package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * TradeGuest entity for t_trade_guest table.
 * 
 * 
 * @since 2014-02-17 17:24:44.590
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_trade_guest")	
public class TradeGuest implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="uid")
	private String uid;
	
	@Column(name="utradeorderid")
	private String utradeorderid;
	
	@Column(name="cidcard")
	private String cidcard;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cfamilyname")
	private String cfamilyname;
	
	@Column(name="cgivenname")
	private String cgivenname;
	
	@Column(name="csex")
	private String csex;
	
	@Column(name="cbirthplace")
	private String cbirthplace;
	
	@Column(name="cmobiletel")
	private String cmobiletel;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUtradeorderid(String utradeorderid){
	    this.utradeorderid=utradeorderid;
	}
	public String getUtradeorderid(){
	    return utradeorderid;
	}
	public void setCidcard(String cidcard){
	    this.cidcard=cidcard;
	}
	public String getCidcard(){
	    return cidcard;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setCname(String cname){
	    this.cname=cname;
	}
	public String getCname(){
	    return cname;
	}
	public void setCfamilyname(String cfamilyname){
	    this.cfamilyname=cfamilyname;
	}
	public String getCfamilyname(){
	    return cfamilyname;
	}
	public void setCgivenname(String cgivenname){
	    this.cgivenname=cgivenname;
	}
	public String getCgivenname(){
	    return cgivenname;
	}
	public void setCsex(String csex){
	    this.csex=csex;
	}
	public String getCsex(){
	    return csex;
	}
	public void setCbirthplace(String cbirthplace){
	    this.cbirthplace=cbirthplace;
	}
	public String getCbirthplace(){
	    return cbirthplace;
	}
	public void setCmobiletel(String cmobiletel){
	    this.cmobiletel=cmobiletel;
	}
	public String getCmobiletel(){
	    return cmobiletel;
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
}