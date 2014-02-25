package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Compact entity for t_compact table.
 * 
 * 
 * @since 2014-02-17 17:24:37.111
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_compact")	
public class Compact implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uuid;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="ccompactno")
	private String ccompactno;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="dbgndate")
	private Date dbgndate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="dcreatedate")
	private Date dcreatedate;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="ucomfirmuserid")
	private String ucomfirmuserid;
	
	@Column(name="ucomfirmdeptid")
	private String ucomfirmdeptid;
	
	@Column(name="ucomfirmcorpid")
	private String ucomfirmcorpid;
	
	@Column(name="ucancelsureuserid")
	private String ucancelsureuserid;
	
	@Column(name="ucancelsuredeptid")
	private String ucancelsuredeptid;
	
	@Column(name="ucancelsurecorpid")
	private String ucancelsurecorpid;
	
	@Column(name="ucanceluserid")
	private String ucanceluserid;
	
	@Column(name="ucanceldeptid")
	private String ucanceldeptid;
	
	@Column(name="ucancelcorpid")
	private String ucancelcorpid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="ucompactpackageid")
	private String ucompactpackageid;
	
	public void setUuid(String uuid){
	    this.uuid=uuid;
	}
	public String getUuid(){
	    return uuid;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setCcompactno(String ccompactno){
	    this.ccompactno=ccompactno;
	}
	public String getCcompactno(){
	    return ccompactno;
	}
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
	public void setDbgndate(Date dbgndate){
	    this.dbgndate=dbgndate;
	}
	public Date getDbgndate(){
	    return dbgndate;
	}
	public void setDenddate(Date denddate){
	    this.denddate=denddate;
	}
	public Date getDenddate(){
	    return denddate;
	}
	public void setDcreatedate(Date dcreatedate){
	    this.dcreatedate=dcreatedate;
	}
	public Date getDcreatedate(){
	    return dcreatedate;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setUcomfirmuserid(String ucomfirmuserid){
	    this.ucomfirmuserid=ucomfirmuserid;
	}
	public String getUcomfirmuserid(){
	    return ucomfirmuserid;
	}
	public void setUcomfirmdeptid(String ucomfirmdeptid){
	    this.ucomfirmdeptid=ucomfirmdeptid;
	}
	public String getUcomfirmdeptid(){
	    return ucomfirmdeptid;
	}
	public void setUcomfirmcorpid(String ucomfirmcorpid){
	    this.ucomfirmcorpid=ucomfirmcorpid;
	}
	public String getUcomfirmcorpid(){
	    return ucomfirmcorpid;
	}
	public void setUcancelsureuserid(String ucancelsureuserid){
	    this.ucancelsureuserid=ucancelsureuserid;
	}
	public String getUcancelsureuserid(){
	    return ucancelsureuserid;
	}
	public void setUcancelsuredeptid(String ucancelsuredeptid){
	    this.ucancelsuredeptid=ucancelsuredeptid;
	}
	public String getUcancelsuredeptid(){
	    return ucancelsuredeptid;
	}
	public void setUcancelsurecorpid(String ucancelsurecorpid){
	    this.ucancelsurecorpid=ucancelsurecorpid;
	}
	public String getUcancelsurecorpid(){
	    return ucancelsurecorpid;
	}
	public void setUcanceluserid(String ucanceluserid){
	    this.ucanceluserid=ucanceluserid;
	}
	public String getUcanceluserid(){
	    return ucanceluserid;
	}
	public void setUcanceldeptid(String ucanceldeptid){
	    this.ucanceldeptid=ucanceldeptid;
	}
	public String getUcanceldeptid(){
	    return ucanceldeptid;
	}
	public void setUcancelcorpid(String ucancelcorpid){
	    this.ucancelcorpid=ucancelcorpid;
	}
	public String getUcancelcorpid(){
	    return ucancelcorpid;
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
	public void setUroleid(String uroleid){
	    this.uroleid=uroleid;
	}
	public String getUroleid(){
	    return uroleid;
	}
	public void setUcompactpackageid(String ucompactpackageid){
	    this.ucompactpackageid=ucompactpackageid;
	}
	public String getUcompactpackageid(){
	    return ucompactpackageid;
	}
}