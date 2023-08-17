package perfect_num;

/**
 * 对于一个正整数，如果它和除了它自身以外的所有 正因子 之和相等，我们称它为 「完美数」。
 * <p>
 * 给定一个整数n，如果是完美数，返回 true；否则返回 false。
 * <p>
 *
 * <p>
 * 示例 1：
 * <p>
 * 输入：num = 28
 * 输出：true
 * 解释：28 = 1 + 2 + 4 + 7 + 14
 * 1, 2, 4, 7, 和 14 是 28 的所有正因子。
 * 示例 2：
 * <p>
 * 输入：num = 7
 * 输出：false
 * <p>
 */
public class PerfectNum {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int limit = (int) Math.sqrt(num);
        int sum = 1;
        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) {
                sum += i;
                sum += num / i;
                if (sum == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PerfectNum perfectNum = new PerfectNum();
        //1 + 2 + 3 + 4 +
//        boolean b = perfectNum.checkPerfectNumber(36);
//        System.out.println(b);
        boolean b2 = perfectNum.checkPerfectNumber(28);
        System.out.println(b2);
    }
}
