package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInsert {
	public int searchInsert(int[] nums, int target) {
		int result = 0;
		Arrays.sort(nums);
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == target) {
				 result = i;
			}
		}
		if(result==0) {
			for(int i=nums.length-1; i>=0; i--) {
				if(target>nums[i]) {
					return i+1;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		SearchInsert obj = new SearchInsert();
		Scanner sc = new Scanner(System.in);
		System.out.print("Array size: ");
		int SIZE = sc.nextInt();
		int[] arr = new int[SIZE];
		for(int i=0; i<SIZE; i++) {
			System.out.print("Index "+i+": ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Array: "+Arrays.toString(arr));
		System.out.print("Target element: ");
		int target = sc.nextInt();
		sc.close();
		System.out.println("Index of target element: "+ obj.searchInsert(arr, target));
	}
}