package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import java.util.Date;
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * MemberPoint entity for t_member_point table.
 * 
 * 
 * @since 2014-02-17 17:24:40.459
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_member_point")	
public class MemberPoint implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="umemberid")
	private String umemberid;
	
	@Column(name="cmemo")
	private String cmemo;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="csource")
	private String csource;
	
	@Column(name="usourceid")
	private String usourceid;
	
	@Column(name="ipoint")
	private Double ipoint;
	
	@Column(name="dupdate")
	private Date dupdate;
	
	@Column(name="utmemberid")
	private String utmemberid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUmemberid(String umemberid){
	    this.umemberid=umemberid;
	}
	public String getUmemberid(){
	    return umemberid;
	}
	public void setCmemo(String cmemo){
	    this.cmemo=cmemo;
	}
	public String getCmemo(){
	    return cmemo;
	}
	public void setCtype(String ctype){
	    this.ctype=ctype;
	}
	public String getCtype(){
	    return ctype;
	}
	public void setCsource(String csource){
	    this.csource=csource;
	}
	public String getCsource(){
	    return csource;
	}
	public void setUsourceid(String usourceid){
	    this.usourceid=usourceid;
	}
	public String getUsourceid(){
	    return usourceid;
	}
	public void setIpoint(Double ipoint){
	    this.ipoint=ipoint;
	}
	public Double getIpoint(){
	    return ipoint;
	}
	public void setDupdate(Date dupdate){
	    this.dupdate=dupdate;
	}
	public Date getDupdate(){
	    return dupdate;
	}
	public void setUtmemberid(String utmemberid){
	    this.utmemberid=utmemberid;
	}
	public String getUtmemberid(){
	    return utmemberid;
	}
}