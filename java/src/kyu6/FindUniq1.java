package kyu6;

public class FindUniq1 {
	/* December 8, 2019
	 * 
	 * There is an array with some numbers. All numbers are equal except for one. Try to find it!
	 * �� ���� ���ڷ� ������ �迭�� �־�. ��� ���ڴ� �� �� ���� ���� �Ȱ���. �װ� ã�ƺ�!
	 * The tests contain some very huge arrays, so think about performance.
	 * �˻��� �� ��û ū �迭�� ���ԵǾ� �����ϱ� ���ɿ� ���ؼ��� ����غ�.
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
