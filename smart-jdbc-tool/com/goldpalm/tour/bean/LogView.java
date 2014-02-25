package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * LogView entity for t_log_view table.
 * 
 * 
 * @since 2014-02-17 17:24:40.030
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_log_view")	
public class LogView implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="uid")
	private String uid;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="cerror")
	private String cerror;
	
	@Column(name="ifailuretimes")
	private Integer ifailuretimes;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cproductname")
	private String cproductname;
	
	@Column(name="cinsured")
	private String cinsured;
	
	@Column(name="corderid")
	private String corderid;
	
	@Column(name="dtime")
	private Date dtime;
	
	@Column(name="cteamcode")
	private String cteamcode;
	
	@Column(name="upolicyid")
	private String upolicyid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
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
	public void setIfailuretimes(Integer ifailuretimes){
	    this.ifailuretimes=ifailuretimes;
	}
	public Integer getIfailuretimes(){
	    return ifailuretimes;
	}
	public void setCname(String cname){
	    this.cname=cname;
	}
	public String getCname(){
	    return cname;
	}
	public void setCproductname(String cproductname){
	    this.cproductname=cproductname;
	}
	public String getCproductname(){
	    return cproductname;
	}
	public void setCinsured(String cinsured){
	    this.cinsured=cinsured;
	}
	public String getCinsured(){
	    return cinsured;
	}
	public void setCorderid(String corderid){
	    this.corderid=corderid;
	}
	public String getCorderid(){
	    return corderid;
	}
	public void setDtime(Date dtime){
	    this.dtime=dtime;
	}
	public Date getDtime(){
	    return dtime;
	}
	public void setCteamcode(String cteamcode){
	    this.cteamcode=cteamcode;
	}
	public String getCteamcode(){
	    return cteamcode;
	}
	public void setUpolicyid(String upolicyid){
	    this.upolicyid=upolicyid;
	}
	public String getUpolicyid(){
	    return upolicyid;
	}
}