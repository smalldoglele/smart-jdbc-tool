package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * City entity for t_city table.
 * 
 * 
 * @since 2014-02-17 17:24:36.789
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_city")	
public class City implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String ccode;
	
	@Column(name="carea")
	private String carea;
	
	@Column(name="ccity")
	private String ccity;/*城市*/
	
	@Column(name="cbrief")
	private String cbrief;
	
	@Column(name="cecity")
	private String cecity;
	
	@Column(name="cstate")
	private String cstate;
	
	@Column(name="cnation")
	private String cnation;
	
	@Column(name="ccontinent")
	private String ccontinent;
	
	@Column(name="cspell")
	private String cspell;
	
	@Column(name="c3code")
	private String c3code;
	
	@Column(name="ino")
	private Integer ino;
	
	@Column(name="calias")
	private String calias;
	
	@Column(name="cstatespell")
	private String cstatespell;
	
	@Column(name="cnationspell")
	private String cnationspell;
	
	public void setCcode(String ccode){
	    this.ccode=ccode;
	}
	public String getCcode(){
	    return ccode;
	}
	public void setCarea(String carea){
	    this.carea=carea;
	}
	public String getCarea(){
	    return carea;
	}
	/**
	 * 设置 城市 
	 * @param ccity
	 */
	public void setCcity(String ccity){
	    this.ccity=ccity;
	}
	/**
	 * 获取 城市 
	 * @return ccity 城市
	 */
	public String getCcity(){
	    return ccity;
	}
	public void setCbrief(String cbrief){
	    this.cbrief=cbrief;
	}
	public String getCbrief(){
	    return cbrief;
	}
	public void setCecity(String cecity){
	    this.cecity=cecity;
	}
	public String getCecity(){
	    return cecity;
	}
	public void setCstate(String cstate){
	    this.cstate=cstate;
	}
	public String getCstate(){
	    return cstate;
	}
	public void setCnation(String cnation){
	    this.cnation=cnation;
	}
	public String getCnation(){
	    return cnation;
	}
	public void setCcontinent(String ccontinent){
	    this.ccontinent=ccontinent;
	}
	public String getCcontinent(){
	    return ccontinent;
	}
	public void setCspell(String cspell){
	    this.cspell=cspell;
	}
	public String getCspell(){
	    return cspell;
	}
	public void setC3code(String c3code){
	    this.c3code=c3code;
	}
	public String getC3code(){
	    return c3code;
	}
	public void setIno(Integer ino){
	    this.ino=ino;
	}
	public Integer getIno(){
	    return ino;
	}
	public void setCalias(String calias){
	    this.calias=calias;
	}
	public String getCalias(){
	    return calias;
	}
	public void setCstatespell(String cstatespell){
	    this.cstatespell=cstatespell;
	}
	public String getCstatespell(){
	    return cstatespell;
	}
	public void setCnationspell(String cnationspell){
	    this.cnationspell=cnationspell;
	}
	public String getCnationspell(){
	    return cnationspell;
	}
}