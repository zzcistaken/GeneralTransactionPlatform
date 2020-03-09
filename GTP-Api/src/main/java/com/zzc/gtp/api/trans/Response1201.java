package com.zzc.gtp.api.trans;

import com.zzc.gtp.api.ResponseHead;

public class Response1201 extends ResponseHead{
	
	private String succFlag;

	public String getSuccFlag() {
		return succFlag;
	}

	public void setSuccFlag(String succFlag) {
		this.succFlag = succFlag;
	}
	
	public String toString () {
		return "ResponseTransfer: " + succFlag + super.toString();
	}
}
