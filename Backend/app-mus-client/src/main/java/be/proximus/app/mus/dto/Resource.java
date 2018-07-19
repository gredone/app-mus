package be.proximus.app.mus.dto;

import java.util.Date;
import java.util.List;

public class Resource {
	
	private List<String> schemas;
	private String udmId;
	private String key;
	private String productSpecCode;
	private String status;
	private Date creationTime;
	private List<Characteristic> characteristics;
	private List<AssignedServices> assignedServices;
	private List<DelegationUnit> delegationUnits;
	private List<Meta> meta;
	public List getSchemas() {
		return schemas;
	}
	public void setSchemas(List schemas) {
		this.schemas = schemas;
	}
	public String getUdmId() {
		return udmId;
	}
	public void setUdmId(String udmId) {
		this.udmId = udmId;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getProductSpecCode() {
		return productSpecCode;
	}
	public void setProductSpecCode(String productSpecCode) {
		this.productSpecCode = productSpecCode;
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
	public List<Characteristic> getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(List<Characteristic> characteristics) {
		this.characteristics = characteristics;
	}
	public List<AssignedServices> getAssignedServices() {
		return assignedServices;
	}
	public void setAssignedServices(List<AssignedServices> assignedServices) {
		this.assignedServices = assignedServices;
	}
	public List<DelegationUnit> getDelegationUnits() {
		return delegationUnits;
	}
	public void setDelegationUnits(List<DelegationUnit> delegationUnits) {
		this.delegationUnits = delegationUnits;
	}
	public List<Meta> getMeta() {
		return meta;
	}
	public void setMeta(List<Meta> meta) {
		this.meta = meta;
	}
	
	
	@Override
	public String toString() {
		return "Resource [schemas=" + schemas + ", udmId=" + udmId + ", key=" + key + ", productSpecCode="
				+ productSpecCode + ", status=" + status + ", creationTime=" + creationTime + ", characteristics="
				+ characteristics + ", assignedServices=" + assignedServices + ", delegationUnits=" + delegationUnits
				+ ", meta=" + meta + "]";
	}
	
	
	
}
