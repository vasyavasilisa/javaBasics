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

	public boolean canPlaceBoat(Boat boat) {
		if (boat == null) {
			return false;
		}
		Cell[] cells = boat.getBody();
		int x, y;
		for (Cell cell : cells) {
			x = cell.getX();
			y = cell.getY();
			if (x < 0 || y < 0 || x >= this.field[0].length || y >= this.field.length) {
				return false;
			}
			if (!this.field[x][y].isFree()) {
				return false;
			}
			if (y > 0) {
				if (x > 0 && !this.field[y - 1][x - 1].isFree()) {
					return false;
				}
				if (!this.field[y - 1][x].isFree()) {
					return false;
				}
				if (x < this.field[0].length - 1 && !this.field[y - 1][x + 1].isFree()) {
					return false;
				}
			}
			if (x > 0 && !this.field[y][x - 1].isFree()) {
				return false;
			}
			if (x < this.field[0].length - 1 && !this.field[y][x].isFree()) {
				return false;
			}
			if (y < this.field.length - 1) {
				if (x > 0 && !this.field[y + 1][x - 1].isFree()) {
					return false;
				}
				if (!this.field[y + 1][x].isFree()) {
					return false;
				}
				if (x < this.field[0].length - 1 && !this.field[y + 1][x + 1].isFree()) {
					return false;
				}
			}
		}
		return true;
	}
}
