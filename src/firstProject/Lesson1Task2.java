package firstProject;

public class Lesson1Task2 {
	public static void main(String[] args) {
		int[] i = {1, -90876, -123, 4, 22};
		int min = i[0];
		int max = i[0];
		for(int x=1; x<i.length; x++){
			if(i[x] < min){
				min = i[x];
			}
			if(i[x] > max){
				max = i[x];
			}
		}
		System.out.println("max " + max);
		System.out.println("min " + min);
	}
}
