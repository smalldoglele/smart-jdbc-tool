package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Module entity for t_module table.
 * 
 * 
 * @since 2014-02-17 17:24:40.564
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_module")	
public class Module implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cparent")
	private String cparent;
	
	@Column(name="ilevel")
	private Short ilevel;
	
	@Column(name="clevelend")
	private String clevelend;
	
	@Column(name="ccodepath")
	private String ccodepath;
	
	@Column(name="caddr")
	private String caddr;
	
	@Column(name="cparam")
	private String cparam;
	
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
	public void setCparent(String cparent){
	    this.cparent=cparent;
	}
	public String getCparent(){
	    return cparent;
	}
	public void setIlevel(Short ilevel){
	    this.ilevel=ilevel;
	}
	public Short getIlevel(){
	    return ilevel;
	}
	public void setClevelend(String clevelend){
	    this.clevelend=clevelend;
	}
	public String getClevelend(){
	    return clevelend;
	}
	public void setCcodepath(String ccodepath){
	    this.ccodepath=ccodepath;
	}
	public String getCcodepath(){
	    return ccodepath;
	}
	public void setCaddr(String caddr){
	    this.caddr=caddr;
	}
	public String getCaddr(){
	    return caddr;
	}
	public void setCparam(String cparam){
	    this.cparam=cparam;
	}
	public String getCparam(){
	    return cparam;
	}
}