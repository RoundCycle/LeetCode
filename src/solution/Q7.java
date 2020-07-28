package solution;

/**
 * @author admin
 * @date 2020/7/27
 */
public class Q7 {

    public int reverse(int x) {
        int n = 0;
        while (x != 0) {

            if (n > Integer.MAX_VALUE / 10) {
                return 0;
            }
            if (n < Integer.MIN_VALUE / 10) {
                return 0;
            }
            n = n * 10 + x % 10;
            x /= 10;
        }
        return n;
    }

}
