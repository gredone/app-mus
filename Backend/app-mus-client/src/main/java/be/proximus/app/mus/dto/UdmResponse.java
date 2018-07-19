package be.proximus.app.mus.dto;

import java.util.List;

public class UdmResponse {
	
	private List<String> schemas;
	private String totalResutls;
	private List<Resource> resources;
	
	
	public List getSchemas() {
		return schemas;
	}
	public void setSchemas(List schemas) {
		this.schemas = schemas;
	}
	public String getTotalResutls() {
		return totalResutls;
	}
	public void setTotalResutls(String totalResutls) {
		this.totalResutls = totalResutls;
	}
	public List<Resource> getResources() {
		return resources;
	}
	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}
	@Override
	public String toString() {
		return "UdmResponse [schemas=" + schemas + ", totalResutls=" + totalResutls + ", resources=" + resources + "]";
	}

	
	
}
