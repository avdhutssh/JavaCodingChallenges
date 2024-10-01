package Java.InterviewQuestions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class _108_Read_Text_File {

	public static void main(String[] args) {
//		read a text file and count the number of lines, words, characters, and paragraphs.

		String filePath = (System.getProperty("user.dir") + "/src/test/java/Java/InterviewQuestions/sample.txt");
		_01_CountFileStatistics_Using_Buffered_Reader(filePath);

	}

	private static void _01_CountFileStatistics_Using_Buffered_Reader(String filePath) {
		// Time complexity: O(n)
		// Space complexity: O(n)
		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;
		int paragraphCount = 0;

		boolean inParagraphCount = false;

		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			String line;
			while ((line = br.readLine()) != null) {
				lineCount++;
				if (!line.trim().isEmpty()) {
					if (!inParagraphCount) {
						paragraphCount++;
						inParagraphCount = true;
					}
					String[] words = line.split("\\s+");
					wordCount += words.length;
				} else {
					inParagraphCount = false;
				}
				charCount += line.length();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Total Lines: " + lineCount);
		System.out.println("Total Words: " + wordCount);
		System.out.println("Total Characters (without new lines): " + charCount);
		System.out.println("Total Paragraphs: " + paragraphCount);
	}

}
