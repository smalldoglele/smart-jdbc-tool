package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Dept entity for t_dept table.
 * 
 * 
 * @since 2014-02-17 17:24:38.192
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_dept")	
public class Dept implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cparentcode")
	private String cparentcode;
	
	@Column(name="ilevel")
	private Integer ilevel;
	
	@Column(name="ccodepath")
	private String ccodepath;
	
	@Column(name="iagentlevel")
	private Short iagentlevel;
	
	@Column(name="cbusinesscode")
	private String cbusinesscode;
	
	@Column(name="cfinancecode")
	private String cfinancecode;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="caddress")
	private String caddress;
	
	@Column(name="cworktime")
	private String cworktime;
	
	@Column(name="cworktel1")
	private String cworktel1;
	
	@Column(name="cworktel2")
	private String cworktel2;
	
	@Column(name="cservicesrange")
	private String cservicesrange;
	
	@Column(name="carea")
	private String carea;
	
	@Column(name="cpicpath")
	private String cpicpath;
	
	@Column(name="cmicropicpath")
	private String cmicropicpath;
	
	@Column(name="cfax")
	private String cfax;
	
	@Column(name="czipcode")
	private String czipcode;
	
	@Column(name="cordercode")
	private String cordercode;
	
	@Column(name="clongitude")
	private String clongitude;
	
	@Column(name="cdimension")
	private String cdimension;
	
	@Column(name="cemail")
	private String cemail;
	
	@Column(name="creserve1")
	private String creserve1;
	
	@Column(name="creserve2")
	private String creserve2;
	
	@Column(name="creserve3")
	private String creserve3;
	
	@Column(name="ncreditlimit")
	private Double ncreditlimit;
	
	@Column(name="corp")
	private String corp;
	
	@Column(name="nadvancedeposit")
	private Double nadvancedeposit;
	
	@Column(name="ndebitlimit")
	private Double ndebitlimit;
	
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
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
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
	public void setCparentcode(String cparentcode){
	    this.cparentcode=cparentcode;
	}
	public String getCparentcode(){
	    return cparentcode;
	}
	public void setIlevel(Integer ilevel){
	    this.ilevel=ilevel;
	}
	public Integer getIlevel(){
	    return ilevel;
	}
	public void setCcodepath(String ccodepath){
	    this.ccodepath=ccodepath;
	}
	public String getCcodepath(){
	    return ccodepath;
	}
	public void setIagentlevel(Short iagentlevel){
	    this.iagentlevel=iagentlevel;
	}
	public Short getIagentlevel(){
	    return iagentlevel;
	}
	public void setCbusinesscode(String cbusinesscode){
	    this.cbusinesscode=cbusinesscode;
	}
	public String getCbusinesscode(){
	    return cbusinesscode;
	}
	public void setCfinancecode(String cfinancecode){
	    this.cfinancecode=cfinancecode;
	}
	public String getCfinancecode(){
	    return cfinancecode;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setCaddress(String caddress){
	    this.caddress=caddress;
	}
	public String getCaddress(){
	    return caddress;
	}
	public void setCworktime(String cworktime){
	    this.cworktime=cworktime;
	}
	public String getCworktime(){
	    return cworktime;
	}
	public void setCworktel1(String cworktel1){
	    this.cworktel1=cworktel1;
	}
	public String getCworktel1(){
	    return cworktel1;
	}
	public void setCworktel2(String cworktel2){
	    this.cworktel2=cworktel2;
	}
	public String getCworktel2(){
	    return cworktel2;
	}
	public void setCservicesrange(String cservicesrange){
	    this.cservicesrange=cservicesrange;
	}
	public String getCservicesrange(){
	    return cservicesrange;
	}
	public void setCarea(String carea){
	    this.carea=carea;
	}
	public String getCarea(){
	    return carea;
	}
	public void setCpicpath(String cpicpath){
	    this.cpicpath=cpicpath;
	}
	public String getCpicpath(){
	    return cpicpath;
	}
	public void setCmicropicpath(String cmicropicpath){
	    this.cmicropicpath=cmicropicpath;
	}
	public String getCmicropicpath(){
	    return cmicropicpath;
	}
	public void setCfax(String cfax){
	    this.cfax=cfax;
	}
	public String getCfax(){
	    return cfax;
	}
	public void setCzipcode(String czipcode){
	    this.czipcode=czipcode;
	}
	public String getCzipcode(){
	    return czipcode;
	}
	public void setCordercode(String cordercode){
	    this.cordercode=cordercode;
	}
	public String getCordercode(){
	    return cordercode;
	}
	public void setClongitude(String clongitude){
	    this.clongitude=clongitude;
	}
	public String getClongitude(){
	    return clongitude;
	}
	public void setCdimension(String cdimension){
	    this.cdimension=cdimension;
	}
	public String getCdimension(){
	    return cdimension;
	}
	public void setCemail(String cemail){
	    this.cemail=cemail;
	}
	public String getCemail(){
	    return cemail;
	}
	public void setCreserve1(String creserve1){
	    this.creserve1=creserve1;
	}
	public String getCreserve1(){
	    return creserve1;
	}
	public void setCreserve2(String creserve2){
	    this.creserve2=creserve2;
	}
	public String getCreserve2(){
	    return creserve2;
	}
	public void setCreserve3(String creserve3){
	    this.creserve3=creserve3;
	}
	public String getCreserve3(){
	    return creserve3;
	}
	public void setNcreditlimit(Double ncreditlimit){
	    this.ncreditlimit=ncreditlimit;
	}
	public Double getNcreditlimit(){
	    return ncreditlimit;
	}
	public void setCorp(String corp){
	    this.corp=corp;
	}
	public String getCorp(){
	    return corp;
	}
	public void setNadvancedeposit(Double nadvancedeposit){
	    this.nadvancedeposit=nadvancedeposit;
	}
	public Double getNadvancedeposit(){
	    return nadvancedeposit;
	}
	public void setNdebitlimit(Double ndebitlimit){
	    this.ndebitlimit=ndebitlimit;
	}
	public Double getNdebitlimit(){
	    return ndebitlimit;
	}
}