package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Hotelown entity for t_hotelown table.
 * 
 * 
 * @since 2014-02-17 17:24:39.041
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_hotelown")	
public class Hotelown implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cenname")
	private String cenname;
	
	@Column(name="cstarlevel")
	private String cstarlevel;
	
	@Column(name="cdiamondlevel")
	private String cdiamondlevel;
	
	@Column(name="cgroup")
	private String cgroup;
	
	@Column(name="cnation")
	private String cnation;
	
	@Column(name="ccity")
	private String ccity;
	
	@Column(name="caddress")
	private String caddress;
	
	@Column(name="czipcode")
	private String czipcode;
	
	@Column(name="carea")
	private String carea;
	
	@Column(name="ctel")
	private String ctel;
	
	@Column(name="cfax")
	private String cfax;
	
	@Column(name="nlongitude")
	private Double nlongitude;
	
	@Column(name="ndimension")
	private Double ndimension;
	
	@Column(name="choteltype")
	private String choteltype;
	
	@Column(name="dopentime")
	private Date dopentime;
	
	@Column(name="dfixuptime")
	private Date dfixuptime;
	
	@Column(name="ccheckintime")
	private String ccheckintime;
	
	@Column(name="clastcheckintime")
	private String clastcheckintime;
	
	@Column(name="ccheckouttime")
	private String ccheckouttime;
	
	@Column(name="creservetime")
	private String creservetime;
	
	@Column(name="ifloors")
	private Integer ifloors;
	
	@Column(name="ilifts")
	private Integer ilifts;
	
	@Column(name="irooms")
	private Integer irooms;
	
	@Column(name="clinkman")
	private String clinkman;
	
	@Column(name="clinkmantel")
	private String clinkmantel;
	
	@Column(name="clinkmanfax")
	private String clinkmanfax;
	
	@Column(name="ihotelcapacities")
	private Integer ihotelcapacities;
	
	@Column(name="ibigbedrooms")
	private Integer ibigbedrooms;
	
	@Column(name="ibigbedkingrooms")
	private Integer ibigbedkingrooms;
	
	@Column(name="ibigbedqueenrooms")
	private Integer ibigbedqueenrooms;
	
	@Column(name="inosmokingrooms")
	private Integer inosmokingrooms;
	
	@Column(name="idoublerooms")
	private Integer idoublerooms;
	
	@Column(name="nextrabedrates")
	private Integer nextrabedrates;
	
	@Column(name="isuites")
	private Integer isuites;
	
	@Column(name="ihandicappedrooms")
	private Integer ihandicappedrooms;
	
	@Column(name="imeetingroomcapacities")
	private Integer imeetingroomcapacities;
	
	@Column(name="imeetingroomnumber")
	private Integer imeetingroomnumber;
	
	@Column(name="nmeetingroomdimensions")
	private Double nmeetingroomdimensions;
	
	@Column(name="chotelintro")
	private String chotelintro;
	
	@Column(name="chotelpolicy")
	private String chotelpolicy;
	
	@Column(name="clocation")
	private String clocation;
	
	@Column(name="ctravelguide")
	private String ctravelguide;
	
	@Column(name="ctraffic")
	private String ctraffic;
	
	@Column(name="croomfacilities")
	private String croomfacilities;
	
	@Column(name="cmeetingfacilities")
	private String cmeetingfacilities;
	
	@Column(name="cdiningfacilities")
	private String cdiningfacilities;
	
	@Column(name="centertainmentfacilities")
	private String centertainmentfacilities;
	
	@Column(name="cttouristattraction")
	private String cttouristattraction;
	
	@Column(name="cacceptcards")
	private String cacceptcards;
	
	@Column(name="nrates")
	private Double nrates;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="cissue")
	private String cissue;
	
	@Column(name="ciscommend")
	private String ciscommend;
	
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
	
	@Column(name="cwebsiteurl")
	private String cwebsiteurl;
	
	@Column(name="islimit")
	private Short islimit;
	
	@Column(name="cstatus")
	private String cstatus;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCname(String cname){
	    this.cname=cname;
	}
	public String getCname(){
	    return cname;
	}
	public void setCenname(String cenname){
	    this.cenname=cenname;
	}
	public String getCenname(){
	    return cenname;
	}
	public void setCstarlevel(String cstarlevel){
	    this.cstarlevel=cstarlevel;
	}
	public String getCstarlevel(){
	    return cstarlevel;
	}
	public void setCdiamondlevel(String cdiamondlevel){
	    this.cdiamondlevel=cdiamondlevel;
	}
	public String getCdiamondlevel(){
	    return cdiamondlevel;
	}
	public void setCgroup(String cgroup){
	    this.cgroup=cgroup;
	}
	public String getCgroup(){
	    return cgroup;
	}
	public void setCnation(String cnation){
	    this.cnation=cnation;
	}
	public String getCnation(){
	    return cnation;
	}
	public void setCcity(String ccity){
	    this.ccity=ccity;
	}
	public String getCcity(){
	    return ccity;
	}
	public void setCaddress(String caddress){
	    this.caddress=caddress;
	}
	public String getCaddress(){
	    return caddress;
	}
	public void setCzipcode(String czipcode){
	    this.czipcode=czipcode;
	}
	public String getCzipcode(){
	    return czipcode;
	}
	public void setCarea(String carea){
	    this.carea=carea;
	}
	public String getCarea(){
	    return carea;
	}
	public void setCtel(String ctel){
	    this.ctel=ctel;
	}
	public String getCtel(){
	    return ctel;
	}
	public void setCfax(String cfax){
	    this.cfax=cfax;
	}
	public String getCfax(){
	    return cfax;
	}
	public void setNlongitude(Double nlongitude){
	    this.nlongitude=nlongitude;
	}
	public Double getNlongitude(){
	    return nlongitude;
	}
	public void setNdimension(Double ndimension){
	    this.ndimension=ndimension;
	}
	public Double getNdimension(){
	    return ndimension;
	}
	public void setChoteltype(String choteltype){
	    this.choteltype=choteltype;
	}
	public String getChoteltype(){
	    return choteltype;
	}
	public void setDopentime(Date dopentime){
	    this.dopentime=dopentime;
	}
	public Date getDopentime(){
	    return dopentime;
	}
	public void setDfixuptime(Date dfixuptime){
	    this.dfixuptime=dfixuptime;
	}
	public Date getDfixuptime(){
	    return dfixuptime;
	}
	public void setCcheckintime(String ccheckintime){
	    this.ccheckintime=ccheckintime;
	}
	public String getCcheckintime(){
	    return ccheckintime;
	}
	public void setClastcheckintime(String clastcheckintime){
	    this.clastcheckintime=clastcheckintime;
	}
	public String getClastcheckintime(){
	    return clastcheckintime;
	}
	public void setCcheckouttime(String ccheckouttime){
	    this.ccheckouttime=ccheckouttime;
	}
	public String getCcheckouttime(){
	    return ccheckouttime;
	}
	public void setCreservetime(String creservetime){
	    this.creservetime=creservetime;
	}
	public String getCreservetime(){
	    return creservetime;
	}
	public void setIfloors(Integer ifloors){
	    this.ifloors=ifloors;
	}
	public Integer getIfloors(){
	    return ifloors;
	}
	public void setIlifts(Integer ilifts){
	    this.ilifts=ilifts;
	}
	public Integer getIlifts(){
	    return ilifts;
	}
	public void setIrooms(Integer irooms){
	    this.irooms=irooms;
	}
	public Integer getIrooms(){
	    return irooms;
	}
	public void setClinkman(String clinkman){
	    this.clinkman=clinkman;
	}
	public String getClinkman(){
	    return clinkman;
	}
	public void setClinkmantel(String clinkmantel){
	    this.clinkmantel=clinkmantel;
	}
	public String getClinkmantel(){
	    return clinkmantel;
	}
	public void setClinkmanfax(String clinkmanfax){
	    this.clinkmanfax=clinkmanfax;
	}
	public String getClinkmanfax(){
	    return clinkmanfax;
	}
	public void setIhotelcapacities(Integer ihotelcapacities){
	    this.ihotelcapacities=ihotelcapacities;
	}
	public Integer getIhotelcapacities(){
	    return ihotelcapacities;
	}
	public void setIbigbedrooms(Integer ibigbedrooms){
	    this.ibigbedrooms=ibigbedrooms;
	}
	public Integer getIbigbedrooms(){
	    return ibigbedrooms;
	}
	public void setIbigbedkingrooms(Integer ibigbedkingrooms){
	    this.ibigbedkingrooms=ibigbedkingrooms;
	}
	public Integer getIbigbedkingrooms(){
	    return ibigbedkingrooms;
	}
	public void setIbigbedqueenrooms(Integer ibigbedqueenrooms){
	    this.ibigbedqueenrooms=ibigbedqueenrooms;
	}
	public Integer getIbigbedqueenrooms(){
	    return ibigbedqueenrooms;
	}
	public void setInosmokingrooms(Integer inosmokingrooms){
	    this.inosmokingrooms=inosmokingrooms;
	}
	public Integer getInosmokingrooms(){
	    return inosmokingrooms;
	}
	public void setIdoublerooms(Integer idoublerooms){
	    this.idoublerooms=idoublerooms;
	}
	public Integer getIdoublerooms(){
	    return idoublerooms;
	}
	public void setNextrabedrates(Integer nextrabedrates){
	    this.nextrabedrates=nextrabedrates;
	}
	public Integer getNextrabedrates(){
	    return nextrabedrates;
	}
	public void setIsuites(Integer isuites){
	    this.isuites=isuites;
	}
	public Integer getIsuites(){
	    return isuites;
	}
	public void setIhandicappedrooms(Integer ihandicappedrooms){
	    this.ihandicappedrooms=ihandicappedrooms;
	}
	public Integer getIhandicappedrooms(){
	    return ihandicappedrooms;
	}
	public void setImeetingroomcapacities(Integer imeetingroomcapacities){
	    this.imeetingroomcapacities=imeetingroomcapacities;
	}
	public Integer getImeetingroomcapacities(){
	    return imeetingroomcapacities;
	}
	public void setImeetingroomnumber(Integer imeetingroomnumber){
	    this.imeetingroomnumber=imeetingroomnumber;
	}
	public Integer getImeetingroomnumber(){
	    return imeetingroomnumber;
	}
	public void setNmeetingroomdimensions(Double nmeetingroomdimensions){
	    this.nmeetingroomdimensions=nmeetingroomdimensions;
	}
	public Double getNmeetingroomdimensions(){
	    return nmeetingroomdimensions;
	}
	public void setChotelintro(String chotelintro){
	    this.chotelintro=chotelintro;
	}
	public String getChotelintro(){
	    return chotelintro;
	}
	public void setChotelpolicy(String chotelpolicy){
	    this.chotelpolicy=chotelpolicy;
	}
	public String getChotelpolicy(){
	    return chotelpolicy;
	}
	public void setClocation(String clocation){
	    this.clocation=clocation;
	}
	public String getClocation(){
	    return clocation;
	}
	public void setCtravelguide(String ctravelguide){
	    this.ctravelguide=ctravelguide;
	}
	public String getCtravelguide(){
	    return ctravelguide;
	}
	public void setCtraffic(String ctraffic){
	    this.ctraffic=ctraffic;
	}
	public String getCtraffic(){
	    return ctraffic;
	}
	public void setCroomfacilities(String croomfacilities){
	    this.croomfacilities=croomfacilities;
	}
	public String getCroomfacilities(){
	    return croomfacilities;
	}
	public void setCmeetingfacilities(String cmeetingfacilities){
	    this.cmeetingfacilities=cmeetingfacilities;
	}
	public String getCmeetingfacilities(){
	    return cmeetingfacilities;
	}
	public void setCdiningfacilities(String cdiningfacilities){
	    this.cdiningfacilities=cdiningfacilities;
	}
	public String getCdiningfacilities(){
	    return cdiningfacilities;
	}
	public void setCentertainmentfacilities(String centertainmentfacilities){
	    this.centertainmentfacilities=centertainmentfacilities;
	}
	public String getCentertainmentfacilities(){
	    return centertainmentfacilities;
	}
	public void setCttouristattraction(String cttouristattraction){
	    this.cttouristattraction=cttouristattraction;
	}
	public String getCttouristattraction(){
	    return cttouristattraction;
	}
	public void setCacceptcards(String cacceptcards){
	    this.cacceptcards=cacceptcards;
	}
	public String getCacceptcards(){
	    return cacceptcards;
	}
	public void setNrates(Double nrates){
	    this.nrates=nrates;
	}
	public Double getNrates(){
	    return nrates;
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
	public void setCiscommend(String ciscommend){
	    this.ciscommend=ciscommend;
	}
	public String getCiscommend(){
	    return ciscommend;
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
	public void setCwebsiteurl(String cwebsiteurl){
	    this.cwebsiteurl=cwebsiteurl;
	}
	public String getCwebsiteurl(){
	    return cwebsiteurl;
	}
	public void setIslimit(Short islimit){
	    this.islimit=islimit;
	}
	public Short getIslimit(){
	    return islimit;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
}