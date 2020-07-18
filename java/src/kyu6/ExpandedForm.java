package kyu6;

public class ExpandedForm {
	/* July 18, 2020
	 * 
	 * You will be given a number and you will need to return it as a string in Expanded Form.
	 * 숫자를 받아서 확장된 양식에서 문자열로 반환해야 한다.
	 * All numbers will be whole numbers greater than 0.
	 * 모든 숫자는 0보다 큰 정수이다.
	 */
	
	public static String expandedForm(int num) {
		String result = "";
		String[] number = new String(""+num).split("");				// 숫자를 한 글자씩 String 배열로 변환
		
		for (int i=0; i<number.length; i++) {
			if (Integer.parseInt(number[i]) != 0) {					// 각 자리 숫자가 0이 아닐 때 수행
				if (i > 0) {
					result += " + ";
				}
				result += number[i];
				for (int j=1; j<number.length-i; j++) {
					result += "0";
				}
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		System.out.println(ExpandedForm.expandedForm(12));
		System.out.println(ExpandedForm.expandedForm(42));
		System.out.println(ExpandedForm.expandedForm(70304));
		System.out.println(ExpandedForm.expandedForm(9000000));
	}
	
	// You have passed all of the tests! :)
}
