package by.myjavacourse.field;

import by.myjavacourse.boats.Boat;

public class Field {
	private Cell[][] field;

	public Field(int sizeX, int sizeY) {
		this.field = new Cell[sizeX][sizeY];
		for (int row = 0; row < sizeY; row++) {
			for (int column = 0; column < sizeX; column++) {
				this.field[row][column] = new Cell(row, column);
				this.field[row][column].setField(this);
			}
		}
	}

	public Cell getCell(int x, int y) {
		return this.field[x][y];
	}
	
	public boolean canPlaceBoat(Boat boat){
		//todo
		return false;
	}
}
