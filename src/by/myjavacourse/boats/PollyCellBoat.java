package by.myjavacourse.boats;

import by.myjavacourse.field.Cell;

public class PollyCellBoat extends Boat {
	private Cell[] body;

	public PollyCellBoat(Cell head, int amountOfCells, boolean isVertical) {
		super(head);
		this.body = new Cell[amountOfCells];
		this.body[0] = head;
		for (int i = 1; i < amountOfCells; i++) {
			this.body[i] = isVertical ? new Cell(head.getX(), head.getY() + 1) : new Cell(head.getX() + 1, head.getY());
		}
	}

	@Override
	public Cell[] getBody() {
		return this.body;
	}
}
