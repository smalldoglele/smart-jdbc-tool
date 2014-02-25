package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Beneficiary entity for t_beneficiary table.
 * 
 * 
 * @since 2014-02-17 17:24:35.914
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_beneficiary")	
public class Beneficiary implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="upolicyid")
	private String upolicyid;
	
	@Column(name="cbeneficiary")
	private String cbeneficiary;
	
	@Column(name="cbcredentialstype")
	private String cbcredentialstype;
	
	@Column(name="cbcredentialsno")
	private String cbcredentialsno;
	
	@Column(name="crelation")
	private String crelation;
	
	@Column(name="nshare")
	private Double nshare;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUpolicyid(String upolicyid){
	    this.upolicyid=upolicyid;
	}
	public String getUpolicyid(){
	    return upolicyid;
	}
	public void setCbeneficiary(String cbeneficiary){
	    this.cbeneficiary=cbeneficiary;
	}
	public String getCbeneficiary(){
	    return cbeneficiary;
	}
	public void setCbcredentialstype(String cbcredentialstype){
	    this.cbcredentialstype=cbcredentialstype;
	}
	public String getCbcredentialstype(){
	    return cbcredentialstype;
	}
	public void setCbcredentialsno(String cbcredentialsno){
	    this.cbcredentialsno=cbcredentialsno;
	}
	public String getCbcredentialsno(){
	    return cbcredentialsno;
	}
	public void setCrelation(String crelation){
	    this.crelation=crelation;
	}
	public String getCrelation(){
	    return crelation;
	}
	public void setNshare(Double nshare){
	    this.nshare=nshare;
	}
	public Double getNshare(){
	    return nshare;
	}
}