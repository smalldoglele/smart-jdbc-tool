package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Visa entity for t_visa table.
 * 
 * 
 * @since 2014-02-17 17:24:45.100
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_visa")	
public class Visa implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cdestcountry")
	private String cdestcountry;
	
	@Column(name="cvisatype")
	private String cvisatype;
	
	@Column(name="cissuecity")
	private String cissuecity;
	
	@Column(name="cvalidcount")
	private String cvalidcount;
	
	@Column(name="cworktime")
	private String cworktime;
	
	@Column(name="cvalidperiod")
	private String cvalidperiod;
	
	@Column(name="cmaxstayday")
	private String cmaxstayday;
	
	@Column(name="cdepositinfo")
	private String cdepositinfo;
	
	@Column(name="nsurcharge")
	private Double nsurcharge;
	
	@Column(name="cimportantclause")
	private String cimportantclause;
	
	@Column(name="ctips")
	private String ctips;
	
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
	public void setCdestcountry(String cdestcountry){
	    this.cdestcountry=cdestcountry;
	}
	public String getCdestcountry(){
	    return cdestcountry;
	}
	public void setCvisatype(String cvisatype){
	    this.cvisatype=cvisatype;
	}
	public String getCvisatype(){
	    return cvisatype;
	}
	public void setCissuecity(String cissuecity){
	    this.cissuecity=cissuecity;
	}
	public String getCissuecity(){
	    return cissuecity;
	}
	public void setCvalidcount(String cvalidcount){
	    this.cvalidcount=cvalidcount;
	}
	public String getCvalidcount(){
	    return cvalidcount;
	}
	public void setCworktime(String cworktime){
	    this.cworktime=cworktime;
	}
	public String getCworktime(){
	    return cworktime;
	}
	public void setCvalidperiod(String cvalidperiod){
	    this.cvalidperiod=cvalidperiod;
	}
	public String getCvalidperiod(){
	    return cvalidperiod;
	}
	public void setCmaxstayday(String cmaxstayday){
	    this.cmaxstayday=cmaxstayday;
	}
	public String getCmaxstayday(){
	    return cmaxstayday;
	}
	public void setCdepositinfo(String cdepositinfo){
	    this.cdepositinfo=cdepositinfo;
	}
	public String getCdepositinfo(){
	    return cdepositinfo;
	}
	public void setNsurcharge(Double nsurcharge){
	    this.nsurcharge=nsurcharge;
	}
	public Double getNsurcharge(){
	    return nsurcharge;
	}
	public void setCimportantclause(String cimportantclause){
	    this.cimportantclause=cimportantclause;
	}
	public String getCimportantclause(){
	    return cimportantclause;
	}
	public void setCtips(String ctips){
	    this.ctips=ctips;
	}
	public String getCtips(){
	    return ctips;
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