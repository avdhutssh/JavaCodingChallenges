package Java.InterviewQuestions;

public class _139_NumberToWords {

	public static void main(String[] args) {
		// UPI payment message use case

		System.out.println(numberToWords(0)); // zero
		System.out.println(numberToWords(67)); // sixty seven
		System.out.println(numberToWords(100)); // one hundred
		System.out.println(numberToWords(345)); // three hundred forty five
		System.out.println(numberToWords(12345)); // twelve thousand three hundred forty five
		System.out.println(numberToWords(987654321)); // nine hundred eighty seven million six hundred fifty four
														// thousand three hundred twenty one

	}

	public static String numberToWords(int num) {
		if (num == 0) {
			return "zero";
		}
		return convert(num).trim();
	}

	private static String convert(int num) {
		if (num < 20) {
			return units[num];
		} else if (num < 100) {
			return tens[num / 10] + " " + units[num % 10];
		} else if (num < 1000) {
			return units[num / 100] + " hundred " + convert(num % 100);
		} else if (num < 1000000) {
			return convert(num / 1000) + " thousand " + convert(num % 1000);
		} else if (num < 1000000000) {
			return convert(num / 1000000) + " million " + convert(num % 1000000);
		} else {
			return convert(num / 1000000000) + " billion " + convert(num % 1000000000);
		}
	}

	// Arrays for numbers in words
	private static final String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };

	private static final String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };
}
