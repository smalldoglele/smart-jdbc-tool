package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Team entity for t_team table.
 * 
 * 
 * @since 2014-02-17 17:24:43.339
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_team")	
public class Team implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cteamcode")
	private String cteamcode;
	
	@Column(name="clinecode")
	private String clinecode;
	
	@Column(name="ulineid")
	private String ulineid;
	
	@Column(name="clinename")
	private String clinename;
	
	@Column(name="idays")
	private Integer idays;
	
	@Column(name="dbgndate")
	private Date dbgndate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="ipreenddays")
	private Integer ipreenddays;
	
	@Column(name="iguides")
	private Integer iguides;
	
	@Column(name="iplanqty")
	private Integer iplanqty;
	
	@Column(name="ikeepqty")
	private Integer ikeepqty;
	
	@Column(name="iqty")
	private Integer iqty;
	
	@Column(name="ipreqty")
	private Integer ipreqty;
	
	@Column(name="iadults")
	private Integer iadults;
	
	@Column(name="ichilds")
	private Integer ichilds;
	
	@Column(name="ibabys")
	private Integer ibabys;
	
	@Column(name="iolds")
	private Integer iolds;
	
	@Column(name="coptype")
	private String coptype;
	
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
	
	@Column(name="cadtitle")
	private String cadtitle;
	
	@Column(name="cadcontent")
	private String cadcontent;
	
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
	
	@Column(name="cchildnote")
	private String cchildnote;
	
	@Column(name="cstandard")
	private String cstandard;
	
	@Column(name="cprompt")
	private String cprompt;
	
	@Column(name="cpriceincude")
	private String cpriceincude;
	
	@Column(name="cpricenotincude")
	private String cpricenotincude;
	
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
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="clookstatus")
	private String clookstatus;
	
	@Column(name="clookmind")
	private String clookmind;
	
	@Column(name="ulookmanid")
	private String ulookmanid;
	
	@Column(name="clooktime")
	private Date clooktime;
	
	@Column(name="csend")
	private String csend;
	
	@Column(name="usenderid")
	private String usenderid;
	
	@Column(name="dsend")
	private Date dsend;
	
	@Column(name="cbalance")
	private String cbalance;
	
	@Column(name="ubalancerid")
	private String ubalancerid;
	
	@Column(name="dbalancetime")
	private Date dbalancetime;
	
	@Column(name="dmeetingtime")
	private Date dmeetingtime;
	
	@Column(name="cmeetingplace")
	private String cmeetingplace;
	
	@Column(name="cdepcode")
	private String cdepcode;
	
	@Column(name="copcode")
	private String copcode;
	
	@Column(name="itemplate")
	private Integer itemplate;
	
	@Column(name="cissue")
	private String cissue;
	
	@Column(name="cmicropicpath")
	private String cmicropicpath;
	
	@Column(name="irecommend")
	private Integer irecommend;
	
	@Column(name="uteamsourceuid")
	private String uteamsourceuid;
	
	@Column(name="copmemo")
	private String copmemo;
	
	@Column(name="cstartcity")
	private String cstartcity;
	
	@Column(name="cteamdoc")
	private String cteamdoc;
	
	@Column(name="ipoint")
	private Integer ipoint;
	
	@Column(name="corderconfirmtype")
	private String corderconfirmtype;
	
	@Column(name="iteamqty")
	private Integer iteamqty;
	
	@Column(name="cfeature")
	private String cfeature;
	
	@Column(name="ndownpayment")
	private Double ndownpayment;
	
	@Column(name="cguidememo")
	private String cguidememo;
	
	@Column(name="dmeetingendtime")
	private Date dmeetingendtime;
	
	@Column(name="dcreate")
	private Date dcreate;
	
	@Column(name="ctravelteamcode")
	private String ctravelteamcode;
	
	@Column(name="ctravelname")
	private String ctravelname;
	
	@Column(name="cconfirmstatus")
	private String cconfirmstatus;
	
	@Column(name="cstatus2")
	private String cstatus2;
	
	@Column(name="csblw")
	private String csblw;
	
	@Column(name="usblwuserid")
	private String usblwuserid;
	
	@Column(name="dsblwdate")
	private Date dsblwdate;
	
	@Column(name="iclearhour")
	private Integer iclearhour;
	
	@Column(name="cleaderadvance")
	private String cleaderadvance;
	
	@Column(name="isspecialoffer")
	private String isspecialoffer;
	
	@Column(name="idiscountplanqty")
	private Integer idiscountplanqty;
	
	@Column(name="idiscountqty")
	private Integer idiscountqty;
	
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
	
	@Column(name="uoperatorid")
	private String uoperatorid;
	
	@Column(name="idiscountuse")
	private Integer idiscountuse;
	
	@Column(name="mpoint")
	private Double mpoint;
	
	@Column(name="mexcutepoint")
	private Double mexcutepoint;
	
	@Column(name="idiscount")
	private Integer idiscount;
	
	@Column(name="ccompulsoryInsure")
	private String ccompulsoryInsure;
	
	@Column(name="cexprice")
	private String cexprice;
	
	@Column(name="cshoplace")
	private String cshoplace;
	
	@Column(name="cvisanotice")
	private String cvisanotice;
	
	@Column(name="ucustomerid")
	private String ucustomerid;
	
	@Column(name="teamconfirm")
	private String teamconfirm;
	
	@Column(name="iminMemberPoint")
	private Integer iminMemberPoint;
	
	@Column(name="ucontractteamid")
	private String ucontractteamid;
	
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
	public void setCteamcode(String cteamcode){
	    this.cteamcode=cteamcode;
	}
	public String getCteamcode(){
	    return cteamcode;
	}
	public void setClinecode(String clinecode){
	    this.clinecode=clinecode;
	}
	public String getClinecode(){
	    return clinecode;
	}
	public void setUlineid(String ulineid){
	    this.ulineid=ulineid;
	}
	public String getUlineid(){
	    return ulineid;
	}
	public void setClinename(String clinename){
	    this.clinename=clinename;
	}
	public String getClinename(){
	    return clinename;
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
	public void setIpreenddays(Integer ipreenddays){
	    this.ipreenddays=ipreenddays;
	}
	public Integer getIpreenddays(){
	    return ipreenddays;
	}
	public void setIguides(Integer iguides){
	    this.iguides=iguides;
	}
	public Integer getIguides(){
	    return iguides;
	}
	public void setIplanqty(Integer iplanqty){
	    this.iplanqty=iplanqty;
	}
	public Integer getIplanqty(){
	    return iplanqty;
	}
	public void setIkeepqty(Integer ikeepqty){
	    this.ikeepqty=ikeepqty;
	}
	public Integer getIkeepqty(){
	    return ikeepqty;
	}
	public void setIqty(Integer iqty){
	    this.iqty=iqty;
	}
	public Integer getIqty(){
	    return iqty;
	}
	public void setIpreqty(Integer ipreqty){
	    this.ipreqty=ipreqty;
	}
	public Integer getIpreqty(){
	    return ipreqty;
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
	public void setCoptype(String coptype){
	    this.coptype=coptype;
	}
	public String getCoptype(){
	    return coptype;
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
	public void setCprompt(String cprompt){
	    this.cprompt=cprompt;
	}
	public String getCprompt(){
	    return cprompt;
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
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
	public void setClookstatus(String clookstatus){
	    this.clookstatus=clookstatus;
	}
	public String getClookstatus(){
	    return clookstatus;
	}
	public void setClookmind(String clookmind){
	    this.clookmind=clookmind;
	}
	public String getClookmind(){
	    return clookmind;
	}
	public void setUlookmanid(String ulookmanid){
	    this.ulookmanid=ulookmanid;
	}
	public String getUlookmanid(){
	    return ulookmanid;
	}
	public void setClooktime(Date clooktime){
	    this.clooktime=clooktime;
	}
	public Date getClooktime(){
	    return clooktime;
	}
	public void setCsend(String csend){
	    this.csend=csend;
	}
	public String getCsend(){
	    return csend;
	}
	public void setUsenderid(String usenderid){
	    this.usenderid=usenderid;
	}
	public String getUsenderid(){
	    return usenderid;
	}
	public void setDsend(Date dsend){
	    this.dsend=dsend;
	}
	public Date getDsend(){
	    return dsend;
	}
	public void setCbalance(String cbalance){
	    this.cbalance=cbalance;
	}
	public String getCbalance(){
	    return cbalance;
	}
	public void setUbalancerid(String ubalancerid){
	    this.ubalancerid=ubalancerid;
	}
	public String getUbalancerid(){
	    return ubalancerid;
	}
	public void setDbalancetime(Date dbalancetime){
	    this.dbalancetime=dbalancetime;
	}
	public Date getDbalancetime(){
	    return dbalancetime;
	}
	public void setDmeetingtime(Date dmeetingtime){
	    this.dmeetingtime=dmeetingtime;
	}
	public Date getDmeetingtime(){
	    return dmeetingtime;
	}
	public void setCmeetingplace(String cmeetingplace){
	    this.cmeetingplace=cmeetingplace;
	}
	public String getCmeetingplace(){
	    return cmeetingplace;
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
	public void setItemplate(Integer itemplate){
	    this.itemplate=itemplate;
	}
	public Integer getItemplate(){
	    return itemplate;
	}
	public void setCissue(String cissue){
	    this.cissue=cissue;
	}
	public String getCissue(){
	    return cissue;
	}
	public void setCmicropicpath(String cmicropicpath){
	    this.cmicropicpath=cmicropicpath;
	}
	public String getCmicropicpath(){
	    return cmicropicpath;
	}
	public void setIrecommend(Integer irecommend){
	    this.irecommend=irecommend;
	}
	public Integer getIrecommend(){
	    return irecommend;
	}
	public void setUteamsourceuid(String uteamsourceuid){
	    this.uteamsourceuid=uteamsourceuid;
	}
	public String getUteamsourceuid(){
	    return uteamsourceuid;
	}
	public void setCopmemo(String copmemo){
	    this.copmemo=copmemo;
	}
	public String getCopmemo(){
	    return copmemo;
	}
	public void setCstartcity(String cstartcity){
	    this.cstartcity=cstartcity;
	}
	public String getCstartcity(){
	    return cstartcity;
	}
	public void setCteamdoc(String cteamdoc){
	    this.cteamdoc=cteamdoc;
	}
	public String getCteamdoc(){
	    return cteamdoc;
	}
	public void setIpoint(Integer ipoint){
	    this.ipoint=ipoint;
	}
	public Integer getIpoint(){
	    return ipoint;
	}
	public void setCorderconfirmtype(String corderconfirmtype){
	    this.corderconfirmtype=corderconfirmtype;
	}
	public String getCorderconfirmtype(){
	    return corderconfirmtype;
	}
	public void setIteamqty(Integer iteamqty){
	    this.iteamqty=iteamqty;
	}
	public Integer getIteamqty(){
	    return iteamqty;
	}
	public void setCfeature(String cfeature){
	    this.cfeature=cfeature;
	}
	public String getCfeature(){
	    return cfeature;
	}
	public void setNdownpayment(Double ndownpayment){
	    this.ndownpayment=ndownpayment;
	}
	public Double getNdownpayment(){
	    return ndownpayment;
	}
	public void setCguidememo(String cguidememo){
	    this.cguidememo=cguidememo;
	}
	public String getCguidememo(){
	    return cguidememo;
	}
	public void setDmeetingendtime(Date dmeetingendtime){
	    this.dmeetingendtime=dmeetingendtime;
	}
	public Date getDmeetingendtime(){
	    return dmeetingendtime;
	}
	public void setDcreate(Date dcreate){
	    this.dcreate=dcreate;
	}
	public Date getDcreate(){
	    return dcreate;
	}
	public void setCtravelteamcode(String ctravelteamcode){
	    this.ctravelteamcode=ctravelteamcode;
	}
	public String getCtravelteamcode(){
	    return ctravelteamcode;
	}
	public void setCtravelname(String ctravelname){
	    this.ctravelname=ctravelname;
	}
	public String getCtravelname(){
	    return ctravelname;
	}
	public void setCconfirmstatus(String cconfirmstatus){
	    this.cconfirmstatus=cconfirmstatus;
	}
	public String getCconfirmstatus(){
	    return cconfirmstatus;
	}
	public void setCstatus2(String cstatus2){
	    this.cstatus2=cstatus2;
	}
	public String getCstatus2(){
	    return cstatus2;
	}
	public void setCsblw(String csblw){
	    this.csblw=csblw;
	}
	public String getCsblw(){
	    return csblw;
	}
	public void setUsblwuserid(String usblwuserid){
	    this.usblwuserid=usblwuserid;
	}
	public String getUsblwuserid(){
	    return usblwuserid;
	}
	public void setDsblwdate(Date dsblwdate){
	    this.dsblwdate=dsblwdate;
	}
	public Date getDsblwdate(){
	    return dsblwdate;
	}
	public void setIclearhour(Integer iclearhour){
	    this.iclearhour=iclearhour;
	}
	public Integer getIclearhour(){
	    return iclearhour;
	}
	public void setCleaderadvance(String cleaderadvance){
	    this.cleaderadvance=cleaderadvance;
	}
	public String getCleaderadvance(){
	    return cleaderadvance;
	}
	public void setIsspecialoffer(String isspecialoffer){
	    this.isspecialoffer=isspecialoffer;
	}
	public String getIsspecialoffer(){
	    return isspecialoffer;
	}
	public void setIdiscountplanqty(Integer idiscountplanqty){
	    this.idiscountplanqty=idiscountplanqty;
	}
	public Integer getIdiscountplanqty(){
	    return idiscountplanqty;
	}
	public void setIdiscountqty(Integer idiscountqty){
	    this.idiscountqty=idiscountqty;
	}
	public Integer getIdiscountqty(){
	    return idiscountqty;
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
	public void setUoperatorid(String uoperatorid){
	    this.uoperatorid=uoperatorid;
	}
	public String getUoperatorid(){
	    return uoperatorid;
	}
	public void setIdiscountuse(Integer idiscountuse){
	    this.idiscountuse=idiscountuse;
	}
	public Integer getIdiscountuse(){
	    return idiscountuse;
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
	public void setCcompulsoryInsure(String ccompulsoryInsure){
	    this.ccompulsoryInsure=ccompulsoryInsure;
	}
	public String getCcompulsoryInsure(){
	    return ccompulsoryInsure;
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
	public void setUcustomerid(String ucustomerid){
	    this.ucustomerid=ucustomerid;
	}
	public String getUcustomerid(){
	    return ucustomerid;
	}
	public void setTeamconfirm(String teamconfirm){
	    this.teamconfirm=teamconfirm;
	}
	public String getTeamconfirm(){
	    return teamconfirm;
	}
	public void setIminMemberPoint(Integer iminMemberPoint){
	    this.iminMemberPoint=iminMemberPoint;
	}
	public Integer getIminMemberPoint(){
	    return iminMemberPoint;
	}
	public void setUcontractteamid(String ucontractteamid){
	    this.ucontractteamid=ucontractteamid;
	}
	public String getUcontractteamid(){
	    return ucontractteamid;
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