package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Accountrp entity for t_accountrp table.
 * 
 * 
 * @since 2014-02-17 17:24:34.816
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_accountrp")	
public class Accountrp implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="doccurdate")
	private Date doccurdate;
	
	@Column(name="cinitialflag")
	private String cinitialflag;
	
	@Column(name="uorderid")
	private String uorderid;
	
	@Column(name="corderno")
	private String corderno;
	
	@Column(name="cobjecttype")
	private String cobjecttype;
	
	@Column(name="cprctype")
	private String cprctype;
	
	@Column(name="nintitialprice")
	private Double nintitialprice;
	
	@Column(name="ndiscount")
	private Double ndiscount;
	
	@Column(name="namountf")
	private Double namountf;
	
	@Column(name="nexchangerate")
	private Double nexchangerate;
	
	@Column(name="namount")
	private Double namount;
	
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
	
	@Column(name="cagentprice")
	private Double cagentprice;
	
	@Column(name="crpmode")
	private String crpmode;
	
	@Column(name="crpcur")
	private String crpcur;
	
	@Column(name="nrprate")
	private Double nrprate;
	
	@Column(name="nrpamountf")
	private Double nrpamountf;
	
	@Column(name="nrpamount")
	private Double nrpamount;
	
	@Column(name="uCorpID")
	private String uCorpID;
	
	@Column(name="nAgentPrice")
	private Double nAgentPrice;
	
	@Column(name="nQty")
	private Double nQty;
	
	@Column(name="nSinglePrice")
	private Double nSinglePrice;
	
	@Column(name="cCur")
	private String cCur;
	
	@Column(name="iBackFlag")
	private Integer iBackFlag;
	
	@Column(name="uAccountRPID")
	private String uAccountRPID;
	
	@Column(name="uPriceID")
	private String uPriceID;
	
	@Column(name="crpflag")
	private String crpflag;
	
	@Column(name="uRPCorpID")
	private String uRPCorpID;
	
	@Column(name="usenduserid")
	private String usenduserid;
	
	@Column(name="usenddeptid")
	private String usenddeptid;
	
	@Column(name="dsenddate")
	private Date dsenddate;
	
	@Column(name="csend")
	private String csend;
	
	@Column(name="ubalanceuserid")
	private String ubalanceuserid;
	
	@Column(name="ubalancedeptid")
	private String ubalancedeptid;
	
	@Column(name="ubalancedate")
	private Date ubalancedate;
	
	@Column(name="cbalance")
	private String cbalance;
	
	@Column(name="uteamid")
	private String uteamid;
	
	@Column(name="dbalancedate")
	private Date dbalancedate;
	
	@Column(name="fvoucherid")
	private String fvoucherid;
	
	@Column(name="nsinglecost")
	private Double nsinglecost;
	
	@Column(name="ncost")
	private Double ncost;
	
	@Column(name="cdiscounttype")
	private String cdiscounttype;
	
	@Column(name="cCostSendCode")
	private String cCostSendCode;
	
	@Column(name="uCostSendUserID")
	private String uCostSendUserID;
	
	@Column(name="uCostSendDeptID")
	private String uCostSendDeptID;
	
	@Column(name="uCostConfirmUserID")
	private String uCostConfirmUserID;
	
	@Column(name="uCostConfirmDeptID")
	private String uCostConfirmDeptID;
	
	@Column(name="dCostSendDate")
	private Date dCostSendDate;
	
	@Column(name="uCostConfirmDate")
	private Date uCostConfirmDate;
	
	@Column(name="cCostSend")
	private String cCostSend;
	
	@Column(name="cCostConfirm")
	private String cCostConfirm;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="uaccountrp2id")
	private String uaccountrp2id;
	
	@Column(name="cbelong")
	private String cbelong;
	
	@Column(name="salerpaymentflag")
	private String salerpaymentflag;
	
	@Column(name="cguidesendflag")
	private String cguidesendflag;
	
	@Column(name="uguiderrenderid")
	private String uguiderrenderid;
	
	@Column(name="csplitflag")
	private String csplitflag;
	
	@Column(name="Cfinancialmemo")
	private String cfinancialmemo;
	
	@Column(name="upricestrategyid")
	private String upricestrategyid;
	
	@Column(name="uguideid")
	private String uguideid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setDoccurdate(Date doccurdate){
	    this.doccurdate=doccurdate;
	}
	public Date getDoccurdate(){
	    return doccurdate;
	}
	public void setCinitialflag(String cinitialflag){
	    this.cinitialflag=cinitialflag;
	}
	public String getCinitialflag(){
	    return cinitialflag;
	}
	public void setUorderid(String uorderid){
	    this.uorderid=uorderid;
	}
	public String getUorderid(){
	    return uorderid;
	}
	public void setCorderno(String corderno){
	    this.corderno=corderno;
	}
	public String getCorderno(){
	    return corderno;
	}
	public void setCobjecttype(String cobjecttype){
	    this.cobjecttype=cobjecttype;
	}
	public String getCobjecttype(){
	    return cobjecttype;
	}
	public void setCprctype(String cprctype){
	    this.cprctype=cprctype;
	}
	public String getCprctype(){
	    return cprctype;
	}
	public void setNintitialprice(Double nintitialprice){
	    this.nintitialprice=nintitialprice;
	}
	public Double getNintitialprice(){
	    return nintitialprice;
	}
	public void setNdiscount(Double ndiscount){
	    this.ndiscount=ndiscount;
	}
	public Double getNdiscount(){
	    return ndiscount;
	}
	public void setNamountf(Double namountf){
	    this.namountf=namountf;
	}
	public Double getNamountf(){
	    return namountf;
	}
	public void setNexchangerate(Double nexchangerate){
	    this.nexchangerate=nexchangerate;
	}
	public Double getNexchangerate(){
	    return nexchangerate;
	}
	public void setNamount(Double namount){
	    this.namount=namount;
	}
	public Double getNamount(){
	    return namount;
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
	public void setCagentprice(Double cagentprice){
	    this.cagentprice=cagentprice;
	}
	public Double getCagentprice(){
	    return cagentprice;
	}
	public void setCrpmode(String crpmode){
	    this.crpmode=crpmode;
	}
	public String getCrpmode(){
	    return crpmode;
	}
	public void setCrpcur(String crpcur){
	    this.crpcur=crpcur;
	}
	public String getCrpcur(){
	    return crpcur;
	}
	public void setNrprate(Double nrprate){
	    this.nrprate=nrprate;
	}
	public Double getNrprate(){
	    return nrprate;
	}
	public void setNrpamountf(Double nrpamountf){
	    this.nrpamountf=nrpamountf;
	}
	public Double getNrpamountf(){
	    return nrpamountf;
	}
	public void setNrpamount(Double nrpamount){
	    this.nrpamount=nrpamount;
	}
	public Double getNrpamount(){
	    return nrpamount;
	}
	public void setUCorpID(String uCorpID){
	    this.uCorpID=uCorpID;
	}
	public String getUCorpID(){
	    return uCorpID;
	}
	public void setNAgentPrice(Double nAgentPrice){
	    this.nAgentPrice=nAgentPrice;
	}
	public Double getNAgentPrice(){
	    return nAgentPrice;
	}
	public void setNQty(Double nQty){
	    this.nQty=nQty;
	}
	public Double getNQty(){
	    return nQty;
	}
	public void setNSinglePrice(Double nSinglePrice){
	    this.nSinglePrice=nSinglePrice;
	}
	public Double getNSinglePrice(){
	    return nSinglePrice;
	}
	public void setCCur(String cCur){
	    this.cCur=cCur;
	}
	public String getCCur(){
	    return cCur;
	}
	public void setIBackFlag(Integer iBackFlag){
	    this.iBackFlag=iBackFlag;
	}
	public Integer getIBackFlag(){
	    return iBackFlag;
	}
	public void setUAccountRPID(String uAccountRPID){
	    this.uAccountRPID=uAccountRPID;
	}
	public String getUAccountRPID(){
	    return uAccountRPID;
	}
	public void setUPriceID(String uPriceID){
	    this.uPriceID=uPriceID;
	}
	public String getUPriceID(){
	    return uPriceID;
	}
	public void setCrpflag(String crpflag){
	    this.crpflag=crpflag;
	}
	public String getCrpflag(){
	    return crpflag;
	}
	public void setURPCorpID(String uRPCorpID){
	    this.uRPCorpID=uRPCorpID;
	}
	public String getURPCorpID(){
	    return uRPCorpID;
	}
	public void setUsenduserid(String usenduserid){
	    this.usenduserid=usenduserid;
	}
	public String getUsenduserid(){
	    return usenduserid;
	}
	public void setUsenddeptid(String usenddeptid){
	    this.usenddeptid=usenddeptid;
	}
	public String getUsenddeptid(){
	    return usenddeptid;
	}
	public void setDsenddate(Date dsenddate){
	    this.dsenddate=dsenddate;
	}
	public Date getDsenddate(){
	    return dsenddate;
	}
	public void setCsend(String csend){
	    this.csend=csend;
	}
	public String getCsend(){
	    return csend;
	}
	public void setUbalanceuserid(String ubalanceuserid){
	    this.ubalanceuserid=ubalanceuserid;
	}
	public String getUbalanceuserid(){
	    return ubalanceuserid;
	}
	public void setUbalancedeptid(String ubalancedeptid){
	    this.ubalancedeptid=ubalancedeptid;
	}
	public String getUbalancedeptid(){
	    return ubalancedeptid;
	}
	public void setUbalancedate(Date ubalancedate){
	    this.ubalancedate=ubalancedate;
	}
	public Date getUbalancedate(){
	    return ubalancedate;
	}
	public void setCbalance(String cbalance){
	    this.cbalance=cbalance;
	}
	public String getCbalance(){
	    return cbalance;
	}
	public void setUteamid(String uteamid){
	    this.uteamid=uteamid;
	}
	public String getUteamid(){
	    return uteamid;
	}
	public void setDbalancedate(Date dbalancedate){
	    this.dbalancedate=dbalancedate;
	}
	public Date getDbalancedate(){
	    return dbalancedate;
	}
	public void setFvoucherid(String fvoucherid){
	    this.fvoucherid=fvoucherid;
	}
	public String getFvoucherid(){
	    return fvoucherid;
	}
	public void setNsinglecost(Double nsinglecost){
	    this.nsinglecost=nsinglecost;
	}
	public Double getNsinglecost(){
	    return nsinglecost;
	}
	public void setNcost(Double ncost){
	    this.ncost=ncost;
	}
	public Double getNcost(){
	    return ncost;
	}
	public void setCdiscounttype(String cdiscounttype){
	    this.cdiscounttype=cdiscounttype;
	}
	public String getCdiscounttype(){
	    return cdiscounttype;
	}
	public void setCCostSendCode(String cCostSendCode){
	    this.cCostSendCode=cCostSendCode;
	}
	public String getCCostSendCode(){
	    return cCostSendCode;
	}
	public void setUCostSendUserID(String uCostSendUserID){
	    this.uCostSendUserID=uCostSendUserID;
	}
	public String getUCostSendUserID(){
	    return uCostSendUserID;
	}
	public void setUCostSendDeptID(String uCostSendDeptID){
	    this.uCostSendDeptID=uCostSendDeptID;
	}
	public String getUCostSendDeptID(){
	    return uCostSendDeptID;
	}
	public void setUCostConfirmUserID(String uCostConfirmUserID){
	    this.uCostConfirmUserID=uCostConfirmUserID;
	}
	public String getUCostConfirmUserID(){
	    return uCostConfirmUserID;
	}
	public void setUCostConfirmDeptID(String uCostConfirmDeptID){
	    this.uCostConfirmDeptID=uCostConfirmDeptID;
	}
	public String getUCostConfirmDeptID(){
	    return uCostConfirmDeptID;
	}
	public void setDCostSendDate(Date dCostSendDate){
	    this.dCostSendDate=dCostSendDate;
	}
	public Date getDCostSendDate(){
	    return dCostSendDate;
	}
	public void setUCostConfirmDate(Date uCostConfirmDate){
	    this.uCostConfirmDate=uCostConfirmDate;
	}
	public Date getUCostConfirmDate(){
	    return uCostConfirmDate;
	}
	public void setCCostSend(String cCostSend){
	    this.cCostSend=cCostSend;
	}
	public String getCCostSend(){
	    return cCostSend;
	}
	public void setCCostConfirm(String cCostConfirm){
	    this.cCostConfirm=cCostConfirm;
	}
	public String getCCostConfirm(){
	    return cCostConfirm;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setUaccountrp2id(String uaccountrp2id){
	    this.uaccountrp2id=uaccountrp2id;
	}
	public String getUaccountrp2id(){
	    return uaccountrp2id;
	}
	public void setCbelong(String cbelong){
	    this.cbelong=cbelong;
	}
	public String getCbelong(){
	    return cbelong;
	}
	public void setSalerpaymentflag(String salerpaymentflag){
	    this.salerpaymentflag=salerpaymentflag;
	}
	public String getSalerpaymentflag(){
	    return salerpaymentflag;
	}
	public void setCguidesendflag(String cguidesendflag){
	    this.cguidesendflag=cguidesendflag;
	}
	public String getCguidesendflag(){
	    return cguidesendflag;
	}
	public void setUguiderrenderid(String uguiderrenderid){
	    this.uguiderrenderid=uguiderrenderid;
	}
	public String getUguiderrenderid(){
	    return uguiderrenderid;
	}
	public void setCsplitflag(String csplitflag){
	    this.csplitflag=csplitflag;
	}
	public String getCsplitflag(){
	    return csplitflag;
	}
	public void setCfinancialmemo(String cfinancialmemo){
	    this.cfinancialmemo=cfinancialmemo;
	}
	public String getCfinancialmemo(){
	    return cfinancialmemo;
	}
	public void setUpricestrategyid(String upricestrategyid){
	    this.upricestrategyid=upricestrategyid;
	}
	public String getUpricestrategyid(){
	    return upricestrategyid;
	}
	public void setUguideid(String uguideid){
	    this.uguideid=uguideid;
	}
	public String getUguideid(){
	    return uguideid;
	}
}