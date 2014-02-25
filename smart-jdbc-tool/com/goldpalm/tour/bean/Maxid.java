package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Maxid entity for t_maxid table.
 * 
 * 
 * @since 2014-02-17 17:24:40.297
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_maxid")	
public class Maxid implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="ctablename")
	private String ctablename;
	
	@Column(name="ccolumnname")
	private String ccolumnname;
	
	@Column(name="cidhead")
	private String cidhead;
	
	@Column(name="iidmax")
	private Integer iidmax;
	
	@Column(name="inumlen")
	private Integer inumlen;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setCtablename(String ctablename){
	    this.ctablename=ctablename;
	}
	public String getCtablename(){
	    return ctablename;
	}
	public void setCcolumnname(String ccolumnname){
	    this.ccolumnname=ccolumnname;
	}
	public String getCcolumnname(){
	    return ccolumnname;
	}
	public void setCidhead(String cidhead){
	    this.cidhead=cidhead;
	}
	public String getCidhead(){
	    return cidhead;
	}
	public void setIidmax(Integer iidmax){
	    this.iidmax=iidmax;
	}
	public Integer getIidmax(){
	    return iidmax;
	}
	public void setInumlen(Integer inumlen){
	    this.inumlen=inumlen;
	}
	public Integer getInumlen(){
	    return inumlen;
	}
}