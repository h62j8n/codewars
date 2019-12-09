package kyu7;

public class getMiddle {
	/* Dec 9, 2019
	 * 
	 * You are going to be given a word. Your job is to return the middle character of the word.
	 * �� �� �ܾ �ް� �ɰž�. �װ� �� ���� �ܾ��� �߰� ���ڸ� ��ȯ�ϴ°ž�.
	 * If the word's length is odd, return the middle character.
	 * ���� �ܾ��� ���̰� Ȧ�����, �߰� ���ڸ� ��ȯ��.
	 * If the word's length is even, return the middle 2 characters.
	 * ���� �ܾ��� ���̰� ¦�����, �߰� ���� �� ���� ��ȯ��.
	 */
	
	public static String getMiddle(String word) {
		char[] words = word.toCharArray();
		boolean even = words.length % 2 == 0;
		int i = words.length / 2;
		String result = "";
		
		if (word.length() == 1) {
			result = word;
		} else {
			if (even) {
				result = ""+words[i-1]+words[i];
				if (words.length == 1) {
					result = word;
				}
			} else {
				result = ""+words[i];
			}
		}
		return result;
	}
	public static void main(String[] args) {
		getMiddle("test");
		getMiddle("testing");
		getMiddle("middle");
		getMiddle("A");
	}
	
	// You have passed all of the tests! :)
}
