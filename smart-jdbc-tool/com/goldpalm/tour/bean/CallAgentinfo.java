package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CallAgentinfo entity for t_call_agentinfo table.
 * 
 * 
 * @since 2014-02-17 17:24:36.190
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_call_agentinfo")	
public class CallAgentinfo implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cagentid")
	private String cagentid;
	
	@Column(name="cagentip")
	private String cagentip;
	
	@Column(name="cextensionnumber")
	private String cextensionnumber;
	
	@Column(name="telephoneip")
	private String telephoneip;
	
	@Column(name="tnid")
	private String tnid;
	
	@Column(name="queueno")
	private String queueno;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCagentid(String cagentid){
	    this.cagentid=cagentid;
	}
	public String getCagentid(){
	    return cagentid;
	}
	public void setCagentip(String cagentip){
	    this.cagentip=cagentip;
	}
	public String getCagentip(){
	    return cagentip;
	}
	public void setCextensionnumber(String cextensionnumber){
	    this.cextensionnumber=cextensionnumber;
	}
	public String getCextensionnumber(){
	    return cextensionnumber;
	}
	public void setTelephoneip(String telephoneip){
	    this.telephoneip=telephoneip;
	}
	public String getTelephoneip(){
	    return telephoneip;
	}
	public void setTnid(String tnid){
	    this.tnid=tnid;
	}
	public String getTnid(){
	    return tnid;
	}
	public void setQueueno(String queueno){
	    this.queueno=queueno;
	}
	public String getQueueno(){
	    return queueno;
	}
}