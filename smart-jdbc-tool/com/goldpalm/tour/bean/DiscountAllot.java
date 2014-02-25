package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * DiscountAllot entity for t_discount_allot table.
 * 
 * 
 * @since 2014-02-17 17:24:38.368
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_discount_allot")	
public class DiscountAllot implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uallotroleid")
	private String uallotroleid;
	
	@Column(name="dbegindate")
	private Date dbegindate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="callotmemo")
	private String callotmemo;
	
	@Column(name="cdiscountpolicy")
	private String cdiscountpolicy;
	
	@Column(name="ndiscountparam")
	private Double ndiscountparam;
	
	@Column(name="cbelowcost")
	private String cbelowcost;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="ddate")
	private Date ddate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUallotroleid(String uallotroleid){
	    this.uallotroleid=uallotroleid;
	}
	public String getUallotroleid(){
	    return uallotroleid;
	}
	public void setDbegindate(Date dbegindate){
	    this.dbegindate=dbegindate;
	}
	public Date getDbegindate(){
	    return dbegindate;
	}
	public void setDenddate(Date denddate){
	    this.denddate=denddate;
	}
	public Date getDenddate(){
	    return denddate;
	}
	public void setCallotmemo(String callotmemo){
	    this.callotmemo=callotmemo;
	}
	public String getCallotmemo(){
	    return callotmemo;
	}
	public void setCdiscountpolicy(String cdiscountpolicy){
	    this.cdiscountpolicy=cdiscountpolicy;
	}
	public String getCdiscountpolicy(){
	    return cdiscountpolicy;
	}
	public void setNdiscountparam(Double ndiscountparam){
	    this.ndiscountparam=ndiscountparam;
	}
	public Double getNdiscountparam(){
	    return ndiscountparam;
	}
	public void setCbelowcost(String cbelowcost){
	    this.cbelowcost=cbelowcost;
	}
	public String getCbelowcost(){
	    return cbelowcost;
	}
	public void setUuserid(String uuserid){
	    this.uuserid=uuserid;
	}
	public String getUuserid(){
	    return uuserid;
	}
	public void setUroleid(String uroleid){
	    this.uroleid=uroleid;
	}
	public String getUroleid(){
	    return uroleid;
	}
	public void setUdeptid(String udeptid){
	    this.udeptid=udeptid;
	}
	public String getUdeptid(){
	    return udeptid;
	}
	public void setDdate(Date ddate){
	    this.ddate=ddate;
	}
	public Date getDdate(){
	    return ddate;
	}
}