package solution;

/**
 * @author admin
 * @date 2020/7/28
 */
public class Q11 {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxSize = 0;
        int i = 1;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            maxSize = Math.max(h * (height.length - i), maxSize);
            i++;
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxSize;

    }

}
