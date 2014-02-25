package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CODEFDINFO entity for T_CODE_FDINFO table.
 * 
 * 
 * @since 2014-02-17 17:24:36.934
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "T_CODE_FDINFO")	
public class CODEFDINFO implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="ID")
	private Integer iD;
	
	@Column(name="Origin")
	private String origin;
	
	@Column(name="Destination")
	private String destination;
	
	@Column(name="YPrice")
	private Double yPrice;
	
	public void setID(Integer iD){
	    this.iD=iD;
	}
	public Integer getID(){
	    return iD;
	}
	public void setOrigin(String origin){
	    this.origin=origin;
	}
	public String getOrigin(){
	    return origin;
	}
	public void setDestination(String destination){
	    this.destination=destination;
	}
	public String getDestination(){
	    return destination;
	}
	public void setYPrice(Double yPrice){
	    this.yPrice=yPrice;
	}
	public Double getYPrice(){
	    return yPrice;
	}
}