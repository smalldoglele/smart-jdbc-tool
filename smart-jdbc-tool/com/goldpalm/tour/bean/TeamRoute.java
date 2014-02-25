package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * TeamRoute entity for t_team_route table.
 * 
 * 
 * @since 2014-02-17 17:24:43.959
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_team_route")	
public class TeamRoute implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uteamid")
	private String uteamid;
	
	@Column(name="iday")
	private Integer iday;
	
	@Column(name="ctitle")
	private String ctitle;
	
	@Column(name="ctrip")
	private String ctrip;
	
	@Column(name="ctraffic")
	private String ctraffic;
	
	@Column(name="cdinner")
	private String cdinner;
	
	@Column(name="chotel")
	private String chotel;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="istop")
	private Integer istop;
	
	@Column(name="cdepartcity")
	private String cdepartcity;
	
	@Column(name="carrivecity")
	private String carrivecity;
	
	@Column(name="cboardtime")
	private String cboardtime;
	
	@Column(name="cofftime")
	private String cofftime;
	
	@Column(name="iadddays")
	private Integer iadddays;
	
	@Column(name="clineno")
	private String clineno;
	
	@Column(name="ccarriername")
	private String ccarriername;
	
	@Column(name="usupplierid")
	private String usupplierid;
	
	@Column(name="cport")
	private String cport;
	
	@Column(name="ctransit")
	private String ctransit;
	
	@Column(name="clinkman")
	private String clinkman;
	
	@Column(name="cguide")
	private String cguide;
	
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
	public void setIday(Integer iday){
	    this.iday=iday;
	}
	public Integer getIday(){
	    return iday;
	}
	public void setCtitle(String ctitle){
	    this.ctitle=ctitle;
	}
	public String getCtitle(){
	    return ctitle;
	}
	public void setCtrip(String ctrip){
	    this.ctrip=ctrip;
	}
	public String getCtrip(){
	    return ctrip;
	}
	public void setCtraffic(String ctraffic){
	    this.ctraffic=ctraffic;
	}
	public String getCtraffic(){
	    return ctraffic;
	}
	public void setCdinner(String cdinner){
	    this.cdinner=cdinner;
	}
	public String getCdinner(){
	    return cdinner;
	}
	public void setChotel(String chotel){
	    this.chotel=chotel;
	}
	public String getChotel(){
	    return chotel;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setUuserid(String uuserid){
	    this.uuserid=uuserid;
	}
	public String getUuserid(){
	    return uuserid;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setIstop(Integer istop){
	    this.istop=istop;
	}
	public Integer getIstop(){
	    return istop;
	}
	public void setCdepartcity(String cdepartcity){
	    this.cdepartcity=cdepartcity;
	}
	public String getCdepartcity(){
	    return cdepartcity;
	}
	public void setCarrivecity(String carrivecity){
	    this.carrivecity=carrivecity;
	}
	public String getCarrivecity(){
	    return carrivecity;
	}
	public void setCboardtime(String cboardtime){
	    this.cboardtime=cboardtime;
	}
	public String getCboardtime(){
	    return cboardtime;
	}
	public void setCofftime(String cofftime){
	    this.cofftime=cofftime;
	}
	public String getCofftime(){
	    return cofftime;
	}
	public void setIadddays(Integer iadddays){
	    this.iadddays=iadddays;
	}
	public Integer getIadddays(){
	    return iadddays;
	}
	public void setClineno(String clineno){
	    this.clineno=clineno;
	}
	public String getClineno(){
	    return clineno;
	}
	public void setCcarriername(String ccarriername){
	    this.ccarriername=ccarriername;
	}
	public String getCcarriername(){
	    return ccarriername;
	}
	public void setUsupplierid(String usupplierid){
	    this.usupplierid=usupplierid;
	}
	public String getUsupplierid(){
	    return usupplierid;
	}
	public void setCport(String cport){
	    this.cport=cport;
	}
	public String getCport(){
	    return cport;
	}
	public void setCtransit(String ctransit){
	    this.ctransit=ctransit;
	}
	public String getCtransit(){
	    return ctransit;
	}
	public void setClinkman(String clinkman){
	    this.clinkman=clinkman;
	}
	public String getClinkman(){
	    return clinkman;
	}
	public void setCguide(String cguide){
	    this.cguide=cguide;
	}
	public String getCguide(){
	    return cguide;
	}
}