package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * OrderTour entity for t_order_tour table.
 * 
 * 
 * @since 2014-02-17 17:24:41.564
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_order_tour")	
public class OrderTour implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uorderid")
	private String uorderid;
	
	@Column(name="uteamid")
	private String uteamid;
	
	@Column(name="uteamcode")
	private String uteamcode;
	
	@Column(name="ulineid")
	private String ulineid;
	
	@Column(name="ulinename")
	private String ulinename;
	
	@Column(name="uteamsourceuid")
	private String uteamsourceuid;
	
	@Column(name="idays")
	private Integer idays;
	
	@Column(name="dbgndate")
	private Date dbgndate;
	
	@Column(name="denddate")
	private Date denddate;
	
	@Column(name="iperson")
	private Integer iperson;
	
	@Column(name="iadults")
	private Integer iadults;
	
	@Column(name="ichilds")
	private Integer ichilds;
	
	@Column(name="cdemand")
	private String cdemand;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="uroleid")
	private String uroleid;
	
	@Column(name="uuserid")
	private String uuserid;
	
	@Column(name="udeptid")
	private String udeptid;
	
	@Column(name="cstatus")
	private String cstatus;
	
	@Column(name="idoubleroom")
	private Integer idoubleroom;
	
	@Column(name="itripleroom")
	private Integer itripleroom;
	
	@Column(name="ibabys")
	private Integer ibabys;
	
	@Column(name="iolds")
	private Integer iolds;
	
	@Column(name="cstarlevel")
	private String cstarlevel;
	
	@Column(name="isingleroom")
	private Integer isingleroom;
	
	@Column(name="iextrabed")
	private Integer iextrabed;
	
	@Column(name="isinglemale")
	private Integer isinglemale;
	
	@Column(name="isinglefemale")
	private Integer isinglefemale;
	
	@Column(name="cchangetype")
	private String cchangetype;
	
	@Column(name="cchangememo")
	private String cchangememo;
	
	@Column(name="cbalance")
	private String cbalance;
	
	@Column(name="cbalancecost")
	private String cbalancecost;
	
	@Column(name="dbalance")
	private Date dbalance;
	
	@Column(name="dbalancecost")
	private Date dbalancecost;
	
	@Column(name="cbatchnogys")
	private String cbatchnogys;
	
	@Column(name="cmemo2")
	private String cmemo2;
	
	@Column(name="cordernov7s")
	private String cordernov7s;
	
	@Column(name="nbalancediscount")
	private Integer nbalancediscount;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUorderid(String uorderid){
	    this.uorderid=uorderid;
	}
	public String getUorderid(){
	    return uorderid;
	}
	public void setUteamid(String uteamid){
	    this.uteamid=uteamid;
	}
	public String getUteamid(){
	    return uteamid;
	}
	public void setUteamcode(String uteamcode){
	    this.uteamcode=uteamcode;
	}
	public String getUteamcode(){
	    return uteamcode;
	}
	public void setUlineid(String ulineid){
	    this.ulineid=ulineid;
	}
	public String getUlineid(){
	    return ulineid;
	}
	public void setUlinename(String ulinename){
	    this.ulinename=ulinename;
	}
	public String getUlinename(){
	    return ulinename;
	}
	public void setUteamsourceuid(String uteamsourceuid){
	    this.uteamsourceuid=uteamsourceuid;
	}
	public String getUteamsourceuid(){
	    return uteamsourceuid;
	}
	public void setIdays(Integer idays){
	    this.idays=idays;
	}
	public Integer getIdays(){
	    return idays;
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
	public void setIperson(Integer iperson){
	    this.iperson=iperson;
	}
	public Integer getIperson(){
	    return iperson;
	}
	public void setIadults(Integer iadults){
	    this.iadults=iadults;
	}
	public Integer getIadults(){
	    return iadults;
	}
	public void setIchilds(Integer ichilds){
	    this.ichilds=ichilds;
	}
	public Integer getIchilds(){
	    return ichilds;
	}
	public void setCdemand(String cdemand){
	    this.cdemand=cdemand;
	}
	public String getCdemand(){
	    return cdemand;
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
	public void setCstatus(String cstatus){
	    this.cstatus=cstatus;
	}
	public String getCstatus(){
	    return cstatus;
	}
	public void setIdoubleroom(Integer idoubleroom){
	    this.idoubleroom=idoubleroom;
	}
	public Integer getIdoubleroom(){
	    return idoubleroom;
	}
	public void setItripleroom(Integer itripleroom){
	    this.itripleroom=itripleroom;
	}
	public Integer getItripleroom(){
	    return itripleroom;
	}
	public void setIbabys(Integer ibabys){
	    this.ibabys=ibabys;
	}
	public Integer getIbabys(){
	    return ibabys;
	}
	public void setIolds(Integer iolds){
	    this.iolds=iolds;
	}
	public Integer getIolds(){
	    return iolds;
	}
	public void setCstarlevel(String cstarlevel){
	    this.cstarlevel=cstarlevel;
	}
	public String getCstarlevel(){
	    return cstarlevel;
	}
	public void setIsingleroom(Integer isingleroom){
	    this.isingleroom=isingleroom;
	}
	public Integer getIsingleroom(){
	    return isingleroom;
	}
	public void setIextrabed(Integer iextrabed){
	    this.iextrabed=iextrabed;
	}
	public Integer getIextrabed(){
	    return iextrabed;
	}
	public void setIsinglemale(Integer isinglemale){
	    this.isinglemale=isinglemale;
	}
	public Integer getIsinglemale(){
	    return isinglemale;
	}
	public void setIsinglefemale(Integer isinglefemale){
	    this.isinglefemale=isinglefemale;
	}
	public Integer getIsinglefemale(){
	    return isinglefemale;
	}
	public void setCchangetype(String cchangetype){
	    this.cchangetype=cchangetype;
	}
	public String getCchangetype(){
	    return cchangetype;
	}
	public void setCchangememo(String cchangememo){
	    this.cchangememo=cchangememo;
	}
	public String getCchangememo(){
	    return cchangememo;
	}
	public void setCbalance(String cbalance){
	    this.cbalance=cbalance;
	}
	public String getCbalance(){
	    return cbalance;
	}
	public void setCbalancecost(String cbalancecost){
	    this.cbalancecost=cbalancecost;
	}
	public String getCbalancecost(){
	    return cbalancecost;
	}
	public void setDbalance(Date dbalance){
	    this.dbalance=dbalance;
	}
	public Date getDbalance(){
	    return dbalance;
	}
	public void setDbalancecost(Date dbalancecost){
	    this.dbalancecost=dbalancecost;
	}
	public Date getDbalancecost(){
	    return dbalancecost;
	}
	public void setCbatchnogys(String cbatchnogys){
	    this.cbatchnogys=cbatchnogys;
	}
	public String getCbatchnogys(){
	    return cbatchnogys;
	}
	public void setCmemo2(String cmemo2){
	    this.cmemo2=cmemo2;
	}
	public String getCmemo2(){
	    return cmemo2;
	}
	public void setCordernov7s(String cordernov7s){
	    this.cordernov7s=cordernov7s;
	}
	public String getCordernov7s(){
	    return cordernov7s;
	}
	public void setNbalancediscount(Integer nbalancediscount){
	    this.nbalancediscount=nbalancediscount;
	}
	public Integer getNbalancediscount(){
	    return nbalancediscount;
	}
}