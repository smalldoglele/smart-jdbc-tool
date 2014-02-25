package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * OptionVote entity for t_option_vote table.
 * 
 * 
 * @since 2014-02-17 17:24:40.898
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_option_vote")	
public class OptionVote implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="clinktable")
	private String clinktable;
	
	@Column(name="cFlowType")
	private String cFlowType;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="cvotechoice")
	private String cvotechoice;
	
	@Column(name="cvotechoicename")
	private String cvotechoicename;
	
	@Column(name="creply")
	private String creply;
	
	@Column(name="ino")
	private Integer ino;
	
	@Column(name="ipassvotes")
	private Integer ipassvotes;
	
	@Column(name="cisauto")
	private String cisauto;
	
	@Column(name="cautofunction")
	private String cautofunction;
	
	@Column(name="cpassstatus")
	private String cpassstatus;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setClinktable(String clinktable){
	    this.clinktable=clinktable;
	}
	public String getClinktable(){
	    return clinktable;
	}
	public void setCFlowType(String cFlowType){
	    this.cFlowType=cFlowType;
	}
	public String getCFlowType(){
	    return cFlowType;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
	public void setCvotechoice(String cvotechoice){
	    this.cvotechoice=cvotechoice;
	}
	public String getCvotechoice(){
	    return cvotechoice;
	}
	public void setCvotechoicename(String cvotechoicename){
	    this.cvotechoicename=cvotechoicename;
	}
	public String getCvotechoicename(){
	    return cvotechoicename;
	}
	public void setCreply(String creply){
	    this.creply=creply;
	}
	public String getCreply(){
	    return creply;
	}
	public void setIno(Integer ino){
	    this.ino=ino;
	}
	public Integer getIno(){
	    return ino;
	}
	public void setIpassvotes(Integer ipassvotes){
	    this.ipassvotes=ipassvotes;
	}
	public Integer getIpassvotes(){
	    return ipassvotes;
	}
	public void setCisauto(String cisauto){
	    this.cisauto=cisauto;
	}
	public String getCisauto(){
	    return cisauto;
	}
	public void setCautofunction(String cautofunction){
	    this.cautofunction=cautofunction;
	}
	public String getCautofunction(){
	    return cautofunction;
	}
	public void setCpassstatus(String cpassstatus){
	    this.cpassstatus=cpassstatus;
	}
	public String getCpassstatus(){
	    return cpassstatus;
	}
}