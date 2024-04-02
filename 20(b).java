public class MaxRepeatedLettersWord {
    public static void main(String[] args) {
        String inputString = "cameron blue";
        String result = findWordWithMaxRepeatedLetters(inputString);
        System.out.println("Word with the highest number of repeated letters: " + result);
    }
    public static String findWordWithMaxRepeatedLetters(String inputString) {
        String[] words = inputString.split("\\s+");
        String maxWord = "-1";
        int maxRepeatedLetters = 0;
        for (String word : words) {
            int repeatedLetters = 0;
            for (char ch : word.toCharArray()) {
                if (Character.isLetter(ch) && countOccurrences(word, ch) > 1) {
                    repeatedLetters++;
                }
            }
            if (repeatedLetters > maxRepeatedLetters) {
                maxRepeatedLetters = repeatedLetters;
                maxWord = word;
            }
        }
        return maxWord;
    }
    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }
}
