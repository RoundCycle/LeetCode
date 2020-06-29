package solution;

import java.util.Arrays;

/**
 * @author admin
 * @date 2020/6/29
 */
public class Q3 {

    // 滑动窗口
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int[] position = new int[128];
        Arrays.fill(position, -1);
        int maxLength = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            left = Math.max(left, position[s.charAt(right)] + 1);
            position[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

}
