package kyu7;

import java.util.Arrays;

public class DescendingOrder {
	/* December 20, 2019
	 * 
	 * Your task is to make a function that can take any non-negative integer
	 * as a argument and return it with its digits in descending order.
	 * 네 임무는 어떤 양의 정수라도 인자로 받아서 그 숫자를 내림차순으로 반환하는거야.   
	 * Essentially, rearrange the digits to create the highest possible number.
	 * 기본적으로, 숫자를 재정렬해서 가능한 높은 숫자로 만드는거지.
	 */
	
	public static int sortDesc(final int num) {
		String[] words = new String(num+"").split("");
		int[] nums = new int[words.length];
		
		String result = "";
		
		for (int i=0; i<words.length; i++) {
			nums[i] = Integer.parseInt(words[i]);
		}
		Arrays.sort(nums);
		
		for (int i=nums.length-1; i>=0; i--) {
			result += nums[i];
		}
		
		return Integer.parseInt(result);
	}
	public static void main(String[] args) {
		sortDesc(21445);
		sortDesc(145263);
		sortDesc(123456789);
	}
	
	// Time: 2562ms You have passed all of the tests! :)
}
