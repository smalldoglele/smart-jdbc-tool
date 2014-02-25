package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Associator entity for t_associator table.
 * 
 * 
 * @since 2014-02-17 17:24:35.722
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_associator")	
public class Associator implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String cassid;
	
	@Column(name="cvip")
	private String cvip;
	
	@Column(name="clevel")
	private String clevel;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="cguesttype")
	private String cguesttype;
	
	@Column(name="csource")
	private String csource;
	
	@Column(name="cpwd")
	private String cpwd;
	
	@Column(name="cename")
	private String cename;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cidentitytype")
	private String cidentitytype;
	
	@Column(name="cidentity")
	private String cidentity;
	
	@Column(name="chname")
	private String chname;
	
	@Column(name="cfname")
	private String cfname;
	
	@Column(name="csex")
	private String csex;
	
	@Column(name="dbirthday")
	private Date dbirthday;
	
	@Column(name="cbirthplace")
	private String cbirthplace;
	
	@Column(name="cmarriage")
	private String cmarriage;
	
	@Column(name="ccity")
	private String ccity;
	
	@Column(name="cdistrict")
	private String cdistrict;
	
	@Column(name="ctel")
	private String ctel;
	
	@Column(name="cmobile")
	private String cmobile;
	
	@Column(name="cfax")
	private String cfax;
	
	@Column(name="caddr")
	private String caddr;
	
	@Column(name="czip")
	private String czip;
	
	@Column(name="coccupation")
	private String coccupation;
	
	@Column(name="cemployment")
	private String cemployment;
	
	@Column(name="cdegree")
	private String cdegree;
	
	@Column(name="cduty")
	private String cduty;
	
	@Column(name="cposition")
	private String cposition;
	
	@Column(name="csf")
	private String csf;
	
	@Column(name="cemail")
	private String cemail;
	
	@Column(name="cmsn")
	private String cmsn;
	
	@Column(name="cqq")
	private String cqq;
	
	@Column(name="ceaddr")
	private String ceaddr;
	
	@Column(name="cpportplace")
	private String cpportplace;
	
	@Column(name="cpassno")
	private String cpassno;
	
	@Column(name="dpassbgn")
	private Date dpassbgn;
	
	@Column(name="dpassend")
	private Date dpassend;
	
	@Column(name="iinfor")
	private Integer iinfor;
	
	@Column(name="isumpoint")
	private Integer isumpoint;
	
	@Column(name="iusepoint")
	private Integer iusepoint;
	
	@Column(name="cisblack")
	private String cisblack;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="cop")
	private String cop;
	
	@Column(name="doptime")
	private Date doptime;
	
	@Column(name="cisfresh")
	private String cisfresh;
	
	@Column(name="ics")
	private Integer ics;
	
	@Column(name="dje")
	private Double dje;
	
	@Column(name="nje_year")
	private Double njeYear;
	
	@Column(name="ntraveltimes")
	private Integer ntraveltimes;
	
	@Column(name="cinterest")
	private String cinterest;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	public void setCassid(String cassid){
	    this.cassid=cassid;
	}
	public String getCassid(){
	    return cassid;
	}
	public void setCvip(String cvip){
	    this.cvip=cvip;
	}
	public String getCvip(){
	    return cvip;
	}
	public void setClevel(String clevel){
	    this.clevel=clevel;
	}
	public String getClevel(){
	    return clevel;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setCguesttype(String cguesttype){
	    this.cguesttype=cguesttype;
	}
	public String getCguesttype(){
	    return cguesttype;
	}
	public void setCsource(String csource){
	    this.csource=csource;
	}
	public String getCsource(){
	    return csource;
	}
	public void setCpwd(String cpwd){
	    this.cpwd=cpwd;
	}
	public String getCpwd(){
	    return cpwd;
	}
	public void setCename(String cename){
	    this.cename=cename;
	}
	public String getCename(){
	    return cename;
	}
	public void setCname(String cname){
	    this.cname=cname;
	}
	public String getCname(){
	    return cname;
	}
	public void setCidentitytype(String cidentitytype){
	    this.cidentitytype=cidentitytype;
	}
	public String getCidentitytype(){
	    return cidentitytype;
	}
	public void setCidentity(String cidentity){
	    this.cidentity=cidentity;
	}
	public String getCidentity(){
	    return cidentity;
	}
	public void setChname(String chname){
	    this.chname=chname;
	}
	public String getChname(){
	    return chname;
	}
	public void setCfname(String cfname){
	    this.cfname=cfname;
	}
	public String getCfname(){
	    return cfname;
	}
	public void setCsex(String csex){
	    this.csex=csex;
	}
	public String getCsex(){
	    return csex;
	}
	public void setDbirthday(Date dbirthday){
	    this.dbirthday=dbirthday;
	}
	public Date getDbirthday(){
	    return dbirthday;
	}
	public void setCbirthplace(String cbirthplace){
	    this.cbirthplace=cbirthplace;
	}
	public String getCbirthplace(){
	    return cbirthplace;
	}
	public void setCmarriage(String cmarriage){
	    this.cmarriage=cmarriage;
	}
	public String getCmarriage(){
	    return cmarriage;
	}
	public void setCcity(String ccity){
	    this.ccity=ccity;
	}
	public String getCcity(){
	    return ccity;
	}
	public void setCdistrict(String cdistrict){
	    this.cdistrict=cdistrict;
	}
	public String getCdistrict(){
	    return cdistrict;
	}
	public void setCtel(String ctel){
	    this.ctel=ctel;
	}
	public String getCtel(){
	    return ctel;
	}
	public void setCmobile(String cmobile){
	    this.cmobile=cmobile;
	}
	public String getCmobile(){
	    return cmobile;
	}
	public void setCfax(String cfax){
	    this.cfax=cfax;
	}
	public String getCfax(){
	    return cfax;
	}
	public void setCaddr(String caddr){
	    this.caddr=caddr;
	}
	public String getCaddr(){
	    return caddr;
	}
	public void setCzip(String czip){
	    this.czip=czip;
	}
	public String getCzip(){
	    return czip;
	}
	public void setCoccupation(String coccupation){
	    this.coccupation=coccupation;
	}
	public String getCoccupation(){
	    return coccupation;
	}
	public void setCemployment(String cemployment){
	    this.cemployment=cemployment;
	}
	public String getCemployment(){
	    return cemployment;
	}
	public void setCdegree(String cdegree){
	    this.cdegree=cdegree;
	}
	public String getCdegree(){
	    return cdegree;
	}
	public void setCduty(String cduty){
	    this.cduty=cduty;
	}
	public String getCduty(){
	    return cduty;
	}
	public void setCposition(String cposition){
	    this.cposition=cposition;
	}
	public String getCposition(){
	    return cposition;
	}
	public void setCsf(String csf){
	    this.csf=csf;
	}
	public String getCsf(){
	    return csf;
	}
	public void setCemail(String cemail){
	    this.cemail=cemail;
	}
	public String getCemail(){
	    return cemail;
	}
	public void setCmsn(String cmsn){
	    this.cmsn=cmsn;
	}
	public String getCmsn(){
	    return cmsn;
	}
	public void setCqq(String cqq){
	    this.cqq=cqq;
	}
	public String getCqq(){
	    return cqq;
	}
	public void setCeaddr(String ceaddr){
	    this.ceaddr=ceaddr;
	}
	public String getCeaddr(){
	    return ceaddr;
	}
	public void setCpportplace(String cpportplace){
	    this.cpportplace=cpportplace;
	}
	public String getCpportplace(){
	    return cpportplace;
	}
	public void setCpassno(String cpassno){
	    this.cpassno=cpassno;
	}
	public String getCpassno(){
	    return cpassno;
	}
	public void setDpassbgn(Date dpassbgn){
	    this.dpassbgn=dpassbgn;
	}
	public Date getDpassbgn(){
	    return dpassbgn;
	}
	public void setDpassend(Date dpassend){
	    this.dpassend=dpassend;
	}
	public Date getDpassend(){
	    return dpassend;
	}
	public void setIinfor(Integer iinfor){
	    this.iinfor=iinfor;
	}
	public Integer getIinfor(){
	    return iinfor;
	}
	public void setIsumpoint(Integer isumpoint){
	    this.isumpoint=isumpoint;
	}
	public Integer getIsumpoint(){
	    return isumpoint;
	}
	public void setIusepoint(Integer iusepoint){
	    this.iusepoint=iusepoint;
	}
	public Integer getIusepoint(){
	    return iusepoint;
	}
	public void setCisblack(String cisblack){
	    this.cisblack=cisblack;
	}
	public String getCisblack(){
	    return cisblack;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setCop(String cop){
	    this.cop=cop;
	}
	public String getCop(){
	    return cop;
	}
	public void setDoptime(Date doptime){
	    this.doptime=doptime;
	}
	public Date getDoptime(){
	    return doptime;
	}
	public void setCisfresh(String cisfresh){
	    this.cisfresh=cisfresh;
	}
	public String getCisfresh(){
	    return cisfresh;
	}
	public void setIcs(Integer ics){
	    this.ics=ics;
	}
	public Integer getIcs(){
	    return ics;
	}
	public void setDje(Double dje){
	    this.dje=dje;
	}
	public Double getDje(){
	    return dje;
	}
	public void setNjeYear(Double njeYear){
	    this.njeYear=njeYear;
	}
	public Double getNjeYear(){
	    return njeYear;
	}
	public void setNtraveltimes(Integer ntraveltimes){
	    this.ntraveltimes=ntraveltimes;
	}
	public Integer getNtraveltimes(){
	    return ntraveltimes;
	}
	public void setCinterest(String cinterest){
	    this.cinterest=cinterest;
	}
	public String getCinterest(){
	    return cinterest;
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