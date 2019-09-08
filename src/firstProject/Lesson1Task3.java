package firstProject;

import java.util.Random;

public class Lesson1Task3 {
	public static void main(String[] args) {
		int[] arr = randomArray(8, 1, 6);
		show(arr);
		int[] arr2 = randomArray(11, 1, 6);
		show(arr2);
		System.out.println("Сумма чётных элементов массива " + oddEvenSum(arr, true));
		System.out.println("Сумма нечётных элементов массива " + oddEvenSum(arr, false));
	    System.out.print("Число 3 встречалось максимум " + oddEvmaxSequence(arr, 3) + " раза");
	    int indOxVaxDiff = indexOfMaxDifference(arr);
	    System.out.print("Максимальная разница между " + indOxVaxDiff + "-м и "  + (indOxVaxDiff + 1) + "-м элементами");
		replace(arr, 1, 4);
		show(arr);
		sort(arr, false);
	    System.out.println();
		show(arr);
		show(cutAndMerge(arr, arr2, true));
	}
	
	public static int random(int min, int max){
		return new Random().nextInt((max - min) + 1) + min;	
	}
	
	public static int[] randomArray(int length, int min, int max){
		int[] arr = new int[length];
		for(int i = 0; i < arr.length; i++){
			arr[i] = random(min, max);
		}
		return arr;	
	}
	
	public static void show(int[] arr){
		for(int val : arr){
	    System.out.print(val + " ");
		}
	    System.out.println();
	}
	
	public static int oddEvenSum(int[] arr, boolean isEven){
		int sum = 0;
		for(int val : arr){
			if(isEven ? val %2 == 0 : val %2 != 0){
				sum += val;
			}
		}
		return sum; 
	}
	
	public static int oddEvmaxSequence(int[] arr, int num){
		int[] arrOfSeqSize = new int[arr.length];
		for(int i = 0, j = 0; i < arr.length; i++){
			if(arr[i] == num){
			if(i > 0 && arr[i - 1] == num){
				arrOfSeqSize[j]++;
			}
			else{
				arrOfSeqSize[j]++;	
			}
			}
			else{
				j++;
			}
		}
        int max = arrOfSeqSize[0];
		for(int x = 1; x < arrOfSeqSize.length; x++){
			if(arrOfSeqSize[x] > max){
				max = arrOfSeqSize[x];
			}
		}
		return max;
	 
	}
	
	public static int indexOfMaxDifference(int[] arr){
		int[]arrOfDiff = new int[arr.length - 1];
		for(int i = 0; i < arr.length - 1; i++){
			arrOfDiff[i] = Math.abs(arr[i] - arr[i + 1]);
		}
		 int max = arrOfDiff[arr.length - 2];
		 int indOfMax = 0;
			for(int x = arr.length - 3; x >= 0; x--){
				if(arrOfDiff[x] >= max){
					max = arrOfDiff[x];
					indOfMax = x;
				}
			}
			return indOfMax;
	}
	
	public static void replace(int[] arr, int replaceTo, int toReplace){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == replaceTo){
			arr[i] = toReplace;
			}
		}
	}
	
	public static void sort(int[] arr, boolean isAsc){
		for (int i = 0; i < arr.length; i++) {
	           for (int j = 0; j < arr.length - i - 1; j++) {
	               if (isAsc ? arr[j] > arr[j + 1] : arr[j] < arr[j + 1]) {
	                  int temp = arr[j];
	                  arr[j] =  arr[j + 1];
	                  arr[j + 1] = temp;
	               }
	           }
	       }
	}
	
	public static int[] cutAndMerge(int[] arr, int[] arr2, boolean isMax){
		int lenght = arr2.length > arr.length ? arr.length : arr2.length;
		int[] freshArr = new int[lenght];
		for (int i = 0; i < freshArr.length; i++) {
			if(isMax){
				freshArr[i] = arr2[i] > arr[i] ? arr2[i] : arr[i];
			}
			else if(!isMax){
				freshArr[i] = arr2[i] < arr[i] ? arr2[i] : arr[i];
			}
	       }
		return freshArr;
	}
	
}
