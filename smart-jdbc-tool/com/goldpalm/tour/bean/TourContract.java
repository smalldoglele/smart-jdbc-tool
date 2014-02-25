package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * TourContract entity for t_tour_contract table.
 * 
 * 
 * @since 2014-02-17 17:24:44.544
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_tour_contract")	
public class TourContract implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uordertourid")
	private String uordertourid;
	
	@Column(name="cteamcode")
	private String cteamcode;
	
	@Column(name="ccontractno")
	private String ccontractno;
	
	@Column(name="namountf")
	private Double namountf;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="cfilename")
	private String cfilename;
	
	@Column(name="ucontactuserid")
	private String ucontactuserid;
	
	@Column(name="uselluserid")
	private String uselluserid;
	
	@Column(name="duploaddate")
	private Date duploaddate;
	
	@Column(name="uaudituserid")
	private String uaudituserid;
	
	@Column(name="uauditdeptid")
	private String uauditdeptid;
	
	@Column(name="dauditdate")
	private Date dauditdate;
	
	@Column(name="uroleid")
	private String uroleid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUordertourid(String uordertourid){
	    this.uordertourid=uordertourid;
	}
	public String getUordertourid(){
	    return uordertourid;
	}
	public void setCteamcode(String cteamcode){
	    this.cteamcode=cteamcode;
	}
	public String getCteamcode(){
	    return cteamcode;
	}
	public void setCcontractno(String ccontractno){
	    this.ccontractno=ccontractno;
	}
	public String getCcontractno(){
	    return ccontractno;
	}
	public void setNamountf(Double namountf){
	    this.namountf=namountf;
	}
	public Double getNamountf(){
	    return namountf;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
	public void setCfilename(String cfilename){
	    this.cfilename=cfilename;
	}
	public String getCfilename(){
	    return cfilename;
	}
	public void setUcontactuserid(String ucontactuserid){
	    this.ucontactuserid=ucontactuserid;
	}
	public String getUcontactuserid(){
	    return ucontactuserid;
	}
	public void setUselluserid(String uselluserid){
	    this.uselluserid=uselluserid;
	}
	public String getUselluserid(){
	    return uselluserid;
	}
	public void setDuploaddate(Date duploaddate){
	    this.duploaddate=duploaddate;
	}
	public Date getDuploaddate(){
	    return duploaddate;
	}
	public void setUaudituserid(String uaudituserid){
	    this.uaudituserid=uaudituserid;
	}
	public String getUaudituserid(){
	    return uaudituserid;
	}
	public void setUauditdeptid(String uauditdeptid){
	    this.uauditdeptid=uauditdeptid;
	}
	public String getUauditdeptid(){
	    return uauditdeptid;
	}
	public void setDauditdate(Date dauditdate){
	    this.dauditdate=dauditdate;
	}
	public Date getDauditdate(){
	    return dauditdate;
	}
	public void setUroleid(String uroleid){
	    this.uroleid=uroleid;
	}
	public String getUroleid(){
	    return uroleid;
	}
}