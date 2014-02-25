package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CorpRelationship entity for t_corp_relationship table.
 * 
 * 
 * @since 2014-02-17 17:24:37.633
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_corp_relationship")	
public class CorpRelationship implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ucorpP")
	private String ucorpP;
	
	@Column(name="ucorpR")
	private String ucorpR;
	
	@Column(name="usupplierid")
	private String usupplierid;
	
	@Column(name="ucustomerid")
	private String ucustomerid;
	
	@Column(name="cisinterior")
	private String cisinterior;
	
	@Column(name="cName")
	private String cName;
	
	@Column(name="cNameEn")
	private String cNameEn;
	
	@Column(name="cNameAb")
	private String cNameAb;
	
	@Column(name="cPrincipal")
	private String cPrincipal;
	
	@Column(name="cTaxNo")
	private String cTaxNo;
	
	@Column(name="cAddr")
	private String cAddr;
	
	@Column(name="cZip")
	private String cZip;
	
	@Column(name="cFax")
	private String cFax;
	
	@Column(name="cTelGeneral")
	private String cTelGeneral;
	
	@Column(name="cTelGuard")
	private String cTelGuard;
	
	@Column(name="cEmail")
	private String cEmail;
	
	@Column(name="cWebSite")
	private String cWebSite;
	
	@Column(name="cMemo")
	private String cMemo;
	
	@Column(name="Cissupplier")
	private String cissupplier;
	
	@Column(name="Ciscustomer")
	private String ciscustomer;
	
	@Column(name="Cop")
	private String cop;
	
	@Column(name="Doptime")
	private Date doptime;
	
	@Column(name="Duptime")
	private Date duptime;
	
	@Column(name="cstate")
	private String cstate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUcorpP(String ucorpP){
	    this.ucorpP=ucorpP;
	}
	public String getUcorpP(){
	    return ucorpP;
	}
	public void setUcorpR(String ucorpR){
	    this.ucorpR=ucorpR;
	}
	public String getUcorpR(){
	    return ucorpR;
	}
	public void setUsupplierid(String usupplierid){
	    this.usupplierid=usupplierid;
	}
	public String getUsupplierid(){
	    return usupplierid;
	}
	public void setUcustomerid(String ucustomerid){
	    this.ucustomerid=ucustomerid;
	}
	public String getUcustomerid(){
	    return ucustomerid;
	}
	public void setCisinterior(String cisinterior){
	    this.cisinterior=cisinterior;
	}
	public String getCisinterior(){
	    return cisinterior;
	}
	public void setCName(String cName){
	    this.cName=cName;
	}
	public String getCName(){
	    return cName;
	}
	public void setCNameEn(String cNameEn){
	    this.cNameEn=cNameEn;
	}
	public String getCNameEn(){
	    return cNameEn;
	}
	public void setCNameAb(String cNameAb){
	    this.cNameAb=cNameAb;
	}
	public String getCNameAb(){
	    return cNameAb;
	}
	public void setCPrincipal(String cPrincipal){
	    this.cPrincipal=cPrincipal;
	}
	public String getCPrincipal(){
	    return cPrincipal;
	}
	public void setCTaxNo(String cTaxNo){
	    this.cTaxNo=cTaxNo;
	}
	public String getCTaxNo(){
	    return cTaxNo;
	}
	public void setCAddr(String cAddr){
	    this.cAddr=cAddr;
	}
	public String getCAddr(){
	    return cAddr;
	}
	public void setCZip(String cZip){
	    this.cZip=cZip;
	}
	public String getCZip(){
	    return cZip;
	}
	public void setCFax(String cFax){
	    this.cFax=cFax;
	}
	public String getCFax(){
	    return cFax;
	}
	public void setCTelGeneral(String cTelGeneral){
	    this.cTelGeneral=cTelGeneral;
	}
	public String getCTelGeneral(){
	    return cTelGeneral;
	}
	public void setCTelGuard(String cTelGuard){
	    this.cTelGuard=cTelGuard;
	}
	public String getCTelGuard(){
	    return cTelGuard;
	}
	public void setCEmail(String cEmail){
	    this.cEmail=cEmail;
	}
	public String getCEmail(){
	    return cEmail;
	}
	public void setCWebSite(String cWebSite){
	    this.cWebSite=cWebSite;
	}
	public String getCWebSite(){
	    return cWebSite;
	}
	public void setCMemo(String cMemo){
	    this.cMemo=cMemo;
	}
	public String getCMemo(){
	    return cMemo;
	}
	public void setCissupplier(String cissupplier){
	    this.cissupplier=cissupplier;
	}
	public String getCissupplier(){
	    return cissupplier;
	}
	public void setCiscustomer(String ciscustomer){
	    this.ciscustomer=ciscustomer;
	}
	public String getCiscustomer(){
	    return ciscustomer;
	}
	public void setCop(String cop){
	    this.cop=cop;
	}
	public String getCop(){
	    return cop;
	}
	public void setDoptime(Date doptime){
	    this.doptime=doptime;
	}
	public Date getDoptime(){
	    return doptime;
	}
	public void setDuptime(Date duptime){
	    this.duptime=duptime;
	}
	public Date getDuptime(){
	    return duptime;
	}
	public void setCstate(String cstate){
	    this.cstate=cstate;
	}
	public String getCstate(){
	    return cstate;
	}
}