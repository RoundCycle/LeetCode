package solution;

/**
 * @author admin
 * @date 2020/6/30
 */
public class Q5 {

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }

        boolean [][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }
        int start = 0;
        int end = 0;
        for (int j = 1; j < s.length(); j++) {
            for (int i = 0; i < j; i++) {
                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = false;
                } else if (j - i < 3) {
                    dp[i][j] = true;
                } else {
                    dp[i][j] = dp[i + 1][j - 1];
                }

                if (dp[i][j] && end - start < j - i + 1) {
                    start = i;
                    end = j;
                }

            }


        }


        return s.substring(start, end + 1);
    }


    public String centerlongestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int longs = Math.max(maxLength(i, i, s), maxLength(i, i + 1, s));
            if (longs > end - start) {
                start = i - (longs - 1) / 2;
                end = i + longs / 2;
            }
        }

        return s.substring(start, end + 1);

    }

    private int maxLength(int left, int right, String s) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public String baolilongestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }
        int index = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {

                int left = i;
                int right = j;
                while (left < right && s.charAt(left) == s.charAt(right)) {
                    left++;
                    right--;
                }

                if (left >= right && maxLength < j - i) {
                    maxLength = j - i + 1;
                    index = i;
                }
            }
        }
        return s.substring(index, index + maxLength);
    }

}
