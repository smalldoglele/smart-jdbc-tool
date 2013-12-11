package org.walden.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Bizzone entity for jltour_bizzone table.
 * 
 * 
 * @since 2013-12-10 17:03:31.591
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "jltour_bizzone")	
public class Bizzone implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer bizzoneid;
	
	@Column(name="cityid")
	private Integer cityid;
	
	@Column(name="citycd")
	private String citycd;
	
	@Column(name="zoneid")
	private Integer zoneid;
	
	@Column(name="zonename")
	private String zonename;
	
	@Column(name="zonecd")
	private String zonecd;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="active")
	private Integer active;
	public void setBizzoneid(Integer bizzoneid){
	    this.bizzoneid=bizzoneid;
	}
	public Integer getBizzoneid(){
	    return bizzoneid;
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
	public void setZoneid(Integer zoneid){
	    this.zoneid=zoneid;
	}
	public Integer getZoneid(){
	    return zoneid;
	}
	public void setZonename(String zonename){
	    this.zonename=zonename;
	}
	public String getZonename(){
	    return zonename;
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