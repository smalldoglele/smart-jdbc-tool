package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * ReservationVehicle entity for t_reservation_vehicle table.
 * 
 * 
 * @since 2014-02-17 17:24:42.705
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_reservation_vehicle")	
public class ReservationVehicle implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cno")
	private String cno;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="cteamcode")
	private String cteamcode;
	
	@Column(name="dbgndate")
	private Date dbgndate;
	
	@Column(name="ctime")
	private String ctime;
	
	@Column(name="cdestination")
	private String cdestination;
	
	@Column(name="cleader")
	private String cleader;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="iqty")
	private Integer iqty;
	
	@Column(name="coppcorp")
	private String coppcorp;
	
	@Column(name="copplinkman")
	private String copplinkman;
	
	@Column(name="coppmobile")
	private String coppmobile;
	
	@Column(name="cvehicleidno")
	private String cvehicleidno;
	
	@Column(name="iseat")
	private Integer iseat;
	
	@Column(name="cdrivername")
	private String cdrivername;
	
	@Column(name="cdrivermobile")
	private String cdrivermobile;
	
	@Column(name="dcost")
	private Double dcost;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="dcreate")
	private Date dcreate;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="crpmode")
	private String crpmode;
	
	@Column(name="cusetype")
	private String cusetype;
	
	@Column(name="cdrivername2")
	private String cdrivername2;
	
	@Column(name="cdrivermobile2")
	private String cdrivermobile2;
	
	@Column(name="covertime")
	private String covertime;
	
	@Column(name="callowance")
	private String callowance;
	
	@Column(name="cauditinfo")
	private String cauditinfo;
	
	@Column(name="cinvoice")
	private String cinvoice;
	
	@Column(name="crpmemo")
	private String crpmemo;
	
	@Column(name="route1")
	private String route1;
	
	@Column(name="route2")
	private String route2;
	
	@Column(name="cdepartnation")
	private String cdepartnation;
	
	@Column(name="ctask")
	private String ctask;
	
	@Column(name="ujdroleid")
	private String ujdroleid;
	
	@Column(name="ujduserid")
	private String ujduserid;
	
	@Column(name="ujddeptid")
	private String ujddeptid;
	
	@Column(name="cscheduletime")
	private String cscheduletime;
	
	@Column(name="ibeginkm")
	private Integer ibeginkm;
	
	@Column(name="iendkm")
	private Integer iendkm;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCno(String cno){
	    this.cno=cno;
	}
	public String getCno(){
	    return cno;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setCteamcode(String cteamcode){
	    this.cteamcode=cteamcode;
	}
	public String getCteamcode(){
	    return cteamcode;
	}
	public void setDbgndate(Date dbgndate){
	    this.dbgndate=dbgndate;
	}
	public Date getDbgndate(){
	    return dbgndate;
	}
	public void setCtime(String ctime){
	    this.ctime=ctime;
	}
	public String getCtime(){
	    return ctime;
	}
	public void setCdestination(String cdestination){
	    this.cdestination=cdestination;
	}
	public String getCdestination(){
	    return cdestination;
	}
	public void setCleader(String cleader){
	    this.cleader=cleader;
	}
	public String getCleader(){
	    return cleader;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setIqty(Integer iqty){
	    this.iqty=iqty;
	}
	public Integer getIqty(){
	    return iqty;
	}
	public void setCoppcorp(String coppcorp){
	    this.coppcorp=coppcorp;
	}
	public String getCoppcorp(){
	    return coppcorp;
	}
	public void setCopplinkman(String copplinkman){
	    this.copplinkman=copplinkman;
	}
	public String getCopplinkman(){
	    return copplinkman;
	}
	public void setCoppmobile(String coppmobile){
	    this.coppmobile=coppmobile;
	}
	public String getCoppmobile(){
	    return coppmobile;
	}
	public void setCvehicleidno(String cvehicleidno){
	    this.cvehicleidno=cvehicleidno;
	}
	public String getCvehicleidno(){
	    return cvehicleidno;
	}
	public void setIseat(Integer iseat){
	    this.iseat=iseat;
	}
	public Integer getIseat(){
	    return iseat;
	}
	public void setCdrivername(String cdrivername){
	    this.cdrivername=cdrivername;
	}
	public String getCdrivername(){
	    return cdrivername;
	}
	public void setCdrivermobile(String cdrivermobile){
	    this.cdrivermobile=cdrivermobile;
	}
	public String getCdrivermobile(){
	    return cdrivermobile;
	}
	public void setDcost(Double dcost){
	    this.dcost=dcost;
	}
	public Double getDcost(){
	    return dcost;
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
	public void setUcorpid(String ucorpid){
	    this.ucorpid=ucorpid;
	}
	public String getUcorpid(){
	    return ucorpid;
	}
	public void setDcreate(Date dcreate){
	    this.dcreate=dcreate;
	}
	public Date getDcreate(){
	    return dcreate;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
	public void setCrpmode(String crpmode){
	    this.crpmode=crpmode;
	}
	public String getCrpmode(){
	    return crpmode;
	}
	public void setCusetype(String cusetype){
	    this.cusetype=cusetype;
	}
	public String getCusetype(){
	    return cusetype;
	}
	public void setCdrivername2(String cdrivername2){
	    this.cdrivername2=cdrivername2;
	}
	public String getCdrivername2(){
	    return cdrivername2;
	}
	public void setCdrivermobile2(String cdrivermobile2){
	    this.cdrivermobile2=cdrivermobile2;
	}
	public String getCdrivermobile2(){
	    return cdrivermobile2;
	}
	public void setCovertime(String covertime){
	    this.covertime=covertime;
	}
	public String getCovertime(){
	    return covertime;
	}
	public void setCallowance(String callowance){
	    this.callowance=callowance;
	}
	public String getCallowance(){
	    return callowance;
	}
	public void setCauditinfo(String cauditinfo){
	    this.cauditinfo=cauditinfo;
	}
	public String getCauditinfo(){
	    return cauditinfo;
	}
	public void setCinvoice(String cinvoice){
	    this.cinvoice=cinvoice;
	}
	public String getCinvoice(){
	    return cinvoice;
	}
	public void setCrpmemo(String crpmemo){
	    this.crpmemo=crpmemo;
	}
	public String getCrpmemo(){
	    return crpmemo;
	}
	public void setRoute1(String route1){
	    this.route1=route1;
	}
	public String getRoute1(){
	    return route1;
	}
	public void setRoute2(String route2){
	    this.route2=route2;
	}
	public String getRoute2(){
	    return route2;
	}
	public void setCdepartnation(String cdepartnation){
	    this.cdepartnation=cdepartnation;
	}
	public String getCdepartnation(){
	    return cdepartnation;
	}
	public void setCtask(String ctask){
	    this.ctask=ctask;
	}
	public String getCtask(){
	    return ctask;
	}
	public void setUjdroleid(String ujdroleid){
	    this.ujdroleid=ujdroleid;
	}
	public String getUjdroleid(){
	    return ujdroleid;
	}
	public void setUjduserid(String ujduserid){
	    this.ujduserid=ujduserid;
	}
	public String getUjduserid(){
	    return ujduserid;
	}
	public void setUjddeptid(String ujddeptid){
	    this.ujddeptid=ujddeptid;
	}
	public String getUjddeptid(){
	    return ujddeptid;
	}
	public void setCscheduletime(String cscheduletime){
	    this.cscheduletime=cscheduletime;
	}
	public String getCscheduletime(){
	    return cscheduletime;
	}
	public void setIbeginkm(Integer ibeginkm){
	    this.ibeginkm=ibeginkm;
	}
	public Integer getIbeginkm(){
	    return ibeginkm;
	}
	public void setIendkm(Integer iendkm){
	    this.iendkm=iendkm;
	}
	public Integer getIendkm(){
	    return iendkm;
	}
}