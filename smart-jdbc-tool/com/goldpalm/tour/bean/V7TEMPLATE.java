package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * V7TEMPLATE entity for T_V7_TEMPLATE table.
 * 
 * 
 * @since 2014-02-17 17:24:44.891
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "T_V7_TEMPLATE")	
public class V7TEMPLATE implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uuid;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="content")
	private String content;
	
	public void setUuid(String uuid){
	    this.uuid=uuid;
	}
	public String getUuid(){
	    return uuid;
	}
	public void setCname(String cname){
	    this.cname=cname;
	}
	public String getCname(){
	    return cname;
	}
	public void setContent(String content){
	    this.content=content;
	}
	public String getContent(){
	    return content;
	}
}