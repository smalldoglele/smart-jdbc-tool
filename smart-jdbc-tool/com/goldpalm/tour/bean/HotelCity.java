package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * HotelCity entity for t_hotel_city table.
 * 
 * 
 * @since 2014-02-17 17:24:38.822
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_hotel_city")	
public class HotelCity implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String cityid;
	
	@Column(name="cityname")
	private String cityname;
	
	public void setCityid(String cityid){
	    this.cityid=cityid;
	}
	public String getCityid(){
	    return cityid;
	}
	public void setCityname(String cityname){
	    this.cityname=cityname;
	}
	public String getCityname(){
	    return cityname;
	}
}