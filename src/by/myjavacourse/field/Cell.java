package by.myjavacourse.field;

import by.myjavacourse.boats.Boat;

public class Cell {
	private int x;
	private int y;
	private boolean isStriked;
	private Boat boat;
	private Field field;

	public Cell(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isStriked() {
		return isStriked;
	}

	public boolean isFree(){
		return this.boat == null;
	}
	
	public Boat getBoat() {
		return boat;
	}

	public void setBoat(Boat boat) {
		this.boat = boat;
	}

	
	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
	}

	public void setStriked(boolean isStriked) {
		this.isStriked = isStriked;
	}

	public void strike(){
		
	}
	
	@Override
	public String toString() {
		return "Cell [x=" + x + ", y=" + y + ", isStriked=" + isStriked + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isStriked ? 1231 : 1237);
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (isStriked != other.isStriked)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
