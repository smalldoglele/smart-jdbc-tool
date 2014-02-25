package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CODECITY entity for T_CODE_CITY table.
 * 
 * 
 * @since 2014-02-17 17:24:36.872
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "T_CODE_CITY")	
public class CODECITY implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="CityCode")
	private String cityCode;
	
	@Column(name="CityNameCN")
	private String cityNameCN;
	
	@Column(name="CityNameEN")
	private String cityNameEN;
	
	public void setCityCode(String cityCode){
	    this.cityCode=cityCode;
	}
	public String getCityCode(){
	    return cityCode;
	}
	public void setCityNameCN(String cityNameCN){
	    this.cityNameCN=cityNameCN;
	}
	public String getCityNameCN(){
	    return cityNameCN;
	}
	public void setCityNameEN(String cityNameEN){
	    this.cityNameEN=cityNameEN;
	}
	public String getCityNameEN(){
	    return cityNameEN;
	}
}