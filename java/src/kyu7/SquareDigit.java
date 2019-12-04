package kyu7;

public class SquareDigit {
	/* December 3, 2019
	 * 
	 * Welcome. In this kata, you are asked to square every digit of a number.
	 * 안녕. 이 카타에서 너는 어느 수의 각 숫자들을 제곱해야 해.
	 * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
	 * 예를 들어서 만약 우리가 메소드를 통해 9119를 실행하면 811181이 나오게 될거야. 왜냐면 9의 2제곱은 81이고 1의 2제곱은 1이니까. 
	 * Note: The function accepts an integer and returns an integer
	 * 주석: 이 함수는 하나의 정수를 받고 하나의 정수를 리턴해.
	 */
	
	public static int squareDigits(int n) {
		String str = n+"";
		char[] strs = str.toCharArray();		// 여러줄의 숫자를 char타입 배열로 한글자씩 분리
		int[] nums = new int[strs.length];
		
		String number = "";
		
		for (int i=0; i<strs.length; i++) {
			nums[i] = (int) strs[i]-48;			// 분리된 숫자를 int타입 배열로 다시 형변환
			nums[i] *= nums[i];					// 제곱 연산
			number += nums[i];					// 하나의 문자열타입으로 합침
		}
		
		return Integer.parseInt(number);		// int형으로 반환
	}
	public static void main(String[] args) {
		squareDigits(9119);
	}
	
	// Time: 2986ms You have passed all of the tests! :)
}
