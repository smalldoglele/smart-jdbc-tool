package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Log entity for t_log table.
 * 
 * 
 * @since 2014-02-17 17:24:40.002
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_log")	
public class Log implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="usupplierid")
	private String usupplierid;
	
	@Column(name="uproductid")
	private String uproductid;
	
	@Column(name="uinterfaceid")
	private String uinterfaceid;
	
	@Column(name="upolicyid")
	private String upolicyid;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="cerror")
	private String cerror;
	
	@Column(name="dtime")
	private Date dtime;
	
	@Column(name="ifailuretimes")
	private Integer ifailuretimes;
	
	@Column(name="cxml")
	private String cxml;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUsupplierid(String usupplierid){
	    this.usupplierid=usupplierid;
	}
	public String getUsupplierid(){
	    return usupplierid;
	}
	public void setUproductid(String uproductid){
	    this.uproductid=uproductid;
	}
	public String getUproductid(){
	    return uproductid;
	}
	public void setUinterfaceid(String uinterfaceid){
	    this.uinterfaceid=uinterfaceid;
	}
	public String getUinterfaceid(){
	    return uinterfaceid;
	}
	public void setUpolicyid(String upolicyid){
	    this.upolicyid=upolicyid;
	}
	public String getUpolicyid(){
	    return upolicyid;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setCerror(String cerror){
	    this.cerror=cerror;
	}
	public String getCerror(){
	    return cerror;
	}
	public void setDtime(Date dtime){
	    this.dtime=dtime;
	}
	public Date getDtime(){
	    return dtime;
	}
	public void setIfailuretimes(Integer ifailuretimes){
	    this.ifailuretimes=ifailuretimes;
	}
	public Integer getIfailuretimes(){
	    return ifailuretimes;
	}
	public void setCxml(String cxml){
	    this.cxml=cxml;
	}
	public String getCxml(){
	    return cxml;
	}
}