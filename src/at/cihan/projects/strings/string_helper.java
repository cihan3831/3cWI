package at.cihan.projects.strings;

public class string_helper {
    public static void main(String[] args) {

        boolean isPalindrome = isPalindrome("anna");
        if(isPalindrome){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        int amount = countLetters("hamudi", 'h');
            System.out.println(amount);

    }

    public static boolean isPalindrome(String word){
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    public static int countLetters(String word, char c){
        int letter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                letter ++;
            }
        }
        return letter;
    }

}