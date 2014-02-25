package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Ccard entity for t_ccard table.
 * 
 * 
 * @since 2014-02-17 17:24:36.653
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_ccard")	
public class Ccard implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ccardno")
	private String ccardno;
	
	@Column(name="cmagcardno")
	private String cmagcardno;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="clevel")
	private String clevel;
	
	@Column(name="npoint")
	private Double npoint;
	
	@Column(name="namount")
	private Double namount;
	
	@Column(name="ncreditamount")
	private Double ncreditamount;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="dcreate")
	private Date dcreate;
	
	@Column(name="cpasword")
	private String cpasword;
	
	@Column(name="nrpamount")
	private Double nrpamount;
	
	@Column(name="cidcardno")
	private String cidcardno;
	
	@Column(name="ccardman")
	private String ccardman;
	
	@Column(name="dvalidate")
	private Date dvalidate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCcardno(String ccardno){
	    this.ccardno=ccardno;
	}
	public String getCcardno(){
	    return ccardno;
	}
	public void setCmagcardno(String cmagcardno){
	    this.cmagcardno=cmagcardno;
	}
	public String getCmagcardno(){
	    return cmagcardno;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setClevel(String clevel){
	    this.clevel=clevel;
	}
	public String getClevel(){
	    return clevel;
	}
	public void setNpoint(Double npoint){
	    this.npoint=npoint;
	}
	public Double getNpoint(){
	    return npoint;
	}
	public void setNamount(Double namount){
	    this.namount=namount;
	}
	public Double getNamount(){
	    return namount;
	}
	public void setNcreditamount(Double ncreditamount){
	    this.ncreditamount=ncreditamount;
	}
	public Double getNcreditamount(){
	    return ncreditamount;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
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
	public void setUroleid(String uroleid){
	    this.uroleid=uroleid;
	}
	public String getUroleid(){
	    return uroleid;
	}
	public void setUcorpid(String ucorpid){
	    this.ucorpid=ucorpid;
	}
	public String getUcorpid(){
	    return ucorpid;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setDcreate(Date dcreate){
	    this.dcreate=dcreate;
	}
	public Date getDcreate(){
	    return dcreate;
	}
	public void setCpasword(String cpasword){
	    this.cpasword=cpasword;
	}
	public String getCpasword(){
	    return cpasword;
	}
	public void setNrpamount(Double nrpamount){
	    this.nrpamount=nrpamount;
	}
	public Double getNrpamount(){
	    return nrpamount;
	}
	public void setCidcardno(String cidcardno){
	    this.cidcardno=cidcardno;
	}
	public String getCidcardno(){
	    return cidcardno;
	}
	public void setCcardman(String ccardman){
	    this.ccardman=ccardman;
	}
	public String getCcardman(){
	    return ccardman;
	}
	public void setDvalidate(Date dvalidate){
	    this.dvalidate=dvalidate;
	}
	public Date getDvalidate(){
	    return dvalidate;
	}
}