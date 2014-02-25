package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Ticketpricecache entity for t_ticketpricecache table.
 * 
 * 
 * @since 2014-02-17 17:24:44.481
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_ticketpricecache")	
public class Ticketpricecache implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String cpk;
	
	@Column(name="cfightno")
	private String cfightno;
	
	@Column(name="cboardpoint")
	private String cboardpoint;
	
	@Column(name="coffpoint")
	private String coffpoint;
	
	@Column(name="ddeparturedate")
	private Date ddeparturedate;
	
	@Column(name="cclass")
	private String cclass;
	
	@Column(name="cfare")
	private String cfare;
	
	@Column(name="ctaxcn")
	private String ctaxcn;
	
	@Column(name="ctaxyq")
	private String ctaxyq;
	
	@Column(name="nrebate")
	private Integer nrebate;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	public void setCpk(String cpk){
	    this.cpk=cpk;
	}
	public String getCpk(){
	    return cpk;
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
	public void setCclass(String cclass){
	    this.cclass=cclass;
	}
	public String getCclass(){
	    return cclass;
	}
	public void setCfare(String cfare){
	    this.cfare=cfare;
	}
	public String getCfare(){
	    return cfare;
	}
	public void setCtaxcn(String ctaxcn){
	    this.ctaxcn=ctaxcn;
	}
	public String getCtaxcn(){
	    return ctaxcn;
	}
	public void setCtaxyq(String ctaxyq){
	    this.ctaxyq=ctaxyq;
	}
	public String getCtaxyq(){
	    return ctaxyq;
	}
	public void setNrebate(Integer nrebate){
	    this.nrebate=nrebate;
	}
	public Integer getNrebate(){
	    return nrebate;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
}