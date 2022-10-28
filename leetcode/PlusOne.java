package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
	public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i=len-1; i>=0; i--){
            if(digits[i] != 9){
                digits[i]+=1;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        int[] arr = new int[len+1];
        arr[0] = 1;
        return arr;
    }
	public static void main(String[] args) {
		PlusOne obj = new PlusOne();
		Scanner sc = new Scanner(System.in);
		System.out.print("Array size: ");
		int SIZE = sc.nextInt();
		int[] arr = new int[SIZE];
		for(int i=0; i<SIZE; i++) {
			System.out.print("Index "+i+": ");
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Original Array: "+ Arrays.toString(arr));
		System.out.println(Arrays.toString(obj.plusOne(arr)));
	}
}