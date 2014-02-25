package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * GuiderRender entity for t_guider_render table.
 * 
 * 
 * @since 2014-02-17 17:24:38.745
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_guider_render")	
public class GuiderRender implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cflag")
	private String cflag;
	
	@Column(name="uteamid")
	private String uteamid;
	
	@Column(name="coptype")
	private String coptype;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="cpromode")
	private String cpromode;
	
	@Column(name="cur")
	private String cur;
	
	@Column(name="nsingleprice")
	private Double nsingleprice;
	
	@Column(name="nqty")
	private Double nqty;
	
	@Column(name="namount")
	private Double namount;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="uguideid")
	private String uguideid;
	
	@Column(name="cconfirm")
	private String cconfirm;
	
	@Column(name="dconfirm")
	private Date dconfirm;
	
	@Column(name="uconfirmcorpid")
	private String uconfirmcorpid;
	
	@Column(name="uconfirmdeptid")
	private String uconfirmdeptid;
	
	@Column(name="uconfirmroleid")
	private String uconfirmroleid;
	
	@Column(name="uconfirmuserid")
	private String uconfirmuserid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCflag(String cflag){
	    this.cflag=cflag;
	}
	public String getCflag(){
	    return cflag;
	}
	public void setUteamid(String uteamid){
	    this.uteamid=uteamid;
	}
	public String getUteamid(){
	    return uteamid;
	}
	public void setCoptype(String coptype){
	    this.coptype=coptype;
	}
	public String getCoptype(){
	    return coptype;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setCpromode(String cpromode){
	    this.cpromode=cpromode;
	}
	public String getCpromode(){
	    return cpromode;
	}
	public void setCur(String cur){
	    this.cur=cur;
	}
	public String getCur(){
	    return cur;
	}
	public void setNsingleprice(Double nsingleprice){
	    this.nsingleprice=nsingleprice;
	}
	public Double getNsingleprice(){
	    return nsingleprice;
	}
	public void setNqty(Double nqty){
	    this.nqty=nqty;
	}
	public Double getNqty(){
	    return nqty;
	}
	public void setNamount(Double namount){
	    this.namount=namount;
	}
	public Double getNamount(){
	    return namount;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setUcorpid(String ucorpid){
	    this.ucorpid=ucorpid;
	}
	public String getUcorpid(){
	    return ucorpid;
	}
	public void setUdeptid(String udeptid){
	    this.udeptid=udeptid;
	}
	public String getUdeptid(){
	    return udeptid;
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
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setUguideid(String uguideid){
	    this.uguideid=uguideid;
	}
	public String getUguideid(){
	    return uguideid;
	}
	public void setCconfirm(String cconfirm){
	    this.cconfirm=cconfirm;
	}
	public String getCconfirm(){
	    return cconfirm;
	}
	public void setDconfirm(Date dconfirm){
	    this.dconfirm=dconfirm;
	}
	public Date getDconfirm(){
	    return dconfirm;
	}
	public void setUconfirmcorpid(String uconfirmcorpid){
	    this.uconfirmcorpid=uconfirmcorpid;
	}
	public String getUconfirmcorpid(){
	    return uconfirmcorpid;
	}
	public void setUconfirmdeptid(String uconfirmdeptid){
	    this.uconfirmdeptid=uconfirmdeptid;
	}
	public String getUconfirmdeptid(){
	    return uconfirmdeptid;
	}
	public void setUconfirmroleid(String uconfirmroleid){
	    this.uconfirmroleid=uconfirmroleid;
	}
	public String getUconfirmroleid(){
	    return uconfirmroleid;
	}
	public void setUconfirmuserid(String uconfirmuserid){
	    this.uconfirmuserid=uconfirmuserid;
	}
	public String getUconfirmuserid(){
	    return uconfirmuserid;
	}
}