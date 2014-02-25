package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Role entity for t_role table.
 * 
 * 
 * @since 2014-02-17 17:24:42.834
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_role")	
public class Role implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="cbusinesscode")
	private String cbusinesscode;
	
	@Column(name="cfinancecode")
	private String cfinancecode;
	
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
	public void setCname(String cname){
	    this.cname=cname;
	}
	public String getCname(){
	    return cname;
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
	public void setCbusinesscode(String cbusinesscode){
	    this.cbusinesscode=cbusinesscode;
	}
	public String getCbusinesscode(){
	    return cbusinesscode;
	}
	public void setCfinancecode(String cfinancecode){
	    this.cfinancecode=cfinancecode;
	}
	public String getCfinancecode(){
	    return cfinancecode;
	}
}