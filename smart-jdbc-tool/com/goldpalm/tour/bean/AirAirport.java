package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * AirAirport entity for t_air_airport table.
 * 
 * 
 * @since 2014-02-17 17:24:35.218
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_air_airport")	
public class AirAirport implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uID;
	
	@Column(name="cAirportCode")
	private String cAirportCode;
	
	@Column(name="cCityCode")
	private String cCityCode;
	
	@Column(name="cIsCityCode")
	private String cIsCityCode;
	
	@Column(name="cAirportName")
	private String cAirportName;
	
	@Column(name="cEName")
	private String cEName;
	
	@Column(name="cCountryCode")
	private String cCountryCode;
	
	@Column(name="cCityName")
	private String cCityName;
	
	@Column(name="cCityEName")
	private String cCityEName;
	
	public void setUID(String uID){
	    this.uID=uID;
	}
	public String getUID(){
	    return uID;
	}
	public void setCAirportCode(String cAirportCode){
	    this.cAirportCode=cAirportCode;
	}
	public String getCAirportCode(){
	    return cAirportCode;
	}
	public void setCCityCode(String cCityCode){
	    this.cCityCode=cCityCode;
	}
	public String getCCityCode(){
	    return cCityCode;
	}
	public void setCIsCityCode(String cIsCityCode){
	    this.cIsCityCode=cIsCityCode;
	}
	public String getCIsCityCode(){
	    return cIsCityCode;
	}
	public void setCAirportName(String cAirportName){
	    this.cAirportName=cAirportName;
	}
	public String getCAirportName(){
	    return cAirportName;
	}
	public void setCEName(String cEName){
	    this.cEName=cEName;
	}
	public String getCEName(){
	    return cEName;
	}
	public void setCCountryCode(String cCountryCode){
	    this.cCountryCode=cCountryCode;
	}
	public String getCCountryCode(){
	    return cCountryCode;
	}
	public void setCCityName(String cCityName){
	    this.cCityName=cCityName;
	}
	public String getCCityName(){
	    return cCityName;
	}
	public void setCCityEName(String cCityEName){
	    this.cCityEName=cCityEName;
	}
	public String getCCityEName(){
	    return cCityEName;
	}
}