package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		int[] nums = {2,5,6,7,9,23,67,87,23,8,9};
		Arrays.sort(nums);
for (int i = 0; i < nums.length-1; i++) {
	
	if (nums[i] == nums[i+1]) {
		System.out.println("the duplicate numbers are " +nums[i]);
	}
}
	}

}
