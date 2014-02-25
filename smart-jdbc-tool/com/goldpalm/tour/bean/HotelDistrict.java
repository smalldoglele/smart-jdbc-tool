package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * HotelDistrict entity for t_hotel_district table.
 * 
 * 
 * @since 2014-02-17 17:24:38.887
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_hotel_district")	
public class HotelDistrict implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String districtid;
	
	@Column(name="districtname")
	private String districtname;
	
	@Column(name="cityid")
	private String cityid;
	
	public void setDistrictid(String districtid){
	    this.districtid=districtid;
	}
	public String getDistrictid(){
	    return districtid;
	}
	public void setDistrictname(String districtname){
	    this.districtname=districtname;
	}
	public String getDistrictname(){
	    return districtname;
	}
	public void setCityid(String cityid){
	    this.cityid=cityid;
	}
	public String getCityid(){
	    return cityid;
	}
}