package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CorpAccount entity for t_corp_account table.
 * 
 * 
 * @since 2014-02-17 17:24:37.386
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_corp_account")	
public class CorpAccount implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="cbank")
	private String cbank;
	
	@Column(name="cbankaddr")
	private String cbankaddr;
	
	@Column(name="caccountnumber")
	private String caccountnumber;
	
	@Column(name="caccountname")
	private String caccountname;
	
	@Column(name="cbusinesscode")
	private String cbusinesscode;
	
	@Column(name="cfinancecode")
	private String cfinancecode;
	
	@Column(name="cmemo")
	private String cmemo;
	
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
	public void setCbank(String cbank){
	    this.cbank=cbank;
	}
	public String getCbank(){
	    return cbank;
	}
	public void setCbankaddr(String cbankaddr){
	    this.cbankaddr=cbankaddr;
	}
	public String getCbankaddr(){
	    return cbankaddr;
	}
	public void setCaccountnumber(String caccountnumber){
	    this.caccountnumber=caccountnumber;
	}
	public String getCaccountnumber(){
	    return caccountnumber;
	}
	public void setCaccountname(String caccountname){
	    this.caccountname=caccountname;
	}
	public String getCaccountname(){
	    return caccountname;
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
}