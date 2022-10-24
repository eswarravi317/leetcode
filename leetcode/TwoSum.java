package leetcode;

import java.util.*;

public class TwoSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Array size: ");
		int SIZE = sc.nextInt();
		int arr[] = new int[SIZE];
		for(int i=0; i<arr.length; i++) {
			System.out.print("Index "+i+": ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Target: ");
		int target = sc.nextInt();
		sc.close();
		boolean present = false;
		String res = "";
		for(int i=0; i<arr.length; i++) {
			int item = 0;
			item = arr[i];
			for(int j=0; j<arr.length-1; j++) {
				if((arr[j]+arr[j+1]) == target) {
					res += j;
					res += j+1;
					present = true;
				}
				if(present) {
					break;
				}
			}
			if(present) {
				break;
			}
		}
		if(present) {
			char[] ch = res.toCharArray();
			System.out.println(String.join(",", Arrays.toString(ch)));
		}
		else {
			System.out.println("Not found");
		}
	}
}