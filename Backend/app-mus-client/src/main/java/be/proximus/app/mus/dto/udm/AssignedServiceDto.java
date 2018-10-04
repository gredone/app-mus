package be.proximus.app.mus.dto.udm;

import java.util.List;

public class AssignedServiceDto {

	private String udmId;
	private String serviceSpecCode;
	private List<CharacteristicDto> characteristics;
	
	public AssignedServiceDto(){}
	
	public String getUdmId() {
		return udmId;
	}
	public void setUdmId(String udmId) {
		this.udmId = udmId;
	}
	public String getServiceSpecCode() {
		return serviceSpecCode;
	}
	public void setServiceSpecCode(String serviceSpecCode) {
		this.serviceSpecCode = serviceSpecCode;
	}
	public List<CharacteristicDto> getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(List<CharacteristicDto> characteristics) {
		this.characteristics = characteristics;
	}
	
	@Override
	public String toString() {
		return "AssignedServices [udmId=" + udmId + ", serviceSpecCode=" + serviceSpecCode + ", characteristics="
				+ characteristics + "]";
	} 
	
	
	
}
