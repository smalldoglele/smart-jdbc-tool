package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * RoleAllot entity for t_role_allot table.
 * 
 * 
 * @since 2014-02-17 17:24:42.895
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_role_allot")	
public class RoleAllot implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="upriorroleid")
	private String upriorroleid;
	
	@Column(name="utargetroleid")
	private String utargetroleid;
	
	@Column(name="dbegindate")
	private Date dbegindate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="callottype")
	private String callottype;
	
	@Column(name="callotmemo")
	private String callotmemo;
	
	@Column(name="uallotuserid")
	private String uallotuserid;
	
	@Column(name="uallotroleid")
	private String uallotroleid;
	
	@Column(name="uallotdeptid")
	private String uallotdeptid;
	
	@Column(name="dallotdate")
	private Date dallotdate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUpriorroleid(String upriorroleid){
	    this.upriorroleid=upriorroleid;
	}
	public String getUpriorroleid(){
	    return upriorroleid;
	}
	public void setUtargetroleid(String utargetroleid){
	    this.utargetroleid=utargetroleid;
	}
	public String getUtargetroleid(){
	    return utargetroleid;
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
	public void setCallottype(String callottype){
	    this.callottype=callottype;
	}
	public String getCallottype(){
	    return callottype;
	}
	public void setCallotmemo(String callotmemo){
	    this.callotmemo=callotmemo;
	}
	public String getCallotmemo(){
	    return callotmemo;
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
	public void setUallotdeptid(String uallotdeptid){
	    this.uallotdeptid=uallotdeptid;
	}
	public String getUallotdeptid(){
	    return uallotdeptid;
	}
	public void setDallotdate(Date dallotdate){
	    this.dallotdate=dallotdate;
	}
	public Date getDallotdate(){
	    return dallotdate;
	}
}