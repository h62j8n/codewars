package kyu7;

public class FindShort {
	/* December 4, 2019
	 * 
	 * Simple, given a string of words, return the length of the shortest word(s).
	 * 간단해. 일련의 단어를 받아서, 가장 짧은 길이의 단어를 반환하는거야.
	 * String will never be empty and you do not need to account for different data types.
	 * 문자열은 절대 비어있지 않고 너는 다른 데이터타입을 설명할 필요없어.
	 */
	
	public static int findShort(String s) {
		String[] words = s.split(" ");			// 띄어쓰기마다 잘라서 문자열 배열로 변환
		int[] size = new int[words.length];
		
		for (int i=0; i<size.length; i++) {
			size[i] = words[i].length();
		}
		
		for (int i=0; i<size.length-1; i++) {	// sort : i와 i+1의 길이를 비교하여 교체
			for (int j=0; j<size.length-1-i; j++) {
				if (size[j] > size[j+1]) {
					int temp = size[j];
					size[j] = size[j+1];
					size[j+1] = temp;
				}
			}
		}
		
		return size[0];
	}
	
	public static void main(String[] args) {
		findShort("bitcoin take over the world maybe who knows perhaps");
		findShort("turns out random test cases are easier than writing out basic ones");
	}
	
	// Time: 29:46.58 You have passed all of the tests! :)
}
