package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * User entity for t_user table.
 * 
 * 
 * @since 2014-02-17 17:24:44.721
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_user")	
public class User implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cnameen")
	private String cnameen;
	
	@Column(name="cpassword")
	private String cpassword;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="cduty")
	private String cduty;
	
	@Column(name="crank")
	private String crank;
	
	@Column(name="djoindate")
	private Date djoindate;
	
	@Column(name="cidcard")
	private String cidcard;
	
	@Column(name="csex")
	private String csex;
	
	@Column(name="dbirthday")
	private Date dbirthday;
	
	@Column(name="ceducate")
	private String ceducate;
	
	@Column(name="cofficetel")
	private String cofficetel;
	
	@Column(name="cofficefax")
	private String cofficefax;
	
	@Column(name="cofficeaddr")
	private String cofficeaddr;
	
	@Column(name="cmobiletel")
	private String cmobiletel;
	
	@Column(name="chometel")
	private String chometel;
	
	@Column(name="chomeaddr")
	private String chomeaddr;
	
	@Column(name="cemail")
	private String cemail;
	
	@Column(name="cmsn")
	private String cmsn;
	
	@Column(name="cqq")
	private String cqq;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="cemployeeno")
	private String cemployeeno;
	
	@Column(name="cmodulecode")
	private String cmodulecode;
	
	@Column(name="cavatar")
	private String cavatar;
	
	@Column(name="nverifyAmount")
	private Double nverifyAmount;
	
	@Column(name="napplyamout")
	private Double napplyamout;
	
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
	public void setCnameen(String cnameen){
	    this.cnameen=cnameen;
	}
	public String getCnameen(){
	    return cnameen;
	}
	public void setCpassword(String cpassword){
	    this.cpassword=cpassword;
	}
	public String getCpassword(){
	    return cpassword;
	}
	public void setUdeptid(String udeptid){
	    this.udeptid=udeptid;
	}
	public String getUdeptid(){
	    return udeptid;
	}
	public void setCduty(String cduty){
	    this.cduty=cduty;
	}
	public String getCduty(){
	    return cduty;
	}
	public void setCrank(String crank){
	    this.crank=crank;
	}
	public String getCrank(){
	    return crank;
	}
	public void setDjoindate(Date djoindate){
	    this.djoindate=djoindate;
	}
	public Date getDjoindate(){
	    return djoindate;
	}
	public void setCidcard(String cidcard){
	    this.cidcard=cidcard;
	}
	public String getCidcard(){
	    return cidcard;
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
	public void setCeducate(String ceducate){
	    this.ceducate=ceducate;
	}
	public String getCeducate(){
	    return ceducate;
	}
	public void setCofficetel(String cofficetel){
	    this.cofficetel=cofficetel;
	}
	public String getCofficetel(){
	    return cofficetel;
	}
	public void setCofficefax(String cofficefax){
	    this.cofficefax=cofficefax;
	}
	public String getCofficefax(){
	    return cofficefax;
	}
	public void setCofficeaddr(String cofficeaddr){
	    this.cofficeaddr=cofficeaddr;
	}
	public String getCofficeaddr(){
	    return cofficeaddr;
	}
	public void setCmobiletel(String cmobiletel){
	    this.cmobiletel=cmobiletel;
	}
	public String getCmobiletel(){
	    return cmobiletel;
	}
	public void setChometel(String chometel){
	    this.chometel=chometel;
	}
	public String getChometel(){
	    return chometel;
	}
	public void setChomeaddr(String chomeaddr){
	    this.chomeaddr=chomeaddr;
	}
	public String getChomeaddr(){
	    return chomeaddr;
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
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setCemployeeno(String cemployeeno){
	    this.cemployeeno=cemployeeno;
	}
	public String getCemployeeno(){
	    return cemployeeno;
	}
	public void setCmodulecode(String cmodulecode){
	    this.cmodulecode=cmodulecode;
	}
	public String getCmodulecode(){
	    return cmodulecode;
	}
	public void setCavatar(String cavatar){
	    this.cavatar=cavatar;
	}
	public String getCavatar(){
	    return cavatar;
	}
	public void setNverifyAmount(Double nverifyAmount){
	    this.nverifyAmount=nverifyAmount;
	}
	public Double getNverifyAmount(){
	    return nverifyAmount;
	}
	public void setNapplyamout(Double napplyamout){
	    this.napplyamout=napplyamout;
	}
	public Double getNapplyamout(){
	    return napplyamout;
	}
}