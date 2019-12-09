package kyu6;

import java.util.Arrays;

public class DuplicateEncoder {
	/* Dec 09, 2019
	 * 
	 * The goal of this exercise is to convert a string to a new string
	 * �� ���������� ��ǥ�� ���ڿ��� ���Ӱ� ��ȯ�ϴ°ž�.
	 * where each character in the new string is
	 * "(" if that character appears only once in the original string,
	 * �� ���ڰ� �� �ѹ��� ��Ÿ���ٸ� "("��,
	 * or ")" if that character appears more than once in the original string.
	 * �� ���� �ƴ϶� �� ���̰� ��Ÿ���ٸ� ")"��.
	 * Ignore capitalization when determining if a character is a duplicate.
	 * ������ �ߺ� �˻翡�� �빮�ڴ� ������.
	 */
	
	/*
	 * ���ڿ��� ���� �迭�� �ٲ۴�.
	 * ù��° ���� �� ������ ���� ��� ���Ͽ� ��ġ�ϴ� ���� ������ ��� "("
	 * ��ġ�ϴ� ���� ������ ")"
	 */
	static String encode(String word) {
		char[] words = word.toCharArray();
		char[] results = new char[words.length];
		boolean changed = false;
		
		for (int i=0; i<words.length; i++) {
			if (results[i] == ')') continue;		// �̹� �ߺ�ó���� ���� �н�
			
			int j=i+1;
			while (j<words.length) {
				if (words[i] == words[j] || words[i] == words[j]-32) {		// >�ߺ����� ������
					results[j] = ')';										// j�� ��ȯ
					changed = true;											// ��ȯ ok.
				}
				j++;
			}
			if (changed) {							// �ߺ� ��ȯ ���ο� ���� i�� ��ȯ
				results[i] = ')';
			} else {
				results[i] = '(';
			}
			changed = false;						// ���� �˻縦 ���� �Ҹ��� �ʱ�ȭ
		}
		
		System.out.println(new String(results));
		return new String(results);
	}
	public static void main(String[] args) {
		encode("Prespecialized"); 	// )()())()(()()(
		encode("   ()(   "); 		// ))))())))
		encode("([(((]");
	}
}
