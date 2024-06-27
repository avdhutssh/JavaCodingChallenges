package Java.InterviewQuestions;

public class _025_countNumberOfWordsInString {

	public static void main(String[] args) {
		String str = "    India Is My Country";

		System.out.println("Word Count: " + _01_Using_Split_Array(str));

	}

	private static int _01_Using_Split_Array(String str) {
		String[] words = str.trim().split(" ");
		return words.length;
	}

}
