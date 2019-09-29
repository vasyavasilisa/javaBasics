package firstProject;

public class Tester {

	public static void main(String[] args) {
		ClassA a1 = new ClassA("Вася",3);
		ClassA a2 = new ClassA();// вывод в консоль
		System.out.println(a1.getValueA());
		System.out.println(a1.getName());
		System.out.println(a2.getValueA());
		System.out.println(a2.getName());
		
		ClassA b = new ClassB("Ваня",1,1);
		System.out.println(b.getName());
		
		Something smth = Something.getInstance();
	}

}
