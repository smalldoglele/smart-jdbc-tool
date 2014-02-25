package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Individualservice entity for t_individualservice table.
 * 
 * 
 * @since 2014-02-17 17:24:39.196
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_individualservice")	
public class Individualservice implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cservicename")
	private String cservicename;
	
	@Column(name="cservicetype")
	private String cservicetype;
	
	@Column(name="ccity")
	private String ccity;
	
	@Column(name="cpriceunit")
	private String cpriceunit;
	
	@Column(name="ccur")
	private String ccur;
	
	@Column(name="nprice")
	private Double nprice;
	
	@Column(name="dbgndate")
	private Date dbgndate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="cisneeddate")
	private String cisneeddate;
	
	@Column(name="cissue")
	private String cissue;
	
	@Column(name="cpricepolicy")
	private String cpricepolicy;
	
	@Column(name="npolicyparam")
	private Double npolicyparam;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="usourceid")
	private String usourceid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCservicename(String cservicename){
	    this.cservicename=cservicename;
	}
	public String getCservicename(){
	    return cservicename;
	}
	public void setCservicetype(String cservicetype){
	    this.cservicetype=cservicetype;
	}
	public String getCservicetype(){
	    return cservicetype;
	}
	public void setCcity(String ccity){
	    this.ccity=ccity;
	}
	public String getCcity(){
	    return ccity;
	}
	public void setCpriceunit(String cpriceunit){
	    this.cpriceunit=cpriceunit;
	}
	public String getCpriceunit(){
	    return cpriceunit;
	}
	public void setCcur(String ccur){
	    this.ccur=ccur;
	}
	public String getCcur(){
	    return ccur;
	}
	public void setNprice(Double nprice){
	    this.nprice=nprice;
	}
	public Double getNprice(){
	    return nprice;
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
	public void setCisneeddate(String cisneeddate){
	    this.cisneeddate=cisneeddate;
	}
	public String getCisneeddate(){
	    return cisneeddate;
	}
	public void setCissue(String cissue){
	    this.cissue=cissue;
	}
	public String getCissue(){
	    return cissue;
	}
	public void setCpricepolicy(String cpricepolicy){
	    this.cpricepolicy=cpricepolicy;
	}
	public String getCpricepolicy(){
	    return cpricepolicy;
	}
	public void setNpolicyparam(Double npolicyparam){
	    this.npolicyparam=npolicyparam;
	}
	public Double getNpolicyparam(){
	    return npolicyparam;
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
	public void setUsourceid(String usourceid){
	    this.usourceid=usourceid;
	}
	public String getUsourceid(){
	    return usourceid;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
}