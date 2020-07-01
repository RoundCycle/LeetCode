package solution;

/**
 * @author admin
 * @date 2020/7/1
 */
public class Q6 {

    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows < 2) {
            return s;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numRows; i++) {

            for (int j = 0; ; j++) {
                int index1 = j * (numRows + numRows - 2) + i;
                if (index1 >= s.length()) {
                    break;
                }
                builder.append(s.charAt(index1));
                if (i != 0 && i != numRows - 1) {
                    int index2 = (j + 1) * (numRows + numRows - 2) - i;
                    if (index2 >= s.length()) {
                        break;
                    }
                    builder.append(s.charAt(index2));
                }

            }

        }
        return builder.toString();

    }

}
