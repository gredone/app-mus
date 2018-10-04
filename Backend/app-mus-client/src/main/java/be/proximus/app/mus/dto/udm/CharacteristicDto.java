package be.proximus.app.mus.dto.udm;

public class CharacteristicDto {
	
	private String name;
	private String value;
	
	public CharacteristicDto(){}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Characteristic [name=" + name + ", value=" + value + "]";
	}

}
