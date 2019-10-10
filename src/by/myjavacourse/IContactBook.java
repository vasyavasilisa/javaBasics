package by.myjavacourse;

import java.util.List;

public interface IContactBook {
	List<INote> getAllNotes();

	List<IContact> getAllContacts();

	boolean addNote(INote note);

	boolean deleteNote(INote note);

	boolean addContact(IContact contact);

	boolean deleteConact(IContact contact);

	INote getNote(String name);

	INote getNote(IContact contact);
}