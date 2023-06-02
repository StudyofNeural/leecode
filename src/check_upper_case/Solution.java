package check_upper_case;

public class Solution {
    public boolean detectCapitalUse(String word) {
        char[] charArray = word.toCharArray();
        boolean flag = false;
        if (charArray[0] >= 65 && charArray[0] <= 90) {
            flag = true;
        }
        if (flag) {
            int count = 0;
            for (int i = 1; i < charArray.length; i++) {
                if (charArray[i] >= 65 && charArray[i] <= 90) {
                    count++;
                }
            }
            return count == 0 || count == charArray.length - 1;
        }
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                return false;
            }
        }
        return true;
    }

}
