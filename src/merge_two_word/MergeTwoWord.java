package merge_two_word;

public class MergeTwoWord {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        StringBuilder result = new StringBuilder();
        if (length1 <= length2) {
            for (int i = 0; i < length1; i++) {
                result.append(String.valueOf(word1.charAt(i)) + String.valueOf(word2.charAt(i)));
            }
            if (length1 < length2) {
                result.append(word2.substring(length1));
            }
        } else {
            for (int i = 0; i < length2; i++) {
                result.append(String.valueOf(word1.charAt(i)) +String.valueOf(word2.charAt(i)));
            }
            result.append(word1.substring(length2));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        MergeTwoWord m = new MergeTwoWord();
        String result = m.mergeAlternately("abcd", "pq");
        System.out.println(result);
    }
}
