package firstProject;

import java.util.Random;

public class Lesson1Task4 {

	public static void main(String[] args) {
		char[] chars = randomCharArray(2, 22);
		System.out.print(chars);
		 System.out.println();
		 changeCharRegister(chars);
		 System.out.print(chars);
	}

	public static char[] randomCharArray(int min, int max) {
		int lenght = Lesson1Task3.random(min, max);
		int charNotLetterCount = 0;
		char[] charArr = new char[lenght];
		for (int i = 0; i < charArr.length; i++) {
			charArr[i] = (char) Lesson1Task3.random('A', 'z');
			if (charArr[i] > 'Z' && charArr[i] < 'a') {
				charNotLetterCount++;
			}
		}
		char[] charArrLetters = new char[lenght - charNotLetterCount];
		for (int i = 0, j = 0; i < charArr.length; i++) {
			if (!(charArr[i] > 'Z' && charArr[i] < 'a')) {
				charArrLetters[j++] = charArr[i];
			}
		}
		return charArrLetters;
	}

	public static void changeCharRegister(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 'A' && chars[i] <= 'Z') {
				chars[i] += 32;
			} else if (chars[i] >= 'a' && chars[i] <= 'z') {
				chars[i] -= 32;
			}
		}
	}
}
