package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * HotelLinkCity entity for t_hotel_link_city table.
 * 
 * 
 * @since 2014-02-17 17:24:38.916
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_hotel_link_city")	
public class HotelLinkCity implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Double pid;
	
	@Column(name="title")
	private String title;
	
	@Column(name="cityid")
	private String cityid;
	
	@Column(name="districtid")
	private String districtid;
	
	@Column(name="commercialid")
	private String commercialid;
	
	public void setPid(Double pid){
	    this.pid=pid;
	}
	public Double getPid(){
	    return pid;
	}
	public void setTitle(String title){
	    this.title=title;
	}
	public String getTitle(){
	    return title;
	}
	public void setCityid(String cityid){
	    this.cityid=cityid;
	}
	public String getCityid(){
	    return cityid;
	}
	public void setDistrictid(String districtid){
	    this.districtid=districtid;
	}
	public String getDistrictid(){
	    return districtid;
	}
	public void setCommercialid(String commercialid){
	    this.commercialid=commercialid;
	}
	public String getCommercialid(){
	    return commercialid;
	}
}