package kyu8;

public class EvenOrOdd {
	/* Dec 09, 2019
	 * 
	 * Create a function (or write a script in Shell) that takes an integer as an argument
	 * and returns "Even" for even numbers or "Odd" for odd numbers.
	 * 정수를 인자로 받아서 짝수일 땐 "Even", 홀수일 땐 "Odd"를 반환하는 함수를 만들어봐.
	 */
	
	public static String evenOrOdd(int number) {
		return (number%2 == 0) ? "Even" : "Odd";
	}
	public static void main(String[] args) {
		System.out.println(evenOrOdd(1));
		System.out.println(evenOrOdd(2));
		System.out.println(evenOrOdd(6));
	}
	
	// You have passed all of the tests! :)
}
