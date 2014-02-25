package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * InvoiceAheadapply entity for t_invoice_aheadapply table.
 * 
 * 
 * @since 2014-02-17 17:24:39.492
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_invoice_aheadapply")	
public class InvoiceAheadapply implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="capplycode")
	private String capplycode;
	
	@Column(name="capplycodebatch")
	private String capplycodebatch;
	
	@Column(name="capplyamount")
	private String capplyamount;
	
	@Column(name="ccustomername")
	private String ccustomername;
	
	@Column(name="cprovidername")
	private String cprovidername;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="ccontent")
	private String ccontent;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="uteamid")
	private String uteamid;
	
	@Column(name="uorderid")
	private String uorderid;
	
	@Column(name="uinvoiceid")
	private String uinvoiceid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="dcreate")
	private Date dcreate;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="dinvoicedate")
	private Date dinvoicedate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCapplycode(String capplycode){
	    this.capplycode=capplycode;
	}
	public String getCapplycode(){
	    return capplycode;
	}
	public void setCapplycodebatch(String capplycodebatch){
	    this.capplycodebatch=capplycodebatch;
	}
	public String getCapplycodebatch(){
	    return capplycodebatch;
	}
	public void setCapplyamount(String capplyamount){
	    this.capplyamount=capplyamount;
	}
	public String getCapplyamount(){
	    return capplyamount;
	}
	public void setCcustomername(String ccustomername){
	    this.ccustomername=ccustomername;
	}
	public String getCcustomername(){
	    return ccustomername;
	}
	public void setCprovidername(String cprovidername){
	    this.cprovidername=cprovidername;
	}
	public String getCprovidername(){
	    return cprovidername;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setCcontent(String ccontent){
	    this.ccontent=ccontent;
	}
	public String getCcontent(){
	    return ccontent;
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
	public void setUteamid(String uteamid){
	    this.uteamid=uteamid;
	}
	public String getUteamid(){
	    return uteamid;
	}
	public void setUorderid(String uorderid){
	    this.uorderid=uorderid;
	}
	public String getUorderid(){
	    return uorderid;
	}
	public void setUinvoiceid(String uinvoiceid){
	    this.uinvoiceid=uinvoiceid;
	}
	public String getUinvoiceid(){
	    return uinvoiceid;
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
	public void setDcreate(Date dcreate){
	    this.dcreate=dcreate;
	}
	public Date getDcreate(){
	    return dcreate;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setDinvoicedate(Date dinvoicedate){
	    this.dinvoicedate=dinvoicedate;
	}
	public Date getDinvoicedate(){
	    return dinvoicedate;
	}
}