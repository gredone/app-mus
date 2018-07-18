package be.proximus.app.mus.dto;

import java.util.Date;

public class DelegationUnit {
	
	private String udmId;
	private String code;
	private String contextCode;
	private String status;
	private Date creationTime;
	public String getUdmId() {
		return udmId;
	}
	public void setUdmId(String udmId) {
		this.udmId = udmId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getContextCode() {
		return contextCode;
	}
	public void setContextCode(String contextCode) {
		this.contextCode = contextCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
	
	@Override
	public String toString() {
		return "DelegationUnit [udmId=" + udmId + ", code=" + code + ", contextCode=" + contextCode + ", status="
				+ status + ", creationTime=" + creationTime + "]";
	}
	
	

}
