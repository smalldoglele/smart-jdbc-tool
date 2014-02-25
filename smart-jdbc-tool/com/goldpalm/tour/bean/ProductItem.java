package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * ProductItem entity for t_product_item table.
 * 
 * 
 * @since 2014-02-17 17:24:42.571
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_product_item")	
public class ProductItem implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="itproductid")
	private String itproductid;
	
	@Column(name="ctitle")
	private String ctitle;
	
	@Column(name="ttext")
	private String ttext;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setItproductid(String itproductid){
	    this.itproductid=itproductid;
	}
	public String getItproductid(){
	    return itproductid;
	}
	public void setCtitle(String ctitle){
	    this.ctitle=ctitle;
	}
	public String getCtitle(){
	    return ctitle;
	}
	public void setTtext(String ttext){
	    this.ttext=ttext;
	}
	public String getTtext(){
	    return ttext;
	}
}