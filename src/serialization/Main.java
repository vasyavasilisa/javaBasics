package serialization;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Object object = new Object();
		object.setIntValue(12);
		object.setName("JKJLLKJLK gfgdf");
		Object object2 = new Object();
		object2.setIntValue(13);
		object2.setName("JKJK");
		Object object3 = new Object();
		object3.setIntValue(10);
		object3.setName("JLK");
		Object object4 = new Object();
		object4.setIntValue(1);
		object4.setName("J");
		List<Object> list = new ArrayList<>();
		list.add(object);
		list.add(object2);
		list.add(object3);
		list.add(object4);
		//new ObjectKeeper().saveObjectList(list);
		System.out.println(new ObjectKeeper().readObjectList());
	}

}
