package com.zzc.gtp.api;

public class RequestHead {
	
	private String globalSeq;
	private String upSysId;
	private String upSysName;
	private String upSysSeq;
	private String upSysDate;
	private String transCode;
	
	public String getGlobalSeq() {
		return globalSeq;
	}
	public void setGlobalSeq(String globalSeq) {
		this.globalSeq = globalSeq;
	}
	public String getUpSysId() {
		return upSysId;
	}
	public void setUpSysId(String upSysId) {
		this.upSysId = upSysId;
	}
	public String getUpSysName() {
		return upSysName;
	}
	public void setUpSysName(String upSysName) {
		this.upSysName = upSysName;
	}
	public String getUpSysSeq() {
		return upSysSeq;
	}
	public void setUpSysSeq(String upSysSeq) {
		this.upSysSeq = upSysSeq;
	}
	public String getUpSysDate() {
		return upSysDate;
	}
	public void setUpSysDate(String upSysDate) {
		this.upSysDate = upSysDate;
	}
	public String getTransCode() {
		return transCode;
	}
	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}
	
	public String toString () {
		return "requestHead-" + globalSeq;
	}
}
