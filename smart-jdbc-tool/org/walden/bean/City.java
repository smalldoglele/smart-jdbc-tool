package org.walden.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * City entity for jltour_city table.
 * 
 * 
 * @since 2013-12-10 17:03:32.357
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "jltour_city")	
public class City implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer cityid;
	
	@Column(name="stateid")
	private Integer stateid;
	
	@Column(name="statecd")
	private String statecd;
	
	@Column(name="citycd")
	private String citycd;
	
	@Column(name="name")
	private String name;
	
	@Column(name="citypin")
	private String citypin;
	
	@Column(name="citypinyinsimp")
	private String citypinyinsimp;
	
	@Column(name="description")
	private String description;
	
	@Column(name="active")
	private Integer active;
	public void setCityid(Integer cityid){
	    this.cityid=cityid;
	}
	public Integer getCityid(){
	    return cityid;
	}
	public void setStateid(Integer stateid){
	    this.stateid=stateid;
	}
	public Integer getStateid(){
	    return stateid;
	}
	public void setStatecd(String statecd){
	    this.statecd=statecd;
	}
	public String getStatecd(){
	    return statecd;
	}
	public void setCitycd(String citycd){
	    this.citycd=citycd;
	}
	public String getCitycd(){
	    return citycd;
	}
	public void setName(String name){
	    this.name=name;
	}
	public String getName(){
	    return name;
	}
	public void setCitypin(String citypin){
	    this.citypin=citypin;
	}
	public String getCitypin(){
	    return citypin;
	}
	public void setCitypinyinsimp(String citypinyinsimp){
	    this.citypinyinsimp=citypinyinsimp;
	}
	public String getCitypinyinsimp(){
	    return citypinyinsimp;
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