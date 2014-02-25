package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * PolicyQueue entity for t_policy_queue table.
 * 
 * 
 * @since 2014-02-17 17:24:41.834
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_policy_queue")	
public class PolicyQueue implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="upolicyid")
	private String upolicyid;
	
	@Column(name="dtime")
	private Date dtime;
	
	@Column(name="itrytimes")
	private Integer itrytimes;
	
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
	public void setUpolicyid(String upolicyid){
	    this.upolicyid=upolicyid;
	}
	public String getUpolicyid(){
	    return upolicyid;
	}
	public void setDtime(Date dtime){
	    this.dtime=dtime;
	}
	public Date getDtime(){
	    return dtime;
	}
	public void setItrytimes(Integer itrytimes){
	    this.itrytimes=itrytimes;
	}
	public Integer getItrytimes(){
	    return itrytimes;
	}
}