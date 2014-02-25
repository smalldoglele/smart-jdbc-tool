package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * AirCarriers entity for t_air_carriers table.
 * 
 * 
 * @since 2014-02-17 17:24:35.538
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_air_carriers")	
public class AirCarriers implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uID;
	
	@Column(name="cCarrierCode")
	private String cCarrierCode;
	
	@Column(name="cAirline3Code")
	private String cAirline3Code;
	
	@Column(name="cCName")
	private String cCName;
	
	@Column(name="cEName")
	private String cEName;
	
	@Column(name="cNation")
	private String cNation;
	
	@Column(name="iValid")
	private Integer iValid;
	
	@Column(name="iSort")
	private Integer iSort;
	
	@Column(name="cCShortName")
	private String cCShortName;
	
	public void setUID(String uID){
	    this.uID=uID;
	}
	public String getUID(){
	    return uID;
	}
	public void setCCarrierCode(String cCarrierCode){
	    this.cCarrierCode=cCarrierCode;
	}
	public String getCCarrierCode(){
	    return cCarrierCode;
	}
	public void setCAirline3Code(String cAirline3Code){
	    this.cAirline3Code=cAirline3Code;
	}
	public String getCAirline3Code(){
	    return cAirline3Code;
	}
	public void setCCName(String cCName){
	    this.cCName=cCName;
	}
	public String getCCName(){
	    return cCName;
	}
	public void setCEName(String cEName){
	    this.cEName=cEName;
	}
	public String getCEName(){
	    return cEName;
	}
	public void setCNation(String cNation){
	    this.cNation=cNation;
	}
	public String getCNation(){
	    return cNation;
	}
	public void setIValid(Integer iValid){
	    this.iValid=iValid;
	}
	public Integer getIValid(){
	    return iValid;
	}
	public void setISort(Integer iSort){
	    this.iSort=iSort;
	}
	public Integer getISort(){
	    return iSort;
	}
	public void setCCShortName(String cCShortName){
	    this.cCShortName=cCShortName;
	}
	public String getCCShortName(){
	    return cCShortName;
	}
}