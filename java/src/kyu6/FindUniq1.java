package kyu6;

public class FindUniq1 {
	/* December 8, 2019
	 * 
	 * There is an array with some numbers. All numbers are equal except for one. Try to find it!
	 * 몇 개의 숫자로 나열된 배열이 있어. 모든 숫자는 단 한 개만 빼고 똑같아. 그걸 찾아봐!
	 * The tests contain some very huge arrays, so think about performance.
	 * 검사할 땐 엄청 큰 배열도 포함되어 있으니까 성능에 대해서도 고민해봐.
	 */
	
	public static double findUniq(double arr[]) {
		int idx = -1;
		for (int i=0; i<arr.length-2; i++) {
			if (arr[i] == arr[i+1] && arr[i+1] == arr[i+2]) {
				continue;
			} else {
				idx = i;
				break;
			}
		}

		double temp = arr[0];
		int diff = 0;
		if (arr[idx] == arr[idx+1]) {
			diff = idx+2;
		} else {
			if (arr[idx] == arr[idx+2]) {
				diff = idx+1;
			} else {
				diff = idx;
			}
		}
		arr[0] = arr[diff];
		arr[diff] = temp;
		
		return arr[0];
	}
	
	public static void main(String[] args) {
		System.out.println(findUniq(new double[]{1, 2, 1, 1, 1, 1}));
	}
	// Time : 46:04.12 You have passed all of the tests! :)
}
