package is_valide;

import java.util.*;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "()"
 * 输出：true
 * 示例2：
 * <p>
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例3：
 * <p>
 * 输入：s = "(]"
 * 输出：false
 */
public class Solution {
    public boolean isValid(String s) {
        //首先肯定必须是偶数
        if (s.length() % 2 != 0) {
            return false;
        }
        char[] charArray = s.toCharArray();
        //判断第一个如果是{，则第二个必须是}，以此类推
        for (int i = 0; i < charArray.length - 1; i += 2) {
            //从0开始为第一
            if (charArray[i] == 91 && charArray[i + 1] == 93) {
                return true;
            }
            if (charArray[i] == 123 && charArray[i + 1] == 125) {
                return true;
            }
            if (charArray[i] == 40 && charArray[i + 1] == 41) {
                return true;
            }
        }
        return false;
    }

    public boolean isValid2(String s) {
        //首先肯定必须是偶数
        if (s.length() % 2 != 0) {
            return false;
        }
        char[] charArray = s.toCharArray();
        Map<Integer, Integer> countMap = new HashMap<>();
        //判断每个的数量是否相等
        for (int i = 0; i < charArray.length; i++) {
            //从0开始为第一
            countMap.put((int) charArray[i], countMap.getOrDefault((int) charArray[i], 0) + 1);
        }
        if (countMap.containsKey(91) && countMap.containsKey(93) && Objects.equals(countMap.get(91), countMap.get(93))) {
            return true;
        }
        if (countMap.containsKey(123) && countMap.containsKey(125) && Objects.equals(countMap.get(123), countMap.get(125))) {
            return true;
        }
        if (countMap.containsKey(40) && countMap.containsKey(41) && Objects.equals(countMap.get(40), countMap.get(41))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean valid = solution.isValid2("([)]");
        System.out.println(valid);
    }
}
