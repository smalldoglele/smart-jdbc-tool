package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Knowledge entity for t_knowledge table.
 * 
 * 
 * @since 2014-02-17 17:24:39.605
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_knowledge")	
public class Knowledge implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cnation")
	private String cnation;
	
	@Column(name="cstate")
	private String cstate;
	
	@Column(name="ccity")
	private String ccity;
	
	@Column(name="ckind")
	private String ckind;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="ctitle")
	private String ctitle;
	
	@Column(name="cbody")
	private String cbody;
	
	@Column(name="cpicpath")
	private String cpicpath;
	
	@Column(name="cmicropicpath")
	private String cmicropicpath;
	
	@Column(name="cattachpath")
	private String cattachpath;
	
	@Column(name="cattachmemo")
	private String cattachmemo;
	
	@Column(name="cissue")
	private String cissue;
	
	@Column(name="csender")
	private String csender;
	
	@Column(name="dsend")
	private Date dsend;
	
	@Column(name="ckey")
	private String ckey;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="nprice")
	private Double nprice;
	
	@Column(name="cstaydays")
	private String cstaydays;
	
	@Column(name="ihandledays")
	private Integer ihandledays;
	
	@Column(name="cvaliddays")
	private String cvaliddays;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCnation(String cnation){
	    this.cnation=cnation;
	}
	public String getCnation(){
	    return cnation;
	}
	public void setCstate(String cstate){
	    this.cstate=cstate;
	}
	public String getCstate(){
	    return cstate;
	}
	public void setCcity(String ccity){
	    this.ccity=ccity;
	}
	public String getCcity(){
	    return ccity;
	}
	public void setCkind(String ckind){
	    this.ckind=ckind;
	}
	public String getCkind(){
	    return ckind;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setCtitle(String ctitle){
	    this.ctitle=ctitle;
	}
	public String getCtitle(){
	    return ctitle;
	}
	public void setCbody(String cbody){
	    this.cbody=cbody;
	}
	public String getCbody(){
	    return cbody;
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
	public void setCattachpath(String cattachpath){
	    this.cattachpath=cattachpath;
	}
	public String getCattachpath(){
	    return cattachpath;
	}
	public void setCattachmemo(String cattachmemo){
	    this.cattachmemo=cattachmemo;
	}
	public String getCattachmemo(){
	    return cattachmemo;
	}
	public void setCissue(String cissue){
	    this.cissue=cissue;
	}
	public String getCissue(){
	    return cissue;
	}
	public void setCsender(String csender){
	    this.csender=csender;
	}
	public String getCsender(){
	    return csender;
	}
	public void setDsend(Date dsend){
	    this.dsend=dsend;
	}
	public Date getDsend(){
	    return dsend;
	}
	public void setCkey(String ckey){
	    this.ckey=ckey;
	}
	public String getCkey(){
	    return ckey;
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
	public void setNprice(Double nprice){
	    this.nprice=nprice;
	}
	public Double getNprice(){
	    return nprice;
	}
	public void setCstaydays(String cstaydays){
	    this.cstaydays=cstaydays;
	}
	public String getCstaydays(){
	    return cstaydays;
	}
	public void setIhandledays(Integer ihandledays){
	    this.ihandledays=ihandledays;
	}
	public Integer getIhandledays(){
	    return ihandledays;
	}
	public void setCvaliddays(String cvaliddays){
	    this.cvaliddays=cvaliddays;
	}
	public String getCvaliddays(){
	    return cvaliddays;
	}
}