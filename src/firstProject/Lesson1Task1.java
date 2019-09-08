package firstProject;

public class Lesson1Task1 {

	public static void main(String[] args) {
		  byte[] byteArray = {1,2,3,4,5};
		  int sum = 0;
		  for (byte b : byteArray){
			  sum += b;
		  }
			System.out.println(sum);
	}
}
