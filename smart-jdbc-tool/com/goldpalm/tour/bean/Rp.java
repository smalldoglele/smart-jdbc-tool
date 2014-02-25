package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Rp entity for t_rp table.
 * 
 * 
 * @since 2014-02-17 17:24:42.975
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_rp")	
public class Rp implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uaccountrpid")
	private String uaccountrpid;
	
	@Column(name="doccurdate")
	private Date doccurdate;
	
	@Column(name="crpflag")
	private String crpflag;
	
	@Column(name="cinitialflag")
	private String cinitialflag;
	
	@Column(name="ccode")
	private String ccode;
	
	@Column(name="cobjecttype")
	private String cobjecttype;
	
	@Column(name="crpmode")
	private String crpmode;
	
	@Column(name="ccur")
	private String ccur;
	
	@Column(name="nexchangerate")
	private Double nexchangerate;
	
	@Column(name="namountf")
	private Double namountf;
	
	@Column(name="namount")
	private Double namount;
	
	@Column(name="urpcorpid")
	private String urpcorpid;
	
	@Column(name="csummary")
	private String csummary;
	
	@Column(name="cinvoicecode")
	private String cinvoicecode;
	
	@Column(name="cinvoicecustomer")
	private String cinvoicecustomer;
	
	@Column(name="cinvoiceusername")
	private String cinvoiceusername;
	
	@Column(name="cinvoicedate")
	private Date cinvoicedate;
	
	@Column(name="cbanktype")
	private String cbanktype;
	
	@Column(name="cbankname")
	private String cbankname;
	
	@Column(name="cbankaddr")
	private String cbankaddr;
	
	@Column(name="cbankaccount")
	private String cbankaccount;
	
	@Column(name="cbanknumber")
	private String cbanknumber;
	
	@Column(name="ccheckno")
	private String ccheckno;
	
	@Column(name="ncheckamount")
	private Double ncheckamount;
	
	@Column(name="uvoucherid")
	private String uvoucherid;
	
	@Column(name="caccountfund")
	private String caccountfund;
	
	@Column(name="caccountopp")
	private String caccountopp;
	
	@Column(name="caccountmode")
	private String caccountmode;
	
	@Column(name="caccountcode")
	private String caccountcode;
	
	@Column(name="nvisarate")
	private Double nvisarate;
	
	@Column(name="nbankcost")
	private Double nbankcost;
	
	@Column(name="cposcode")
	private String cposcode;
	
	@Column(name="cposclient")
	private String cposclient;
	
	@Column(name="dposdate")
	private Date dposdate;
	
	@Column(name="ibackflag")
	private Integer ibackflag;
	
	@Column(name="urpid")
	private String urpid;
	
	@Column(name="uconfirmuserid")
	private String uconfirmuserid;
	
	@Column(name="uconfirmdeptid")
	private String uconfirmdeptid;
	
	@Column(name="dconfirmdate")
	private Date dconfirmdate;
	
	@Column(name="cconfirm")
	private String cconfirm;
	
	@Column(name="csendcode")
	private String csendcode;
	
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
	
	@Column(name="dbalancedate")
	private Date dbalancedate;
	
	@Column(name="cbalance")
	private String cbalance;
	
	@Column(name="uteamid")
	private String uteamid;
	
	@Column(name="utransdeptid")
	private String utransdeptid;
	
	@Column(name="utransteamid")
	private String utransteamid;
	
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
	
	@Column(name="uorderid")
	private String uorderid;
	
	@Column(name="fvoucherid")
	private String fvoucherid;
	
	@Column(name="upolicyid")
	private String upolicyid;
	
	@Column(name="uguideid")
	private String uguideid;
	
	@Column(name="cconfirm2")
	private String cconfirm2;
	
	@Column(name="uconfirmuserid2")
	private String uconfirmuserid2;
	
	@Column(name="cconfirmdeptid2")
	private String cconfirmdeptid2;
	
	@Column(name="dconfirmdate2")
	private Date dconfirmdate2;
	
	@Column(name="cfundcur")
	private String cfundcur;
	
	@Column(name="nfundexchangerate")
	private Double nfundexchangerate;
	
	@Column(name="nfundamount")
	private Double nfundamount;
	
	@Column(name="cguidesendflag")
	private String cguidesendflag;
	
	@Column(name="uguiderrenderid")
	private String uguiderrenderid;
	
	@Column(name="cfinancialmemo")
	private String cfinancialmemo;
	
	@Column(name="cvoucherno")
	private String cvoucherno;
	
	@Column(name="ucardpointid")
	private String ucardpointid;
	
	@Column(name="ucostid")
	private String ucostid;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="nsumamount")
	private Double nsumamount;
	
	@Column(name="ncardamount")
	private Double ncardamount;
	
	@Column(name="cidcardno")
	private String cidcardno;
	
	@Column(name="ncardcount")
	private Integer ncardcount;
	
	@Column(name="ccardman")
	private String ccardman;
	
	@Column(name="cdeptManagerVerifyFlag")
	private String cdeptManagerVerifyFlag;
	
	@Column(name="ddeptManagerVerifyTime")
	private Date ddeptManagerVerifyTime;
	
	@Column(name="udeptManagerVerifyUserId")
	private String udeptManagerVerifyUserId;
	
	@Column(name="udeptManagerVerifyDetpId")
	private String udeptManagerVerifyDetpId;
	
	@Column(name="ccorpManagerVerifyFlag")
	private String ccorpManagerVerifyFlag;
	
	@Column(name="dcorpManagerVerifyTime")
	private Date dcorpManagerVerifyTime;
	
	@Column(name="ucorpManagerVerifyUserId")
	private String ucorpManagerVerifyUserId;
	
	@Column(name="ucorpManagerVerifyDetpId")
	private String ucorpManagerVerifyDetpId;
	
	@Column(name="cfinanceManagerVerifyFlag")
	private String cfinanceManagerVerifyFlag;
	
	@Column(name="dfinanceManagerVerifyTime")
	private Date dfinanceManagerVerifyTime;
	
	@Column(name="ufinanceManagerVerifyUserId")
	private String ufinanceManagerVerifyUserId;
	
	@Column(name="ufinanceManagerVerifyDetpId")
	private String ufinanceManagerVerifyDetpId;
	
	@Column(name="cfinalVerifyFlag")
	private String cfinalVerifyFlag;
	
	@Column(name="cexistinvoice")
	private String cexistinvoice;
	
	@Column(name="cfunditem1")
	private String cfunditem1;
	
	@Column(name="cfunditem2")
	private String cfunditem2;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUaccountrpid(String uaccountrpid){
	    this.uaccountrpid=uaccountrpid;
	}
	public String getUaccountrpid(){
	    return uaccountrpid;
	}
	public void setDoccurdate(Date doccurdate){
	    this.doccurdate=doccurdate;
	}
	public Date getDoccurdate(){
	    return doccurdate;
	}
	public void setCrpflag(String crpflag){
	    this.crpflag=crpflag;
	}
	public String getCrpflag(){
	    return crpflag;
	}
	public void setCinitialflag(String cinitialflag){
	    this.cinitialflag=cinitialflag;
	}
	public String getCinitialflag(){
	    return cinitialflag;
	}
	public void setCcode(String ccode){
	    this.ccode=ccode;
	}
	public String getCcode(){
	    return ccode;
	}
	public void setCobjecttype(String cobjecttype){
	    this.cobjecttype=cobjecttype;
	}
	public String getCobjecttype(){
	    return cobjecttype;
	}
	public void setCrpmode(String crpmode){
	    this.crpmode=crpmode;
	}
	public String getCrpmode(){
	    return crpmode;
	}
	public void setCcur(String ccur){
	    this.ccur=ccur;
	}
	public String getCcur(){
	    return ccur;
	}
	public void setNexchangerate(Double nexchangerate){
	    this.nexchangerate=nexchangerate;
	}
	public Double getNexchangerate(){
	    return nexchangerate;
	}
	public void setNamountf(Double namountf){
	    this.namountf=namountf;
	}
	public Double getNamountf(){
	    return namountf;
	}
	public void setNamount(Double namount){
	    this.namount=namount;
	}
	public Double getNamount(){
	    return namount;
	}
	public void setUrpcorpid(String urpcorpid){
	    this.urpcorpid=urpcorpid;
	}
	public String getUrpcorpid(){
	    return urpcorpid;
	}
	public void setCsummary(String csummary){
	    this.csummary=csummary;
	}
	public String getCsummary(){
	    return csummary;
	}
	public void setCinvoicecode(String cinvoicecode){
	    this.cinvoicecode=cinvoicecode;
	}
	public String getCinvoicecode(){
	    return cinvoicecode;
	}
	public void setCinvoicecustomer(String cinvoicecustomer){
	    this.cinvoicecustomer=cinvoicecustomer;
	}
	public String getCinvoicecustomer(){
	    return cinvoicecustomer;
	}
	public void setCinvoiceusername(String cinvoiceusername){
	    this.cinvoiceusername=cinvoiceusername;
	}
	public String getCinvoiceusername(){
	    return cinvoiceusername;
	}
	public void setCinvoicedate(Date cinvoicedate){
	    this.cinvoicedate=cinvoicedate;
	}
	public Date getCinvoicedate(){
	    return cinvoicedate;
	}
	public void setCbanktype(String cbanktype){
	    this.cbanktype=cbanktype;
	}
	public String getCbanktype(){
	    return cbanktype;
	}
	public void setCbankname(String cbankname){
	    this.cbankname=cbankname;
	}
	public String getCbankname(){
	    return cbankname;
	}
	public void setCbankaddr(String cbankaddr){
	    this.cbankaddr=cbankaddr;
	}
	public String getCbankaddr(){
	    return cbankaddr;
	}
	public void setCbankaccount(String cbankaccount){
	    this.cbankaccount=cbankaccount;
	}
	public String getCbankaccount(){
	    return cbankaccount;
	}
	public void setCbanknumber(String cbanknumber){
	    this.cbanknumber=cbanknumber;
	}
	public String getCbanknumber(){
	    return cbanknumber;
	}
	public void setCcheckno(String ccheckno){
	    this.ccheckno=ccheckno;
	}
	public String getCcheckno(){
	    return ccheckno;
	}
	public void setNcheckamount(Double ncheckamount){
	    this.ncheckamount=ncheckamount;
	}
	public Double getNcheckamount(){
	    return ncheckamount;
	}
	public void setUvoucherid(String uvoucherid){
	    this.uvoucherid=uvoucherid;
	}
	public String getUvoucherid(){
	    return uvoucherid;
	}
	public void setCaccountfund(String caccountfund){
	    this.caccountfund=caccountfund;
	}
	public String getCaccountfund(){
	    return caccountfund;
	}
	public void setCaccountopp(String caccountopp){
	    this.caccountopp=caccountopp;
	}
	public String getCaccountopp(){
	    return caccountopp;
	}
	public void setCaccountmode(String caccountmode){
	    this.caccountmode=caccountmode;
	}
	public String getCaccountmode(){
	    return caccountmode;
	}
	public void setCaccountcode(String caccountcode){
	    this.caccountcode=caccountcode;
	}
	public String getCaccountcode(){
	    return caccountcode;
	}
	public void setNvisarate(Double nvisarate){
	    this.nvisarate=nvisarate;
	}
	public Double getNvisarate(){
	    return nvisarate;
	}
	public void setNbankcost(Double nbankcost){
	    this.nbankcost=nbankcost;
	}
	public Double getNbankcost(){
	    return nbankcost;
	}
	public void setCposcode(String cposcode){
	    this.cposcode=cposcode;
	}
	public String getCposcode(){
	    return cposcode;
	}
	public void setCposclient(String cposclient){
	    this.cposclient=cposclient;
	}
	public String getCposclient(){
	    return cposclient;
	}
	public void setDposdate(Date dposdate){
	    this.dposdate=dposdate;
	}
	public Date getDposdate(){
	    return dposdate;
	}
	public void setIbackflag(Integer ibackflag){
	    this.ibackflag=ibackflag;
	}
	public Integer getIbackflag(){
	    return ibackflag;
	}
	public void setUrpid(String urpid){
	    this.urpid=urpid;
	}
	public String getUrpid(){
	    return urpid;
	}
	public void setUconfirmuserid(String uconfirmuserid){
	    this.uconfirmuserid=uconfirmuserid;
	}
	public String getUconfirmuserid(){
	    return uconfirmuserid;
	}
	public void setUconfirmdeptid(String uconfirmdeptid){
	    this.uconfirmdeptid=uconfirmdeptid;
	}
	public String getUconfirmdeptid(){
	    return uconfirmdeptid;
	}
	public void setDconfirmdate(Date dconfirmdate){
	    this.dconfirmdate=dconfirmdate;
	}
	public Date getDconfirmdate(){
	    return dconfirmdate;
	}
	public void setCconfirm(String cconfirm){
	    this.cconfirm=cconfirm;
	}
	public String getCconfirm(){
	    return cconfirm;
	}
	public void setCsendcode(String csendcode){
	    this.csendcode=csendcode;
	}
	public String getCsendcode(){
	    return csendcode;
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
	public void setDbalancedate(Date dbalancedate){
	    this.dbalancedate=dbalancedate;
	}
	public Date getDbalancedate(){
	    return dbalancedate;
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
	public void setUtransdeptid(String utransdeptid){
	    this.utransdeptid=utransdeptid;
	}
	public String getUtransdeptid(){
	    return utransdeptid;
	}
	public void setUtransteamid(String utransteamid){
	    this.utransteamid=utransteamid;
	}
	public String getUtransteamid(){
	    return utransteamid;
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
	public void setUorderid(String uorderid){
	    this.uorderid=uorderid;
	}
	public String getUorderid(){
	    return uorderid;
	}
	public void setFvoucherid(String fvoucherid){
	    this.fvoucherid=fvoucherid;
	}
	public String getFvoucherid(){
	    return fvoucherid;
	}
	public void setUpolicyid(String upolicyid){
	    this.upolicyid=upolicyid;
	}
	public String getUpolicyid(){
	    return upolicyid;
	}
	public void setUguideid(String uguideid){
	    this.uguideid=uguideid;
	}
	public String getUguideid(){
	    return uguideid;
	}
	public void setCconfirm2(String cconfirm2){
	    this.cconfirm2=cconfirm2;
	}
	public String getCconfirm2(){
	    return cconfirm2;
	}
	public void setUconfirmuserid2(String uconfirmuserid2){
	    this.uconfirmuserid2=uconfirmuserid2;
	}
	public String getUconfirmuserid2(){
	    return uconfirmuserid2;
	}
	public void setCconfirmdeptid2(String cconfirmdeptid2){
	    this.cconfirmdeptid2=cconfirmdeptid2;
	}
	public String getCconfirmdeptid2(){
	    return cconfirmdeptid2;
	}
	public void setDconfirmdate2(Date dconfirmdate2){
	    this.dconfirmdate2=dconfirmdate2;
	}
	public Date getDconfirmdate2(){
	    return dconfirmdate2;
	}
	public void setCfundcur(String cfundcur){
	    this.cfundcur=cfundcur;
	}
	public String getCfundcur(){
	    return cfundcur;
	}
	public void setNfundexchangerate(Double nfundexchangerate){
	    this.nfundexchangerate=nfundexchangerate;
	}
	public Double getNfundexchangerate(){
	    return nfundexchangerate;
	}
	public void setNfundamount(Double nfundamount){
	    this.nfundamount=nfundamount;
	}
	public Double getNfundamount(){
	    return nfundamount;
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
	public void setCfinancialmemo(String cfinancialmemo){
	    this.cfinancialmemo=cfinancialmemo;
	}
	public String getCfinancialmemo(){
	    return cfinancialmemo;
	}
	public void setCvoucherno(String cvoucherno){
	    this.cvoucherno=cvoucherno;
	}
	public String getCvoucherno(){
	    return cvoucherno;
	}
	public void setUcardpointid(String ucardpointid){
	    this.ucardpointid=ucardpointid;
	}
	public String getUcardpointid(){
	    return ucardpointid;
	}
	public void setUcostid(String ucostid){
	    this.ucostid=ucostid;
	}
	public String getUcostid(){
	    return ucostid;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setNsumamount(Double nsumamount){
	    this.nsumamount=nsumamount;
	}
	public Double getNsumamount(){
	    return nsumamount;
	}
	public void setNcardamount(Double ncardamount){
	    this.ncardamount=ncardamount;
	}
	public Double getNcardamount(){
	    return ncardamount;
	}
	public void setCidcardno(String cidcardno){
	    this.cidcardno=cidcardno;
	}
	public String getCidcardno(){
	    return cidcardno;
	}
	public void setNcardcount(Integer ncardcount){
	    this.ncardcount=ncardcount;
	}
	public Integer getNcardcount(){
	    return ncardcount;
	}
	public void setCcardman(String ccardman){
	    this.ccardman=ccardman;
	}
	public String getCcardman(){
	    return ccardman;
	}
	public void setCdeptManagerVerifyFlag(String cdeptManagerVerifyFlag){
	    this.cdeptManagerVerifyFlag=cdeptManagerVerifyFlag;
	}
	public String getCdeptManagerVerifyFlag(){
	    return cdeptManagerVerifyFlag;
	}
	public void setDdeptManagerVerifyTime(Date ddeptManagerVerifyTime){
	    this.ddeptManagerVerifyTime=ddeptManagerVerifyTime;
	}
	public Date getDdeptManagerVerifyTime(){
	    return ddeptManagerVerifyTime;
	}
	public void setUdeptManagerVerifyUserId(String udeptManagerVerifyUserId){
	    this.udeptManagerVerifyUserId=udeptManagerVerifyUserId;
	}
	public String getUdeptManagerVerifyUserId(){
	    return udeptManagerVerifyUserId;
	}
	public void setUdeptManagerVerifyDetpId(String udeptManagerVerifyDetpId){
	    this.udeptManagerVerifyDetpId=udeptManagerVerifyDetpId;
	}
	public String getUdeptManagerVerifyDetpId(){
	    return udeptManagerVerifyDetpId;
	}
	public void setCcorpManagerVerifyFlag(String ccorpManagerVerifyFlag){
	    this.ccorpManagerVerifyFlag=ccorpManagerVerifyFlag;
	}
	public String getCcorpManagerVerifyFlag(){
	    return ccorpManagerVerifyFlag;
	}
	public void setDcorpManagerVerifyTime(Date dcorpManagerVerifyTime){
	    this.dcorpManagerVerifyTime=dcorpManagerVerifyTime;
	}
	public Date getDcorpManagerVerifyTime(){
	    return dcorpManagerVerifyTime;
	}
	public void setUcorpManagerVerifyUserId(String ucorpManagerVerifyUserId){
	    this.ucorpManagerVerifyUserId=ucorpManagerVerifyUserId;
	}
	public String getUcorpManagerVerifyUserId(){
	    return ucorpManagerVerifyUserId;
	}
	public void setUcorpManagerVerifyDetpId(String ucorpManagerVerifyDetpId){
	    this.ucorpManagerVerifyDetpId=ucorpManagerVerifyDetpId;
	}
	public String getUcorpManagerVerifyDetpId(){
	    return ucorpManagerVerifyDetpId;
	}
	public void setCfinanceManagerVerifyFlag(String cfinanceManagerVerifyFlag){
	    this.cfinanceManagerVerifyFlag=cfinanceManagerVerifyFlag;
	}
	public String getCfinanceManagerVerifyFlag(){
	    return cfinanceManagerVerifyFlag;
	}
	public void setDfinanceManagerVerifyTime(Date dfinanceManagerVerifyTime){
	    this.dfinanceManagerVerifyTime=dfinanceManagerVerifyTime;
	}
	public Date getDfinanceManagerVerifyTime(){
	    return dfinanceManagerVerifyTime;
	}
	public void setUfinanceManagerVerifyUserId(String ufinanceManagerVerifyUserId){
	    this.ufinanceManagerVerifyUserId=ufinanceManagerVerifyUserId;
	}
	public String getUfinanceManagerVerifyUserId(){
	    return ufinanceManagerVerifyUserId;
	}
	public void setUfinanceManagerVerifyDetpId(String ufinanceManagerVerifyDetpId){
	    this.ufinanceManagerVerifyDetpId=ufinanceManagerVerifyDetpId;
	}
	public String getUfinanceManagerVerifyDetpId(){
	    return ufinanceManagerVerifyDetpId;
	}
	public void setCfinalVerifyFlag(String cfinalVerifyFlag){
	    this.cfinalVerifyFlag=cfinalVerifyFlag;
	}
	public String getCfinalVerifyFlag(){
	    return cfinalVerifyFlag;
	}
	public void setCexistinvoice(String cexistinvoice){
	    this.cexistinvoice=cexistinvoice;
	}
	public String getCexistinvoice(){
	    return cexistinvoice;
	}
	public void setCfunditem1(String cfunditem1){
	    this.cfunditem1=cfunditem1;
	}
	public String getCfunditem1(){
	    return cfunditem1;
	}
	public void setCfunditem2(String cfunditem2){
	    this.cfunditem2=cfunditem2;
	}
	public String getCfunditem2(){
	    return cfunditem2;
	}
}