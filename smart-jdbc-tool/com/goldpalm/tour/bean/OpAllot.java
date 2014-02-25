package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * OpAllot entity for t_op_allot table.
 * 
 * 
 * @since 2014-02-17 17:24:40.828
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_op_allot")	
public class OpAllot implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="clinktable")
	private String clinktable;
	
	@Column(name="ulinktableid")
	private String ulinktableid;
	
	@Column(name="upriorcorpid")
	private String upriorcorpid;
	
	@Column(name="upriorroleid")
	private String upriorroleid;
	
	@Column(name="uprioruserid")
	private String uprioruserid;
	
	@Column(name="upriordeptid")
	private String upriordeptid;
	
	@Column(name="iallottimes")
	private Integer iallottimes;
	
	@Column(name="callotmemo")
	private String callotmemo;
	
	@Column(name="uallotdeptid")
	private String uallotdeptid;
	
	@Column(name="uallotuserid")
	private String uallotuserid;
	
	@Column(name="uallotroleid")
	private String uallotroleid;
	
	@Column(name="dallotdate")
	private Date dallotdate;
	
	@Column(name="utargetdeptid")
	private String utargetdeptid;
	
	@Column(name="csubflag")
	private String csubflag;
	
	@Column(name="utargetroleid")
	private String utargetroleid;
	
	@Column(name="utargetuserid")
	private String utargetuserid;
	
	@Column(name="ccatchstatus")
	private String ccatchstatus;
	
	@Column(name="ucatchuserid")
	private String ucatchuserid;
	
	@Column(name="ucatchroleid")
	private String ucatchroleid;
	
	@Column(name="ucatchdeptid")
	private String ucatchdeptid;
	
	@Column(name="dcatchdate")
	private Date dcatchdate;
	
	@Column(name="crange")
	private String crange;
	
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
	public void setUlinktableid(String ulinktableid){
	    this.ulinktableid=ulinktableid;
	}
	public String getUlinktableid(){
	    return ulinktableid;
	}
	public void setUpriorcorpid(String upriorcorpid){
	    this.upriorcorpid=upriorcorpid;
	}
	public String getUpriorcorpid(){
	    return upriorcorpid;
	}
	public void setUpriorroleid(String upriorroleid){
	    this.upriorroleid=upriorroleid;
	}
	public String getUpriorroleid(){
	    return upriorroleid;
	}
	public void setUprioruserid(String uprioruserid){
	    this.uprioruserid=uprioruserid;
	}
	public String getUprioruserid(){
	    return uprioruserid;
	}
	public void setUpriordeptid(String upriordeptid){
	    this.upriordeptid=upriordeptid;
	}
	public String getUpriordeptid(){
	    return upriordeptid;
	}
	public void setIallottimes(Integer iallottimes){
	    this.iallottimes=iallottimes;
	}
	public Integer getIallottimes(){
	    return iallottimes;
	}
	public void setCallotmemo(String callotmemo){
	    this.callotmemo=callotmemo;
	}
	public String getCallotmemo(){
	    return callotmemo;
	}
	public void setUallotdeptid(String uallotdeptid){
	    this.uallotdeptid=uallotdeptid;
	}
	public String getUallotdeptid(){
	    return uallotdeptid;
	}
	public void setUallotuserid(String uallotuserid){
	    this.uallotuserid=uallotuserid;
	}
	public String getUallotuserid(){
	    return uallotuserid;
	}
	public void setUallotroleid(String uallotroleid){
	    this.uallotroleid=uallotroleid;
	}
	public String getUallotroleid(){
	    return uallotroleid;
	}
	public void setDallotdate(Date dallotdate){
	    this.dallotdate=dallotdate;
	}
	public Date getDallotdate(){
	    return dallotdate;
	}
	public void setUtargetdeptid(String utargetdeptid){
	    this.utargetdeptid=utargetdeptid;
	}
	public String getUtargetdeptid(){
	    return utargetdeptid;
	}
	public void setCsubflag(String csubflag){
	    this.csubflag=csubflag;
	}
	public String getCsubflag(){
	    return csubflag;
	}
	public void setUtargetroleid(String utargetroleid){
	    this.utargetroleid=utargetroleid;
	}
	public String getUtargetroleid(){
	    return utargetroleid;
	}
	public void setUtargetuserid(String utargetuserid){
	    this.utargetuserid=utargetuserid;
	}
	public String getUtargetuserid(){
	    return utargetuserid;
	}
	public void setCcatchstatus(String ccatchstatus){
	    this.ccatchstatus=ccatchstatus;
	}
	public String getCcatchstatus(){
	    return ccatchstatus;
	}
	public void setUcatchuserid(String ucatchuserid){
	    this.ucatchuserid=ucatchuserid;
	}
	public String getUcatchuserid(){
	    return ucatchuserid;
	}
	public void setUcatchroleid(String ucatchroleid){
	    this.ucatchroleid=ucatchroleid;
	}
	public String getUcatchroleid(){
	    return ucatchroleid;
	}
	public void setUcatchdeptid(String ucatchdeptid){
	    this.ucatchdeptid=ucatchdeptid;
	}
	public String getUcatchdeptid(){
	    return ucatchdeptid;
	}
	public void setDcatchdate(Date dcatchdate){
	    this.dcatchdate=dcatchdate;
	}
	public Date getDcatchdate(){
	    return dcatchdate;
	}
	public void setCrange(String crange){
	    this.crange=crange;
	}
	public String getCrange(){
	    return crange;
	}
}