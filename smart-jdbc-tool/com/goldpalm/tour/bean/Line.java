package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Line entity for t_line table.
 * 
 * 
 * @since 2014-02-17 17:24:39.694
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_line")	
public class Line implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="idays")
	private Integer idays;
	
	@Column(name="dbgndate")
	private Date dbgndate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="coutrule")
	private String coutrule;
	
	@Column(name="ipreenddays")
	private Integer ipreenddays;
	
	@Column(name="coptype")
	private String coptype;
	
	@Column(name="cadtitle")
	private String cadtitle;
	
	@Column(name="cadcontent")
	private String cadcontent;
	
	@Column(name="cstandard")
	private String cstandard;
	
	@Column(name="cprompt")
	private String cprompt;
	
	@Column(name="ctag")
	private String ctag;
	
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
	
	@Column(name="cdepcode")
	private String cdepcode;
	
	@Column(name="copcode")
	private String copcode;
	
	@Column(name="coutdate")
	private String coutdate;
	
	@Column(name="cdeparture")
	private String cdeparture;
	
	@Column(name="copmemo")
	private String copmemo;
	
	@Column(name="ulinesourceuid")
	private String ulinesourceuid;
	
	@Column(name="cissue")
	private String cissue;
	
	@Column(name="irecommend")
	private Integer irecommend;
	
	@Column(name="carea")
	private String carea;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="season")
	private String season;
	
	@Column(name="planqty")
	private Integer planqty;
	
	@Column(name="guides")
	private Integer guides;
	
	@Column(name="visaenddays")
	private Integer visaenddays;
	
	@Column(name="visa_area")
	private String visaArea;
	
	@Column(name="visa_area_name")
	private String visaAreaName;
	
	@Column(name="cnation")
	private String cnation;
	
	@Column(name="ft_region")
	private String ftRegion;
	
	@Column(name="feature")
	private String feature;
	
	@Column(name="nlowprice")
	private Double nlowprice;
	
	@Column(name="dlowpricedate")
	private Date dlowpricedate;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="cPriceNotIncude")
	private String cPriceNotIncude;
	
	@Column(name="cPriceIncude")
	private String cPriceIncude;
	
	@Column(name="cOrderConfirmType")
	private String cOrderConfirmType;
	
	@Column(name="cfeature")
	private String cfeature;
	
	@Column(name="iteamqty")
	private Integer iteamqty;
	
	@Column(name="ipoint")
	private Integer ipoint;
	
	@Column(name="ndownpayment")
	private Double ndownpayment;
	
	@Column(name="cstartcity")
	private String cstartcity;
	
	@Column(name="dcreate")
	private Date dcreate;
	
	@Column(name="iclearhour")
	private Integer iclearhour;
	
	@Column(name="idiscountplanqty")
	private Integer idiscountplanqty;
	
	@Column(name="cdjsname")
	private String cdjsname;
	
	@Column(name="cdjsaddr")
	private String cdjsaddr;
	
	@Column(name="cdjscontact")
	private String cdjscontact;
	
	@Column(name="cdjstel")
	private String cdjstel;
	
	@Column(name="cfreenumber")
	private String cfreenumber;
	
	@Column(name="cfreetime")
	private String cfreetime;
	
	@Column(name="cshoppingstorename")
	private String cshoppingstorename;
	
	@Column(name="cshoppingtime")
	private String cshoppingtime;
	
	@Column(name="cmaincommodities")
	private String cmaincommodities;
	
	@Column(name="citempricepaidseparately")
	private String citempricepaidseparately;
	
	@Column(name="ckcflag")
	private String ckcflag;
	
	@Column(name="usupplierid")
	private String usupplierid;
	
	@Column(name="mpoint")
	private Double mpoint;
	
	@Column(name="mexcutepoint")
	private Double mexcutepoint;
	
	@Column(name="idiscount")
	private Integer idiscount;
	
	@Column(name="isMemberLine")
	private String isMemberLine;
	
	@Column(name="cexprice")
	private String cexprice;
	
	@Column(name="cshoplace")
	private String cshoplace;
	
	@Column(name="cvisanotice")
	private String cvisanotice;
	
	@Column(name="ccompulsoryInsure")
	private String ccompulsoryInsure;
	
	@Column(name="iminMemberPoint")
	private Integer iminMemberPoint;
	
	@Column(name="cactivitydemand")
	private String cactivitydemand;
	
	@Column(name="isgroupbuying")
	private String isgroupbuying;
	
	@Column(name="ishot")
	private String ishot;
	
	@Column(name="ispreferential")
	private String ispreferential;
	
	@Column(name="cisgroupbuying")
	private String cisgroupbuying;
	
	@Column(name="cishot")
	private String cishot;
	
	@Column(name="cispreferential")
	private String cispreferential;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCcode(String ccode){
	    this.ccode=ccode;
	}
	public String getCcode(){
	    return ccode;
	}
	public void setCname(String cname){
	    this.cname=cname;
	}
	public String getCname(){
	    return cname;
	}
	public void setIdays(Integer idays){
	    this.idays=idays;
	}
	public Integer getIdays(){
	    return idays;
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
	public void setCoutrule(String coutrule){
	    this.coutrule=coutrule;
	}
	public String getCoutrule(){
	    return coutrule;
	}
	public void setIpreenddays(Integer ipreenddays){
	    this.ipreenddays=ipreenddays;
	}
	public Integer getIpreenddays(){
	    return ipreenddays;
	}
	public void setCoptype(String coptype){
	    this.coptype=coptype;
	}
	public String getCoptype(){
	    return coptype;
	}
	public void setCadtitle(String cadtitle){
	    this.cadtitle=cadtitle;
	}
	public String getCadtitle(){
	    return cadtitle;
	}
	public void setCadcontent(String cadcontent){
	    this.cadcontent=cadcontent;
	}
	public String getCadcontent(){
	    return cadcontent;
	}
	public void setCstandard(String cstandard){
	    this.cstandard=cstandard;
	}
	public String getCstandard(){
	    return cstandard;
	}
	public void setCprompt(String cprompt){
	    this.cprompt=cprompt;
	}
	public String getCprompt(){
	    return cprompt;
	}
	public void setCtag(String ctag){
	    this.ctag=ctag;
	}
	public String getCtag(){
	    return ctag;
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
	public void setCdepcode(String cdepcode){
	    this.cdepcode=cdepcode;
	}
	public String getCdepcode(){
	    return cdepcode;
	}
	public void setCopcode(String copcode){
	    this.copcode=copcode;
	}
	public String getCopcode(){
	    return copcode;
	}
	public void setCoutdate(String coutdate){
	    this.coutdate=coutdate;
	}
	public String getCoutdate(){
	    return coutdate;
	}
	public void setCdeparture(String cdeparture){
	    this.cdeparture=cdeparture;
	}
	public String getCdeparture(){
	    return cdeparture;
	}
	public void setCopmemo(String copmemo){
	    this.copmemo=copmemo;
	}
	public String getCopmemo(){
	    return copmemo;
	}
	public void setUlinesourceuid(String ulinesourceuid){
	    this.ulinesourceuid=ulinesourceuid;
	}
	public String getUlinesourceuid(){
	    return ulinesourceuid;
	}
	public void setCissue(String cissue){
	    this.cissue=cissue;
	}
	public String getCissue(){
	    return cissue;
	}
	public void setIrecommend(Integer irecommend){
	    this.irecommend=irecommend;
	}
	public Integer getIrecommend(){
	    return irecommend;
	}
	public void setCarea(String carea){
	    this.carea=carea;
	}
	public String getCarea(){
	    return carea;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setSeason(String season){
	    this.season=season;
	}
	public String getSeason(){
	    return season;
	}
	public void setPlanqty(Integer planqty){
	    this.planqty=planqty;
	}
	public Integer getPlanqty(){
	    return planqty;
	}
	public void setGuides(Integer guides){
	    this.guides=guides;
	}
	public Integer getGuides(){
	    return guides;
	}
	public void setVisaenddays(Integer visaenddays){
	    this.visaenddays=visaenddays;
	}
	public Integer getVisaenddays(){
	    return visaenddays;
	}
	public void setVisaArea(String visaArea){
	    this.visaArea=visaArea;
	}
	public String getVisaArea(){
	    return visaArea;
	}
	public void setVisaAreaName(String visaAreaName){
	    this.visaAreaName=visaAreaName;
	}
	public String getVisaAreaName(){
	    return visaAreaName;
	}
	public void setCnation(String cnation){
	    this.cnation=cnation;
	}
	public String getCnation(){
	    return cnation;
	}
	public void setFtRegion(String ftRegion){
	    this.ftRegion=ftRegion;
	}
	public String getFtRegion(){
	    return ftRegion;
	}
	public void setFeature(String feature){
	    this.feature=feature;
	}
	public String getFeature(){
	    return feature;
	}
	public void setNlowprice(Double nlowprice){
	    this.nlowprice=nlowprice;
	}
	public Double getNlowprice(){
	    return nlowprice;
	}
	public void setDlowpricedate(Date dlowpricedate){
	    this.dlowpricedate=dlowpricedate;
	}
	public Date getDlowpricedate(){
	    return dlowpricedate;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
	public void setCPriceNotIncude(String cPriceNotIncude){
	    this.cPriceNotIncude=cPriceNotIncude;
	}
	public String getCPriceNotIncude(){
	    return cPriceNotIncude;
	}
	public void setCPriceIncude(String cPriceIncude){
	    this.cPriceIncude=cPriceIncude;
	}
	public String getCPriceIncude(){
	    return cPriceIncude;
	}
	public void setCOrderConfirmType(String cOrderConfirmType){
	    this.cOrderConfirmType=cOrderConfirmType;
	}
	public String getCOrderConfirmType(){
	    return cOrderConfirmType;
	}
	public void setCfeature(String cfeature){
	    this.cfeature=cfeature;
	}
	public String getCfeature(){
	    return cfeature;
	}
	public void setIteamqty(Integer iteamqty){
	    this.iteamqty=iteamqty;
	}
	public Integer getIteamqty(){
	    return iteamqty;
	}
	public void setIpoint(Integer ipoint){
	    this.ipoint=ipoint;
	}
	public Integer getIpoint(){
	    return ipoint;
	}
	public void setNdownpayment(Double ndownpayment){
	    this.ndownpayment=ndownpayment;
	}
	public Double getNdownpayment(){
	    return ndownpayment;
	}
	public void setCstartcity(String cstartcity){
	    this.cstartcity=cstartcity;
	}
	public String getCstartcity(){
	    return cstartcity;
	}
	public void setDcreate(Date dcreate){
	    this.dcreate=dcreate;
	}
	public Date getDcreate(){
	    return dcreate;
	}
	public void setIclearhour(Integer iclearhour){
	    this.iclearhour=iclearhour;
	}
	public Integer getIclearhour(){
	    return iclearhour;
	}
	public void setIdiscountplanqty(Integer idiscountplanqty){
	    this.idiscountplanqty=idiscountplanqty;
	}
	public Integer getIdiscountplanqty(){
	    return idiscountplanqty;
	}
	public void setCdjsname(String cdjsname){
	    this.cdjsname=cdjsname;
	}
	public String getCdjsname(){
	    return cdjsname;
	}
	public void setCdjsaddr(String cdjsaddr){
	    this.cdjsaddr=cdjsaddr;
	}
	public String getCdjsaddr(){
	    return cdjsaddr;
	}
	public void setCdjscontact(String cdjscontact){
	    this.cdjscontact=cdjscontact;
	}
	public String getCdjscontact(){
	    return cdjscontact;
	}
	public void setCdjstel(String cdjstel){
	    this.cdjstel=cdjstel;
	}
	public String getCdjstel(){
	    return cdjstel;
	}
	public void setCfreenumber(String cfreenumber){
	    this.cfreenumber=cfreenumber;
	}
	public String getCfreenumber(){
	    return cfreenumber;
	}
	public void setCfreetime(String cfreetime){
	    this.cfreetime=cfreetime;
	}
	public String getCfreetime(){
	    return cfreetime;
	}
	public void setCshoppingstorename(String cshoppingstorename){
	    this.cshoppingstorename=cshoppingstorename;
	}
	public String getCshoppingstorename(){
	    return cshoppingstorename;
	}
	public void setCshoppingtime(String cshoppingtime){
	    this.cshoppingtime=cshoppingtime;
	}
	public String getCshoppingtime(){
	    return cshoppingtime;
	}
	public void setCmaincommodities(String cmaincommodities){
	    this.cmaincommodities=cmaincommodities;
	}
	public String getCmaincommodities(){
	    return cmaincommodities;
	}
	public void setCitempricepaidseparately(String citempricepaidseparately){
	    this.citempricepaidseparately=citempricepaidseparately;
	}
	public String getCitempricepaidseparately(){
	    return citempricepaidseparately;
	}
	public void setCkcflag(String ckcflag){
	    this.ckcflag=ckcflag;
	}
	public String getCkcflag(){
	    return ckcflag;
	}
	public void setUsupplierid(String usupplierid){
	    this.usupplierid=usupplierid;
	}
	public String getUsupplierid(){
	    return usupplierid;
	}
	public void setMpoint(Double mpoint){
	    this.mpoint=mpoint;
	}
	public Double getMpoint(){
	    return mpoint;
	}
	public void setMexcutepoint(Double mexcutepoint){
	    this.mexcutepoint=mexcutepoint;
	}
	public Double getMexcutepoint(){
	    return mexcutepoint;
	}
	public void setIdiscount(Integer idiscount){
	    this.idiscount=idiscount;
	}
	public Integer getIdiscount(){
	    return idiscount;
	}
	public void setIsMemberLine(String isMemberLine){
	    this.isMemberLine=isMemberLine;
	}
	public String getIsMemberLine(){
	    return isMemberLine;
	}
	public void setCexprice(String cexprice){
	    this.cexprice=cexprice;
	}
	public String getCexprice(){
	    return cexprice;
	}
	public void setCshoplace(String cshoplace){
	    this.cshoplace=cshoplace;
	}
	public String getCshoplace(){
	    return cshoplace;
	}
	public void setCvisanotice(String cvisanotice){
	    this.cvisanotice=cvisanotice;
	}
	public String getCvisanotice(){
	    return cvisanotice;
	}
	public void setCcompulsoryInsure(String ccompulsoryInsure){
	    this.ccompulsoryInsure=ccompulsoryInsure;
	}
	public String getCcompulsoryInsure(){
	    return ccompulsoryInsure;
	}
	public void setIminMemberPoint(Integer iminMemberPoint){
	    this.iminMemberPoint=iminMemberPoint;
	}
	public Integer getIminMemberPoint(){
	    return iminMemberPoint;
	}
	public void setCactivitydemand(String cactivitydemand){
	    this.cactivitydemand=cactivitydemand;
	}
	public String getCactivitydemand(){
	    return cactivitydemand;
	}
	public void setIsgroupbuying(String isgroupbuying){
	    this.isgroupbuying=isgroupbuying;
	}
	public String getIsgroupbuying(){
	    return isgroupbuying;
	}
	public void setIshot(String ishot){
	    this.ishot=ishot;
	}
	public String getIshot(){
	    return ishot;
	}
	public void setIspreferential(String ispreferential){
	    this.ispreferential=ispreferential;
	}
	public String getIspreferential(){
	    return ispreferential;
	}
	public void setCisgroupbuying(String cisgroupbuying){
	    this.cisgroupbuying=cisgroupbuying;
	}
	public String getCisgroupbuying(){
	    return cisgroupbuying;
	}
	public void setCishot(String cishot){
	    this.cishot=cishot;
	}
	public String getCishot(){
	    return cishot;
	}
	public void setCispreferential(String cispreferential){
	    this.cispreferential=cispreferential;
	}
	public String getCispreferential(){
	    return cispreferential;
	}
}