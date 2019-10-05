package by.myjavacourse.field;

public class Field {
private Cell[][] field;

public Field(int sizeX, int sizeY) {
	this.field = new Cell[sizeX][sizeY];
}

public Cell getCell(int x, int y) {
	return this.field[x][y];
}
}
