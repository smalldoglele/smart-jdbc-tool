package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Advice entity for t_advice table.
 * 
 * 
 * @since 2014-02-17 17:24:35.105
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_advice")	
public class Advice implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ulineid")
	private String ulineid;
	
	@Column(name="umemberid")
	private String umemberid;
	
	@Column(name="ctelno")
	private String ctelno;
	
	@Column(name="cadvice")
	private String cadvice;
	
	@Column(name="dadvicetime")
	private Date dadvicetime;
	
	@Column(name="creply")
	private String creply;
	
	@Column(name="dreplytime")
	private Date dreplytime;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="ccontact")
	private String ccontact;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUlineid(String ulineid){
	    this.ulineid=ulineid;
	}
	public String getUlineid(){
	    return ulineid;
	}
	public void setUmemberid(String umemberid){
	    this.umemberid=umemberid;
	}
	public String getUmemberid(){
	    return umemberid;
	}
	public void setCtelno(String ctelno){
	    this.ctelno=ctelno;
	}
	public String getCtelno(){
	    return ctelno;
	}
	public void setCadvice(String cadvice){
	    this.cadvice=cadvice;
	}
	public String getCadvice(){
	    return cadvice;
	}
	public void setDadvicetime(Date dadvicetime){
	    this.dadvicetime=dadvicetime;
	}
	public Date getDadvicetime(){
	    return dadvicetime;
	}
	public void setCreply(String creply){
	    this.creply=creply;
	}
	public String getCreply(){
	    return creply;
	}
	public void setDreplytime(Date dreplytime){
	    this.dreplytime=dreplytime;
	}
	public Date getDreplytime(){
	    return dreplytime;
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
	public void setCcontact(String ccontact){
	    this.ccontact=ccontact;
	}
	public String getCcontact(){
	    return ccontact;
	}
}