package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * CODEMEALS entity for T_CODE_MEALS table.
 * 
 * 
 * @since 2014-02-17 17:24:36.958
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "T_CODE_MEALS")	
public class CODEMEALS implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="MealCode")
	private String mealCode;
	
	@Column(name="Description")
	private String description;
	
	public void setMealCode(String mealCode){
	    this.mealCode=mealCode;
	}
	public String getMealCode(){
	    return mealCode;
	}
	public void setDescription(String description){
	    this.description=description;
	}
	public String getDescription(){
	    return description;
	}
}