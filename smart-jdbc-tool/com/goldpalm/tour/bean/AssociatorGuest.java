package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * AssociatorGuest entity for t_associator_guest table.
 * 
 * 
 * @since 2014-02-17 17:24:35.794
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_associator_guest")	
public class AssociatorGuest implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="cassid")
	private String cassid;
	
	@Column(name="cguestname")
	private String cguestname;
	
	@Column(name="cguestsex")
	private String cguestsex;
	
	@Column(name="persontype")
	private String persontype;
	
	@Column(name="dbirthday")
	private Date dbirthday;
	
	@Column(name="ccertificatetype")
	private String ccertificatetype;
	
	@Column(name="ccertificateid")
	private String ccertificateid;
	
	@Column(name="cmobileno")
	private String cmobileno;
	
	@Column(name="ccontactinfo")
	private String ccontactinfo;
	
	@Column(name="ccertificatetype2")
	private String ccertificatetype2;
	
	@Column(name="ccertificateid2")
	private String ccertificateid2;
	
	@Column(name="ccertificatetype3")
	private String ccertificatetype3;
	
	@Column(name="ccertificateid3")
	private String ccertificateid3;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCassid(String cassid){
	    this.cassid=cassid;
	}
	public String getCassid(){
	    return cassid;
	}
	public void setCguestname(String cguestname){
	    this.cguestname=cguestname;
	}
	public String getCguestname(){
	    return cguestname;
	}
	public void setCguestsex(String cguestsex){
	    this.cguestsex=cguestsex;
	}
	public String getCguestsex(){
	    return cguestsex;
	}
	public void setPersontype(String persontype){
	    this.persontype=persontype;
	}
	public String getPersontype(){
	    return persontype;
	}
	public void setDbirthday(Date dbirthday){
	    this.dbirthday=dbirthday;
	}
	public Date getDbirthday(){
	    return dbirthday;
	}
	public void setCcertificatetype(String ccertificatetype){
	    this.ccertificatetype=ccertificatetype;
	}
	public String getCcertificatetype(){
	    return ccertificatetype;
	}
	public void setCcertificateid(String ccertificateid){
	    this.ccertificateid=ccertificateid;
	}
	public String getCcertificateid(){
	    return ccertificateid;
	}
	public void setCmobileno(String cmobileno){
	    this.cmobileno=cmobileno;
	}
	public String getCmobileno(){
	    return cmobileno;
	}
	public void setCcontactinfo(String ccontactinfo){
	    this.ccontactinfo=ccontactinfo;
	}
	public String getCcontactinfo(){
	    return ccontactinfo;
	}
	public void setCcertificatetype2(String ccertificatetype2){
	    this.ccertificatetype2=ccertificatetype2;
	}
	public String getCcertificatetype2(){
	    return ccertificatetype2;
	}
	public void setCcertificateid2(String ccertificateid2){
	    this.ccertificateid2=ccertificateid2;
	}
	public String getCcertificateid2(){
	    return ccertificateid2;
	}
	public void setCcertificatetype3(String ccertificatetype3){
	    this.ccertificatetype3=ccertificatetype3;
	}
	public String getCcertificatetype3(){
	    return ccertificatetype3;
	}
	public void setCcertificateid3(String ccertificateid3){
	    this.ccertificateid3=ccertificateid3;
	}
	public String getCcertificateid3(){
	    return ccertificateid3;
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
}