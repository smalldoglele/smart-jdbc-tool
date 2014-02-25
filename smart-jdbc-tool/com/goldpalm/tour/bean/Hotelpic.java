package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Hotelpic entity for t_hotelpic table.
 * 
 * 
 * @since 2014-02-17 17:24:39.154
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_hotelpic")	
public class Hotelpic implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uuid;
	
	@Column(name="hoteluid")
	private String hoteluid;
	
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
	public void setHoteluid(String hoteluid){
	    this.hoteluid=hoteluid;
	}
	public String getHoteluid(){
	    return hoteluid;
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