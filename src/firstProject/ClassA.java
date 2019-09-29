package firstProject;

public class ClassA {
	private int intValueA;
	private String name;

	public ClassA() {
	}

	public ClassA(String name, int valueA) {
		this.name = name;
		this.intValueA = valueA;
	}

	public void setValueA(int valueA) {
		this.intValueA = valueA;
	}

	public int getValueA() {
		return intValueA;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
