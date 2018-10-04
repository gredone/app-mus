package be.proximus.app.mus.dto.udm;

import java.util.Date;
import java.util.List;

public class ResourceDto {
	
	private List<String> schemas;
	private String udmId;
	private String key;
	private String productSpecCode;
	private String status;
	private Date creationTime;
	private List<CharacteristicDto> characteristics;
	private List<AssignedServiceDto> assignedServices;
	private List<DelegationUnitDto> delegationUnits;
	private MetaDto meta;
	
	public ResourceDto() {
	}
	
	public void setSchemas(List<String> schemas) {
		this.schemas = schemas;
	}
	public List getSchemas() {
		return schemas;
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
	public List<CharacteristicDto> getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(List<CharacteristicDto> characteristics) {
		this.characteristics = characteristics;
	}
	public List<AssignedServiceDto> getAssignedServices() {
		return assignedServices;
	}
	public void setAssignedServices(List<AssignedServiceDto> assignedServices) {
		this.assignedServices = assignedServices;
	}
	public List<DelegationUnitDto> getDelegationUnits() {
		return delegationUnits;
	}
	public void setDelegationUnits(List<DelegationUnitDto> delegationUnits) {
		this.delegationUnits = delegationUnits;
	}
	public MetaDto getMeta() {
		return meta;
	}
	public void setMeta(MetaDto meta) {
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
