package secpndProject;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		 System.out.println(isPhoneNumberCorrect("+375447617003"));
		 System.out.println(isPhoneNumberCorrect("8 029 622 22 22"));
		 System.out.println(isPhoneNumberCorrect("8(29)6258585"));
		 System.out.println(isPhoneNumberCorrect("225-89-89"));
		 System.out.println(isPhoneNumberCorrect("(033)333 33 33"));

		 System.out.println(isEmailAddressCorrect("email@mail.xx"));
		 System.out.println(isEmailAddressCorrect("mail@tut.by"));
		 System.out.println(isEmailAddressCorrect("jok@@eee.e"));
		
		addSquares();
	}

	public static boolean isPhoneNumberCorrect(String pnomeNumber) {
		Pattern pattern = Pattern
				.compile("^((8*(\\(0*\\d{2}\\)| *0*\\d{2}))|\\+375\\d{2})*[- ]*(\\d{3})[- ]*(\\d{2})[- ]*(\\d{2})$");
		Matcher matcher = pattern.matcher(pnomeNumber);
		return matcher.find() ? true : false;
	}

	public static boolean isEmailAddressCorrect(String emilAddress) {
		Pattern pattern = Pattern.compile("^[A-Z0-9+_.-]+@[A-Z0-9.-]+$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(emilAddress);
		return matcher.find() ? true : false;
	}

	public static void addSquares() {
		int[][] array = new int[5][5];
		int randValue = random(1, 2);
		int[] indexes = getRandIndexes(array);

		array[indexes[0]][indexes[1]] = randValue;
		int nextCol = setNeighboringCol(array, indexes[1], indexes[0], randValue);
		int nextRow = setNeighboringRow(array, indexes[1], indexes[0], randValue);
		array[nextRow][nextCol] = randValue;

		int randValueSecond = randValue == 1 ? 2 : 1;
		int[] indexesSecond = getRandIndexes(array);

		array[indexesSecond[0]][indexesSecond[1]] = randValueSecond;
		nextCol = setNeighboringCol(array, indexesSecond[1], indexesSecond[0], randValueSecond);
		nextRow = setNeighboringRow(array, indexesSecond[1], indexesSecond[0], randValueSecond);
		array[nextRow][nextCol] = randValueSecond;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static int setNeighboringCol(int[][] array, int randColumn, int randRow, int randValue) {
		int succesCol = 1;
		int nextCol = 0;
		do {
			if (randColumn != 4) {
				if (array[randRow][randColumn + 1] == 0) {
					array[randRow][randColumn + 1] = randValue;
					nextCol = randColumn + 1;
				} else if (randColumn != 0) {
					if (array[randRow][randColumn - 1] == 0) {
						array[randRow][randColumn - 1] = randValue;
						nextCol = randColumn - 1;
					} else {
						randRow = random(0, 4);
						randColumn = random(0, 4);
						succesCol = 0;
					}
				}
			} else {
				if (array[randRow][randColumn - 1] == 0) {
					array[randRow][randColumn - 1] = randValue;
					nextCol = randColumn - 1;
				} else {
					randRow = random(0, 4);
					randColumn = random(0, 4);
					succesCol = 0;
				}
			}
		} while (succesCol == 0);
		return nextCol;
	}

	private static int setNeighboringRow(int[][] array, int randColumn, int randRow, int randValue) {
		int succesCol = 1;
		int nextRow = 0;
		do {
			if (randRow != 4) {
				if (randColumn != 4 && array[randRow + 1][randColumn] == 0 && array[randRow + 1][randColumn + 1] == 0) {
					array[randRow + 1][randColumn] = randValue;
					nextRow = randRow + 1;
				} else if (randRow != 0 && array[randRow - 1][randColumn] == 0) {
					array[randRow - 1][randColumn] = randValue;
					nextRow = randRow - 1;
				}
			} else {
				if (array[randRow - 1][randColumn] == 0) {
					array[randRow - 1][randColumn] = randValue;
					nextRow = randRow - 1;
				} else {
					randRow = random(0, 4);
					randColumn = random(0, 4);
					succesCol = 0;
				}
			}
		} while (succesCol == 0);
		return nextRow;
	}

	private static int random(int min, int max) {
		return new Random().nextInt((max - min) + 1) + min;
	}

	private static int[] getRandIndexes(int[][] array) {
		int success = 0;
		int randRow = 0;
		int randColumn = 0;
		do {
			randRow = random(0, 4);
			randColumn = random(0, 4);
			if (array[randRow][randColumn] != 0) {
			} else if (randRow != 4) {
				if (randColumn != 4) {
					if (array[randRow + 1][randColumn] == 0 && array[randRow + 1][randColumn + 1] == 0
							&& array[randRow][randColumn + 1] == 0) {
						success = 1;
					} else if (randRow != 0) {
						if (array[randRow - 1][randColumn] == 0 && array[randRow - 1][randColumn + 1] == 0
								&& array[randRow][randColumn + 1] == 0) {
							success = 1;
						} else if (randColumn != 0) {
							if (array[randRow - 1][randColumn] == 0 && array[randRow - 1][randColumn - 1] == 0
									&& array[randRow][randColumn - 1] == 0) {
								success = 1;
							}
						}
					}
				}

			}
		} while (success == 0);
		int[] arr = new int[2];
		arr[0] = randRow;
		arr[1] = randColumn;
		return arr;

	}
}
