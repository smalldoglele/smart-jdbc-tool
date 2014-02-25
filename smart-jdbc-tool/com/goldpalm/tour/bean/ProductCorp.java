package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * ProductCorp entity for t_product_corp table.
 * 
 * 
 * @since 2014-02-17 17:24:42.536
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_product_corp")	
public class ProductCorp implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="uproductid")
	private String uproductid;
	
	@Column(name="ucorpid")
	private String ucorpid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUproductid(String uproductid){
	    this.uproductid=uproductid;
	}
	public String getUproductid(){
	    return uproductid;
	}
	public void setUcorpid(String ucorpid){
	    this.ucorpid=ucorpid;
	}
	public String getUcorpid(){
	    return ucorpid;
	}
}