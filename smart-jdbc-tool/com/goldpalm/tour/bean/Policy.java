package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Policy entity for t_policy table.
 * 
 * 
 * @since 2014-02-17 17:24:41.790
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_policy")	
public class Policy implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="corderid")
	private String corderid;
	
	@Column(name="cgrouporderid")
	private String cgrouporderid;
	
	@Column(name="uorderid")
	private String uorderid;
	
	@Column(name="cline")
	private String cline;
	
	@Column(name="uproductid")
	private String uproductid;
	
	@Column(name="ccontinent")
	private String ccontinent;
	
	@Column(name="cnation")
	private String cnation;
	
	@Column(name="carea")
	private String carea;
	
	@Column(name="cstate")
	private String cstate;
	
	@Column(name="ccity")
	private String ccity;
	
	@Column(name="nquote")
	private Double nquote;
	
	@Column(name="cpolicyid")
	private String cpolicyid;
	
	@Column(name="cgrouppolicyid")
	private String cgrouppolicyid;
	
	@Column(name="citem")
	private String citem;
	
	@Column(name="cdestination")
	private String cdestination;
	
	@Column(name="dbgndate")
	private Date dbgndate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="icopys")
	private Integer icopys;
	
	@Column(name="npremium")
	private Double npremium;
	
	@Column(name="cbeneficiary")
	private String cbeneficiary;
	
	@Column(name="cbcertificatetype")
	private String cbcertificatetype;
	
	@Column(name="cbcertificateno")
	private String cbcertificateno;
	
	@Column(name="cbrelation")
	private String cbrelation;
	
	@Column(name="nshare")
	private Double nshare;
	
	@Column(name="capplicant")
	private String capplicant;
	
	@Column(name="cfirstname")
	private String cfirstname;
	
	@Column(name="clastname")
	private String clastname;
	
	@Column(name="crelation")
	private String crelation;
	
	@Column(name="ccertificatetype")
	private String ccertificatetype;
	
	@Column(name="ccertificateno")
	private String ccertificateno;
	
	@Column(name="dbirthday")
	private Date dbirthday;
	
	@Column(name="cmobile")
	private String cmobile;
	
	@Column(name="cemail")
	private String cemail;
	
	@Column(name="caddress")
	private String caddress;
	
	@Column(name="czip")
	private String czip;
	
	@Column(name="cphone")
	private String cphone;
	
	@Column(name="cletteraddress")
	private String cletteraddress;
	
	@Column(name="cletterzip")
	private String cletterzip;
	
	@Column(name="cemergencylinker")
	private String cemergencylinker;
	
	@Column(name="cemergencyphone")
	private String cemergencyphone;
	
	@Column(name="dapply")
	private Date dapply;
	
	@Column(name="uapplyroleid")
	private String uapplyroleid;
	
	@Column(name="uapplyuserid")
	private String uapplyuserid;
	
	@Column(name="uapplydeptid")
	private String uapplydeptid;
	
	@Column(name="cupsuccessflag")
	private String cupsuccessflag;
	
	@Column(name="dupsuccess")
	private Date dupsuccess;
	
	@Column(name="creceiveway")
	private String creceiveway;
	
	@Column(name="ccheckedflag")
	private String ccheckedflag;
	
	@Column(name="cquitflag")
	private String cquitflag;
	
	@Column(name="urelationid")
	private String urelationid;
	
	@Column(name="uquitsuccessflag")
	private String uquitsuccessflag;
	
	@Column(name="dpause")
	private Date dpause;
	
	@Column(name="upauseroleid")
	private String upauseroleid;
	
	@Column(name="upauseuserid")
	private String upauseuserid;
	
	@Column(name="upausedeptid")
	private String upausedeptid;
	
	@Column(name="dcancel")
	private Date dcancel;
	
	@Column(name="ucancelroleid")
	private String ucancelroleid;
	
	@Column(name="ucanceluserid")
	private String ucanceluserid;
	
	@Column(name="ucanceldeptid")
	private String ucanceldeptid;
	
	@Column(name="cweburl")
	private String cweburl;
	
	@Column(name="cpdfurl")
	private String cpdfurl;
	
	@Column(name="dcountermark")
	private Date dcountermark;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="csuccessflag")
	private String csuccessflag;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="dsuccess")
	private Date dsuccess;
	
	@Column(name="cexportfilename")
	private String cexportfilename;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCorderid(String corderid){
	    this.corderid=corderid;
	}
	public String getCorderid(){
	    return corderid;
	}
	public void setCgrouporderid(String cgrouporderid){
	    this.cgrouporderid=cgrouporderid;
	}
	public String getCgrouporderid(){
	    return cgrouporderid;
	}
	public void setUorderid(String uorderid){
	    this.uorderid=uorderid;
	}
	public String getUorderid(){
	    return uorderid;
	}
	public void setCline(String cline){
	    this.cline=cline;
	}
	public String getCline(){
	    return cline;
	}
	public void setUproductid(String uproductid){
	    this.uproductid=uproductid;
	}
	public String getUproductid(){
	    return uproductid;
	}
	public void setCcontinent(String ccontinent){
	    this.ccontinent=ccontinent;
	}
	public String getCcontinent(){
	    return ccontinent;
	}
	public void setCnation(String cnation){
	    this.cnation=cnation;
	}
	public String getCnation(){
	    return cnation;
	}
	public void setCarea(String carea){
	    this.carea=carea;
	}
	public String getCarea(){
	    return carea;
	}
	public void setCstate(String cstate){
	    this.cstate=cstate;
	}
	public String getCstate(){
	    return cstate;
	}
	public void setCcity(String ccity){
	    this.ccity=ccity;
	}
	public String getCcity(){
	    return ccity;
	}
	public void setNquote(Double nquote){
	    this.nquote=nquote;
	}
	public Double getNquote(){
	    return nquote;
	}
	public void setCpolicyid(String cpolicyid){
	    this.cpolicyid=cpolicyid;
	}
	public String getCpolicyid(){
	    return cpolicyid;
	}
	public void setCgrouppolicyid(String cgrouppolicyid){
	    this.cgrouppolicyid=cgrouppolicyid;
	}
	public String getCgrouppolicyid(){
	    return cgrouppolicyid;
	}
	public void setCitem(String citem){
	    this.citem=citem;
	}
	public String getCitem(){
	    return citem;
	}
	public void setCdestination(String cdestination){
	    this.cdestination=cdestination;
	}
	public String getCdestination(){
	    return cdestination;
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
	public void setIcopys(Integer icopys){
	    this.icopys=icopys;
	}
	public Integer getIcopys(){
	    return icopys;
	}
	public void setNpremium(Double npremium){
	    this.npremium=npremium;
	}
	public Double getNpremium(){
	    return npremium;
	}
	public void setCbeneficiary(String cbeneficiary){
	    this.cbeneficiary=cbeneficiary;
	}
	public String getCbeneficiary(){
	    return cbeneficiary;
	}
	public void setCbcertificatetype(String cbcertificatetype){
	    this.cbcertificatetype=cbcertificatetype;
	}
	public String getCbcertificatetype(){
	    return cbcertificatetype;
	}
	public void setCbcertificateno(String cbcertificateno){
	    this.cbcertificateno=cbcertificateno;
	}
	public String getCbcertificateno(){
	    return cbcertificateno;
	}
	public void setCbrelation(String cbrelation){
	    this.cbrelation=cbrelation;
	}
	public String getCbrelation(){
	    return cbrelation;
	}
	public void setNshare(Double nshare){
	    this.nshare=nshare;
	}
	public Double getNshare(){
	    return nshare;
	}
	public void setCapplicant(String capplicant){
	    this.capplicant=capplicant;
	}
	public String getCapplicant(){
	    return capplicant;
	}
	public void setCfirstname(String cfirstname){
	    this.cfirstname=cfirstname;
	}
	public String getCfirstname(){
	    return cfirstname;
	}
	public void setClastname(String clastname){
	    this.clastname=clastname;
	}
	public String getClastname(){
	    return clastname;
	}
	public void setCrelation(String crelation){
	    this.crelation=crelation;
	}
	public String getCrelation(){
	    return crelation;
	}
	public void setCcertificatetype(String ccertificatetype){
	    this.ccertificatetype=ccertificatetype;
	}
	public String getCcertificatetype(){
	    return ccertificatetype;
	}
	public void setCcertificateno(String ccertificateno){
	    this.ccertificateno=ccertificateno;
	}
	public String getCcertificateno(){
	    return ccertificateno;
	}
	public void setDbirthday(Date dbirthday){
	    this.dbirthday=dbirthday;
	}
	public Date getDbirthday(){
	    return dbirthday;
	}
	public void setCmobile(String cmobile){
	    this.cmobile=cmobile;
	}
	public String getCmobile(){
	    return cmobile;
	}
	public void setCemail(String cemail){
	    this.cemail=cemail;
	}
	public String getCemail(){
	    return cemail;
	}
	public void setCaddress(String caddress){
	    this.caddress=caddress;
	}
	public String getCaddress(){
	    return caddress;
	}
	public void setCzip(String czip){
	    this.czip=czip;
	}
	public String getCzip(){
	    return czip;
	}
	public void setCphone(String cphone){
	    this.cphone=cphone;
	}
	public String getCphone(){
	    return cphone;
	}
	public void setCletteraddress(String cletteraddress){
	    this.cletteraddress=cletteraddress;
	}
	public String getCletteraddress(){
	    return cletteraddress;
	}
	public void setCletterzip(String cletterzip){
	    this.cletterzip=cletterzip;
	}
	public String getCletterzip(){
	    return cletterzip;
	}
	public void setCemergencylinker(String cemergencylinker){
	    this.cemergencylinker=cemergencylinker;
	}
	public String getCemergencylinker(){
	    return cemergencylinker;
	}
	public void setCemergencyphone(String cemergencyphone){
	    this.cemergencyphone=cemergencyphone;
	}
	public String getCemergencyphone(){
	    return cemergencyphone;
	}
	public void setDapply(Date dapply){
	    this.dapply=dapply;
	}
	public Date getDapply(){
	    return dapply;
	}
	public void setUapplyroleid(String uapplyroleid){
	    this.uapplyroleid=uapplyroleid;
	}
	public String getUapplyroleid(){
	    return uapplyroleid;
	}
	public void setUapplyuserid(String uapplyuserid){
	    this.uapplyuserid=uapplyuserid;
	}
	public String getUapplyuserid(){
	    return uapplyuserid;
	}
	public void setUapplydeptid(String uapplydeptid){
	    this.uapplydeptid=uapplydeptid;
	}
	public String getUapplydeptid(){
	    return uapplydeptid;
	}
	public void setCupsuccessflag(String cupsuccessflag){
	    this.cupsuccessflag=cupsuccessflag;
	}
	public String getCupsuccessflag(){
	    return cupsuccessflag;
	}
	public void setDupsuccess(Date dupsuccess){
	    this.dupsuccess=dupsuccess;
	}
	public Date getDupsuccess(){
	    return dupsuccess;
	}
	public void setCreceiveway(String creceiveway){
	    this.creceiveway=creceiveway;
	}
	public String getCreceiveway(){
	    return creceiveway;
	}
	public void setCcheckedflag(String ccheckedflag){
	    this.ccheckedflag=ccheckedflag;
	}
	public String getCcheckedflag(){
	    return ccheckedflag;
	}
	public void setCquitflag(String cquitflag){
	    this.cquitflag=cquitflag;
	}
	public String getCquitflag(){
	    return cquitflag;
	}
	public void setUrelationid(String urelationid){
	    this.urelationid=urelationid;
	}
	public String getUrelationid(){
	    return urelationid;
	}
	public void setUquitsuccessflag(String uquitsuccessflag){
	    this.uquitsuccessflag=uquitsuccessflag;
	}
	public String getUquitsuccessflag(){
	    return uquitsuccessflag;
	}
	public void setDpause(Date dpause){
	    this.dpause=dpause;
	}
	public Date getDpause(){
	    return dpause;
	}
	public void setUpauseroleid(String upauseroleid){
	    this.upauseroleid=upauseroleid;
	}
	public String getUpauseroleid(){
	    return upauseroleid;
	}
	public void setUpauseuserid(String upauseuserid){
	    this.upauseuserid=upauseuserid;
	}
	public String getUpauseuserid(){
	    return upauseuserid;
	}
	public void setUpausedeptid(String upausedeptid){
	    this.upausedeptid=upausedeptid;
	}
	public String getUpausedeptid(){
	    return upausedeptid;
	}
	public void setDcancel(Date dcancel){
	    this.dcancel=dcancel;
	}
	public Date getDcancel(){
	    return dcancel;
	}
	public void setUcancelroleid(String ucancelroleid){
	    this.ucancelroleid=ucancelroleid;
	}
	public String getUcancelroleid(){
	    return ucancelroleid;
	}
	public void setUcanceluserid(String ucanceluserid){
	    this.ucanceluserid=ucanceluserid;
	}
	public String getUcanceluserid(){
	    return ucanceluserid;
	}
	public void setUcanceldeptid(String ucanceldeptid){
	    this.ucanceldeptid=ucanceldeptid;
	}
	public String getUcanceldeptid(){
	    return ucanceldeptid;
	}
	public void setCweburl(String cweburl){
	    this.cweburl=cweburl;
	}
	public String getCweburl(){
	    return cweburl;
	}
	public void setCpdfurl(String cpdfurl){
	    this.cpdfurl=cpdfurl;
	}
	public String getCpdfurl(){
	    return cpdfurl;
	}
	public void setDcountermark(Date dcountermark){
	    this.dcountermark=dcountermark;
	}
	public Date getDcountermark(){
	    return dcountermark;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
	public void setCsuccessflag(String csuccessflag){
	    this.csuccessflag=csuccessflag;
	}
	public String getCsuccessflag(){
	    return csuccessflag;
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
	public void setUuserid(String uuserid){
	    this.uuserid=uuserid;
	}
	public String getUuserid(){
	    return uuserid;
	}
	public void setDsuccess(Date dsuccess){
	    this.dsuccess=dsuccess;
	}
	public Date getDsuccess(){
	    return dsuccess;
	}
	public void setCexportfilename(String cexportfilename){
	    this.cexportfilename=cexportfilename;
	}
	public String getCexportfilename(){
	    return cexportfilename;
	}
}