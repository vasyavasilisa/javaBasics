package firstProject;

public class ClassB extends ClassA{
	private int valueB;
	
	public ClassB(String name, int a, int b){
		super(name, a);
		valueB = b;
	}
	
	public void setValueB(int valueB) {
		this.valueB = valueB;
	}

	public int getValueB() {
		return valueB;
	}
}
