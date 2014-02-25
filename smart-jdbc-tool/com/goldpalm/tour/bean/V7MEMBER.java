package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * V7MEMBER entity for T_V7_MEMBER table.
 * 
 * 
 * @since 2014-02-17 17:24:44.856
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "T_V7_MEMBER")	
public class V7MEMBER implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uuid;
	
	@Column(name="broker")
	private String broker;
	
	@Column(name="cardno")
	private String cardno;
	
	@Column(name="cbirthday")
	private Date cbirthday;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="cmsn")
	private String cmsn;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cpassword")
	private String cpassword;
	
	@Column(name="cplace")
	private String cplace;
	
	@Column(name="cqq")
	private String cqq;
	
	@Column(name="cregdate")
	private Date cregdate;
	
	@Column(name="csex")
	private String csex;
	
	@Column(name="csource")
	private String csource;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="department")
	private String department;
	
	@Column(name="email")
	private String email;
	
	@Column(name="enabledate")
	private Date enabledate;
	
	@Column(name="interestplaces")
	private String interestplaces;
	
	@Column(name="manager")
	private String manager;
	
	@Column(name="marriage")
	private String marriage;
	
	@Column(name="memberno")
	private String memberno;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="profession")
	private String profession;
	
	@Column(name="travelplans")
	private String travelplans;
	
	@Column(name="visitedcountries")
	private String visitedcountries;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="address")
	private String address;
	
	public void setUuid(String uuid){
	    this.uuid=uuid;
	}
	public String getUuid(){
	    return uuid;
	}
	public void setBroker(String broker){
	    this.broker=broker;
	}
	public String getBroker(){
	    return broker;
	}
	public void setCardno(String cardno){
	    this.cardno=cardno;
	}
	public String getCardno(){
	    return cardno;
	}
	public void setCbirthday(Date cbirthday){
	    this.cbirthday=cbirthday;
	}
	public Date getCbirthday(){
	    return cbirthday;
	}
	public void setCcode(String ccode){
	    this.ccode=ccode;
	}
	public String getCcode(){
	    return ccode;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setCmsn(String cmsn){
	    this.cmsn=cmsn;
	}
	public String getCmsn(){
	    return cmsn;
	}
	public void setCname(String cname){
	    this.cname=cname;
	}
	public String getCname(){
	    return cname;
	}
	public void setCpassword(String cpassword){
	    this.cpassword=cpassword;
	}
	public String getCpassword(){
	    return cpassword;
	}
	public void setCplace(String cplace){
	    this.cplace=cplace;
	}
	public String getCplace(){
	    return cplace;
	}
	public void setCqq(String cqq){
	    this.cqq=cqq;
	}
	public String getCqq(){
	    return cqq;
	}
	public void setCregdate(Date cregdate){
	    this.cregdate=cregdate;
	}
	public Date getCregdate(){
	    return cregdate;
	}
	public void setCsex(String csex){
	    this.csex=csex;
	}
	public String getCsex(){
	    return csex;
	}
	public void setCsource(String csource){
	    this.csource=csource;
	}
	public String getCsource(){
	    return csource;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
	public void setDepartment(String department){
	    this.department=department;
	}
	public String getDepartment(){
	    return department;
	}
	public void setEmail(String email){
	    this.email=email;
	}
	public String getEmail(){
	    return email;
	}
	public void setEnabledate(Date enabledate){
	    this.enabledate=enabledate;
	}
	public Date getEnabledate(){
	    return enabledate;
	}
	public void setInterestplaces(String interestplaces){
	    this.interestplaces=interestplaces;
	}
	public String getInterestplaces(){
	    return interestplaces;
	}
	public void setManager(String manager){
	    this.manager=manager;
	}
	public String getManager(){
	    return manager;
	}
	public void setMarriage(String marriage){
	    this.marriage=marriage;
	}
	public String getMarriage(){
	    return marriage;
	}
	public void setMemberno(String memberno){
	    this.memberno=memberno;
	}
	public String getMemberno(){
	    return memberno;
	}
	public void setPhone(String phone){
	    this.phone=phone;
	}
	public String getPhone(){
	    return phone;
	}
	public void setProfession(String profession){
	    this.profession=profession;
	}
	public String getProfession(){
	    return profession;
	}
	public void setTravelplans(String travelplans){
	    this.travelplans=travelplans;
	}
	public String getTravelplans(){
	    return travelplans;
	}
	public void setVisitedcountries(String visitedcountries){
	    this.visitedcountries=visitedcountries;
	}
	public String getVisitedcountries(){
	    return visitedcountries;
	}
	public void setAge(Integer age){
	    this.age=age;
	}
	public Integer getAge(){
	    return age;
	}
	public void setAddress(String address){
	    this.address=address;
	}
	public String getAddress(){
	    return address;
	}
}