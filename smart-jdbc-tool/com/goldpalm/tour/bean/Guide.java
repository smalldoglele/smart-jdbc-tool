package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Guide entity for t_guide table.
 * 
 * 
 * @since 2014-02-17 17:24:38.666
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_guide")	
public class Guide implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="uguidedeptid")
	private String uguidedeptid;
	
	@Column(name="clevel")
	private String clevel;
	
	@Column(name="cguidecode")
	private String cguidecode;
	
	@Column(name="dguideenddate")
	private Date dguideenddate;
	
	@Column(name="cleadercode")
	private String cleadercode;
	
	@Column(name="dleaderenddate")
	private Date dleaderenddate;
	
	@Column(name="ctwleadercode")
	private String ctwleadercode;
	
	@Column(name="dtwleaderenddate")
	private Date dtwleaderenddate;
	
	@Column(name="clanguage")
	private String clanguage;
	
	@Column(name="clanguage1")
	private String clanguage1;
	
	@Column(name="clanguage2")
	private String clanguage2;
	
	@Column(name="clanguage3")
	private String clanguage3;
	
	@Column(name="cidcard")
	private String cidcard;
	
	@Column(name="carmycode")
	private String carmycode;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cfamilyname")
	private String cfamilyname;
	
	@Column(name="cgivenname")
	private String cgivenname;
	
	@Column(name="csex")
	private String csex;
	
	@Column(name="dbirthday")
	private Date dbirthday;
	
	@Column(name="cbirthplace")
	private String cbirthplace;
	
	@Column(name="clegalplace")
	private String clegalplace;
	
	@Column(name="cliveplace")
	private String cliveplace;
	
	@Column(name="cnation")
	private String cnation;
	
	@Column(name="cfolk")
	private String cfolk;
	
	@Column(name="ceducation")
	private String ceducation;
	
	@Column(name="cmarriage")
	private String cmarriage;
	
	@Column(name="cmobiletel")
	private String cmobiletel;
	
	@Column(name="cmobiletel2")
	private String cmobiletel2;
	
	@Column(name="cemail")
	private String cemail;
	
	@Column(name="cmsn")
	private String cmsn;
	
	@Column(name="cqq")
	private String cqq;
	
	@Column(name="chomeaddr")
	private String chomeaddr;
	
	@Column(name="chomezip")
	private String chomezip;
	
	@Column(name="chometel")
	private String chometel;
	
	@Column(name="ccorpname")
	private String ccorpname;
	
	@Column(name="ccorpaddr")
	private String ccorpaddr;
	
	@Column(name="ccorpzip")
	private String ccorpzip;
	
	@Column(name="ccorptel")
	private String ccorptel;
	
	@Column(name="ccorpfax")
	private String ccorpfax;
	
	@Column(name="cpasscode")
	private String cpasscode;
	
	@Column(name="cpassplace")
	private String cpassplace;
	
	@Column(name="dpassbegindate")
	private Date dpassbegindate;
	
	@Column(name="dpassenddate")
	private Date dpassenddate;
	
	@Column(name="cgapasscode")
	private String cgapasscode;
	
	@Column(name="cgapassplace")
	private String cgapassplace;
	
	@Column(name="dgapassbegindate")
	private Date dgapassbegindate;
	
	@Column(name="dgapassenddate")
	private Date dgapassenddate;
	
	@Column(name="ctwpasscode")
	private String ctwpasscode;
	
	@Column(name="ctwpassplace")
	private String ctwpassplace;
	
	@Column(name="dtwpassbegindate")
	private Date dtwpassbegindate;
	
	@Column(name="dtwpassenddate")
	private Date dtwpassenddate;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="recommendlevel")
	private String recommendlevel;
	
	@Column(name="nprice")
	private Double nprice;
	
	@Column(name="usupplierid")
	private String usupplierid;
	
	@Column(name="crecommend")
	private String crecommend;
	
	@Column(name="nmkprice")
	private Double nmkprice;
	
	@Column(name="carea")
	private String carea;
	
	@Column(name="cspecialty")
	private String cspecialty;
	
	@Column(name="cperiod")
	private String cperiod;
	
	@Column(name="nstandard")
	private Double nstandard;
	
	@Column(name="ctitle")
	private String ctitle;
	
	@Column(name="ctypecustomer")
	private String ctypecustomer;
	
	@Column(name="cdetail")
	private String cdetail;
	
	@Column(name="ino")
	private Integer ino;
	
	@Column(name="cstatus1")
	private String cstatus1;
	
	@Column(name="guuserid")
	private String guuserid;
	
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
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setUguidedeptid(String uguidedeptid){
	    this.uguidedeptid=uguidedeptid;
	}
	public String getUguidedeptid(){
	    return uguidedeptid;
	}
	public void setClevel(String clevel){
	    this.clevel=clevel;
	}
	public String getClevel(){
	    return clevel;
	}
	public void setCguidecode(String cguidecode){
	    this.cguidecode=cguidecode;
	}
	public String getCguidecode(){
	    return cguidecode;
	}
	public void setDguideenddate(Date dguideenddate){
	    this.dguideenddate=dguideenddate;
	}
	public Date getDguideenddate(){
	    return dguideenddate;
	}
	public void setCleadercode(String cleadercode){
	    this.cleadercode=cleadercode;
	}
	public String getCleadercode(){
	    return cleadercode;
	}
	public void setDleaderenddate(Date dleaderenddate){
	    this.dleaderenddate=dleaderenddate;
	}
	public Date getDleaderenddate(){
	    return dleaderenddate;
	}
	public void setCtwleadercode(String ctwleadercode){
	    this.ctwleadercode=ctwleadercode;
	}
	public String getCtwleadercode(){
	    return ctwleadercode;
	}
	public void setDtwleaderenddate(Date dtwleaderenddate){
	    this.dtwleaderenddate=dtwleaderenddate;
	}
	public Date getDtwleaderenddate(){
	    return dtwleaderenddate;
	}
	public void setClanguage(String clanguage){
	    this.clanguage=clanguage;
	}
	public String getClanguage(){
	    return clanguage;
	}
	public void setClanguage1(String clanguage1){
	    this.clanguage1=clanguage1;
	}
	public String getClanguage1(){
	    return clanguage1;
	}
	public void setClanguage2(String clanguage2){
	    this.clanguage2=clanguage2;
	}
	public String getClanguage2(){
	    return clanguage2;
	}
	public void setClanguage3(String clanguage3){
	    this.clanguage3=clanguage3;
	}
	public String getClanguage3(){
	    return clanguage3;
	}
	public void setCidcard(String cidcard){
	    this.cidcard=cidcard;
	}
	public String getCidcard(){
	    return cidcard;
	}
	public void setCarmycode(String carmycode){
	    this.carmycode=carmycode;
	}
	public String getCarmycode(){
	    return carmycode;
	}
	public void setCname(String cname){
	    this.cname=cname;
	}
	public String getCname(){
	    return cname;
	}
	public void setCfamilyname(String cfamilyname){
	    this.cfamilyname=cfamilyname;
	}
	public String getCfamilyname(){
	    return cfamilyname;
	}
	public void setCgivenname(String cgivenname){
	    this.cgivenname=cgivenname;
	}
	public String getCgivenname(){
	    return cgivenname;
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
	public void setClegalplace(String clegalplace){
	    this.clegalplace=clegalplace;
	}
	public String getClegalplace(){
	    return clegalplace;
	}
	public void setCliveplace(String cliveplace){
	    this.cliveplace=cliveplace;
	}
	public String getCliveplace(){
	    return cliveplace;
	}
	public void setCnation(String cnation){
	    this.cnation=cnation;
	}
	public String getCnation(){
	    return cnation;
	}
	public void setCfolk(String cfolk){
	    this.cfolk=cfolk;
	}
	public String getCfolk(){
	    return cfolk;
	}
	public void setCeducation(String ceducation){
	    this.ceducation=ceducation;
	}
	public String getCeducation(){
	    return ceducation;
	}
	public void setCmarriage(String cmarriage){
	    this.cmarriage=cmarriage;
	}
	public String getCmarriage(){
	    return cmarriage;
	}
	public void setCmobiletel(String cmobiletel){
	    this.cmobiletel=cmobiletel;
	}
	public String getCmobiletel(){
	    return cmobiletel;
	}
	public void setCmobiletel2(String cmobiletel2){
	    this.cmobiletel2=cmobiletel2;
	}
	public String getCmobiletel2(){
	    return cmobiletel2;
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
	public void setChomeaddr(String chomeaddr){
	    this.chomeaddr=chomeaddr;
	}
	public String getChomeaddr(){
	    return chomeaddr;
	}
	public void setChomezip(String chomezip){
	    this.chomezip=chomezip;
	}
	public String getChomezip(){
	    return chomezip;
	}
	public void setChometel(String chometel){
	    this.chometel=chometel;
	}
	public String getChometel(){
	    return chometel;
	}
	public void setCcorpname(String ccorpname){
	    this.ccorpname=ccorpname;
	}
	public String getCcorpname(){
	    return ccorpname;
	}
	public void setCcorpaddr(String ccorpaddr){
	    this.ccorpaddr=ccorpaddr;
	}
	public String getCcorpaddr(){
	    return ccorpaddr;
	}
	public void setCcorpzip(String ccorpzip){
	    this.ccorpzip=ccorpzip;
	}
	public String getCcorpzip(){
	    return ccorpzip;
	}
	public void setCcorptel(String ccorptel){
	    this.ccorptel=ccorptel;
	}
	public String getCcorptel(){
	    return ccorptel;
	}
	public void setCcorpfax(String ccorpfax){
	    this.ccorpfax=ccorpfax;
	}
	public String getCcorpfax(){
	    return ccorpfax;
	}
	public void setCpasscode(String cpasscode){
	    this.cpasscode=cpasscode;
	}
	public String getCpasscode(){
	    return cpasscode;
	}
	public void setCpassplace(String cpassplace){
	    this.cpassplace=cpassplace;
	}
	public String getCpassplace(){
	    return cpassplace;
	}
	public void setDpassbegindate(Date dpassbegindate){
	    this.dpassbegindate=dpassbegindate;
	}
	public Date getDpassbegindate(){
	    return dpassbegindate;
	}
	public void setDpassenddate(Date dpassenddate){
	    this.dpassenddate=dpassenddate;
	}
	public Date getDpassenddate(){
	    return dpassenddate;
	}
	public void setCgapasscode(String cgapasscode){
	    this.cgapasscode=cgapasscode;
	}
	public String getCgapasscode(){
	    return cgapasscode;
	}
	public void setCgapassplace(String cgapassplace){
	    this.cgapassplace=cgapassplace;
	}
	public String getCgapassplace(){
	    return cgapassplace;
	}
	public void setDgapassbegindate(Date dgapassbegindate){
	    this.dgapassbegindate=dgapassbegindate;
	}
	public Date getDgapassbegindate(){
	    return dgapassbegindate;
	}
	public void setDgapassenddate(Date dgapassenddate){
	    this.dgapassenddate=dgapassenddate;
	}
	public Date getDgapassenddate(){
	    return dgapassenddate;
	}
	public void setCtwpasscode(String ctwpasscode){
	    this.ctwpasscode=ctwpasscode;
	}
	public String getCtwpasscode(){
	    return ctwpasscode;
	}
	public void setCtwpassplace(String ctwpassplace){
	    this.ctwpassplace=ctwpassplace;
	}
	public String getCtwpassplace(){
	    return ctwpassplace;
	}
	public void setDtwpassbegindate(Date dtwpassbegindate){
	    this.dtwpassbegindate=dtwpassbegindate;
	}
	public Date getDtwpassbegindate(){
	    return dtwpassbegindate;
	}
	public void setDtwpassenddate(Date dtwpassenddate){
	    this.dtwpassenddate=dtwpassenddate;
	}
	public Date getDtwpassenddate(){
	    return dtwpassenddate;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
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
	public void setUcorpid(String ucorpid){
	    this.ucorpid=ucorpid;
	}
	public String getUcorpid(){
	    return ucorpid;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setRecommendlevel(String recommendlevel){
	    this.recommendlevel=recommendlevel;
	}
	public String getRecommendlevel(){
	    return recommendlevel;
	}
	public void setNprice(Double nprice){
	    this.nprice=nprice;
	}
	public Double getNprice(){
	    return nprice;
	}
	public void setUsupplierid(String usupplierid){
	    this.usupplierid=usupplierid;
	}
	public String getUsupplierid(){
	    return usupplierid;
	}
	public void setCrecommend(String crecommend){
	    this.crecommend=crecommend;
	}
	public String getCrecommend(){
	    return crecommend;
	}
	public void setNmkprice(Double nmkprice){
	    this.nmkprice=nmkprice;
	}
	public Double getNmkprice(){
	    return nmkprice;
	}
	public void setCarea(String carea){
	    this.carea=carea;
	}
	public String getCarea(){
	    return carea;
	}
	public void setCspecialty(String cspecialty){
	    this.cspecialty=cspecialty;
	}
	public String getCspecialty(){
	    return cspecialty;
	}
	public void setCperiod(String cperiod){
	    this.cperiod=cperiod;
	}
	public String getCperiod(){
	    return cperiod;
	}
	public void setNstandard(Double nstandard){
	    this.nstandard=nstandard;
	}
	public Double getNstandard(){
	    return nstandard;
	}
	public void setCtitle(String ctitle){
	    this.ctitle=ctitle;
	}
	public String getCtitle(){
	    return ctitle;
	}
	public void setCtypecustomer(String ctypecustomer){
	    this.ctypecustomer=ctypecustomer;
	}
	public String getCtypecustomer(){
	    return ctypecustomer;
	}
	public void setCdetail(String cdetail){
	    this.cdetail=cdetail;
	}
	public String getCdetail(){
	    return cdetail;
	}
	public void setIno(Integer ino){
	    this.ino=ino;
	}
	public Integer getIno(){
	    return ino;
	}
	public void setCstatus1(String cstatus1){
	    this.cstatus1=cstatus1;
	}
	public String getCstatus1(){
	    return cstatus1;
	}
	public void setGuuserid(String guuserid){
	    this.guuserid=guuserid;
	}
	public String getGuuserid(){
	    return guuserid;
	}
}