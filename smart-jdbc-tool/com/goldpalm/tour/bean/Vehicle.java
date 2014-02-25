package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Vehicle entity for t_vehicle table.
 * 
 * 
 * @since 2014-02-17 17:24:44.922
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_vehicle")	
public class Vehicle implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cvehicletype")
	private String cvehicletype;
	
	@Column(name="cvehicleidno")
	private String cvehicleidno;
	
	@Column(name="cvehiclebrand")
	private String cvehiclebrand;
	
	@Column(name="iseat")
	private Integer iseat;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="purchasedate")
	private Date purchasedate;
	
	@Column(name="carcstatus")
	private String carcstatus;
	
	@Column(name="availablestate")
	private String availablestate;
	
	@Column(name="travelkm")
	private Integer travelkm;
	
	@Column(name="purchaseprice")
	private Double purchaseprice;
	
	@Column(name="owneduseyear")
	private Integer owneduseyear;
	
	@Column(name="depreciation")
	private Double depreciation;
	
	@Column(name="maintenancefee")
	private Double maintenancefee;
	
	@Column(name="insurance")
	private Double insurance;
	
	@Column(name="gold")
	private Double gold;
	
	@Column(name="relyuseyear")
	private Integer relyuseyear;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCvehicletype(String cvehicletype){
	    this.cvehicletype=cvehicletype;
	}
	public String getCvehicletype(){
	    return cvehicletype;
	}
	public void setCvehicleidno(String cvehicleidno){
	    this.cvehicleidno=cvehicleidno;
	}
	public String getCvehicleidno(){
	    return cvehicleidno;
	}
	public void setCvehiclebrand(String cvehiclebrand){
	    this.cvehiclebrand=cvehiclebrand;
	}
	public String getCvehiclebrand(){
	    return cvehiclebrand;
	}
	public void setIseat(Integer iseat){
	    this.iseat=iseat;
	}
	public Integer getIseat(){
	    return iseat;
	}
	public void setUroleid(String uroleid){
	    this.uroleid=uroleid;
	}
	public String getUroleid(){
	    return uroleid;
	}
	public void setUuserid(String uuserid){
	    this.uuserid=uuserid;
	}
	public String getUuserid(){
	    return uuserid;
	}
	public void setUdeptid(String udeptid){
	    this.udeptid=udeptid;
	}
	public String getUdeptid(){
	    return udeptid;
	}
	public void setUcorpid(String ucorpid){
	    this.ucorpid=ucorpid;
	}
	public String getUcorpid(){
	    return ucorpid;
	}
	public void setPurchasedate(Date purchasedate){
	    this.purchasedate=purchasedate;
	}
	public Date getPurchasedate(){
	    return purchasedate;
	}
	public void setCarcstatus(String carcstatus){
	    this.carcstatus=carcstatus;
	}
	public String getCarcstatus(){
	    return carcstatus;
	}
	public void setAvailablestate(String availablestate){
	    this.availablestate=availablestate;
	}
	public String getAvailablestate(){
	    return availablestate;
	}
	public void setTravelkm(Integer travelkm){
	    this.travelkm=travelkm;
	}
	public Integer getTravelkm(){
	    return travelkm;
	}
	public void setPurchaseprice(Double purchaseprice){
	    this.purchaseprice=purchaseprice;
	}
	public Double getPurchaseprice(){
	    return purchaseprice;
	}
	public void setOwneduseyear(Integer owneduseyear){
	    this.owneduseyear=owneduseyear;
	}
	public Integer getOwneduseyear(){
	    return owneduseyear;
	}
	public void setDepreciation(Double depreciation){
	    this.depreciation=depreciation;
	}
	public Double getDepreciation(){
	    return depreciation;
	}
	public void setMaintenancefee(Double maintenancefee){
	    this.maintenancefee=maintenancefee;
	}
	public Double getMaintenancefee(){
	    return maintenancefee;
	}
	public void setInsurance(Double insurance){
	    this.insurance=insurance;
	}
	public Double getInsurance(){
	    return insurance;
	}
	public void setGold(Double gold){
	    this.gold=gold;
	}
	public Double getGold(){
	    return gold;
	}
	public void setRelyuseyear(Integer relyuseyear){
	    this.relyuseyear=relyuseyear;
	}
	public Integer getRelyuseyear(){
	    return relyuseyear;
	}
}