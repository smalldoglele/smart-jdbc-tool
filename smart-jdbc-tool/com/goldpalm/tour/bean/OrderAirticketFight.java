package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * OrderAirticketFight entity for t_order_airticket_fight table.
 * 
 * 
 * @since 2014-02-17 17:24:41.022
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_order_airticket_fight")	
public class OrderAirticketFight implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uorderairticketid")
	private String uorderairticketid;
	
	@Column(name="ino")
	private Integer ino;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="ccarrier")
	private String ccarrier;
	
	@Column(name="cfightno")
	private String cfightno;
	
	@Column(name="cboardpoint")
	private String cboardpoint;
	
	@Column(name="coffpoint")
	private String coffpoint;
	
	@Column(name="ddeparturedate")
	private Date ddeparturedate;
	
	@Column(name="darrivedate")
	private Date darrivedate;
	
	@Column(name="cclass")
	private String cclass;
	
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
	public void setUorderairticketid(String uorderairticketid){
	    this.uorderairticketid=uorderairticketid;
	}
	public String getUorderairticketid(){
	    return uorderairticketid;
	}
	public void setIno(Integer ino){
	    this.ino=ino;
	}
	public Integer getIno(){
	    return ino;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setCcarrier(String ccarrier){
	    this.ccarrier=ccarrier;
	}
	public String getCcarrier(){
	    return ccarrier;
	}
	public void setCfightno(String cfightno){
	    this.cfightno=cfightno;
	}
	public String getCfightno(){
	    return cfightno;
	}
	public void setCboardpoint(String cboardpoint){
	    this.cboardpoint=cboardpoint;
	}
	public String getCboardpoint(){
	    return cboardpoint;
	}
	public void setCoffpoint(String coffpoint){
	    this.coffpoint=coffpoint;
	}
	public String getCoffpoint(){
	    return coffpoint;
	}
	public void setDdeparturedate(Date ddeparturedate){
	    this.ddeparturedate=ddeparturedate;
	}
	public Date getDdeparturedate(){
	    return ddeparturedate;
	}
	public void setDarrivedate(Date darrivedate){
	    this.darrivedate=darrivedate;
	}
	public Date getDarrivedate(){
	    return darrivedate;
	}
	public void setCclass(String cclass){
	    this.cclass=cclass;
	}
	public String getCclass(){
	    return cclass;
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