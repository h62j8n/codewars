package kyu7;

public class NthSeries {
	/* December 20, 2019
	 * 
	 * Your task is to write a function which returns
	 * the sum of following series upto nth term(parameter).
	 * ���� �ӹ��� ���� �ø����� �հ踦 n��° ��(�Ű�����)���� ��ȯ�ϴ°ž�.
	 * Series : 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
	 * 
	 * Rules :
	 * - You need to round the answer to 2 decimal places and return it as String.
	 * �Ҽ��� ���� �ι�° �ڸ����� �ݿø��ؼ� ���ڿ��� ������� ��.
	 * - If the given value is 0 then it should return 0.00
	 * ���� 0�� ������ 0.00���� �����ؾ� ��.
	 * - You will only be given Natural Numbers as arguments.
	 * ���ڷδ� �ڿ����� �ް� �ɰž�.
	 */
	
	public static String seriesSum(int n) {
		int num = 1;
		double result = 0;
		
		for (int i=0; i<n; i++) {
//			System.out.println(num);
			result += 1/num;
			num = (num+3);
			System.out.println(result);
			/*try {
				result += num/(i+3);
			} catch (ArithmeticException e) {
			}*/
		}
		
		return null;
	}
	public static void main(String[] args) {
		seriesSum(5);
	}
}
