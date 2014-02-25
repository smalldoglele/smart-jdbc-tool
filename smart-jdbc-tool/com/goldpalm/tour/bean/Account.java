package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Account entity for t_account table.
 * 
 * 
 * @since 2014-02-17 17:24:34.651
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_account")	
public class Account implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="ccur")
	private String ccur;
	
	@Column(name="crpflag")
	private String crpflag;
	
	@Column(name="crpmode")
	private String crpmode;
	
	@Column(name="cdisable")
	private String cdisable;
	
	@Column(name="ulinkdeptid")
	private String ulinkdeptid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
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
	public void setCcur(String ccur){
	    this.ccur=ccur;
	}
	public String getCcur(){
	    return ccur;
	}
	public void setCrpflag(String crpflag){
	    this.crpflag=crpflag;
	}
	public String getCrpflag(){
	    return crpflag;
	}
	public void setCrpmode(String crpmode){
	    this.crpmode=crpmode;
	}
	public String getCrpmode(){
	    return crpmode;
	}
	public void setCdisable(String cdisable){
	    this.cdisable=cdisable;
	}
	public String getCdisable(){
	    return cdisable;
	}
	public void setUlinkdeptid(String ulinkdeptid){
	    this.ulinkdeptid=ulinkdeptid;
	}
	public String getUlinkdeptid(){
	    return ulinkdeptid;
	}
	public void setUcorpid(String ucorpid){
	    this.ucorpid=ucorpid;
	}
	public String getUcorpid(){
	    return ucorpid;
	}
}