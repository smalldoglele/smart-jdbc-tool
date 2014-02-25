package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * Dictcn entity for t_dictcn table.
 * 
 * 
 * @since 2014-02-17 17:24:38.328
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "t_dictcn")	
public class Dictcn implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String cspell;
	
	@Column(name="cword")
	private String cword;
	
	public void setCspell(String cspell){
	    this.cspell=cspell;
	}
	public String getCspell(){
	    return cspell;
	}
	public void setCword(String cword){
	    this.cword=cword;
	}
	public String getCword(){
	    return cword;
	}
}