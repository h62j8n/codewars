package kyu7;

public class NthSeries {
	/* December 20, 2019
	 * 
	 * Your task is to write a function which returns
	 * the sum of following series upto nth term(parameter).
	 * 너의 임무는 다음 시리즈의 합계를 n번째 항(매개변수)까지 반환하는거야.
	 * Series : 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
	 * 
	 * Rules :
	 * - You need to round the answer to 2 decimal places and return it as String.
	 * 소수점 이하 두번째 자리까지 반올림해서 문자열로 돌려줘야 해.
	 * - If the given value is 0 then it should return 0.00
	 * 만약 0을 받으면 0.00으로 리턴해야 해.
	 * - You will only be given Natural Numbers as arguments.
	 * 인자로는 자연수만 받게 될거야.
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
