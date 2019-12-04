package kyu7;

public class SquareDigit {
	/* December 3, 2019
	 * 
	 * Welcome. In this kata, you are asked to square every digit of a number.
	 * �ȳ�. �� īŸ���� �ʴ� ��� ���� �� ���ڵ��� �����ؾ� ��.
	 * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
	 * ���� �� ���� �츮�� �޼ҵ带 ���� 9119�� �����ϸ� 811181�� ������ �ɰž�. �ֳĸ� 9�� 2������ 81�̰� 1�� 2������ 1�̴ϱ�. 
	 * Note: The function accepts an integer and returns an integer
	 * �ּ�: �� �Լ��� �ϳ��� ������ �ް� �ϳ��� ������ ������.
	 */
	
	public static int squareDigits(int n) {
		String str = n+"";
		char[] strs = str.toCharArray();		// �������� ���ڸ� charŸ�� �迭�� �ѱ��ھ� �и�
		int[] nums = new int[strs.length];
		
		String number = "";
		
		for (int i=0; i<strs.length; i++) {
			nums[i] = (int) strs[i]-48;			// �и��� ���ڸ� intŸ�� �迭�� �ٽ� ����ȯ
			nums[i] *= nums[i];					// ���� ����
			number += nums[i];					// �ϳ��� ���ڿ�Ÿ������ ��ħ
		}
		
		return Integer.parseInt(number);		// int������ ��ȯ
	}
	public static void main(String[] args) {
		squareDigits(9119);
	}
	
	// Time: 2986ms You have passed all of the tests! :)
}
