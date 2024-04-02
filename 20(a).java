public class MaxRepeatedLettersWord {
    public static void main(String[] args) {
        String inputString = "abcdefghij google microsoft"; 
        String result = findWordWithMaxRepeatedLetters(inputString);
        
        System.out.println("Word with the highest number of repeated letters: " + result);
    }
    public static String findWordWithMaxRepeatedLetters(String inputString) {
        String[] words = inputString.split("\\s+");
        String maxWord = "-1";
        int maxRepeatedLetters = 0;
        for (String word : words) {
            int repeatedLetters = countRepeatedLetters(word);
            if (repeatedLetters > maxRepeatedLetters) {
                maxRepeatedLetters = repeatedLetters;
                maxWord = word;
            }
        }
        return maxWord;
    }
    public static int countRepeatedLetters(String word) {
        int[] frequency = new int[26];
        int repeatedLetters = 0;

        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                frequency[Character.toLowerCase(ch) - 'a']++;
            }
        }
        for (int count : frequency) {
            if (count > 1) {
                repeatedLetters += count;
            }
        }
        return repeatedLetters;
    }
}
