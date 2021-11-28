/**
 * https://leetcode.com/problems/maximum-number-of-words-you-can-type/
 * @author ashish
 */
public class MaxNoOfWords {
    public static int canBeTypedWords(String text, String brokenLetters) {
        if (brokenLetters.length() == 0) return text.split(" ").length;

        String[] words = text.split(" ");
        int counter = 0;

        for (String word: words) {
            for (int i = 0; i < brokenLetters.length(); i++) {
                if (word.indexOf(brokenLetters.charAt(i)) != -1) break;
                if (i == brokenLetters.length() -1 ) counter++;
            }
        }

        return counter;
    }
    public static void main(String[] args) {
        System.out.println(canBeTypedWords("hello world","ad"));

    }
}
