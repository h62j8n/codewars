package kyu8;

public class kata01 {
	/* December 3, 2019
	 * 
	 * In this simple assignment you are given a number and have to make it negative.
	 * 이건 숫자를 받아서 음수로 만드는 간단한 과제야.
	 * But maybe the number is already negative?
	 * 하지만 만약 숫자가 이미 음수라면?
	 * 
	 * Notes: 주석:
	 * The number can be negative already, in which case no change is required.
	 * 숫자가 이미 음수라면 바꿀 필요 없어.
	 * Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.
	 * 0은 특정한 기호가 없어. -0은 말이 안되잖아.
	 */
	
	public static int makeNegative(final int x) {
		int number = 0;
		if (x > 0) {
			number = -x;
		} else {
			number = x;
		}
		
		return number;
	}
	
//	public static int makeNegative(final int x) {
//		return -abs(x);
//	}

	public static void main(String[] args) {
		makeNegative(1);
		makeNegative(-5);
		makeNegative(0);
	}
	
	// Time: 3014ms You have passed all of the tests! :)
}
