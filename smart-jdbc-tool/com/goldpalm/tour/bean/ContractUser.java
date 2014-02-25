package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * ContractUser entity for T_Contract_User table.
 * 
 * 
 * @since 2014-02-17 17:24:37.253
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "T_Contract_User")	
public class ContractUser implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="cpassword")
	private String cpassword;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUuserid(String uuserid){
	    this.uuserid=uuserid;
	}
	public String getUuserid(){
	    return uuserid;
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
	public void setUcorpid(String ucorpid){
	    this.ucorpid=ucorpid;
	}
	public String getUcorpid(){
	    return ucorpid;
	}
}