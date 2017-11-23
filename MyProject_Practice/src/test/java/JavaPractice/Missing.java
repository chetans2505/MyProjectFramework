package JavaPractice;

import java.util.Arrays;

public class Missing {
	public static void main(String[] args) {
		String str = "Anbbbbb";
		System.out.println("String : " + str);
		findMissingChar(str);
	}
	private static void findMissingChar(String str) {
		// Convert to upper case
		str = str.toLowerCase();
		// Get character array of string.
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		// Sort the character array.
		Arrays.sort(charArray);
		printRange(charArray);
		System.out.println("Missing characters");
		// Iterate over character array.

		for (int i = 0; i < charArray.length - 1; i++) {
			// Find the difference between current char and next char.
			int charDiff = charArray[i + 1] - charArray[i];
			//System.out.println("Diff-- "+charDiff);
			if (charDiff > 1) {
				for (int j = 1; j < charDiff; j++) {
					char c = (char) (charArray[i] + j);
					System.out.print(c + " ");
				}
			}
		}
	}
	private static void printRange(final char[] charArray) {
		/*StringBuilder builder = new StringBuilder(30);
		builder.append("Range is from '").append(charArray[0]).append("' to '")
		.append(charArray[charArray.length - 1]).append("'");
		System.out.println("Range: "+builder.toString());*/
		System.out.println(charArray[0]+"---"+charArray[charArray.length - 1]);
	}
}
