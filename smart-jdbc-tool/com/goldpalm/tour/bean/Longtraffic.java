package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Longtraffic entity for t_longtraffic table.
 * 
 * 
 * @since 2014-02-17 17:24:40.118
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_longtraffic")	
public class Longtraffic implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cdescribe")
	private String cdescribe;
	
	@Column(name="ctraffictype")
	private String ctraffictype;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="ccarrier")
	private String ccarrier;
	
	@Column(name="dbgndate")
	private Date dbgndate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="cfrequency")
	private String cfrequency;
	
	@Column(name="cpricepolicy")
	private String cpricepolicy;
	
	@Column(name="npolicyparam")
	private Double npolicyparam;
	
	@Column(name="iduration")
	private Integer iduration;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="cissue")
	private String cissue;
	
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
	
	@Column(name="ciscommend")
	private String ciscommend;
	
	@Column(name="nprice")
	private Double nprice;
	
	@Column(name="cflighttype")
	private String cflighttype;
	
	@Column(name="carrive")
	private String carrive;
	
	@Column(name="cdeparture")
	private String cdeparture;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCdescribe(String cdescribe){
	    this.cdescribe=cdescribe;
	}
	public String getCdescribe(){
	    return cdescribe;
	}
	public void setCtraffictype(String ctraffictype){
	    this.ctraffictype=ctraffictype;
	}
	public String getCtraffictype(){
	    return ctraffictype;
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
	public void setCfrequency(String cfrequency){
	    this.cfrequency=cfrequency;
	}
	public String getCfrequency(){
	    return cfrequency;
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
	public void setIduration(Integer iduration){
	    this.iduration=iduration;
	}
	public Integer getIduration(){
	    return iduration;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setCissue(String cissue){
	    this.cissue=cissue;
	}
	public String getCissue(){
	    return cissue;
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
	public void setCiscommend(String ciscommend){
	    this.ciscommend=ciscommend;
	}
	public String getCiscommend(){
	    return ciscommend;
	}
	public void setNprice(Double nprice){
	    this.nprice=nprice;
	}
	public Double getNprice(){
	    return nprice;
	}
	public void setCflighttype(String cflighttype){
	    this.cflighttype=cflighttype;
	}
	public String getCflighttype(){
	    return cflighttype;
	}
	public void setCarrive(String carrive){
	    this.carrive=carrive;
	}
	public String getCarrive(){
	    return carrive;
	}
	public void setCdeparture(String cdeparture){
	    this.cdeparture=cdeparture;
	}
	public String getCdeparture(){
	    return cdeparture;
	}
}