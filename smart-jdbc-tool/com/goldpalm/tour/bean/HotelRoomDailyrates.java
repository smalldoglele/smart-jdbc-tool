package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * HotelRoomDailyrates entity for t_hotel_room_dailyrates table.
 * 
 * 
 * @since 2014-02-17 17:24:38.956
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_hotel_room_dailyrates")	
public class HotelRoomDailyrates implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String dailyratesid;
	
	@Column(name="refid")
	private String refid;
	
	@Column(name="roomtype")
	private String roomtype;
	
	@Column(name="ratecode")
	private String ratecode;
	
	@Column(name="availdate")
	private Date availdate;
	
	@Column(name="avstat")
	private String avstat;
	
	@Column(name="allotment")
	private Integer allotment;
	
	@Column(name="leadtime")
	private Integer leadtime;
	
	@Column(name="minlos")
	private Integer minlos;
	
	@Column(name="maxlos")
	private Integer maxlos;
	
	@Column(name="singlerates")
	private Double singlerates;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="gua")
	private String gua;
	
	@Column(name="cxl")
	private String cxl;
	
	@Column(name="creatorid")
	private String creatorid;
	
	@Column(name="createdate")
	private Date createdate;
	
	public void setDailyratesid(String dailyratesid){
	    this.dailyratesid=dailyratesid;
	}
	public String getDailyratesid(){
	    return dailyratesid;
	}
	public void setRefid(String refid){
	    this.refid=refid;
	}
	public String getRefid(){
	    return refid;
	}
	public void setRoomtype(String roomtype){
	    this.roomtype=roomtype;
	}
	public String getRoomtype(){
	    return roomtype;
	}
	public void setRatecode(String ratecode){
	    this.ratecode=ratecode;
	}
	public String getRatecode(){
	    return ratecode;
	}
	public void setAvaildate(Date availdate){
	    this.availdate=availdate;
	}
	public Date getAvaildate(){
	    return availdate;
	}
	public void setAvstat(String avstat){
	    this.avstat=avstat;
	}
	public String getAvstat(){
	    return avstat;
	}
	public void setAllotment(Integer allotment){
	    this.allotment=allotment;
	}
	public Integer getAllotment(){
	    return allotment;
	}
	public void setLeadtime(Integer leadtime){
	    this.leadtime=leadtime;
	}
	public Integer getLeadtime(){
	    return leadtime;
	}
	public void setMinlos(Integer minlos){
	    this.minlos=minlos;
	}
	public Integer getMinlos(){
	    return minlos;
	}
	public void setMaxlos(Integer maxlos){
	    this.maxlos=maxlos;
	}
	public Integer getMaxlos(){
	    return maxlos;
	}
	public void setSinglerates(Double singlerates){
	    this.singlerates=singlerates;
	}
	public Double getSinglerates(){
	    return singlerates;
	}
	public void setCurrency(String currency){
	    this.currency=currency;
	}
	public String getCurrency(){
	    return currency;
	}
	public void setGua(String gua){
	    this.gua=gua;
	}
	public String getGua(){
	    return gua;
	}
	public void setCxl(String cxl){
	    this.cxl=cxl;
	}
	public String getCxl(){
	    return cxl;
	}
	public void setCreatorid(String creatorid){
	    this.creatorid=creatorid;
	}
	public String getCreatorid(){
	    return creatorid;
	}
	public void setCreatedate(Date createdate){
	    this.createdate=createdate;
	}
	public Date getCreatedate(){
	    return createdate;
	}
}