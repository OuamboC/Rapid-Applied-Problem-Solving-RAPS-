public class LengthLastWord {
    public static void main(String[] args) {
        // Create an instance of LengthLastWord
        LengthLastWord len1 = new LengthLastWord();
        int length = len1.getLastStringLength("Hello Word");
        int length2 = len1.getLastStringLength("Canis Ouambo    ");
        int length3 = len1.getLastStringLength("First Exercise of Lab1 Week1 for Rapid Applied Problem Solving");
        System.out.println("Length of last word: " + length);
        System.out.println("Length of last word: " + length2);
        System.out.println("Length of last word: " + length3);

    }

    public int getLastStringLength(String word) {
        // Get the length of the word
        int StringLength = word.length();
        // Get the index of the last index
        int i = StringLength - 1;
        // Initiliase the length of the last word to 0
        int answer = 0;
        // Loop to remove trailing spaces
        while (i >= 0 && Character.isWhitespace(word.charAt(i))) {
            i--;
        }
        // Loop to count the length of the last word
        while (i >= 0 && !Character.isWhitespace(word.charAt(i))) {
            i--;
            answer++;
        }
        return answer;

    }
}