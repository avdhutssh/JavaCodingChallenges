package Java.InterviewQuestions;

import com.github.javafaker.Faker;

public class _109_Generate_Random_Name_Number_Alphanumeric {

	private static java.util.Random random = new java.util.Random();
	static Faker faker = new Faker();

	public static void main(String[] args) {

		System.out.println(_01_Generate_random_Using_RegX(5, "name"));
		System.out.println(_01_Generate_random_Using_RegX(6, "Number"));
		System.out.println(_01_Generate_random_Using_RegX(4, "Alphanumeric"));
		System.out.println(_01_Generate_random_Using_RegX(8, "any"));

		System.out.println(_02_Generate_random_UsingJavaFaker("name"));
		System.out.println(_02_Generate_random_UsingJavaFaker("Number"));
		System.out.println(_02_Generate_random_UsingJavaFaker("Alphanumeric"));
		System.out.println(_02_Generate_random_UsingJavaFaker("any"));
	}

	private static String _01_Generate_random_Using_RegX(int length, String type) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		if (length <= 0) {
			throw new IllegalArgumentException("length must be greater than 0");
		}

		final String Alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		final String Numbers = "0123456789";
		final String Alphanumeric = Alphabets + Numbers;
		final String Special_Character = "!@#$%^&*()_+";

		String characters = "";
		switch (type.toLowerCase()) {
		case "name":
			characters = Alphabets;
			break;
		case "number":
			characters = Numbers;
			break;
		case "alphanumeric":
			characters = Alphanumeric;
			break;
		default:
			characters = Alphabets + Special_Character;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(characters.length());
			sb.append(characters.charAt(randomIndex));
		}

		return sb.toString();
	}

	private static String _02_Generate_random_UsingJavaFaker(String type) {
		// Time complexity: O(n)
		// Space complexity: O(n)

		String result = "";
		switch (type.toLowerCase()) {
		case "name":
			result = faker.name().username();
			break;
		case "number":
			result = faker.number().digit();
			break;
		case "alphanumeric":
			result = faker.lorem().characters(6,true,true);
			break;
		default:
			result = faker.name().fullName() + faker.lorem().characters(6,false,true);
		}

		return result;
	}
}
