package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * KnowledgeLink entity for t_knowledge_link table.
 * 
 * 
 * @since 2014-02-17 17:24:39.639
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_knowledge_link")	
public class KnowledgeLink implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="ulinkid")
	private String ulinkid;
	
	@Column(name="ctitle")
	private String ctitle;
	
	@Column(name="uknowledgeid")
	private String uknowledgeid;
	
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
	public void setUlinkid(String ulinkid){
	    this.ulinkid=ulinkid;
	}
	public String getUlinkid(){
	    return ulinkid;
	}
	public void setCtitle(String ctitle){
	    this.ctitle=ctitle;
	}
	public String getCtitle(){
	    return ctitle;
	}
	public void setUknowledgeid(String uknowledgeid){
	    this.uknowledgeid=uknowledgeid;
	}
	public String getUknowledgeid(){
	    return uknowledgeid;
	}
}