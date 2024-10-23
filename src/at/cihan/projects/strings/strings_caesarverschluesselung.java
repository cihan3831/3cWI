package at.cihan.projects.strings;

public class strings_caesarverschluesselung {
    public static void main(String[] args) {
        String result = encrypt("abc");
        System.out.println(result);
    }

    public static String encrypt(String data) {

        char[] letters = data.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) (letters[i] + 2);
        }

        return new String(letters);
    }

    public static String decrypt(String data) {

        char[] letters = data.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) (letters[i] - 2);
        }

        return new String(letters);
    }
}
