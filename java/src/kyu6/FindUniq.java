package kyu6;

import java.util.Arrays;

public class FindUniq {
	/* December 8, 2019
	 * 
	 * There is an array with some numbers. All numbers are equal except for one. Try to find it!
	 * �� ���� ���ڷ� ������ �迭�� �־�. ��� ���ڴ� �� �� ���� ���� �Ȱ���. �װ� ã�ƺ�!
	 * The tests contain some very huge arrays, so think about performance.
	 * �˻��� �� ��û ū �迭�� ���ԵǾ� �����ϱ� ���ɿ� ���ؼ��� ����غ�.
	 */
	
	public static double findUniq(double arr[]) {
		Arrays.sort(arr);
		
		if (arr[0] == arr[1]) {
			double temp = arr[0];
			arr[0] = arr[arr.length-1];
			arr[arr.length-1] = temp;
		}
		
		return arr[0];
	}
	
	public static void main(String[] args) {
		System.out.println(findUniq(new double[]{1, 2, 1, 1, 1, 1}));
	}
	// Time : 46:04.12 You have passed all of the tests! :)
}
