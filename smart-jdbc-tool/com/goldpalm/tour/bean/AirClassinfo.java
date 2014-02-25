package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * AirClassinfo entity for t_air_classinfo table.
 * 
 * 
 * @since 2014-02-17 17:24:35.617
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_air_classinfo")	
public class AirClassinfo implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cCarrierCode")
	private String cCarrierCode;
	
	@Column(name="cClassCode")
	private String cClassCode;
	
	@Column(name="iRebate")
	private Integer iRebate;
	
	@Column(name="cRefund")
	private String cRefund;
	
	@Column(name="cReschedule")
	private String cReschedule;
	
	@Column(name="cTransfer")
	private String cTransfer;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="dbngdate")
	private Date dbngdate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="cFightno")
	private String cFightno;
	
	@Column(name="cFights")
	private String cFights;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCCarrierCode(String cCarrierCode){
	    this.cCarrierCode=cCarrierCode;
	}
	public String getCCarrierCode(){
	    return cCarrierCode;
	}
	public void setCClassCode(String cClassCode){
	    this.cClassCode=cClassCode;
	}
	public String getCClassCode(){
	    return cClassCode;
	}
	public void setIRebate(Integer iRebate){
	    this.iRebate=iRebate;
	}
	public Integer getIRebate(){
	    return iRebate;
	}
	public void setCRefund(String cRefund){
	    this.cRefund=cRefund;
	}
	public String getCRefund(){
	    return cRefund;
	}
	public void setCReschedule(String cReschedule){
	    this.cReschedule=cReschedule;
	}
	public String getCReschedule(){
	    return cReschedule;
	}
	public void setCTransfer(String cTransfer){
	    this.cTransfer=cTransfer;
	}
	public String getCTransfer(){
	    return cTransfer;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setDbngdate(Date dbngdate){
	    this.dbngdate=dbngdate;
	}
	public Date getDbngdate(){
	    return dbngdate;
	}
	public void setDenddate(Date denddate){
	    this.denddate=denddate;
	}
	public Date getDenddate(){
	    return denddate;
	}
	public void setCFightno(String cFightno){
	    this.cFightno=cFightno;
	}
	public String getCFightno(){
	    return cFightno;
	}
	public void setCFights(String cFights){
	    this.cFights=cFights;
	}
	public String getCFights(){
	    return cFights;
	}
}