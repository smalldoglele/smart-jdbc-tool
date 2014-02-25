package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Voucher entity for t_voucher table.
 * 
 * 
 * @since 2014-02-17 17:24:45.252
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_voucher")	
public class Voucher implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="fbrno")
	private String fbrno;
	
	@Id
	private String fvoucherid;
	
	@Column(name="fdate")
	private Date fdate;
	
	@Column(name="fyear")
	private Integer fyear;
	
	@Column(name="fperiod")
	private Integer fperiod;
	
	@Column(name="fgroupid")
	private Integer fgroupid;
	
	@Column(name="fnumber")
	private Integer fnumber;
	
	@Column(name="freference")
	private String freference;
	
	@Column(name="fexplanation")
	private String fexplanation;
	
	@Column(name="fattachments")
	private Integer fattachments;
	
	@Column(name="fentrycount")
	private Integer fentrycount;
	
	@Column(name="fdebittotal")
	private Double fdebittotal;
	
	@Column(name="fcredittotal")
	private Double fcredittotal;
	
	@Column(name="finternalind")
	private String finternalind;
	
	@Column(name="fchecked")
	private Boolean fchecked;
	
	@Column(name="fposted")
	private Boolean fposted;
	
	@Column(name="fpreparerid")
	private Short fpreparerid;
	
	@Column(name="fcheckerid")
	private Short fcheckerid;
	
	@Column(name="fposterid")
	private Short fposterid;
	
	@Column(name="fcashierid")
	private Short fcashierid;
	
	@Column(name="fhandler")
	private String fhandler;
	
	@Column(name="fownergroupid")
	private Short fownergroupid;
	
	@Column(name="fobjectname")
	private String fobjectname;
	
	@Column(name="fparameter")
	private String fparameter;
	
	@Column(name="fserialnum")
	private Integer fserialnum;
	
	@Column(name="ftrantype")
	private Integer ftrantype;
	
	@Column(name="ftransyear")
	private Integer ftransyear;
	
	@Column(name="ftransperiod")
	private Integer ftransperiod;
	
	@Column(name="ftransdate")
	private Date ftransdate;
	
	@Column(name="ftransnumber")
	private Integer ftransnumber;
	
	@Column(name="ftransuser")
	private String ftransuser;
	
	@Column(name="ftransdept")
	private String ftransdept;
	
	@Column(name="ftransno")
	private String ftransno;
	
	@Column(name="ftransnogroup")
	private String ftransnogroup;
	
	@Column(name="fframeworkid")
	private Integer fframeworkid;
	
	@Column(name="fapproveid")
	private Integer fapproveid;
	
	@Column(name="ffootnote")
	private String ffootnote;
	
	@Column(name="uuid")
	private String uuid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="userialid")
	private String userialid;
	
	public void setFbrno(String fbrno){
	    this.fbrno=fbrno;
	}
	public String getFbrno(){
	    return fbrno;
	}
	public void setFvoucherid(String fvoucherid){
	    this.fvoucherid=fvoucherid;
	}
	public String getFvoucherid(){
	    return fvoucherid;
	}
	public void setFdate(Date fdate){
	    this.fdate=fdate;
	}
	public Date getFdate(){
	    return fdate;
	}
	public void setFyear(Integer fyear){
	    this.fyear=fyear;
	}
	public Integer getFyear(){
	    return fyear;
	}
	public void setFperiod(Integer fperiod){
	    this.fperiod=fperiod;
	}
	public Integer getFperiod(){
	    return fperiod;
	}
	public void setFgroupid(Integer fgroupid){
	    this.fgroupid=fgroupid;
	}
	public Integer getFgroupid(){
	    return fgroupid;
	}
	public void setFnumber(Integer fnumber){
	    this.fnumber=fnumber;
	}
	public Integer getFnumber(){
	    return fnumber;
	}
	public void setFreference(String freference){
	    this.freference=freference;
	}
	public String getFreference(){
	    return freference;
	}
	public void setFexplanation(String fexplanation){
	    this.fexplanation=fexplanation;
	}
	public String getFexplanation(){
	    return fexplanation;
	}
	public void setFattachments(Integer fattachments){
	    this.fattachments=fattachments;
	}
	public Integer getFattachments(){
	    return fattachments;
	}
	public void setFentrycount(Integer fentrycount){
	    this.fentrycount=fentrycount;
	}
	public Integer getFentrycount(){
	    return fentrycount;
	}
	public void setFdebittotal(Double fdebittotal){
	    this.fdebittotal=fdebittotal;
	}
	public Double getFdebittotal(){
	    return fdebittotal;
	}
	public void setFcredittotal(Double fcredittotal){
	    this.fcredittotal=fcredittotal;
	}
	public Double getFcredittotal(){
	    return fcredittotal;
	}
	public void setFinternalind(String finternalind){
	    this.finternalind=finternalind;
	}
	public String getFinternalind(){
	    return finternalind;
	}
	public void setFchecked(Boolean fchecked){
	    this.fchecked=fchecked;
	}
	public Boolean getFchecked(){
	    return fchecked;
	}
	public void setFposted(Boolean fposted){
	    this.fposted=fposted;
	}
	public Boolean getFposted(){
	    return fposted;
	}
	public void setFpreparerid(Short fpreparerid){
	    this.fpreparerid=fpreparerid;
	}
	public Short getFpreparerid(){
	    return fpreparerid;
	}
	public void setFcheckerid(Short fcheckerid){
	    this.fcheckerid=fcheckerid;
	}
	public Short getFcheckerid(){
	    return fcheckerid;
	}
	public void setFposterid(Short fposterid){
	    this.fposterid=fposterid;
	}
	public Short getFposterid(){
	    return fposterid;
	}
	public void setFcashierid(Short fcashierid){
	    this.fcashierid=fcashierid;
	}
	public Short getFcashierid(){
	    return fcashierid;
	}
	public void setFhandler(String fhandler){
	    this.fhandler=fhandler;
	}
	public String getFhandler(){
	    return fhandler;
	}
	public void setFownergroupid(Short fownergroupid){
	    this.fownergroupid=fownergroupid;
	}
	public Short getFownergroupid(){
	    return fownergroupid;
	}
	public void setFobjectname(String fobjectname){
	    this.fobjectname=fobjectname;
	}
	public String getFobjectname(){
	    return fobjectname;
	}
	public void setFparameter(String fparameter){
	    this.fparameter=fparameter;
	}
	public String getFparameter(){
	    return fparameter;
	}
	public void setFserialnum(Integer fserialnum){
	    this.fserialnum=fserialnum;
	}
	public Integer getFserialnum(){
	    return fserialnum;
	}
	public void setFtrantype(Integer ftrantype){
	    this.ftrantype=ftrantype;
	}
	public Integer getFtrantype(){
	    return ftrantype;
	}
	public void setFtransyear(Integer ftransyear){
	    this.ftransyear=ftransyear;
	}
	public Integer getFtransyear(){
	    return ftransyear;
	}
	public void setFtransperiod(Integer ftransperiod){
	    this.ftransperiod=ftransperiod;
	}
	public Integer getFtransperiod(){
	    return ftransperiod;
	}
	public void setFtransdate(Date ftransdate){
	    this.ftransdate=ftransdate;
	}
	public Date getFtransdate(){
	    return ftransdate;
	}
	public void setFtransnumber(Integer ftransnumber){
	    this.ftransnumber=ftransnumber;
	}
	public Integer getFtransnumber(){
	    return ftransnumber;
	}
	public void setFtransuser(String ftransuser){
	    this.ftransuser=ftransuser;
	}
	public String getFtransuser(){
	    return ftransuser;
	}
	public void setFtransdept(String ftransdept){
	    this.ftransdept=ftransdept;
	}
	public String getFtransdept(){
	    return ftransdept;
	}
	public void setFtransno(String ftransno){
	    this.ftransno=ftransno;
	}
	public String getFtransno(){
	    return ftransno;
	}
	public void setFtransnogroup(String ftransnogroup){
	    this.ftransnogroup=ftransnogroup;
	}
	public String getFtransnogroup(){
	    return ftransnogroup;
	}
	public void setFframeworkid(Integer fframeworkid){
	    this.fframeworkid=fframeworkid;
	}
	public Integer getFframeworkid(){
	    return fframeworkid;
	}
	public void setFapproveid(Integer fapproveid){
	    this.fapproveid=fapproveid;
	}
	public Integer getFapproveid(){
	    return fapproveid;
	}
	public void setFfootnote(String ffootnote){
	    this.ffootnote=ffootnote;
	}
	public String getFfootnote(){
	    return ffootnote;
	}
	public void setUuid(String uuid){
	    this.uuid=uuid;
	}
	public String getUuid(){
	    return uuid;
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
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setUserialid(String userialid){
	    this.userialid=userialid;
	}
	public String getUserialid(){
	    return userialid;
	}
}