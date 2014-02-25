package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * AirAircrafts entity for t_air_aircrafts table.
 * 
 * 
 * @since 2014-02-17 17:24:35.167
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_air_aircrafts")	
public class AirAircrafts implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uID;
	
	@Column(name="cAircraftCode")
	private String cAircraftCode;
	
	@Column(name="cPlaneMode")
	private String cPlaneMode;
	
	@Column(name="cCompany")
	private String cCompany;
	
	@Column(name="cName")
	private String cName;
	
	@Column(name="nFeeIn")
	private Double nFeeIn;
	
	@Column(name="nFeeOut")
	private Double nFeeOut;
	
	public void setUID(String uID){
	    this.uID=uID;
	}
	public String getUID(){
	    return uID;
	}
	public void setCAircraftCode(String cAircraftCode){
	    this.cAircraftCode=cAircraftCode;
	}
	public String getCAircraftCode(){
	    return cAircraftCode;
	}
	public void setCPlaneMode(String cPlaneMode){
	    this.cPlaneMode=cPlaneMode;
	}
	public String getCPlaneMode(){
	    return cPlaneMode;
	}
	public void setCCompany(String cCompany){
	    this.cCompany=cCompany;
	}
	public String getCCompany(){
	    return cCompany;
	}
	public void setCName(String cName){
	    this.cName=cName;
	}
	public String getCName(){
	    return cName;
	}
	public void setNFeeIn(Double nFeeIn){
	    this.nFeeIn=nFeeIn;
	}
	public Double getNFeeIn(){
	    return nFeeIn;
	}
	public void setNFeeOut(Double nFeeOut){
	    this.nFeeOut=nFeeOut;
	}
	public Double getNFeeOut(){
	    return nFeeOut;
	}
}