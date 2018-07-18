package be.proximus.app.mus.dto;

import java.util.List;

public class AssignedServices {

	private String udmId;
	private String serviceSpecCode;
	private List<Characteristic> characteristics;
	
	
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
	public List<Characteristic> getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(List<Characteristic> characteristics) {
		this.characteristics = characteristics;
	}
	
	@Override
	public String toString() {
		return "AssignedServices [udmId=" + udmId + ", serviceSpecCode=" + serviceSpecCode + ", characteristics="
				+ characteristics + "]";
	} 
	
	
	
}
