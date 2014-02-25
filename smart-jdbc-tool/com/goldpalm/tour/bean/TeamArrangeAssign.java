package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * TeamArrangeAssign entity for T_Team_Arrange_Assign table.
 * 
 * 
 * @since 2014-02-17 17:24:43.412
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "T_Team_Arrange_Assign")	
public class TeamArrangeAssign implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uTeamID")
	private String uTeamID;
	
	@Column(name="uTeamRouteID")
	private String uTeamRouteID;
	
	@Column(name="cConfirmed")
	private String cConfirmed;
	
	@Column(name="dConfirmedTime")
	private Date dConfirmedTime;
	
	@Column(name="cChanged")
	private String cChanged;
	
	@Column(name="dChangedTime")
	private Date dChangedTime;
	
	@Column(name="uarrangesupplierid")
	private String uarrangesupplierid;
	
	@Column(name="uArrangeTeamID")
	private String uArrangeTeamID;
	
	@Column(name="dAssign")
	private Date dAssign;
	
	@Column(name="dReceive")
	private Date dReceive;
	
	@Column(name="uRoleID")
	private String uRoleID;
	
	@Column(name="uUserID")
	private String uUserID;
	
	@Column(name="uDeptID")
	private String uDeptID;
	
	@Column(name="dUpdate")
	private Date dUpdate;
	
	@Column(name="cmemo")
	private String cmemo;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUTeamID(String uTeamID){
	    this.uTeamID=uTeamID;
	}
	public String getUTeamID(){
	    return uTeamID;
	}
	public void setUTeamRouteID(String uTeamRouteID){
	    this.uTeamRouteID=uTeamRouteID;
	}
	public String getUTeamRouteID(){
	    return uTeamRouteID;
	}
	public void setCConfirmed(String cConfirmed){
	    this.cConfirmed=cConfirmed;
	}
	public String getCConfirmed(){
	    return cConfirmed;
	}
	public void setDConfirmedTime(Date dConfirmedTime){
	    this.dConfirmedTime=dConfirmedTime;
	}
	public Date getDConfirmedTime(){
	    return dConfirmedTime;
	}
	public void setCChanged(String cChanged){
	    this.cChanged=cChanged;
	}
	public String getCChanged(){
	    return cChanged;
	}
	public void setDChangedTime(Date dChangedTime){
	    this.dChangedTime=dChangedTime;
	}
	public Date getDChangedTime(){
	    return dChangedTime;
	}
	public void setUarrangesupplierid(String uarrangesupplierid){
	    this.uarrangesupplierid=uarrangesupplierid;
	}
	public String getUarrangesupplierid(){
	    return uarrangesupplierid;
	}
	public void setUArrangeTeamID(String uArrangeTeamID){
	    this.uArrangeTeamID=uArrangeTeamID;
	}
	public String getUArrangeTeamID(){
	    return uArrangeTeamID;
	}
	public void setDAssign(Date dAssign){
	    this.dAssign=dAssign;
	}
	public Date getDAssign(){
	    return dAssign;
	}
	public void setDReceive(Date dReceive){
	    this.dReceive=dReceive;
	}
	public Date getDReceive(){
	    return dReceive;
	}
	public void setURoleID(String uRoleID){
	    this.uRoleID=uRoleID;
	}
	public String getURoleID(){
	    return uRoleID;
	}
	public void setUUserID(String uUserID){
	    this.uUserID=uUserID;
	}
	public String getUUserID(){
	    return uUserID;
	}
	public void setUDeptID(String uDeptID){
	    this.uDeptID=uDeptID;
	}
	public String getUDeptID(){
	    return uDeptID;
	}
	public void setDUpdate(Date dUpdate){
	    this.dUpdate=dUpdate;
	}
	public Date getDUpdate(){
	    return dUpdate;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
}