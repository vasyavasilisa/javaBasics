package by.javacurce.exceptions;

import java.util.Random;

public class MyClass {

	private int intValue;
	private String name;

	public void firstMethod() throws AnotherException1, AnotherException2 {
		int rand = new Random().nextInt(3 + 1 - 1) + 1;
		if (rand % 2 == 0) {
			throw new AnotherException1();
		}
		if (rand % 3 == 0) {
			throw new AnotherException2();
		}
	}

	public void secondMethod() {
		if (name == null && intValue > 100) {
			throw new MyRuntimeExceptionB();
		}
		if (name == null && intValue >= 1 && intValue <= 100) {
			throw new MyRuntimeExceptionC();

		}
		if (name != null && !(intValue >= 1 && intValue <= 100)) {
			throw new MyRuntimeExceptionD();
		}
		if (name == null || intValue <= 0) {
			throw new MyRuntimeExceptionA();
		}
	}

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + intValue;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		if (intValue != other.intValue)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
