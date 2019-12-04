package kyu8;

public class kata01 {
	/* December 3, 2019
	 * 
	 * In this simple assignment you are given a number and have to make it negative.
	 * �̰� ���ڸ� �޾Ƽ� ������ ����� ������ ������.
	 * But maybe the number is already negative?
	 * ������ ���� ���ڰ� �̹� �������?
	 * 
	 * Notes: �ּ�:
	 * The number can be negative already, in which case no change is required.
	 * ���ڰ� �̹� ������� �ٲ� �ʿ� ����.
	 * Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.
	 * 0�� Ư���� ��ȣ�� ����. -0�� ���� �ȵ��ݾ�.
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
