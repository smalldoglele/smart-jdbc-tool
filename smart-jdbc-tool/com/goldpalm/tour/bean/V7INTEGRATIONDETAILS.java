package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * V7INTEGRATIONDETAILS entity for T_V7_INTEGRATION_DETAILS table.
 * 
 * 
 * @since 2014-02-17 17:24:44.824
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "T_V7_INTEGRATION_DETAILS")	
public class V7INTEGRATIONDETAILS implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uuid;
	
	@Column(name="amount")
	private Double amount;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="csource")
	private String csource;
	
	@Column(name="doperate")
	private Date doperate;
	
	@Column(name="type")
	private String type;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="umemberid")
	private String umemberid;
	
	@Column(name="userid")
	private String userid;
	
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
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setCsource(String csource){
	    this.csource=csource;
	}
	public String getCsource(){
	    return csource;
	}
	public void setDoperate(Date doperate){
	    this.doperate=doperate;
	}
	public Date getDoperate(){
	    return doperate;
	}
	public void setType(String type){
	    this.type=type;
	}
	public String getType(){
	    return type;
	}
	public void setUdeptid(String udeptid){
	    this.udeptid=udeptid;
	}
	public String getUdeptid(){
	    return udeptid;
	}
	public void setUmemberid(String umemberid){
	    this.umemberid=umemberid;
	}
	public String getUmemberid(){
	    return umemberid;
	}
	public void setUserid(String userid){
	    this.userid=userid;
	}
	public String getUserid(){
	    return userid;
	}
}