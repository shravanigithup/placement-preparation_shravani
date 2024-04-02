public class VowelConsonantCounter {
    public static void main(String[] args) {
        String str = "Hello World"; 
        int[] counts = countVowelsAndConsonants(str);
    
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }
    public static int[] countVowelsAndConsonants(String str) {
        int[] counts = new int[2];
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    counts[0]++; 
                } else {
                    counts[1]++;
                }
            }
        }
        return counts;
    }
}
