package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * V7INTEGRATION entity for T_V7_INTEGRATION table.
 * 
 * 
 * @since 2014-02-17 17:24:44.792
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "T_V7_INTEGRATION")	
public class V7INTEGRATION implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uuid;
	
	@Column(name="amount")
	private Double amount;
	
	@Column(name="detailsid")
	private String detailsid;
	
	@Column(name="dproduce")
	private Date dproduce;
	
	@Column(name="umemberid")
	private String umemberid;
	
	@Column(name="memberno")
	private String memberno;
	
	public void setUuid(String uuid){
	    this.uuid=uuid;
	}
	public String getUuid(){
	    return uuid;
	}
	public void setAmount(Double amount){
	    this.amount=amount;
	}
	public Double getAmount(){
	    return amount;
	}
	public void setDetailsid(String detailsid){
	    this.detailsid=detailsid;
	}
	public String getDetailsid(){
	    return detailsid;
	}
	public void setDproduce(Date dproduce){
	    this.dproduce=dproduce;
	}
	public Date getDproduce(){
	    return dproduce;
	}
	public void setUmemberid(String umemberid){
	    this.umemberid=umemberid;
	}
	public String getUmemberid(){
	    return umemberid;
	}
	public void setMemberno(String memberno){
	    this.memberno=memberno;
	}
	public String getMemberno(){
	    return memberno;
	}
}