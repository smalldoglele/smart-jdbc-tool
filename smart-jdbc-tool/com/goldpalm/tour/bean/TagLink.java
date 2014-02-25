package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * TagLink entity for t_tag_link table.
 * 
 * 
 * @since 2014-02-17 17:24:43.276
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_tag_link")	
public class TagLink implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="utagid")
	private String utagid;
	
	@Column(name="uinfoid")
	private String uinfoid;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUtagid(String utagid){
	    this.utagid=utagid;
	}
	public String getUtagid(){
	    return utagid;
	}
	public void setUinfoid(String uinfoid){
	    this.uinfoid=uinfoid;
	}
	public String getUinfoid(){
	    return uinfoid;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setUuserid(String uuserid){
	    this.uuserid=uuserid;
	}
	public String getUuserid(){
	    return uuserid;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
}