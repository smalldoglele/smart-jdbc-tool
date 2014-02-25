package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * NoteLineLink entity for t_note_line_link table.
 * 
 * 
 * @since 2014-02-17 17:24:40.747
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_note_line_link")	
public class NoteLineLink implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String uid;
	
	@Column(name="unoteid")
	private String unoteid;
	
	@Column(name="ulineid")
	private String ulineid;
	
	public void setUid(String uid){
	    this.uid=uid;
	}
	public String getUid(){
	    return uid;
	}
	public void setUnoteid(String unoteid){
	    this.unoteid=unoteid;
	}
	public String getUnoteid(){
	    return unoteid;
	}
	public void setUlineid(String ulineid){
	    this.ulineid=ulineid;
	}
	public String getUlineid(){
	    return ulineid;
	}
}