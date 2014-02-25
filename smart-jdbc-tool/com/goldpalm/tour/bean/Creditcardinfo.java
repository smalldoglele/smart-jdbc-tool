package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Creditcardinfo entity for t_creditcardinfo table.
 * 
 * 
 * @since 2014-02-17 17:24:38.006
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_creditcardinfo")	
public class Creditcardinfo implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cassid")
	private String cassid;
	
	@Column(name="cbankname")
	private String cbankname;
	
	@Column(name="cbankgateid")
	private String cbankgateid;
	
	@Column(name="ccardno")
	private String ccardno;
	
	@Column(name="cvaliddate")
	private String cvaliddate;
	
	@Column(name="ccvv2")
	private String ccvv2;
	
	@Column(name="ccardholdername")
	private String ccardholdername;
	
	@Column(name="ccardholderidtype")
	private String ccardholderidtype;
	
	@Column(name="ccardholderidno")
	private String ccardholderidno;
	
	@Column(name="cencryptcardinfo")
	private String cencryptcardinfo;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCassid(String cassid){
	    this.cassid=cassid;
	}
	public String getCassid(){
	    return cassid;
	}
	public void setCbankname(String cbankname){
	    this.cbankname=cbankname;
	}
	public String getCbankname(){
	    return cbankname;
	}
	public void setCbankgateid(String cbankgateid){
	    this.cbankgateid=cbankgateid;
	}
	public String getCbankgateid(){
	    return cbankgateid;
	}
	public void setCcardno(String ccardno){
	    this.ccardno=ccardno;
	}
	public String getCcardno(){
	    return ccardno;
	}
	public void setCvaliddate(String cvaliddate){
	    this.cvaliddate=cvaliddate;
	}
	public String getCvaliddate(){
	    return cvaliddate;
	}
	public void setCcvv2(String ccvv2){
	    this.ccvv2=ccvv2;
	}
	public String getCcvv2(){
	    return ccvv2;
	}
	public void setCcardholdername(String ccardholdername){
	    this.ccardholdername=ccardholdername;
	}
	public String getCcardholdername(){
	    return ccardholdername;
	}
	public void setCcardholderidtype(String ccardholderidtype){
	    this.ccardholderidtype=ccardholderidtype;
	}
	public String getCcardholderidtype(){
	    return ccardholderidtype;
	}
	public void setCcardholderidno(String ccardholderidno){
	    this.ccardholderidno=ccardholderidno;
	}
	public String getCcardholderidno(){
	    return ccardholderidno;
	}
	public void setCencryptcardinfo(String cencryptcardinfo){
	    this.cencryptcardinfo=cencryptcardinfo;
	}
	public String getCencryptcardinfo(){
	    return cencryptcardinfo;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
}