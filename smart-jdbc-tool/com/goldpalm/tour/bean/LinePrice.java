package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * LinePrice entity for t_line_price table.
 * 
 * 
 * @since 2014-02-17 17:24:39.819
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_line_price")	
public class LinePrice implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ulineid")
	private String ulineid;
	
	@Column(name="cprcitem")
	private String cprcitem;
	
	@Column(name="cprctype")
	private String cprctype;
	
	@Column(name="ccur")
	private String ccur;
	
	@Column(name="nprice")
	private Double nprice;
	
	@Column(name="nprice1")
	private Double nprice1;
	
	@Column(name="nprice2")
	private Double nprice2;
	
	@Column(name="nprice3")
	private Double nprice3;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="nminprice")
	private Double nminprice;
	
	@Column(name="cdisable")
	private String cdisable;
	
	@Column(name="iqty")
	private Integer iqty;
	
	@Column(name="cissue")
	private String cissue;
	
	@Column(name="ino")
	private Integer ino;
	
	@Column(name="nnetprice")
	private Double nnetprice;
	
	@Column(name="idiscountplanqty")
	private Integer idiscountplanqty;
	
	@Column(name="cisdiscount")
	private String cisdiscount;
	
	@Column(name="cdsdfflag")
	private String cdsdfflag;
	
	@Column(name="cisvalid")
	private String cisvalid;
	
	@Column(name="cissince")
	private String cissince;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUlineid(String ulineid){
	    this.ulineid=ulineid;
	}
	public String getUlineid(){
	    return ulineid;
	}
	public void setCprcitem(String cprcitem){
	    this.cprcitem=cprcitem;
	}
	public String getCprcitem(){
	    return cprcitem;
	}
	public void setCprctype(String cprctype){
	    this.cprctype=cprctype;
	}
	public String getCprctype(){
	    return cprctype;
	}
	public void setCcur(String ccur){
	    this.ccur=ccur;
	}
	public String getCcur(){
	    return ccur;
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
	public void setNminprice(Double nminprice){
	    this.nminprice=nminprice;
	}
	public Double getNminprice(){
	    return nminprice;
	}
	public void setCdisable(String cdisable){
	    this.cdisable=cdisable;
	}
	public String getCdisable(){
	    return cdisable;
	}
	public void setIqty(Integer iqty){
	    this.iqty=iqty;
	}
	public Integer getIqty(){
	    return iqty;
	}
	public void setCissue(String cissue){
	    this.cissue=cissue;
	}
	public String getCissue(){
	    return cissue;
	}
	public void setIno(Integer ino){
	    this.ino=ino;
	}
	public Integer getIno(){
	    return ino;
	}
	public void setNnetprice(Double nnetprice){
	    this.nnetprice=nnetprice;
	}
	public Double getNnetprice(){
	    return nnetprice;
	}
	public void setIdiscountplanqty(Integer idiscountplanqty){
	    this.idiscountplanqty=idiscountplanqty;
	}
	public Integer getIdiscountplanqty(){
	    return idiscountplanqty;
	}
	public void setCisdiscount(String cisdiscount){
	    this.cisdiscount=cisdiscount;
	}
	public String getCisdiscount(){
	    return cisdiscount;
	}
	public void setCdsdfflag(String cdsdfflag){
	    this.cdsdfflag=cdsdfflag;
	}
	public String getCdsdfflag(){
	    return cdsdfflag;
	}
	public void setCisvalid(String cisvalid){
	    this.cisvalid=cisvalid;
	}
	public String getCisvalid(){
	    return cisvalid;
	}
	public void setCissince(String cissince){
	    this.cissince=cissince;
	}
	public String getCissince(){
	    return cissince;
	}
}