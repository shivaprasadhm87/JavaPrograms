import java.util.Arrays;

public class AnagramChecker {

    public static boolean areAnagrams(String str1, String str2) {
        // Check for null strings or unequal lengths
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to lowercase and sort the character arrays
        char[] firstString = str1.toLowerCase().toCharArray();
        char[] secondString = str2.toLowerCase().toCharArray();
        Arrays.sort(firstString);
        Arrays.sort(secondString);

        // Compare the sorted arrays and return the result
        return Arrays.equals(firstString, secondString);
    }

    public static void main(String[] args) {
        // Test the method
        System.out.println(areAnagrams("LISTEN", "silent")); // true
    }
}
