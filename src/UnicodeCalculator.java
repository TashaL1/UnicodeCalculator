import java.util.Scanner;

public class UnicodeCalculator {

	public static void main(String[] args) {

		System.out.println("Enter 2 words!");

		Scanner scnr = new Scanner(System.in);

		String word1 = "";
		String word2 = "";

		word1 = scnr.next();
		word2 = scnr.next();

		for (int i = 0; i < word1.length(); i++) {
			// System.out.println(word1);

			int unicodeValue = (int) word1.charAt(i);
			System.out.println(unicodeValue);

			abs(word1);

		}
		for (int i1 = 0; i1 < word2.length(); i1++) {
			// System.out.println(word2);

			int unicodeValue1 = (int) word2.charAt(i1);
			System.out.println(unicodeValue1);

			abs(word2);
		}
		System.out.println("Difference (as absolute value): ");
		System.out.println();
		abs(word1 + word2);
	}

	private static void abs(String word2) {
		// TODO Auto-generated method stub

	}

}
