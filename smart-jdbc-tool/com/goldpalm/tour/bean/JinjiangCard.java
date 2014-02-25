package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * JinjiangCard entity for t_jinjiang_card table.
 * 
 * 
 * @since 2014-02-17 17:24:39.563
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_jinjiang_card")	
public class JinjiangCard implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String cCardNo;
	
	@Column(name="cCardType")
	private String cCardType;
	
	@Column(name="cName")
	private String cName;
	
	@Column(name="cIDNumber")
	private String cIDNumber;
	
	@Column(name="cGroup")
	private String cGroup;
	
	@Column(name="cValid")
	private String cValid;
	
	@Column(name="cCardStatus")
	private String cCardStatus;
	
	@Column(name="cCardBalance")
	private String cCardBalance;
	
	@Column(name="cCardPoint")
	private Double cCardPoint;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	public void setCCardNo(String cCardNo){
	    this.cCardNo=cCardNo;
	}
	public String getCCardNo(){
	    return cCardNo;
	}
	public void setCCardType(String cCardType){
	    this.cCardType=cCardType;
	}
	public String getCCardType(){
	    return cCardType;
	}
	public void setCName(String cName){
	    this.cName=cName;
	}
	public String getCName(){
	    return cName;
	}
	public void setCIDNumber(String cIDNumber){
	    this.cIDNumber=cIDNumber;
	}
	public String getCIDNumber(){
	    return cIDNumber;
	}
	public void setCGroup(String cGroup){
	    this.cGroup=cGroup;
	}
	public String getCGroup(){
	    return cGroup;
	}
	public void setCValid(String cValid){
	    this.cValid=cValid;
	}
	public String getCValid(){
	    return cValid;
	}
	public void setCCardStatus(String cCardStatus){
	    this.cCardStatus=cCardStatus;
	}
	public String getCCardStatus(){
	    return cCardStatus;
	}
	public void setCCardBalance(String cCardBalance){
	    this.cCardBalance=cCardBalance;
	}
	public String getCCardBalance(){
	    return cCardBalance;
	}
	public void setCCardPoint(Double cCardPoint){
	    this.cCardPoint=cCardPoint;
	}
	public Double getCCardPoint(){
	    return cCardPoint;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
}