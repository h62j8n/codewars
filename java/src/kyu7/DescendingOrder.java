package kyu7;

import java.util.Arrays;

public class DescendingOrder {
	/* December 20, 2019
	 * 
	 * Your task is to make a function that can take any non-negative integer
	 * as a argument and return it with its digits in descending order.
	 * �� �ӹ��� � ���� ������ ���ڷ� �޾Ƽ� �� ���ڸ� ������������ ��ȯ�ϴ°ž�.   
	 * Essentially, rearrange the digits to create the highest possible number.
	 * �⺻������, ���ڸ� �������ؼ� ������ ���� ���ڷ� ����°���.
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
