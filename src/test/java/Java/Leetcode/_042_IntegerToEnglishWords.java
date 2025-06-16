package Java.Leetcode;

public class _042_IntegerToEnglishWords {
	private final static String[] LESS_THAN_20 = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };
	private final static String[] TENS = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
			"Eighty", "Ninety" };
	private final static String[] THOUSANDS = { "", "Thousand", "Million", "Billion" };

	public static void main(String[] args) {

		System.out.println("--- Integer to English Words ---");
		System.out.println(_01_numberToWords(0)); // "Zero"
		System.out.println(_01_numberToWords(1)); // "One"
		System.out.println(_01_numberToWords(12)); // "Twelve"
		System.out.println(_01_numberToWords(20)); // "Twenty"
		System.out.println(_01_numberToWords(23)); // "Twenty Three"
		System.out.println(_01_numberToWords(100)); // "One Hundred"
		System.out.println(_01_numberToWords(123)); // "One Hundred Twenty Three"
		System.out.println(_01_numberToWords(1000)); // "One Thousand"
		System.out.println(_01_numberToWords(1234)); // "One Thousand Two Hundred Thirty Four"
		System.out.println(_01_numberToWords(10000)); // "Ten Thousand"
		System.out.println(_01_numberToWords(12345)); // "Twelve Thousand Three Hundred Forty Five"
		System.out.println(_01_numberToWords(100000)); // "One Hundred Thousand"
		System.out.println(_01_numberToWords(123456)); // "One Hundred Twenty Three Thousand Four Hundred Fifty Six"
		System.out.println(_01_numberToWords(1000000)); // "One Million"
		System.out.println(_01_numberToWords(1234567)); // "One Million Two Hundred Thirty Four Thousand Five Hundred
														// Sixty Seven"
		System.out.println(_01_numberToWords(1000000000)); // "One Billion"
		System.out.println(_01_numberToWords(2147483647)); // "Two Billion One Hundred Forty Seven Million Four Hundred
															// Eighty Three Thousand Six Hundred Forty Seven"
	}

	public static String _01_numberToWords(int num) {
		// Time Complexity: O(log1000n)
		// Space Complexity: O(1)
		int i = 0;
		String word = "";
		while (num > 0) {
			if (num % 1000 != 0) {
				word = conversionHelper(num % 1000) + THOUSANDS[i] +" "+ word;
			}
			num /= 1000;
			i++;
		}

		return word.trim();
	}

	private static String conversionHelper(int num) {
		if (num == 0) {
			return "";
		} else if (num < 20) {
			return LESS_THAN_20[num] + " ";
		} else if (num < 100) {
			return TENS[num/10] + " " + conversionHelper(num % 10);
		} else {
			return LESS_THAN_20[num / 100] + " Hundred " + conversionHelper(num % 100);
		}
	}
}
