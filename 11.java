public class RemoveNonAlphabets {
    public static void main(String[] args) {
        String input = "Hello123, How are you?"; 
        String result = removeNonAlphabets(input);
        System.out.println("String after removing non-alphabetic characters: " + result);
    }
    public static String removeNonAlphabets(String input) {
        StringBuilder builder = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
