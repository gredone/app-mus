package be.proximus.app.mus.dto.udm;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class UdmResponseDto {
	
	private List<String> schemas;
	private String totalResults;
	private List<ResourceDto> resources;
	private String test;
	
	public UdmResponseDto() {
	}
	
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}
	public List<ResourceDto> getResources() {
		return resources;
	}
	public void setResources(List<ResourceDto> resources) {
		this.resources = resources;
	}
	
	public List<String> getSchemas() {
		return schemas;
	}
	public void setSchemas(List<String> schemas) {
		this.schemas = schemas;
	}
	@Override
	public String toString() {
		return "UdmResponse [schemas=" + schemas + ", totalResutls=" + totalResults + ", resources=" + resources + "]";
	}

}
