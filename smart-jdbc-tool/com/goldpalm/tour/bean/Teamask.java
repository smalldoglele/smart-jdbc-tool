package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Teamask entity for t_teamask table.
 * 
 * 
 * @since 2014-02-17 17:24:44.123
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_teamask")	
public class Teamask implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cteamaskno")
	private String cteamaskno;
	
	@Column(name="csource")
	private String csource;
	
	@Column(name="ulineid")
	private String ulineid;
	
	@Column(name="ulineplanid")
	private String ulineplanid;
	
	@Column(name="uteamid")
	private String uteamid;
	
	@Column(name="umemberid")
	private String umemberid;
	
	@Column(name="ccontact")
	private String ccontact;
	
	@Column(name="csex")
	private String csex;
	
	@Column(name="ctitle")
	private String ctitle;
	
	@Column(name="cphone")
	private String cphone;
	
	@Column(name="cmobileno")
	private String cmobileno;
	
	@Column(name="cfax")
	private String cfax;
	
	@Column(name="caddress")
	private String caddress;
	
	@Column(name="czip")
	private String czip;
	
	@Column(name="cemail")
	private String cemail;
	
	@Column(name="dsignup")
	private Date dsignup;
	
	@Column(name="cnote")
	private String cnote;
	
	@Column(name="iguides")
	private Integer iguides;
	
	@Column(name="iqty")
	private Integer iqty;
	
	@Column(name="iadults")
	private Integer iadults;
	
	@Column(name="ichilds")
	private Integer ichilds;
	
	@Column(name="ibabys")
	private Integer ibabys;
	
	@Column(name="iolds")
	private Integer iolds;
	
	@Column(name="oqtyrequir")
	private String oqtyrequir;
	
	@Column(name="cstarlevel")
	private String cstarlevel;
	
	@Column(name="isingleroom")
	private Integer isingleroom;
	
	@Column(name="idoubleroom")
	private Integer idoubleroom;
	
	@Column(name="itripleroom")
	private Integer itripleroom;
	
	@Column(name="iextrabed")
	private Integer iextrabed;
	
	@Column(name="isinglemale")
	private Integer isinglemale;
	
	@Column(name="isinglefemale")
	private Integer isinglefemale;
	
	@Column(name="clinename")
	private String clinename;
	
	@Column(name="dbegindate")
	private Date dbegindate;
	
	@Column(name="idays")
	private Integer idays;
	
	@Column(name="inights")
	private Integer inights;
	
	@Column(name="cdaterequir")
	private String cdaterequir;
	
	@Column(name="coptype")
	private String coptype;
	
	@Column(name="cdeparture")
	private String cdeparture;
	
	@Column(name="carea")
	private String carea;
	
	@Column(name="cnation")
	private String cnation;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="cguesttype")
	private String cguesttype;
	
	@Column(name="cguestnation")
	private String cguestnation;
	
	@Column(name="cguestco")
	private String cguestco;
	
	@Column(name="ctravelintent")
	private String ctravelintent;
	
	@Column(name="clongtraffic")
	private String clongtraffic;
	
	@Column(name="clocaltraffic")
	private String clocaltraffic;
	
	@Column(name="chotelstandard")
	private String chotelstandard;
	
	@Column(name="cfoodstandard")
	private String cfoodstandard;
	
	@Column(name="cprogramstandard")
	private String cprogramstandard;
	
	@Column(name="cshopstandard")
	private String cshopstandard;
	
	@Column(name="cseftitem")
	private String cseftitem;
	
	@Column(name="cvisarequir")
	private String cvisarequir;
	
	@Column(name="cneeditem")
	private String cneeditem;
	
	@Column(name="cchoiceitem")
	private String cchoiceitem;
	
	@Column(name="cpricerequir")
	private String cpricerequir;
	
	@Column(name="ipricetime")
	private Integer ipricetime;
	
	@Column(name="ipayrate")
	private Integer ipayrate;
	
	@Column(name="cchildnote")
	private String cchildnote;
	
	@Column(name="cstandard")
	private String cstandard;
	
	@Column(name="cpriceincude")
	private String cpriceincude;
	
	@Column(name="cpricenotincude")
	private String cpricenotincude;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="dminprice")
	private Double dminprice;
	
	@Column(name="dmaxprice")
	private Double dmaxprice;
	
	@Column(name="cprobability")
	private String cprobability;
	
	@Column(name="cguestmemo")
	private String cguestmemo;
	
	@Column(name="copmemo")
	private String copmemo;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="upriceuserid")
	private String upriceuserid;
	
	@Column(name="upricedeptid")
	private String upricedeptid;
	
	@Column(name="dpricedate")
	private Date dpricedate;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="cguidestandard")
	private String cguidestandard;
	
	@Column(name="upriceroleid")
	private String upriceroleid;
	
	@Column(name="ucustomerid")
	private String ucustomerid;
	
	@Column(name="iscontract")
	private String iscontract;
	
	@Column(name="ctravelintentmemo")
	private String ctravelintentmemo;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCteamaskno(String cteamaskno){
	    this.cteamaskno=cteamaskno;
	}
	public String getCteamaskno(){
	    return cteamaskno;
	}
	public void setCsource(String csource){
	    this.csource=csource;
	}
	public String getCsource(){
	    return csource;
	}
	public void setUlineid(String ulineid){
	    this.ulineid=ulineid;
	}
	public String getUlineid(){
	    return ulineid;
	}
	public void setUlineplanid(String ulineplanid){
	    this.ulineplanid=ulineplanid;
	}
	public String getUlineplanid(){
	    return ulineplanid;
	}
	public void setUteamid(String uteamid){
	    this.uteamid=uteamid;
	}
	public String getUteamid(){
	    return uteamid;
	}
	public void setUmemberid(String umemberid){
	    this.umemberid=umemberid;
	}
	public String getUmemberid(){
	    return umemberid;
	}
	public void setCcontact(String ccontact){
	    this.ccontact=ccontact;
	}
	public String getCcontact(){
	    return ccontact;
	}
	public void setCsex(String csex){
	    this.csex=csex;
	}
	public String getCsex(){
	    return csex;
	}
	public void setCtitle(String ctitle){
	    this.ctitle=ctitle;
	}
	public String getCtitle(){
	    return ctitle;
	}
	public void setCphone(String cphone){
	    this.cphone=cphone;
	}
	public String getCphone(){
	    return cphone;
	}
	public void setCmobileno(String cmobileno){
	    this.cmobileno=cmobileno;
	}
	public String getCmobileno(){
	    return cmobileno;
	}
	public void setCfax(String cfax){
	    this.cfax=cfax;
	}
	public String getCfax(){
	    return cfax;
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
	public void setCemail(String cemail){
	    this.cemail=cemail;
	}
	public String getCemail(){
	    return cemail;
	}
	public void setDsignup(Date dsignup){
	    this.dsignup=dsignup;
	}
	public Date getDsignup(){
	    return dsignup;
	}
	public void setCnote(String cnote){
	    this.cnote=cnote;
	}
	public String getCnote(){
	    return cnote;
	}
	public void setIguides(Integer iguides){
	    this.iguides=iguides;
	}
	public Integer getIguides(){
	    return iguides;
	}
	public void setIqty(Integer iqty){
	    this.iqty=iqty;
	}
	public Integer getIqty(){
	    return iqty;
	}
	public void setIadults(Integer iadults){
	    this.iadults=iadults;
	}
	public Integer getIadults(){
	    return iadults;
	}
	public void setIchilds(Integer ichilds){
	    this.ichilds=ichilds;
	}
	public Integer getIchilds(){
	    return ichilds;
	}
	public void setIbabys(Integer ibabys){
	    this.ibabys=ibabys;
	}
	public Integer getIbabys(){
	    return ibabys;
	}
	public void setIolds(Integer iolds){
	    this.iolds=iolds;
	}
	public Integer getIolds(){
	    return iolds;
	}
	public void setOqtyrequir(String oqtyrequir){
	    this.oqtyrequir=oqtyrequir;
	}
	public String getOqtyrequir(){
	    return oqtyrequir;
	}
	public void setCstarlevel(String cstarlevel){
	    this.cstarlevel=cstarlevel;
	}
	public String getCstarlevel(){
	    return cstarlevel;
	}
	public void setIsingleroom(Integer isingleroom){
	    this.isingleroom=isingleroom;
	}
	public Integer getIsingleroom(){
	    return isingleroom;
	}
	public void setIdoubleroom(Integer idoubleroom){
	    this.idoubleroom=idoubleroom;
	}
	public Integer getIdoubleroom(){
	    return idoubleroom;
	}
	public void setItripleroom(Integer itripleroom){
	    this.itripleroom=itripleroom;
	}
	public Integer getItripleroom(){
	    return itripleroom;
	}
	public void setIextrabed(Integer iextrabed){
	    this.iextrabed=iextrabed;
	}
	public Integer getIextrabed(){
	    return iextrabed;
	}
	public void setIsinglemale(Integer isinglemale){
	    this.isinglemale=isinglemale;
	}
	public Integer getIsinglemale(){
	    return isinglemale;
	}
	public void setIsinglefemale(Integer isinglefemale){
	    this.isinglefemale=isinglefemale;
	}
	public Integer getIsinglefemale(){
	    return isinglefemale;
	}
	public void setClinename(String clinename){
	    this.clinename=clinename;
	}
	public String getClinename(){
	    return clinename;
	}
	public void setDbegindate(Date dbegindate){
	    this.dbegindate=dbegindate;
	}
	public Date getDbegindate(){
	    return dbegindate;
	}
	public void setIdays(Integer idays){
	    this.idays=idays;
	}
	public Integer getIdays(){
	    return idays;
	}
	public void setInights(Integer inights){
	    this.inights=inights;
	}
	public Integer getInights(){
	    return inights;
	}
	public void setCdaterequir(String cdaterequir){
	    this.cdaterequir=cdaterequir;
	}
	public String getCdaterequir(){
	    return cdaterequir;
	}
	public void setCoptype(String coptype){
	    this.coptype=coptype;
	}
	public String getCoptype(){
	    return coptype;
	}
	public void setCdeparture(String cdeparture){
	    this.cdeparture=cdeparture;
	}
	public String getCdeparture(){
	    return cdeparture;
	}
	public void setCarea(String carea){
	    this.carea=carea;
	}
	public String getCarea(){
	    return carea;
	}
	public void setCnation(String cnation){
	    this.cnation=cnation;
	}
	public String getCnation(){
	    return cnation;
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
	public void setCguestnation(String cguestnation){
	    this.cguestnation=cguestnation;
	}
	public String getCguestnation(){
	    return cguestnation;
	}
	public void setCguestco(String cguestco){
	    this.cguestco=cguestco;
	}
	public String getCguestco(){
	    return cguestco;
	}
	public void setCtravelintent(String ctravelintent){
	    this.ctravelintent=ctravelintent;
	}
	public String getCtravelintent(){
	    return ctravelintent;
	}
	public void setClongtraffic(String clongtraffic){
	    this.clongtraffic=clongtraffic;
	}
	public String getClongtraffic(){
	    return clongtraffic;
	}
	public void setClocaltraffic(String clocaltraffic){
	    this.clocaltraffic=clocaltraffic;
	}
	public String getClocaltraffic(){
	    return clocaltraffic;
	}
	public void setChotelstandard(String chotelstandard){
	    this.chotelstandard=chotelstandard;
	}
	public String getChotelstandard(){
	    return chotelstandard;
	}
	public void setCfoodstandard(String cfoodstandard){
	    this.cfoodstandard=cfoodstandard;
	}
	public String getCfoodstandard(){
	    return cfoodstandard;
	}
	public void setCprogramstandard(String cprogramstandard){
	    this.cprogramstandard=cprogramstandard;
	}
	public String getCprogramstandard(){
	    return cprogramstandard;
	}
	public void setCshopstandard(String cshopstandard){
	    this.cshopstandard=cshopstandard;
	}
	public String getCshopstandard(){
	    return cshopstandard;
	}
	public void setCseftitem(String cseftitem){
	    this.cseftitem=cseftitem;
	}
	public String getCseftitem(){
	    return cseftitem;
	}
	public void setCvisarequir(String cvisarequir){
	    this.cvisarequir=cvisarequir;
	}
	public String getCvisarequir(){
	    return cvisarequir;
	}
	public void setCneeditem(String cneeditem){
	    this.cneeditem=cneeditem;
	}
	public String getCneeditem(){
	    return cneeditem;
	}
	public void setCchoiceitem(String cchoiceitem){
	    this.cchoiceitem=cchoiceitem;
	}
	public String getCchoiceitem(){
	    return cchoiceitem;
	}
	public void setCpricerequir(String cpricerequir){
	    this.cpricerequir=cpricerequir;
	}
	public String getCpricerequir(){
	    return cpricerequir;
	}
	public void setIpricetime(Integer ipricetime){
	    this.ipricetime=ipricetime;
	}
	public Integer getIpricetime(){
	    return ipricetime;
	}
	public void setIpayrate(Integer ipayrate){
	    this.ipayrate=ipayrate;
	}
	public Integer getIpayrate(){
	    return ipayrate;
	}
	public void setCchildnote(String cchildnote){
	    this.cchildnote=cchildnote;
	}
	public String getCchildnote(){
	    return cchildnote;
	}
	public void setCstandard(String cstandard){
	    this.cstandard=cstandard;
	}
	public String getCstandard(){
	    return cstandard;
	}
	public void setCpriceincude(String cpriceincude){
	    this.cpriceincude=cpriceincude;
	}
	public String getCpriceincude(){
	    return cpriceincude;
	}
	public void setCpricenotincude(String cpricenotincude){
	    this.cpricenotincude=cpricenotincude;
	}
	public String getCpricenotincude(){
	    return cpricenotincude;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setDminprice(Double dminprice){
	    this.dminprice=dminprice;
	}
	public Double getDminprice(){
	    return dminprice;
	}
	public void setDmaxprice(Double dmaxprice){
	    this.dmaxprice=dmaxprice;
	}
	public Double getDmaxprice(){
	    return dmaxprice;
	}
	public void setCprobability(String cprobability){
	    this.cprobability=cprobability;
	}
	public String getCprobability(){
	    return cprobability;
	}
	public void setCguestmemo(String cguestmemo){
	    this.cguestmemo=cguestmemo;
	}
	public String getCguestmemo(){
	    return cguestmemo;
	}
	public void setCopmemo(String copmemo){
	    this.copmemo=copmemo;
	}
	public String getCopmemo(){
	    return copmemo;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
	public void setUpriceuserid(String upriceuserid){
	    this.upriceuserid=upriceuserid;
	}
	public String getUpriceuserid(){
	    return upriceuserid;
	}
	public void setUpricedeptid(String upricedeptid){
	    this.upricedeptid=upricedeptid;
	}
	public String getUpricedeptid(){
	    return upricedeptid;
	}
	public void setDpricedate(Date dpricedate){
	    this.dpricedate=dpricedate;
	}
	public Date getDpricedate(){
	    return dpricedate;
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
	public void setCguidestandard(String cguidestandard){
	    this.cguidestandard=cguidestandard;
	}
	public String getCguidestandard(){
	    return cguidestandard;
	}
	public void setUpriceroleid(String upriceroleid){
	    this.upriceroleid=upriceroleid;
	}
	public String getUpriceroleid(){
	    return upriceroleid;
	}
	public void setUcustomerid(String ucustomerid){
	    this.ucustomerid=ucustomerid;
	}
	public String getUcustomerid(){
	    return ucustomerid;
	}
	public void setIscontract(String iscontract){
	    this.iscontract=iscontract;
	}
	public String getIscontract(){
	    return iscontract;
	}
	public void setCtravelintentmemo(String ctravelintentmemo){
	    this.ctravelintentmemo=ctravelintentmemo;
	}
	public String getCtravelintentmemo(){
	    return ctravelintentmemo;
	}
}