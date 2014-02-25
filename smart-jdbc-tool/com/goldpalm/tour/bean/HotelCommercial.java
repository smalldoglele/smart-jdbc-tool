package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * HotelCommercial entity for t_hotel_commercial table.
 * 
 * 
 * @since 2014-02-17 17:24:38.855
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_hotel_commercial")	
public class HotelCommercial implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String commercialid;
	
	@Column(name="commercialname")
	private String commercialname;
	
	@Column(name="cityid")
	private String cityid;
	
	public void setCommercialid(String commercialid){
	    this.commercialid=commercialid;
	}
	public String getCommercialid(){
	    return commercialid;
	}
	public void setCommercialname(String commercialname){
	    this.commercialname=commercialname;
	}
	public String getCommercialname(){
	    return commercialname;
	}
	public void setCityid(String cityid){
	    this.cityid=cityid;
	}
	public String getCityid(){
	    return cityid;
	}
}