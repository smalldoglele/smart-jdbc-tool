package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CODECOUNTRYS entity for T_CODE_COUNTRYS table.
 * 
 * 
 * @since 2014-02-17 17:24:36.902
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "T_CODE_COUNTRYS")	
public class CODECOUNTRYS implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="CountryCode")
	private String countryCode;
	
	@Column(name="CountryCName")
	private String countryCName;
	
	@Column(name="CountryEName")
	private String countryEName;
	
	public void setCountryCode(String countryCode){
	    this.countryCode=countryCode;
	}
	public String getCountryCode(){
	    return countryCode;
	}
	public void setCountryCName(String countryCName){
	    this.countryCName=countryCName;
	}
	public String getCountryCName(){
	    return countryCName;
	}
	public void setCountryEName(String countryEName){
	    this.countryEName=countryEName;
	}
	public String getCountryEName(){
	    return countryEName;
	}
}