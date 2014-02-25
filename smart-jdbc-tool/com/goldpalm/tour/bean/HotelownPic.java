package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * HotelownPic entity for t_hotelown_pic table.
 * 
 * 
 * @since 2014-02-17 17:24:39.079
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_hotelown_pic")	
public class HotelownPic implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uuid;
	
	@Column(name="hotelownuid")
	private String hotelownuid;
	
	@Column(name="cpictype")
	private String cpictype;
	
	@Column(name="cdisplaytype")
	private String cdisplaytype;
	
	@Column(name="cpicdescribe")
	private String cpicdescribe;
	
	@Column(name="cpicpath")
	private String cpicpath;
	
	@Column(name="cmicropicpath")
	private String cmicropicpath;
	
	public void setUuid(String uuid){
	    this.uuid=uuid;
	}
	public String getUuid(){
	    return uuid;
	}
	public void setHotelownuid(String hotelownuid){
	    this.hotelownuid=hotelownuid;
	}
	public String getHotelownuid(){
	    return hotelownuid;
	}
	public void setCpictype(String cpictype){
	    this.cpictype=cpictype;
	}
	public String getCpictype(){
	    return cpictype;
	}
	public void setCdisplaytype(String cdisplaytype){
	    this.cdisplaytype=cdisplaytype;
	}
	public String getCdisplaytype(){
	    return cdisplaytype;
	}
	public void setCpicdescribe(String cpicdescribe){
	    this.cpicdescribe=cpicdescribe;
	}
	public String getCpicdescribe(){
	    return cpicdescribe;
	}
	public void setCpicpath(String cpicpath){
	    this.cpicpath=cpicpath;
	}
	public String getCpicpath(){
	    return cpicpath;
	}
	public void setCmicropicpath(String cmicropicpath){
	    this.cmicropicpath=cmicropicpath;
	}
	public String getCmicropicpath(){
	    return cmicropicpath;
	}
}