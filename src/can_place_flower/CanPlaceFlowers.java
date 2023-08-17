package can_place_flower;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        int result = 0;
        int temp = 0;
        if (n == 0) {
            return true;
        }
        if (length == 1) {
            return flowerbed[0] == 0;
        }
        int left = 0, right = 0;
        //分解为3段，0-n;n-m;m-length
        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 1) {
                left = i;
                break;
            }
        }
        for (int i = length - 1; i > 0; i--) {
            if (flowerbed[i] == 1) {
                right = i;
                break;
            }
        }
        if (left == 0 && right == 0 && flowerbed[0] != 1) {
            return (length + 1) / 2 >= n;
        }
        if (left >= 2) {
            result += left / 2;
        }
        if (length - 1 - right >= 2) {
            result += (length - 1 - right) / 2;
        }
        if (left != right) {
            temp = left + 1;
            for (int i = temp; i <= right; i++) {
                if (flowerbed[i] == 1) {
                    if (i - temp - 3 >= 0) {
                        result += (i - temp - 3) / 2 + 1;
                    }
                    temp = i + 1;
                }
            }
        }
        return result >= n;
    }

    public static void main(String[] args) {
        int[] flowerbed = new int[]{1,0,0,0,0,0,1};
        boolean b = new CanPlaceFlowers().canPlaceFlowers(flowerbed, 2);
        System.out.println(b);
    }
}
