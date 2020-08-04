package solution;

/**
 * @author admin
 * @date 2020/7/28
 */
public class Q12 {

    public static String intToRoman(int num) {
        int[] nums = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] symbols = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D","CM", "M"};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (num >= nums[i]) {
                num -= nums[i];
                stringBuilder.append(symbols[i]);
            }
        }
        return stringBuilder.toString();
    }

    public static String bakintToRoman(int num) {
        int thousand = num / 1000;
        int hundred = (num % 1000) / 100;
        int ten = (num % 100) / 10;
        int one = num % 10;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < thousand; i++) {
            stringBuilder.append("M");
        }

        for (int i = 0; i < hundred; i++) {
            if (hundred == 9) {
                stringBuilder.append("CM");
                break;
            }
            if (hundred == 4) {
                stringBuilder.append("CD");
                break;
            }
            if (hundred > 5 && i > 0) {
                stringBuilder.append("D");
                i = 4;
            }
            stringBuilder.append("C");
        }

        for (int i = 0; i < ten; i++) {
            if (ten == 9) {
                stringBuilder.append("XC");
                break;
            }
            if (ten == 4) {
                stringBuilder.append("XL");
                break;
            }
            if (ten > 5 && i > 0) {
                stringBuilder.append("L");
                i = 4;
            }
            stringBuilder.append("X");
        }

        for (int i = 0; i < one; i++) {
            if (one == 9) {
                stringBuilder.append("IX");
                break;
            }
            if (one == 4) {
                stringBuilder.append("IV");
                break;
            }
            if (one > 5 && i > 0) {
                stringBuilder.append("V");
                i = 4;
            }
            stringBuilder.append("I");
        }
        return stringBuilder.toString();
    }

}
