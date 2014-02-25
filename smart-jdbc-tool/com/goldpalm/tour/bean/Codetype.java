package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Codetype entity for t_codetype table.
 * 
 * 
 * @since 2014-02-17 17:24:36.994
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_codetype")	
public class Codetype implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cnameen")
	private String cnameen;
	
	@Column(name="cnameab")
	private String cnameab;
	
	@Column(name="cparent")
	private String cparent;
	
	@Column(name="ilevel")
	private Short ilevel;
	
	@Column(name="clevelend")
	private String clevelend;
	
	@Column(name="ccodepath")
	private String ccodepath;
	
	@Column(name="ino")
	private Integer ino;
	
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
	public void setCnameen(String cnameen){
	    this.cnameen=cnameen;
	}
	public String getCnameen(){
	    return cnameen;
	}
	public void setCnameab(String cnameab){
	    this.cnameab=cnameab;
	}
	public String getCnameab(){
	    return cnameab;
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
	public void setIno(Integer ino){
	    this.ino=ino;
	}
	public Integer getIno(){
	    return ino;
	}
}