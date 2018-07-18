package be.proximus.app.mus.dto;

import java.util.Date;

public class Meta {
	
	private Date created;
	private String location;
	private String resourceType;
	
	
	
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	
	
	@Override
	public String toString() {
		return "Meta [created=" + created + ", location=" + location + ", resourceType=" + resourceType + "]";
	}
	
	
	
	

}
