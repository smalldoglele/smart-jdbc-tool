package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CardConsumeReward entity for t_card_consume_reward table.
 * 
 * 
 * @since 2014-02-17 17:24:36.393
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_card_consume_reward")	
public class CardConsumeReward implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ucardmoneyid")
	private String ucardmoneyid;
	
	@Column(name="ucardconsumeid")
	private String ucardconsumeid;
	
	@Column(name="namount")
	private Double namount;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUcardmoneyid(String ucardmoneyid){
	    this.ucardmoneyid=ucardmoneyid;
	}
	public String getUcardmoneyid(){
	    return ucardmoneyid;
	}
	public void setUcardconsumeid(String ucardconsumeid){
	    this.ucardconsumeid=ucardconsumeid;
	}
	public String getUcardconsumeid(){
	    return ucardconsumeid;
	}
	public void setNamount(Double namount){
	    this.namount=namount;
	}
	public Double getNamount(){
	    return namount;
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
	public void setUroleid(String uroleid){
	    this.uroleid=uroleid;
	}
	public String getUroleid(){
	    return uroleid;
	}
	public void setUcorpid(String ucorpid){
	    this.ucorpid=ucorpid;
	}
	public String getUcorpid(){
	    return ucorpid;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
}