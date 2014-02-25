package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * PolicyView entity for t_policy_view table.
 * 
 * 
 * @since 2014-02-17 17:24:41.862
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_policy_view")	
public class PolicyView implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="uid")
	private String uid;
	
	@Column(name="corderid")
	private String corderid;
	
	@Column(name="nquote")
	private Double nquote;
	
	@Column(name="dbgndate")
	private Date dbgndate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="icopys")
	private Integer icopys;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="csuccessflag")
	private String csuccessflag;
	
	@Column(name="uquitsuccessflag")
	private String uquitsuccessflag;
	
	@Column(name="cupsuccessflag")
	private String cupsuccessflag;
	
	@Column(name="cproductname")
	private String cproductname;
	
	@Column(name="npremium")
	private Double npremium;
	
	@Column(name="idays")
	private Integer idays;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cinsured")
	private String cinsured;
	
	@Column(name="ccertificatetype")
	private String ccertificatetype;
	
	@Column(name="ccertificateno")
	private String ccertificateno;
	
	@Column(name="deptname")
	private String deptname;
	
	@Column(name="cquitflag")
	private String cquitflag;
	
	@Column(name="dsuccess")
	private Date dsuccess;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="suppliercode")
	private String suppliercode;
	
	@Column(name="username")
	private String username;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCorderid(String corderid){
	    this.corderid=corderid;
	}
	public String getCorderid(){
	    return corderid;
	}
	public void setNquote(Double nquote){
	    this.nquote=nquote;
	}
	public Double getNquote(){
	    return nquote;
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
	public void setIcopys(Integer icopys){
	    this.icopys=icopys;
	}
	public Integer getIcopys(){
	    return icopys;
	}
	public void setUdeptid(String udeptid){
	    this.udeptid=udeptid;
	}
	public String getUdeptid(){
	    return udeptid;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
	public void setCsuccessflag(String csuccessflag){
	    this.csuccessflag=csuccessflag;
	}
	public String getCsuccessflag(){
	    return csuccessflag;
	}
	public void setUquitsuccessflag(String uquitsuccessflag){
	    this.uquitsuccessflag=uquitsuccessflag;
	}
	public String getUquitsuccessflag(){
	    return uquitsuccessflag;
	}
	public void setCupsuccessflag(String cupsuccessflag){
	    this.cupsuccessflag=cupsuccessflag;
	}
	public String getCupsuccessflag(){
	    return cupsuccessflag;
	}
	public void setCproductname(String cproductname){
	    this.cproductname=cproductname;
	}
	public String getCproductname(){
	    return cproductname;
	}
	public void setNpremium(Double npremium){
	    this.npremium=npremium;
	}
	public Double getNpremium(){
	    return npremium;
	}
	public void setIdays(Integer idays){
	    this.idays=idays;
	}
	public Integer getIdays(){
	    return idays;
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
	public void setCinsured(String cinsured){
	    this.cinsured=cinsured;
	}
	public String getCinsured(){
	    return cinsured;
	}
	public void setCcertificatetype(String ccertificatetype){
	    this.ccertificatetype=ccertificatetype;
	}
	public String getCcertificatetype(){
	    return ccertificatetype;
	}
	public void setCcertificateno(String ccertificateno){
	    this.ccertificateno=ccertificateno;
	}
	public String getCcertificateno(){
	    return ccertificateno;
	}
	public void setDeptname(String deptname){
	    this.deptname=deptname;
	}
	public String getDeptname(){
	    return deptname;
	}
	public void setCquitflag(String cquitflag){
	    this.cquitflag=cquitflag;
	}
	public String getCquitflag(){
	    return cquitflag;
	}
	public void setDsuccess(Date dsuccess){
	    this.dsuccess=dsuccess;
	}
	public Date getDsuccess(){
	    return dsuccess;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setSuppliercode(String suppliercode){
	    this.suppliercode=suppliercode;
	}
	public String getSuppliercode(){
	    return suppliercode;
	}
	public void setUsername(String username){
	    this.username=username;
	}
	public String getUsername(){
	    return username;
	}
}