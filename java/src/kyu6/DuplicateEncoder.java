package kyu6;

import java.util.Arrays;

public class DuplicateEncoder {
	/* Dec 09, 2019
	 * 
	 * The goal of this exercise is to convert a string to a new string
	 * 이 연습문제의 목표는 문자열을 새롭게 변환하는거야.
	 * where each character in the new string is
	 * "(" if that character appears only once in the original string,
	 * 각 문자가 단 한번만 나타난다면 "("로,
	 * or ")" if that character appears more than once in the original string.
	 * 한 번이 아니라 몇 번이고 나타난다면 ")"로.
	 * Ignore capitalization when determining if a character is a duplicate.
	 * 문자의 중복 검사에서 대문자는 무시해.
	 */
	
	/*
	 * 문자열을 문자 배열로 바꾼다.
	 * 첫번째 값과 그 이후의 값을 모두 비교하여 일치하는 값이 있으면 모두 "("
	 * 일치하는 값이 없으면 ")"
	 */
	static String encode(String word) {
		char[] words = word.toCharArray();
		char[] results = new char[words.length];
		boolean changed = false;
		
		for (int i=0; i<words.length; i++) {
			if (results[i] == ')') continue;		// 이미 중복처리된 값은 패스
			
			int j=i+1;
			while (j<words.length) {
				if (words[i] == words[j] || words[i] == words[j]-32) {		// >중복값이 있으면
					results[j] = ')';										// j값 변환
					changed = true;											// 변환 ok.
				}
				j++;
			}
			if (changed) {							// 중복 변환 여부에 따라 i값 변환
				results[i] = ')';
			} else {
				results[i] = '(';
			}
			changed = false;						// 다음 검사를 위해 불리언 초기화
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
