package by.myjavacourse;

import java.util.List;

public interface IView {
	void showNotes(List<INote> contacts);

	void showContacts(List<IContact> contacts);

	void show(INote note);

	void show(IContact contact);
}