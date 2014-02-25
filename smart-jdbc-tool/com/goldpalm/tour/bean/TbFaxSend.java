package com.goldpalm.tour.bean;	

import java.io.Serializable;	
import org.smart.jdbc.annotation.Id;
import org.smart.jdbc.annotation.Table;
import org.smart.jdbc.annotation.Entity;
import org.smart.jdbc.annotation.Column;

/**
 * TbFaxSend entity for tbFaxSend table.
 * 
 * 
 * @since 2014-02-17 17:24:45.386
 * @author smart-jdbc-tool
 */	
	
@Entity	
@Table(name = "tbFaxSend")	
public class TbFaxSend implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer faxID;
	
	@Column(name="InsertTime")
	private String insertTime;
	
	@Column(name="CompleteTime")
	private String completeTime;
	
	@Column(name="TelNO")
	private String telNO;
	
	@Column(name="FaxFlag")
	private String faxFlag;
	
	@Column(name="FilePath1")
	private String filePath1;
	
	@Column(name="FilePath2")
	private String filePath2;
	
	@Column(name="FilePath3")
	private String filePath3;
	
	@Column(name="FilePath4")
	private String filePath4;
	
	@Column(name="FilePath5")
	private String filePath5;
	
	@Column(name="SenderFlag")
	private String senderFlag;
	
	@Column(name="SenderID")
	private String senderID;
	
	@Column(name="SenderData")
	private String senderData;
	
	@Column(name="SenderUserid")
	private String senderUserid;
	
	@Column(name="SenderUsercode")
	private String senderUsercode;
	
	public void setFaxID(Integer faxID){
	    this.faxID=faxID;
	}
	public Integer getFaxID(){
	    return faxID;
	}
	public void setInsertTime(String insertTime){
	    this.insertTime=insertTime;
	}
	public String getInsertTime(){
	    return insertTime;
	}
	public void setCompleteTime(String completeTime){
	    this.completeTime=completeTime;
	}
	public String getCompleteTime(){
	    return completeTime;
	}
	public void setTelNO(String telNO){
	    this.telNO=telNO;
	}
	public String getTelNO(){
	    return telNO;
	}
	public void setFaxFlag(String faxFlag){
	    this.faxFlag=faxFlag;
	}
	public String getFaxFlag(){
	    return faxFlag;
	}
	public void setFilePath1(String filePath1){
	    this.filePath1=filePath1;
	}
	public String getFilePath1(){
	    return filePath1;
	}
	public void setFilePath2(String filePath2){
	    this.filePath2=filePath2;
	}
	public String getFilePath2(){
	    return filePath2;
	}
	public void setFilePath3(String filePath3){
	    this.filePath3=filePath3;
	}
	public String getFilePath3(){
	    return filePath3;
	}
	public void setFilePath4(String filePath4){
	    this.filePath4=filePath4;
	}
	public String getFilePath4(){
	    return filePath4;
	}
	public void setFilePath5(String filePath5){
	    this.filePath5=filePath5;
	}
	public String getFilePath5(){
	    return filePath5;
	}
	public void setSenderFlag(String senderFlag){
	    this.senderFlag=senderFlag;
	}
	public String getSenderFlag(){
	    return senderFlag;
	}
	public void setSenderID(String senderID){
	    this.senderID=senderID;
	}
	public String getSenderID(){
	    return senderID;
	}
	public void setSenderData(String senderData){
	    this.senderData=senderData;
	}
	public String getSenderData(){
	    return senderData;
	}
	public void setSenderUserid(String senderUserid){
	    this.senderUserid=senderUserid;
	}
	public String getSenderUserid(){
	    return senderUserid;
	}
	public void setSenderUsercode(String senderUsercode){
	    this.senderUsercode=senderUsercode;
	}
	public String getSenderUsercode(){
	    return senderUsercode;
	}
}