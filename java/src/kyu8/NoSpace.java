package kyu8;

public class NoSpace {
	/* Dec 09, 2019
	 * 
	 * Simple, remove the spaces from the string, then return the resultant string.
	 * 문자열의 공백들을 제거하고 그 결과로 생긴 문자열을 반환해.
	 */
	public static String noSpace(final String x) {
		return x.replace(" ", "");
	}
	public static void main(String[] args) {
		System.out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
		System.out.println(noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
		System.out.println(noSpace("8aaaaa dddd r     "));
		System.out.println(noSpace("jfBm  gk lf8hg  88lbe8 "));
		System.out.println(noSpace("8j aam"));
	}
	
	// You have passed all of the tests! :)
}
