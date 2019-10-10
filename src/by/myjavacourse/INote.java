package by.myjavacourse;

import java.util.List;

public interface INote {

	String getName();

	List<IContact> getContactsList();

	boolean addNote(IContact contact);

	boolean delete(IContact contact);
}