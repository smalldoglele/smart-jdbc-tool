package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * SalerPaymentApply entity for t_saler_payment_apply table.
 * 
 * 
 * @since 2014-02-17 17:24:43.015
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_saler_payment_apply")	
public class SalerPaymentApply implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="capplyno")
	private String capplyno;
	
	@Column(name="uteamid")
	private String uteamid;
	
	@Column(name="uorderid")
	private String uorderid;
	
	@Column(name="usupplierid")
	private String usupplierid;
	
	@Column(name="cobjecttype")
	private String cobjecttype;
	
	@Column(name="cprctype")
	private String cprctype;
	
	@Column(name="nprice")
	private Double nprice;
	
	@Column(name="iqty")
	private Integer iqty;
	
	@Column(name="namountf")
	private Double namountf;
	
	@Column(name="ccur")
	private String ccur;
	
	@Column(name="nexchangerate")
	private Double nexchangerate;
	
	@Column(name="namcount")
	private Double namcount;
	
	@Column(name="ddocument")
	private Date ddocument;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="dsenddate")
	private Date dsenddate;
	
	@Column(name="usenduserid")
	private String usenduserid;
	
	@Column(name="usendroleid")
	private String usendroleid;
	
	@Column(name="usenddeptid")
	private String usenddeptid;
	
	@Column(name="usendcorpid")
	private String usendcorpid;
	
	@Column(name="uconfirmuserid")
	private String uconfirmuserid;
	
	@Column(name="uconfirmroleid")
	private String uconfirmroleid;
	
	@Column(name="uconfirmdeptid")
	private String uconfirmdeptid;
	
	@Column(name="uconfirmcorpid")
	private String uconfirmcorpid;
	
	@Column(name="dconfirm")
	private Date dconfirm;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="uconnectcostid")
	private String uconnectcostid;
	
	@Column(name="cpaymode")
	private String cpaymode;
	
	@Column(name="ccheckno")
	private String ccheckno;
	
	@Column(name="ncheckamount")
	private Double ncheckamount;
	
	@Column(name="cpaysummary")
	private String cpaysummary;
	
	@Column(name="urpcorpid")
	private String urpcorpid;
	
	@Column(name="urpid")
	private String urpid;
	
	@Column(name="utransteamid")
	private String utransteamid;
	
	@Column(name="utransdeptid")
	private String utransdeptid;
	
	@Column(name="dcheck")
	private Date dcheck;
	
	@Column(name="ucheckuserid")
	private String ucheckuserid;
	
	@Column(name="ucheckroleid")
	private String ucheckroleid;
	
	@Column(name="ucheckdeptid")
	private String ucheckdeptid;
	
	@Column(name="ucheckcorpid")
	private String ucheckcorpid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCapplyno(String capplyno){
	    this.capplyno=capplyno;
	}
	public String getCapplyno(){
	    return capplyno;
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
	public void setUsupplierid(String usupplierid){
	    this.usupplierid=usupplierid;
	}
	public String getUsupplierid(){
	    return usupplierid;
	}
	public void setCobjecttype(String cobjecttype){
	    this.cobjecttype=cobjecttype;
	}
	public String getCobjecttype(){
	    return cobjecttype;
	}
	public void setCprctype(String cprctype){
	    this.cprctype=cprctype;
	}
	public String getCprctype(){
	    return cprctype;
	}
	public void setNprice(Double nprice){
	    this.nprice=nprice;
	}
	public Double getNprice(){
	    return nprice;
	}
	public void setIqty(Integer iqty){
	    this.iqty=iqty;
	}
	public Integer getIqty(){
	    return iqty;
	}
	public void setNamountf(Double namountf){
	    this.namountf=namountf;
	}
	public Double getNamountf(){
	    return namountf;
	}
	public void setCcur(String ccur){
	    this.ccur=ccur;
	}
	public String getCcur(){
	    return ccur;
	}
	public void setNexchangerate(Double nexchangerate){
	    this.nexchangerate=nexchangerate;
	}
	public Double getNexchangerate(){
	    return nexchangerate;
	}
	public void setNamcount(Double namcount){
	    this.namcount=namcount;
	}
	public Double getNamcount(){
	    return namcount;
	}
	public void setDdocument(Date ddocument){
	    this.ddocument=ddocument;
	}
	public Date getDdocument(){
	    return ddocument;
	}
	public void setUuserid(String uuserid){
	    this.uuserid=uuserid;
	}
	public String getUuserid(){
	    return uuserid;
	}
	public void setUroleid(String uroleid){
	    this.uroleid=uroleid;
	}
	public String getUroleid(){
	    return uroleid;
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
	public void setDsenddate(Date dsenddate){
	    this.dsenddate=dsenddate;
	}
	public Date getDsenddate(){
	    return dsenddate;
	}
	public void setUsenduserid(String usenduserid){
	    this.usenduserid=usenduserid;
	}
	public String getUsenduserid(){
	    return usenduserid;
	}
	public void setUsendroleid(String usendroleid){
	    this.usendroleid=usendroleid;
	}
	public String getUsendroleid(){
	    return usendroleid;
	}
	public void setUsenddeptid(String usenddeptid){
	    this.usenddeptid=usenddeptid;
	}
	public String getUsenddeptid(){
	    return usenddeptid;
	}
	public void setUsendcorpid(String usendcorpid){
	    this.usendcorpid=usendcorpid;
	}
	public String getUsendcorpid(){
	    return usendcorpid;
	}
	public void setUconfirmuserid(String uconfirmuserid){
	    this.uconfirmuserid=uconfirmuserid;
	}
	public String getUconfirmuserid(){
	    return uconfirmuserid;
	}
	public void setUconfirmroleid(String uconfirmroleid){
	    this.uconfirmroleid=uconfirmroleid;
	}
	public String getUconfirmroleid(){
	    return uconfirmroleid;
	}
	public void setUconfirmdeptid(String uconfirmdeptid){
	    this.uconfirmdeptid=uconfirmdeptid;
	}
	public String getUconfirmdeptid(){
	    return uconfirmdeptid;
	}
	public void setUconfirmcorpid(String uconfirmcorpid){
	    this.uconfirmcorpid=uconfirmcorpid;
	}
	public String getUconfirmcorpid(){
	    return uconfirmcorpid;
	}
	public void setDconfirm(Date dconfirm){
	    this.dconfirm=dconfirm;
	}
	public Date getDconfirm(){
	    return dconfirm;
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
	public void setUconnectcostid(String uconnectcostid){
	    this.uconnectcostid=uconnectcostid;
	}
	public String getUconnectcostid(){
	    return uconnectcostid;
	}
	public void setCpaymode(String cpaymode){
	    this.cpaymode=cpaymode;
	}
	public String getCpaymode(){
	    return cpaymode;
	}
	public void setCcheckno(String ccheckno){
	    this.ccheckno=ccheckno;
	}
	public String getCcheckno(){
	    return ccheckno;
	}
	public void setNcheckamount(Double ncheckamount){
	    this.ncheckamount=ncheckamount;
	}
	public Double getNcheckamount(){
	    return ncheckamount;
	}
	public void setCpaysummary(String cpaysummary){
	    this.cpaysummary=cpaysummary;
	}
	public String getCpaysummary(){
	    return cpaysummary;
	}
	public void setUrpcorpid(String urpcorpid){
	    this.urpcorpid=urpcorpid;
	}
	public String getUrpcorpid(){
	    return urpcorpid;
	}
	public void setUrpid(String urpid){
	    this.urpid=urpid;
	}
	public String getUrpid(){
	    return urpid;
	}
	public void setUtransteamid(String utransteamid){
	    this.utransteamid=utransteamid;
	}
	public String getUtransteamid(){
	    return utransteamid;
	}
	public void setUtransdeptid(String utransdeptid){
	    this.utransdeptid=utransdeptid;
	}
	public String getUtransdeptid(){
	    return utransdeptid;
	}
	public void setDcheck(Date dcheck){
	    this.dcheck=dcheck;
	}
	public Date getDcheck(){
	    return dcheck;
	}
	public void setUcheckuserid(String ucheckuserid){
	    this.ucheckuserid=ucheckuserid;
	}
	public String getUcheckuserid(){
	    return ucheckuserid;
	}
	public void setUcheckroleid(String ucheckroleid){
	    this.ucheckroleid=ucheckroleid;
	}
	public String getUcheckroleid(){
	    return ucheckroleid;
	}
	public void setUcheckdeptid(String ucheckdeptid){
	    this.ucheckdeptid=ucheckdeptid;
	}
	public String getUcheckdeptid(){
	    return ucheckdeptid;
	}
	public void setUcheckcorpid(String ucheckcorpid){
	    this.ucheckcorpid=ucheckcorpid;
	}
	public String getUcheckcorpid(){
	    return ucheckcorpid;
	}
}