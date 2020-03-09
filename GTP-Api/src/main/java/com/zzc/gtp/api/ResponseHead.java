package com.zzc.gtp.api;

public class ResponseHead {

	private String code;
	private String message;
	private String downSysSeq;
	private String globalSeq;
	
	public String getGlobalSeq() {
		return globalSeq;
	}
	public void setGlobalSeq(String globalSeq) {
		this.globalSeq = globalSeq;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDownSysSeq() {
		return downSysSeq;
	}
	public void setDownSysSeq(String downSysSeq) {
		this.downSysSeq = downSysSeq;
	}
	@Override
	public String toString() {
		return "ResponseInfo [code=" + code + ", \nmessage=" + message + ", \ndownSysSeq=" + downSysSeq + ", \nglobalSeq="
				+ globalSeq + "]";
	}
	
}
