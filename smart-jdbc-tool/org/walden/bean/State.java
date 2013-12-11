package org.walden.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * State entity for jltour_state table.
 * 
 * 
 * @since 2013-12-10 17:03:32.466
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "jltour_state")	
public class State implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer stateid;
	
	@Column(name="countryid")
	private Integer countryid;
	
	@Column(name="countrycd")
	private String countrycd;
	
	@Column(name="statecd")
	private String statecd;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="active")
	private Integer active;
	public void setStateid(Integer stateid){
	    this.stateid=stateid;
	}
	public Integer getStateid(){
	    return stateid;
	}
	public void setCountryid(Integer countryid){
	    this.countryid=countryid;
	}
	public Integer getCountryid(){
	    return countryid;
	}
	public void setCountrycd(String countrycd){
	    this.countrycd=countrycd;
	}
	public String getCountrycd(){
	    return countrycd;
	}
	public void setStatecd(String statecd){
	    this.statecd=statecd;
	}
	public String getStatecd(){
	    return statecd;
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