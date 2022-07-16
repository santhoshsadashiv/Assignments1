package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		int [] num = {23,22,19,2,6,7,46};
		Arrays.sort(num);
		int length = num.length;
		for (int i = 0; i < num.length-1; i++) {
		System.out.println("the min number is "+num[0]);	
		System.out.println("the max number is "+num[length-1]);
		}
		}
		 
	}


