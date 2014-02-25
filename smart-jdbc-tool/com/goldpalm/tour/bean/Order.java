package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Order entity for t_order table.
 * 
 * 
 * @since 2014-02-17 17:24:40.944
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_order")	
public class Order implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="corderno")
	private String corderno;
	
	@Column(name="cordersource")
	private String cordersource;
	
	@Column(name="umemberid")
	private String umemberid;
	
	@Column(name="ccontact")
	private String ccontact;
	
	@Column(name="ccphone")
	private String ccphone;
	
	@Column(name="cmobileno")
	private String cmobileno;
	
	@Column(name="cfax")
	private String cfax;
	
	@Column(name="caddress")
	private String caddress;
	
	@Column(name="czip")
	private String czip;
	
	@Column(name="dsignup")
	private Date dsignup;
	
	@Column(name="cconfirmed")
	private String cconfirmed;
	
	@Column(name="cconfirmuser")
	private String cconfirmuser;
	
	@Column(name="cconfirmdept")
	private String cconfirmdept;
	
	@Column(name="dconfirmdate")
	private Date dconfirmdate;
	
	@Column(name="cemail")
	private String cemail;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="uconfirmuserid")
	private String uconfirmuserid;
	
	@Column(name="uconfirmdeptid")
	private String uconfirmdeptid;
	
	@Column(name="cpaytransstat")
	private String cpaytransstat;
	
	@Column(name="cpaysysseqid")
	private String cpaysysseqid;
	
	@Column(name="cpaysysdate")
	private Date cpaysysdate;
	
	@Column(name="cpaytype")
	private String cpaytype;
	
	@Column(name="cpaybankname")
	private String cpaybankname;
	
	@Column(name="cpayorderno")
	private String cpayorderno;
	
	@Column(name="cpaycardno")
	private String cpaycardno;
	
	@Column(name="dpaytime")
	private Date dpaytime;
	
	@Column(name="ucustomerid")
	private String ucustomerid;
	
	@Column(name="ucardid")
	private String ucardid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="cbelong")
	private String cbelong;
	
	@Column(name="ccontractno")
	private String ccontractno;
	
	@Column(name="idelayhour")
	private Integer idelayhour;
	
	@Column(name="isdiscount")
	private String isdiscount;
	
	@Column(name="ccustomername")
	private String ccustomername;
	
	@Column(name="cmembername")
	private String cmembername;
	
	@Column(name="dept")
	private String dept;
	
	@Column(name="cispreferent")
	private String cispreferent;
	
	@Column(name="uguideid")
	private String uguideid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCorderno(String corderno){
	    this.corderno=corderno;
	}
	public String getCorderno(){
	    return corderno;
	}
	public void setCordersource(String cordersource){
	    this.cordersource=cordersource;
	}
	public String getCordersource(){
	    return cordersource;
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
	public void setCcphone(String ccphone){
	    this.ccphone=ccphone;
	}
	public String getCcphone(){
	    return ccphone;
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
	public void setDsignup(Date dsignup){
	    this.dsignup=dsignup;
	}
	public Date getDsignup(){
	    return dsignup;
	}
	public void setCconfirmed(String cconfirmed){
	    this.cconfirmed=cconfirmed;
	}
	public String getCconfirmed(){
	    return cconfirmed;
	}
	public void setCconfirmuser(String cconfirmuser){
	    this.cconfirmuser=cconfirmuser;
	}
	public String getCconfirmuser(){
	    return cconfirmuser;
	}
	public void setCconfirmdept(String cconfirmdept){
	    this.cconfirmdept=cconfirmdept;
	}
	public String getCconfirmdept(){
	    return cconfirmdept;
	}
	public void setDconfirmdate(Date dconfirmdate){
	    this.dconfirmdate=dconfirmdate;
	}
	public Date getDconfirmdate(){
	    return dconfirmdate;
	}
	public void setCemail(String cemail){
	    this.cemail=cemail;
	}
	public String getCemail(){
	    return cemail;
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
	public void setUconfirmuserid(String uconfirmuserid){
	    this.uconfirmuserid=uconfirmuserid;
	}
	public String getUconfirmuserid(){
	    return uconfirmuserid;
	}
	public void setUconfirmdeptid(String uconfirmdeptid){
	    this.uconfirmdeptid=uconfirmdeptid;
	}
	public String getUconfirmdeptid(){
	    return uconfirmdeptid;
	}
	public void setCpaytransstat(String cpaytransstat){
	    this.cpaytransstat=cpaytransstat;
	}
	public String getCpaytransstat(){
	    return cpaytransstat;
	}
	public void setCpaysysseqid(String cpaysysseqid){
	    this.cpaysysseqid=cpaysysseqid;
	}
	public String getCpaysysseqid(){
	    return cpaysysseqid;
	}
	public void setCpaysysdate(Date cpaysysdate){
	    this.cpaysysdate=cpaysysdate;
	}
	public Date getCpaysysdate(){
	    return cpaysysdate;
	}
	public void setCpaytype(String cpaytype){
	    this.cpaytype=cpaytype;
	}
	public String getCpaytype(){
	    return cpaytype;
	}
	public void setCpaybankname(String cpaybankname){
	    this.cpaybankname=cpaybankname;
	}
	public String getCpaybankname(){
	    return cpaybankname;
	}
	public void setCpayorderno(String cpayorderno){
	    this.cpayorderno=cpayorderno;
	}
	public String getCpayorderno(){
	    return cpayorderno;
	}
	public void setCpaycardno(String cpaycardno){
	    this.cpaycardno=cpaycardno;
	}
	public String getCpaycardno(){
	    return cpaycardno;
	}
	public void setDpaytime(Date dpaytime){
	    this.dpaytime=dpaytime;
	}
	public Date getDpaytime(){
	    return dpaytime;
	}
	public void setUcustomerid(String ucustomerid){
	    this.ucustomerid=ucustomerid;
	}
	public String getUcustomerid(){
	    return ucustomerid;
	}
	public void setUcardid(String ucardid){
	    this.ucardid=ucardid;
	}
	public String getUcardid(){
	    return ucardid;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setCbelong(String cbelong){
	    this.cbelong=cbelong;
	}
	public String getCbelong(){
	    return cbelong;
	}
	public void setCcontractno(String ccontractno){
	    this.ccontractno=ccontractno;
	}
	public String getCcontractno(){
	    return ccontractno;
	}
	public void setIdelayhour(Integer idelayhour){
	    this.idelayhour=idelayhour;
	}
	public Integer getIdelayhour(){
	    return idelayhour;
	}
	public void setIsdiscount(String isdiscount){
	    this.isdiscount=isdiscount;
	}
	public String getIsdiscount(){
	    return isdiscount;
	}
	public void setCcustomername(String ccustomername){
	    this.ccustomername=ccustomername;
	}
	public String getCcustomername(){
	    return ccustomername;
	}
	public void setCmembername(String cmembername){
	    this.cmembername=cmembername;
	}
	public String getCmembername(){
	    return cmembername;
	}
	public void setDept(String dept){
	    this.dept=dept;
	}
	public String getDept(){
	    return dept;
	}
	public void setCispreferent(String cispreferent){
	    this.cispreferent=cispreferent;
	}
	public String getCispreferent(){
	    return cispreferent;
	}
	public void setUguideid(String uguideid){
	    this.uguideid=uguideid;
	}
	public String getUguideid(){
	    return uguideid;
	}
}