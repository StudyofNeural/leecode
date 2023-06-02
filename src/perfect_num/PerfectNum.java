package perfect_num;

public class PerfectNum {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int limit = (int) Math.sqrt(num);
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            if (num % i == 0) {
                sum += i;
                sum += num / i;
                return sum == num;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PerfectNum perfectNum = new PerfectNum();
        boolean b = perfectNum.checkPerfectNumber(7);
        System.out.println(b);
        boolean b2 = perfectNum.checkPerfectNumber(28);
        System.out.println(b2);
    }
}
