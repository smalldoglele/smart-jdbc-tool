package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Product entity for t_product table.
 * 
 * 
 * @since 2014-02-17 17:24:42.501
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_product")	
public class Product implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="usupplierid")
	private String usupplierid;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="cproductname")
	private String cproductname;
	
	@Column(name="ccoverage")
	private String ccoverage;
	
	@Column(name="idays")
	private Integer idays;
	
	@Column(name="uinterfaceid")
	private String uinterfaceid;
	
	@Column(name="npremium")
	private Double npremium;
	
	@Column(name="dbgndate")
	private Date dbgndate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="cisvalid")
	private String cisvalid;
	
	@Column(name="idayslowerbound")
	private Integer idayslowerbound;
	
	@Column(name="cproductcode")
	private String cproductcode;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="cplancode")
	private String cplancode;
	
	@Column(name="cplanname")
	private String cplanname;
	
	@Column(name="csubplancode")
	private String csubplancode;
	
	@Column(name="csubplanname")
	private String csubplanname;
	
	@Column(name="iagelower")
	private Integer iagelower;
	
	@Column(name="iageupper")
	private Integer iageupper;
	
	@Column(name="cteamtype")
	private String cteamtype;
	
	@Column(name="carea")
	private String carea;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUsupplierid(String usupplierid){
	    this.usupplierid=usupplierid;
	}
	public String getUsupplierid(){
	    return usupplierid;
	}
	public void setCcode(String ccode){
	    this.ccode=ccode;
	}
	public String getCcode(){
	    return ccode;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setCproductname(String cproductname){
	    this.cproductname=cproductname;
	}
	public String getCproductname(){
	    return cproductname;
	}
	public void setCcoverage(String ccoverage){
	    this.ccoverage=ccoverage;
	}
	public String getCcoverage(){
	    return ccoverage;
	}
	public void setIdays(Integer idays){
	    this.idays=idays;
	}
	public Integer getIdays(){
	    return idays;
	}
	public void setUinterfaceid(String uinterfaceid){
	    this.uinterfaceid=uinterfaceid;
	}
	public String getUinterfaceid(){
	    return uinterfaceid;
	}
	public void setNpremium(Double npremium){
	    this.npremium=npremium;
	}
	public Double getNpremium(){
	    return npremium;
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
	public void setCisvalid(String cisvalid){
	    this.cisvalid=cisvalid;
	}
	public String getCisvalid(){
	    return cisvalid;
	}
	public void setIdayslowerbound(Integer idayslowerbound){
	    this.idayslowerbound=idayslowerbound;
	}
	public Integer getIdayslowerbound(){
	    return idayslowerbound;
	}
	public void setCproductcode(String cproductcode){
	    this.cproductcode=cproductcode;
	}
	public String getCproductcode(){
	    return cproductcode;
	}
	public void setCname(String cname){
	    this.cname=cname;
	}
	public String getCname(){
	    return cname;
	}
	public void setCplancode(String cplancode){
	    this.cplancode=cplancode;
	}
	public String getCplancode(){
	    return cplancode;
	}
	public void setCplanname(String cplanname){
	    this.cplanname=cplanname;
	}
	public String getCplanname(){
	    return cplanname;
	}
	public void setCsubplancode(String csubplancode){
	    this.csubplancode=csubplancode;
	}
	public String getCsubplancode(){
	    return csubplancode;
	}
	public void setCsubplanname(String csubplanname){
	    this.csubplanname=csubplanname;
	}
	public String getCsubplanname(){
	    return csubplanname;
	}
	public void setIagelower(Integer iagelower){
	    this.iagelower=iagelower;
	}
	public Integer getIagelower(){
	    return iagelower;
	}
	public void setIageupper(Integer iageupper){
	    this.iageupper=iageupper;
	}
	public Integer getIageupper(){
	    return iageupper;
	}
	public void setCteamtype(String cteamtype){
	    this.cteamtype=cteamtype;
	}
	public String getCteamtype(){
	    return cteamtype;
	}
	public void setCarea(String carea){
	    this.carea=carea;
	}
	public String getCarea(){
	    return carea;
	}
}