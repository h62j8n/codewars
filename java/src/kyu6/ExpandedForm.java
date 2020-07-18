package kyu6;

public class ExpandedForm {
	/* July 18, 2020
	 * 
	 * You will be given a number and you will need to return it as a string in Expanded Form.
	 * ���ڸ� �޾Ƽ� Ȯ��� ��Ŀ��� ���ڿ��� ��ȯ�ؾ� �Ѵ�.
	 * All numbers will be whole numbers greater than 0.
	 * ��� ���ڴ� 0���� ū �����̴�.
	 */
	
	public static String expandedForm(int num) {
		String result = "";
		String[] number = new String(""+num).split("");				// ���ڸ� �� ���ھ� String �迭�� ��ȯ
		
		for (int i=0; i<number.length; i++) {
			if (Integer.parseInt(number[i]) != 0) {					// �� �ڸ� ���ڰ� 0�� �ƴ� �� ����
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
