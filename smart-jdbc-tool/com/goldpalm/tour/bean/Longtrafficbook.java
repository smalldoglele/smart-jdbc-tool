package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Longtrafficbook entity for t_longtrafficbook table.
 * 
 * 
 * @since 2014-02-17 17:24:40.154
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_longtrafficbook")	
public class Longtrafficbook implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ulongtrafficid")
	private String ulongtrafficid;
	
	@Column(name="cpnr")
	private String cpnr;
	
	@Column(name="ddeparturedate")
	private Date ddeparturedate;
	
	@Column(name="darrivedate")
	private Date darrivedate;
	
	@Column(name="iqty")
	private Integer iqty;
	
	@Column(name="nprice")
	private Double nprice;
	
	@Column(name="ndeposit")
	private String ndeposit;
	
	@Column(name="cdepositno")
	private String cdepositno;
	
	@Column(name="dsubmit")
	private Date dsubmit;
	
	@Column(name="ddraft")
	private Date ddraft;
	
	@Column(name="cdraftname")
	private String cdraftname;
	
	@Column(name="idraftqty")
	private Integer idraftqty;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="dcreate")
	private Date dcreate;
	
	@Column(name="cneedinternalseg")
	private String cneedinternalseg;
	
	@Column(name="usupplierid")
	private String usupplierid;
	
	@Column(name="cscotmemo")
	private String cscotmemo;
	
	@Column(name="ndemandcdraftpercent")
	private Double ndemandcdraftpercent;
	
	@Column(name="cdraftflag")
	private String cdraftflag;
	
	@Column(name="udraftuserid")
	private String udraftuserid;
	
	@Column(name="clineno")
	private String clineno;
	
	@Column(name="clineno2")
	private String clineno2;
	
	@Column(name="ddemanddraft")
	private Date ddemanddraft;
	
	@Column(name="cdistrict")
	private String cdistrict;
	
	@Column(name="idays")
	private Integer idays;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUlongtrafficid(String ulongtrafficid){
	    this.ulongtrafficid=ulongtrafficid;
	}
	public String getUlongtrafficid(){
	    return ulongtrafficid;
	}
	public void setCpnr(String cpnr){
	    this.cpnr=cpnr;
	}
	public String getCpnr(){
	    return cpnr;
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
	public void setIqty(Integer iqty){
	    this.iqty=iqty;
	}
	public Integer getIqty(){
	    return iqty;
	}
	public void setNprice(Double nprice){
	    this.nprice=nprice;
	}
	public Double getNprice(){
	    return nprice;
	}
	public void setNdeposit(String ndeposit){
	    this.ndeposit=ndeposit;
	}
	public String getNdeposit(){
	    return ndeposit;
	}
	public void setCdepositno(String cdepositno){
	    this.cdepositno=cdepositno;
	}
	public String getCdepositno(){
	    return cdepositno;
	}
	public void setDsubmit(Date dsubmit){
	    this.dsubmit=dsubmit;
	}
	public Date getDsubmit(){
	    return dsubmit;
	}
	public void setDdraft(Date ddraft){
	    this.ddraft=ddraft;
	}
	public Date getDdraft(){
	    return ddraft;
	}
	public void setCdraftname(String cdraftname){
	    this.cdraftname=cdraftname;
	}
	public String getCdraftname(){
	    return cdraftname;
	}
	public void setIdraftqty(Integer idraftqty){
	    this.idraftqty=idraftqty;
	}
	public Integer getIdraftqty(){
	    return idraftqty;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
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
	public void setDcreate(Date dcreate){
	    this.dcreate=dcreate;
	}
	public Date getDcreate(){
	    return dcreate;
	}
	public void setCneedinternalseg(String cneedinternalseg){
	    this.cneedinternalseg=cneedinternalseg;
	}
	public String getCneedinternalseg(){
	    return cneedinternalseg;
	}
	public void setUsupplierid(String usupplierid){
	    this.usupplierid=usupplierid;
	}
	public String getUsupplierid(){
	    return usupplierid;
	}
	public void setCscotmemo(String cscotmemo){
	    this.cscotmemo=cscotmemo;
	}
	public String getCscotmemo(){
	    return cscotmemo;
	}
	public void setNdemandcdraftpercent(Double ndemandcdraftpercent){
	    this.ndemandcdraftpercent=ndemandcdraftpercent;
	}
	public Double getNdemandcdraftpercent(){
	    return ndemandcdraftpercent;
	}
	public void setCdraftflag(String cdraftflag){
	    this.cdraftflag=cdraftflag;
	}
	public String getCdraftflag(){
	    return cdraftflag;
	}
	public void setUdraftuserid(String udraftuserid){
	    this.udraftuserid=udraftuserid;
	}
	public String getUdraftuserid(){
	    return udraftuserid;
	}
	public void setClineno(String clineno){
	    this.clineno=clineno;
	}
	public String getClineno(){
	    return clineno;
	}
	public void setClineno2(String clineno2){
	    this.clineno2=clineno2;
	}
	public String getClineno2(){
	    return clineno2;
	}
	public void setDdemanddraft(Date ddemanddraft){
	    this.ddemanddraft=ddemanddraft;
	}
	public Date getDdemanddraft(){
	    return ddemanddraft;
	}
	public void setCdistrict(String cdistrict){
	    this.cdistrict=cdistrict;
	}
	public String getCdistrict(){
	    return cdistrict;
	}
	public void setIdays(Integer idays){
	    this.idays=idays;
	}
	public Integer getIdays(){
	    return idays;
	}
}