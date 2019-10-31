package serialization;

import java.io.Serializable;

public class Object implements Serializable{
	private static final long serialVersionUID = 1L;
	private int intValue;
	private String name;
	
	public int getIntValue() {
		return intValue;
	}
	
	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Object [intValue=" + intValue + ", name=" + name + "]";
	}
	
	

}
