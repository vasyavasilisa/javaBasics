package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectKeeper {

	public void saveObjectList(List<Object> objectList) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("t.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(objectList);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				System.out.println("Stream closing error");
			}
		}
	}

	public List<Object> readObjectList() {
		FileInputStream fis = null;
		List<Object> list = null;
		File file = new File("t.txt");
		if (file.exists()) {
			try {
				fis = new FileInputStream(file);
				ObjectInputStream oos = new ObjectInputStream(fis);
				list = (List<Object>) oos.readObject();
			} catch (ClassNotFoundException e) {
				System.out.println("Class not found");
			} catch (IOException e) {
				System.out.println("Error initializing input stream");
			} finally {
				try {
					if (fis != null) {
						fis.close();
					}
				} catch (IOException e) {
					System.out.println("Stream closing error");
				}
			}
		}
		return list == null ? new ArrayList<>() : list;
	}
}
