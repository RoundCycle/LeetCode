package solution;

/**
 * @author admin
 * @date 2020/7/28
 */
public class Q9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        int n = 0;
        int a = x;
        while (a > 0) {
            n = n * 10 + a % 10;
            a /= 10;
        }
        return n == x;
    }

}
