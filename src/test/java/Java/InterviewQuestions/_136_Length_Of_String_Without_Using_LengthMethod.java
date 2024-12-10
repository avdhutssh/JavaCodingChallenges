package Java.InterviewQuestions;

public class _136_Length_Of_String_Without_Using_LengthMethod {
//How to find the length of the string without using length?
	
	public static void main(String[] args) {

		String str = "Avdhut"; // 6
		_01_Using_For_Each_Loop(str);

	}

	private static void _01_Using_For_Each_Loop(String str) {
		int index = 0;
		for (char ch : str.toCharArray()) {
			index++;
		}
		System.out.println("Length of String is: " + index);
	}

}
