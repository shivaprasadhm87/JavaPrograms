import java.util.Arrays;

public class ReverseASentence {

	public static String reverseEachWord(String sentence) {
		// Split the sentence into words using whitespace as the delimiter
		String[] wordsArray = sentence.split("\\s+");

		// StringBuilder to build the result
		StringBuilder reversedSentence = new StringBuilder();

		// Reverse each word and append to the result
		for (String word : wordsArray) {
			String reversedWord = new StringBuilder(word).reverse().toString();
			reversedSentence.append(reversedWord).append(" ");
		}

		// Convert StringBuilder to String and trim the trailing space
		return reversedSentence.toString().trim();
	}

	public static void main(String[] args) {
		// Example sentence
		String sentence = "This is a sentence with several words";

		// Reverse each word in the sentence
		String reversedSentence = reverseEachWord(sentence);

		// Print the resulting sentence
		System.out.println("Reversed sentence: " + reversedSentence);
	}
}
