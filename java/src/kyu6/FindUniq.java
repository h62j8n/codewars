package kyu6;

import java.util.Arrays;

public class FindUniq {
	/* December 8, 2019
	 * 
	 * There is an array with some numbers. All numbers are equal except for one. Try to find it!
	 * 몇 개의 숫자로 나열된 배열이 있어. 모든 숫자는 단 한 개만 빼고 똑같아. 그걸 찾아봐!
	 * The tests contain some very huge arrays, so think about performance.
	 * 검사할 땐 엄청 큰 배열도 포함되어 있으니까 성능에 대해서도 고민해봐.
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
