package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Code entity for t_code table.
 * 
 * 
 * @since 2014-02-17 17:24:36.838
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_code")	
public class Code implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ucodetypeid")
	private String ucodetypeid;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cnameen")
	private String cnameen;
	
	@Column(name="cnameab")
	private String cnameab;
	
	@Column(name="ndigite")
	private Double ndigite;
	
	@Column(name="ino")
	private Integer ino;
	
	@Column(name="cdefault")
	private String cdefault;
	
	@Column(name="cdisable")
	private String cdisable;
	
	@Column(name="cparam")
	private String cparam;
	
	@Column(name="nDigite2")
	private Double nDigite2;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUcodetypeid(String ucodetypeid){
	    this.ucodetypeid=ucodetypeid;
	}
	public String getUcodetypeid(){
	    return ucodetypeid;
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
	public void setNdigite(Double ndigite){
	    this.ndigite=ndigite;
	}
	public Double getNdigite(){
	    return ndigite;
	}
	public void setIno(Integer ino){
	    this.ino=ino;
	}
	public Integer getIno(){
	    return ino;
	}
	public void setCdefault(String cdefault){
	    this.cdefault=cdefault;
	}
	public String getCdefault(){
	    return cdefault;
	}
	public void setCdisable(String cdisable){
	    this.cdisable=cdisable;
	}
	public String getCdisable(){
	    return cdisable;
	}
	public void setCparam(String cparam){
	    this.cparam=cparam;
	}
	public String getCparam(){
	    return cparam;
	}
	public void setNDigite2(Double nDigite2){
	    this.nDigite2=nDigite2;
	}
	public Double getNDigite2(){
	    return nDigite2;
	}
}