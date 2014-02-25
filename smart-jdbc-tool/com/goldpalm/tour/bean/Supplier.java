package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Supplier entity for t_supplier table.
 * 
 * 
 * @since 2014-02-17 17:24:43.129
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_supplier")	
public class Supplier implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cnameen")
	private String cnameen;
	
	@Column(name="cshortname")
	private String cshortname;
	
	@Column(name="carea")
	private String carea;
	
	@Column(name="cnation")
	private String cnation;
	
	@Column(name="cprovince")
	private String cprovince;
	
	@Column(name="ccity")
	private String ccity;
	
	@Column(name="csection")
	private String csection;
	
	@Column(name="caccountcode")
	private String caccountcode;
	
	@Column(name="cistravel")
	private String cistravel;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="csymbol")
	private String csymbol;
	
	@Column(name="caddress")
	private String caddress;
	
	@Column(name="czip")
	private String czip;
	
	@Column(name="cwebsite")
	private String cwebsite;
	
	@Column(name="ctelephone")
	private String ctelephone;
	
	@Column(name="cfax")
	private String cfax;
	
	@Column(name="clevel")
	private String clevel;
	
	@Column(name="ncredit")
	private Double ncredit;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="dvaliditydate")
	private Date dvaliditydate;
	
	@Column(name="uapplydeptid")
	private String uapplydeptid;
	
	@Column(name="uapplyuserid")
	private String uapplyuserid;
	
	@Column(name="cdutyphone")
	private String cdutyphone;
	
	@Column(name="cbank1")
	private String cbank1;
	
	@Column(name="cbank1addr")
	private String cbank1addr;
	
	@Column(name="cbank1accountnum")
	private String cbank1accountnum;
	
	@Column(name="cbank1cur")
	private String cbank1cur;
	
	@Column(name="cbank2")
	private String cbank2;
	
	@Column(name="cbank2addr")
	private String cbank2addr;
	
	@Column(name="cbank2accountnum")
	private String cbank2accountnum;
	
	@Column(name="cbank2cur")
	private String cbank2cur;
	
	@Column(name="csname")
	private String csname;
	
	@Column(name="csbank")
	private String csbank;
	
	@Column(name="csbankaddr")
	private String csbankaddr;
	
	@Column(name="csbankaccountnum")
	private String csbankaccountnum;
	
	@Column(name="csbankcur")
	private String csbankcur;
	
	@Column(name="cmanagerdept")
	private String cmanagerdept;
	
	@Column(name="ccorphuman")
	private String ccorphuman;
	
	@Column(name="ncorpfund")
	private Double ncorpfund;
	
	@Column(name="ccorpkind")
	private String ccorpkind;
	
	@Column(name="ncorpcash")
	private Double ncorpcash;
	
	@Column(name="ccorpfundcur")
	private String ccorpfundcur;
	
	@Column(name="invoicedays")
	private Integer invoicedays;
	
	@Column(name="introduction")
	private String introduction;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="cisvalid")
	private String cisvalid;
	
	@Column(name="ckind")
	private String ckind;
	
	@Column(name="cTrustBankaddr")
	private String cTrustBankaddr;
	
	@Column(name="cTrustBankAccountNum")
	private String cTrustBankAccountNum;
	
	@Column(name="cTrustBank")
	private String cTrustBank;
	
	@Column(name="cTrustName")
	private String cTrustName;
	
	@Column(name="cTrustBankcur")
	private String cTrustBankcur;
	
	@Column(name="crpmode")
	private String crpmode;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUcorpid(String ucorpid){
	    this.ucorpid=ucorpid;
	}
	public String getUcorpid(){
	    return ucorpid;
	}
	public void setCname(String cname){
	    this.cname=cname;
	}
	public String getCname(){
	    return cname;
	}
	public void setCnameen(String cnameen){
	    this.cnameen=cnameen;
	}
	public String getCnameen(){
	    return cnameen;
	}
	public void setCshortname(String cshortname){
	    this.cshortname=cshortname;
	}
	public String getCshortname(){
	    return cshortname;
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
	public void setCprovince(String cprovince){
	    this.cprovince=cprovince;
	}
	public String getCprovince(){
	    return cprovince;
	}
	public void setCcity(String ccity){
	    this.ccity=ccity;
	}
	public String getCcity(){
	    return ccity;
	}
	public void setCsection(String csection){
	    this.csection=csection;
	}
	public String getCsection(){
	    return csection;
	}
	public void setCaccountcode(String caccountcode){
	    this.caccountcode=caccountcode;
	}
	public String getCaccountcode(){
	    return caccountcode;
	}
	public void setCistravel(String cistravel){
	    this.cistravel=cistravel;
	}
	public String getCistravel(){
	    return cistravel;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setCsymbol(String csymbol){
	    this.csymbol=csymbol;
	}
	public String getCsymbol(){
	    return csymbol;
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
	public void setCwebsite(String cwebsite){
	    this.cwebsite=cwebsite;
	}
	public String getCwebsite(){
	    return cwebsite;
	}
	public void setCtelephone(String ctelephone){
	    this.ctelephone=ctelephone;
	}
	public String getCtelephone(){
	    return ctelephone;
	}
	public void setCfax(String cfax){
	    this.cfax=cfax;
	}
	public String getCfax(){
	    return cfax;
	}
	public void setClevel(String clevel){
	    this.clevel=clevel;
	}
	public String getClevel(){
	    return clevel;
	}
	public void setNcredit(Double ncredit){
	    this.ncredit=ncredit;
	}
	public Double getNcredit(){
	    return ncredit;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
	public void setDvaliditydate(Date dvaliditydate){
	    this.dvaliditydate=dvaliditydate;
	}
	public Date getDvaliditydate(){
	    return dvaliditydate;
	}
	public void setUapplydeptid(String uapplydeptid){
	    this.uapplydeptid=uapplydeptid;
	}
	public String getUapplydeptid(){
	    return uapplydeptid;
	}
	public void setUapplyuserid(String uapplyuserid){
	    this.uapplyuserid=uapplyuserid;
	}
	public String getUapplyuserid(){
	    return uapplyuserid;
	}
	public void setCdutyphone(String cdutyphone){
	    this.cdutyphone=cdutyphone;
	}
	public String getCdutyphone(){
	    return cdutyphone;
	}
	public void setCbank1(String cbank1){
	    this.cbank1=cbank1;
	}
	public String getCbank1(){
	    return cbank1;
	}
	public void setCbank1addr(String cbank1addr){
	    this.cbank1addr=cbank1addr;
	}
	public String getCbank1addr(){
	    return cbank1addr;
	}
	public void setCbank1accountnum(String cbank1accountnum){
	    this.cbank1accountnum=cbank1accountnum;
	}
	public String getCbank1accountnum(){
	    return cbank1accountnum;
	}
	public void setCbank1cur(String cbank1cur){
	    this.cbank1cur=cbank1cur;
	}
	public String getCbank1cur(){
	    return cbank1cur;
	}
	public void setCbank2(String cbank2){
	    this.cbank2=cbank2;
	}
	public String getCbank2(){
	    return cbank2;
	}
	public void setCbank2addr(String cbank2addr){
	    this.cbank2addr=cbank2addr;
	}
	public String getCbank2addr(){
	    return cbank2addr;
	}
	public void setCbank2accountnum(String cbank2accountnum){
	    this.cbank2accountnum=cbank2accountnum;
	}
	public String getCbank2accountnum(){
	    return cbank2accountnum;
	}
	public void setCbank2cur(String cbank2cur){
	    this.cbank2cur=cbank2cur;
	}
	public String getCbank2cur(){
	    return cbank2cur;
	}
	public void setCsname(String csname){
	    this.csname=csname;
	}
	public String getCsname(){
	    return csname;
	}
	public void setCsbank(String csbank){
	    this.csbank=csbank;
	}
	public String getCsbank(){
	    return csbank;
	}
	public void setCsbankaddr(String csbankaddr){
	    this.csbankaddr=csbankaddr;
	}
	public String getCsbankaddr(){
	    return csbankaddr;
	}
	public void setCsbankaccountnum(String csbankaccountnum){
	    this.csbankaccountnum=csbankaccountnum;
	}
	public String getCsbankaccountnum(){
	    return csbankaccountnum;
	}
	public void setCsbankcur(String csbankcur){
	    this.csbankcur=csbankcur;
	}
	public String getCsbankcur(){
	    return csbankcur;
	}
	public void setCmanagerdept(String cmanagerdept){
	    this.cmanagerdept=cmanagerdept;
	}
	public String getCmanagerdept(){
	    return cmanagerdept;
	}
	public void setCcorphuman(String ccorphuman){
	    this.ccorphuman=ccorphuman;
	}
	public String getCcorphuman(){
	    return ccorphuman;
	}
	public void setNcorpfund(Double ncorpfund){
	    this.ncorpfund=ncorpfund;
	}
	public Double getNcorpfund(){
	    return ncorpfund;
	}
	public void setCcorpkind(String ccorpkind){
	    this.ccorpkind=ccorpkind;
	}
	public String getCcorpkind(){
	    return ccorpkind;
	}
	public void setNcorpcash(Double ncorpcash){
	    this.ncorpcash=ncorpcash;
	}
	public Double getNcorpcash(){
	    return ncorpcash;
	}
	public void setCcorpfundcur(String ccorpfundcur){
	    this.ccorpfundcur=ccorpfundcur;
	}
	public String getCcorpfundcur(){
	    return ccorpfundcur;
	}
	public void setInvoicedays(Integer invoicedays){
	    this.invoicedays=invoicedays;
	}
	public Integer getInvoicedays(){
	    return invoicedays;
	}
	public void setIntroduction(String introduction){
	    this.introduction=introduction;
	}
	public String getIntroduction(){
	    return introduction;
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
	public void setCcode(String ccode){
	    this.ccode=ccode;
	}
	public String getCcode(){
	    return ccode;
	}
	public void setCisvalid(String cisvalid){
	    this.cisvalid=cisvalid;
	}
	public String getCisvalid(){
	    return cisvalid;
	}
	public void setCkind(String ckind){
	    this.ckind=ckind;
	}
	public String getCkind(){
	    return ckind;
	}
	public void setCTrustBankaddr(String cTrustBankaddr){
	    this.cTrustBankaddr=cTrustBankaddr;
	}
	public String getCTrustBankaddr(){
	    return cTrustBankaddr;
	}
	public void setCTrustBankAccountNum(String cTrustBankAccountNum){
	    this.cTrustBankAccountNum=cTrustBankAccountNum;
	}
	public String getCTrustBankAccountNum(){
	    return cTrustBankAccountNum;
	}
	public void setCTrustBank(String cTrustBank){
	    this.cTrustBank=cTrustBank;
	}
	public String getCTrustBank(){
	    return cTrustBank;
	}
	public void setCTrustName(String cTrustName){
	    this.cTrustName=cTrustName;
	}
	public String getCTrustName(){
	    return cTrustName;
	}
	public void setCTrustBankcur(String cTrustBankcur){
	    this.cTrustBankcur=cTrustBankcur;
	}
	public String getCTrustBankcur(){
	    return cTrustBankcur;
	}
	public void setCrpmode(String crpmode){
	    this.crpmode=crpmode;
	}
	public String getCrpmode(){
	    return crpmode;
	}
}