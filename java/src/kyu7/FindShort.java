package kyu7;

public class FindShort {
	/* December 4, 2019
	 * 
	 * Simple, given a string of words, return the length of the shortest word(s).
	 * ������. �Ϸ��� �ܾ �޾Ƽ�, ���� ª�� ������ �ܾ ��ȯ�ϴ°ž�.
	 * String will never be empty and you do not need to account for different data types.
	 * ���ڿ��� ���� ������� �ʰ� �ʴ� �ٸ� ������Ÿ���� ������ �ʿ����.
	 */
	
	public static int findShort(String s) {
		String[] words = s.split(" ");			// ���⸶�� �߶� ���ڿ� �迭�� ��ȯ
		int[] size = new int[words.length];
		
		for (int i=0; i<size.length; i++) {
			size[i] = words[i].length();
		}
		
		for (int i=0; i<size.length-1; i++) {	// sort : i�� i+1�� ���̸� ���Ͽ� ��ü
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
