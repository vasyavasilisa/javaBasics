package by.javacurce.exceptions;

public class MyWrapper {
	private MyClass myClass;

	public MyWrapper() {
		myClass = new MyClass();
	}

	public void invoke(int method) {
		if (method == 1) {
			try {
				myClass.firstMethod();
				System.out.println("no exceptions");
			} catch (AnotherException1 e) {
				System.out.println("exception 1");
			} catch (AnotherException2 e) {
				System.out.println("exception 2");
			} finally {
				System.out.println("hello");
			}
		} else if (method == 2) {
			myClass.secondMethod();
		}
	}

	public void set(Object ob) {
		if (ob instanceof String) {
			myClass.setName(String.valueOf(ob));
		}
		else if (ob instanceof Integer) {
			myClass.setIntValue(Integer.parseInt(String.valueOf(ob)));
		}
		else{
			throw new RuntimeException();
		}
	}
}
