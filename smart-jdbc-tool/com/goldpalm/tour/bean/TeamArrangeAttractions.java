package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * TeamArrangeAttractions entity for t_team_arrange_attractions table.
 * 
 * 
 * @since 2014-02-17 17:24:43.446
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_team_arrange_attractions")	
public class TeamArrangeAttractions implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="uid")
	private String uid;
	
	@Column(name="uteamid")
	private String uteamid;
	
	@Column(name="uteamrouteid")
	private String uteamrouteid;
	
	@Column(name="usupplierid")
	private String usupplierid;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="dcheckintime")
	private Date dcheckintime;
	
	@Column(name="iqty")
	private Integer iqty;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="nprice")
	private Double nprice;
	
	@Column(name="ccur")
	private String ccur;
	
	@Column(name="nexchangerate")
	private Double nexchangerate;
	
	@Column(name="ncost")
	private Double ncost;
	
	@Column(name="ccostcur")
	private String ccostcur;
	
	@Column(name="ncostexchangerate")
	private Double ncostexchangerate;
	
	@Column(name="ideratenum")
	private Integer ideratenum;
	
	@Column(name="ideratebasenum")
	private Integer ideratebasenum;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="dconfirmedtime")
	private Date dconfirmedtime;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
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
	public void setUteamrouteid(String uteamrouteid){
	    this.uteamrouteid=uteamrouteid;
	}
	public String getUteamrouteid(){
	    return uteamrouteid;
	}
	public void setUsupplierid(String usupplierid){
	    this.usupplierid=usupplierid;
	}
	public String getUsupplierid(){
	    return usupplierid;
	}
	public void setCname(String cname){
	    this.cname=cname;
	}
	public String getCname(){
	    return cname;
	}
	public void setDcheckintime(Date dcheckintime){
	    this.dcheckintime=dcheckintime;
	}
	public Date getDcheckintime(){
	    return dcheckintime;
	}
	public void setIqty(Integer iqty){
	    this.iqty=iqty;
	}
	public Integer getIqty(){
	    return iqty;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setNprice(Double nprice){
	    this.nprice=nprice;
	}
	public Double getNprice(){
	    return nprice;
	}
	public void setCcur(String ccur){
	    this.ccur=ccur;
	}
	public String getCcur(){
	    return ccur;
	}
	public void setNexchangerate(Double nexchangerate){
	    this.nexchangerate=nexchangerate;
	}
	public Double getNexchangerate(){
	    return nexchangerate;
	}
	public void setNcost(Double ncost){
	    this.ncost=ncost;
	}
	public Double getNcost(){
	    return ncost;
	}
	public void setCcostcur(String ccostcur){
	    this.ccostcur=ccostcur;
	}
	public String getCcostcur(){
	    return ccostcur;
	}
	public void setNcostexchangerate(Double ncostexchangerate){
	    this.ncostexchangerate=ncostexchangerate;
	}
	public Double getNcostexchangerate(){
	    return ncostexchangerate;
	}
	public void setIderatenum(Integer ideratenum){
	    this.ideratenum=ideratenum;
	}
	public Integer getIderatenum(){
	    return ideratenum;
	}
	public void setIderatebasenum(Integer ideratebasenum){
	    this.ideratebasenum=ideratebasenum;
	}
	public Integer getIderatebasenum(){
	    return ideratebasenum;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
	public void setDconfirmedtime(Date dconfirmedtime){
	    this.dconfirmedtime=dconfirmedtime;
	}
	public Date getDconfirmedtime(){
	    return dconfirmedtime;
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
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
}