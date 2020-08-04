package solution;

/**
 * @author admin
 * @date 2020/7/29
 */
public class Q14 {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        boolean result = true;
        int start = 0;
        while (result) {
            char c = 0;
            for (int i = 0; i < strs.length; i++) {
                if (start >= strs[i].length()) {
                    result = false;
                    break;
                }

                if (i == 0) {
                    c = strs[i].charAt(start);
                    continue;
                }
                if (c != strs[i].charAt(start)) {
                    result = false;
                    break;
                }
            }
            start++;
        }

        return strs[0].substring(0, start - 1);
    }

}
