package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * InsureRecommend entity for t_insure_recommend table.
 * 
 * 
 * @since 2014-02-17 17:24:39.264
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_insure_recommend")	
public class InsureRecommend implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uteamid")
	private String uteamid;
	
	@Column(name="ulineid")
	private String ulineid;
	
	@Column(name="uproductid")
	private String uproductid;
	
	@Column(name="crecommendmode")
	private String crecommendmode;
	
	@Column(name="cisvalid")
	private String cisvalid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUteamid(String uteamid){
	    this.uteamid=uteamid;
	}
	public String getUteamid(){
	    return uteamid;
	}
	public void setUlineid(String ulineid){
	    this.ulineid=ulineid;
	}
	public String getUlineid(){
	    return ulineid;
	}
	public void setUproductid(String uproductid){
	    this.uproductid=uproductid;
	}
	public String getUproductid(){
	    return uproductid;
	}
	public void setCrecommendmode(String crecommendmode){
	    this.crecommendmode=crecommendmode;
	}
	public String getCrecommendmode(){
	    return crecommendmode;
	}
	public void setCisvalid(String cisvalid){
	    this.cisvalid=cisvalid;
	}
	public String getCisvalid(){
	    return cisvalid;
	}
}