package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CorpInsureUser entity for t_corp_insure_user table.
 * 
 * 
 * @since 2014-02-17 17:24:37.419
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_corp_insure_user")	
public class CorpInsureUser implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="cpassword")
	private String cpassword;
	
	@Column(name="ckey")
	private String ckey;
	
	@Column(name="uinterfaceid")
	private String uinterfaceid;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCcode(String ccode){
	    this.ccode=ccode;
	}
	public String getCcode(){
	    return ccode;
	}
	public void setCpassword(String cpassword){
	    this.cpassword=cpassword;
	}
	public String getCpassword(){
	    return cpassword;
	}
	public void setCkey(String ckey){
	    this.ckey=ckey;
	}
	public String getCkey(){
	    return ckey;
	}
	public void setUinterfaceid(String uinterfaceid){
	    this.uinterfaceid=uinterfaceid;
	}
	public String getUinterfaceid(){
	    return uinterfaceid;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
	public void setUcorpid(String ucorpid){
	    this.ucorpid=ucorpid;
	}
	public String getUcorpid(){
	    return ucorpid;
	}
}