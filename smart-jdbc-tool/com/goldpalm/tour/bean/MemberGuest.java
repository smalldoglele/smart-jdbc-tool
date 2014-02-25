package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * MemberGuest entity for t_member_guest table.
 * 
 * 
 * @since 2014-02-17 17:24:40.428
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_member_guest")	
public class MemberGuest implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="umemberid")
	private String umemberid;
	
	@Column(name="cidcard")
	private String cidcard;
	
	@Column(name="carmycode")
	private String carmycode;
	
	@Column(name="ctype")
	private String ctype;
	
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
	
	@Column(name="cotherpasstype")
	private String cotherpasstype;
	
	@Column(name="cotherpasscode")
	private String cotherpasscode;
	
	@Column(name="cotherpassplace")
	private String cotherpassplace;
	
	@Column(name="dotherpassbegindate")
	private Date dotherpassbegindate;
	
	@Column(name="dotherpassenddate")
	private Date dotherpassenddate;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUmemberid(String umemberid){
	    this.umemberid=umemberid;
	}
	public String getUmemberid(){
	    return umemberid;
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
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
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
	public void setCotherpasstype(String cotherpasstype){
	    this.cotherpasstype=cotherpasstype;
	}
	public String getCotherpasstype(){
	    return cotherpasstype;
	}
	public void setCotherpasscode(String cotherpasscode){
	    this.cotherpasscode=cotherpasscode;
	}
	public String getCotherpasscode(){
	    return cotherpasscode;
	}
	public void setCotherpassplace(String cotherpassplace){
	    this.cotherpassplace=cotherpassplace;
	}
	public String getCotherpassplace(){
	    return cotherpassplace;
	}
	public void setDotherpassbegindate(Date dotherpassbegindate){
	    this.dotherpassbegindate=dotherpassbegindate;
	}
	public Date getDotherpassbegindate(){
	    return dotherpassbegindate;
	}
	public void setDotherpassenddate(Date dotherpassenddate){
	    this.dotherpassenddate=dotherpassenddate;
	}
	public Date getDotherpassenddate(){
	    return dotherpassenddate;
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
}