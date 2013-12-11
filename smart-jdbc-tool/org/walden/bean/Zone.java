package org.walden.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Zone entity for jltour_zone table.
 * 
 * 
 * @since 2013-12-10 17:03:32.513
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "jltour_zone")	
public class Zone implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer zoneid;
	
	@Column(name="cityid")
	private Integer cityid;
	
	@Column(name="citycd")
	private String citycd;
	
	@Column(name="zonecd")
	private String zonecd;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="active")
	private Integer active;
	public void setZoneid(Integer zoneid){
	    this.zoneid=zoneid;
	}
	public Integer getZoneid(){
	    return zoneid;
	}
	public void setCityid(Integer cityid){
	    this.cityid=cityid;
	}
	public Integer getCityid(){
	    return cityid;
	}
	public void setCitycd(String citycd){
	    this.citycd=citycd;
	}
	public String getCitycd(){
	    return citycd;
	}
	public void setZonecd(String zonecd){
	    this.zonecd=zonecd;
	}
	public String getZonecd(){
	    return zonecd;
	}
	public void setName(String name){
	    this.name=name;
	}
	public String getName(){
	    return name;
	}
	public void setDescription(String description){
	    this.description=description;
	}
	public String getDescription(){
	    return description;
	}
	public void setActive(Integer active){
	    this.active=active;
	}
	public Integer getActive(){
	    return active;
	}
}