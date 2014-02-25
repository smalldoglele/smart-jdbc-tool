package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * HotelRoomtype entity for t_hotel_roomtype table.
 * 
 * 
 * @since 2014-02-17 17:24:38.992
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_hotel_roomtype")	
public class HotelRoomtype implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uhotelid")
	private String uhotelid;
	
	@Column(name="chotelcode")
	private String chotelcode;
	
	@Column(name="croomtypecode")
	private String croomtypecode;
	
	@Column(name="croomtypename")
	private String croomtypename;
	
	@Column(name="croomdescribe")
	private String croomdescribe;
	
	@Column(name="inumber")
	private Integer inumber;
	
	@Column(name="iextrabed")
	private Integer iextrabed;
	
	@Column(name="iinquantity")
	private Integer iinquantity;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUhotelid(String uhotelid){
	    this.uhotelid=uhotelid;
	}
	public String getUhotelid(){
	    return uhotelid;
	}
	public void setChotelcode(String chotelcode){
	    this.chotelcode=chotelcode;
	}
	public String getChotelcode(){
	    return chotelcode;
	}
	public void setCroomtypecode(String croomtypecode){
	    this.croomtypecode=croomtypecode;
	}
	public String getCroomtypecode(){
	    return croomtypecode;
	}
	public void setCroomtypename(String croomtypename){
	    this.croomtypename=croomtypename;
	}
	public String getCroomtypename(){
	    return croomtypename;
	}
	public void setCroomdescribe(String croomdescribe){
	    this.croomdescribe=croomdescribe;
	}
	public String getCroomdescribe(){
	    return croomdescribe;
	}
	public void setInumber(Integer inumber){
	    this.inumber=inumber;
	}
	public Integer getInumber(){
	    return inumber;
	}
	public void setIextrabed(Integer iextrabed){
	    this.iextrabed=iextrabed;
	}
	public Integer getIextrabed(){
	    return iextrabed;
	}
	public void setIinquantity(Integer iinquantity){
	    this.iinquantity=iinquantity;
	}
	public Integer getIinquantity(){
	    return iinquantity;
	}
}