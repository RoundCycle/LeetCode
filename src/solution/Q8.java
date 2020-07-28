package solution;

/**
 * @author admin
 * @date 2020/7/27
 */
public class Q8 {
    public static int myAtoi(String str) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        if (i == str.length()) {
            return 0;
        }
        int flag = 0;
        if (str.charAt(i) == '+') {
            i = i + 1;
        } else if (str.charAt(i) == '-') {
            flag = 1;
            i = i + 1;
        }
        int n = 0;
        for (int j = i; j < str.length(); j++) {
            if (Character.isDigit(str.charAt(j))) {
                int digit = str.charAt(j) - '0';

                if (flag == 0 && n > (Integer.MAX_VALUE  - digit) / 10) {
                    return Integer.MAX_VALUE;
                }
                if (flag == 1 && 0 - n < (Integer.MIN_VALUE + digit) / 10) {
                    return Integer.MIN_VALUE;
                }
                n = n * 10 + digit;
            } else {
                break;
            }
        }
        if (flag == 0) {
            return n;
        } else {
            return 0 - n;
        }

    }

    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
    }
}
