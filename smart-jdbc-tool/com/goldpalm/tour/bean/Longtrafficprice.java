package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Longtrafficprice entity for t_longtrafficprice table.
 * 
 * 
 * @since 2014-02-17 17:24:40.194
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_longtrafficprice")	
public class Longtrafficprice implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ulongtrafficid")
	private String ulongtrafficid;
	
	@Column(name="cpassengertype")
	private String cpassengertype;
	
	@Column(name="dbgndate")
	private Date dbgndate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="cur")
	private String cur;
	
	@Column(name="nprice")
	private Double nprice;
	
	@Column(name="nprice1")
	private Double nprice1;
	
	@Column(name="nprice2")
	private Double nprice2;
	
	@Column(name="nprice3")
	private Double nprice3;
	
	@Column(name="nprice4")
	private Double nprice4;
	
	@Column(name="nprice5")
	private Double nprice5;
	
	@Column(name="ntax")
	private Double ntax;
	
	@Column(name="ntax1")
	private Double ntax1;
	
	@Column(name="ntax2")
	private Double ntax2;
	
	@Column(name="ntax3")
	private Double ntax3;
	
	@Column(name="ntax4")
	private Double ntax4;
	
	@Column(name="ntax5")
	private Double ntax5;
	
	@Column(name="cclasscode")
	private String cclasscode;
	
	@Column(name="cclasscode1")
	private String cclasscode1;
	
	@Column(name="cclasscode2")
	private String cclasscode2;
	
	@Column(name="cclasscode3")
	private String cclasscode3;
	
	@Column(name="cclasscode4")
	private String cclasscode4;
	
	@Column(name="cclasscode5")
	private String cclasscode5;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="usourceid")
	private String usourceid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="iminduration")
	private Integer iminduration;
	
	@Column(name="imaxduration")
	private Integer imaxduration;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUlongtrafficid(String ulongtrafficid){
	    this.ulongtrafficid=ulongtrafficid;
	}
	public String getUlongtrafficid(){
	    return ulongtrafficid;
	}
	public void setCpassengertype(String cpassengertype){
	    this.cpassengertype=cpassengertype;
	}
	public String getCpassengertype(){
	    return cpassengertype;
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
	public void setCur(String cur){
	    this.cur=cur;
	}
	public String getCur(){
	    return cur;
	}
	public void setNprice(Double nprice){
	    this.nprice=nprice;
	}
	public Double getNprice(){
	    return nprice;
	}
	public void setNprice1(Double nprice1){
	    this.nprice1=nprice1;
	}
	public Double getNprice1(){
	    return nprice1;
	}
	public void setNprice2(Double nprice2){
	    this.nprice2=nprice2;
	}
	public Double getNprice2(){
	    return nprice2;
	}
	public void setNprice3(Double nprice3){
	    this.nprice3=nprice3;
	}
	public Double getNprice3(){
	    return nprice3;
	}
	public void setNprice4(Double nprice4){
	    this.nprice4=nprice4;
	}
	public Double getNprice4(){
	    return nprice4;
	}
	public void setNprice5(Double nprice5){
	    this.nprice5=nprice5;
	}
	public Double getNprice5(){
	    return nprice5;
	}
	public void setNtax(Double ntax){
	    this.ntax=ntax;
	}
	public Double getNtax(){
	    return ntax;
	}
	public void setNtax1(Double ntax1){
	    this.ntax1=ntax1;
	}
	public Double getNtax1(){
	    return ntax1;
	}
	public void setNtax2(Double ntax2){
	    this.ntax2=ntax2;
	}
	public Double getNtax2(){
	    return ntax2;
	}
	public void setNtax3(Double ntax3){
	    this.ntax3=ntax3;
	}
	public Double getNtax3(){
	    return ntax3;
	}
	public void setNtax4(Double ntax4){
	    this.ntax4=ntax4;
	}
	public Double getNtax4(){
	    return ntax4;
	}
	public void setNtax5(Double ntax5){
	    this.ntax5=ntax5;
	}
	public Double getNtax5(){
	    return ntax5;
	}
	public void setCclasscode(String cclasscode){
	    this.cclasscode=cclasscode;
	}
	public String getCclasscode(){
	    return cclasscode;
	}
	public void setCclasscode1(String cclasscode1){
	    this.cclasscode1=cclasscode1;
	}
	public String getCclasscode1(){
	    return cclasscode1;
	}
	public void setCclasscode2(String cclasscode2){
	    this.cclasscode2=cclasscode2;
	}
	public String getCclasscode2(){
	    return cclasscode2;
	}
	public void setCclasscode3(String cclasscode3){
	    this.cclasscode3=cclasscode3;
	}
	public String getCclasscode3(){
	    return cclasscode3;
	}
	public void setCclasscode4(String cclasscode4){
	    this.cclasscode4=cclasscode4;
	}
	public String getCclasscode4(){
	    return cclasscode4;
	}
	public void setCclasscode5(String cclasscode5){
	    this.cclasscode5=cclasscode5;
	}
	public String getCclasscode5(){
	    return cclasscode5;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
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
	public void setUsourceid(String usourceid){
	    this.usourceid=usourceid;
	}
	public String getUsourceid(){
	    return usourceid;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setIminduration(Integer iminduration){
	    this.iminduration=iminduration;
	}
	public Integer getIminduration(){
	    return iminduration;
	}
	public void setImaxduration(Integer imaxduration){
	    this.imaxduration=imaxduration;
	}
	public Integer getImaxduration(){
	    return imaxduration;
	}
}