package solution;

import java.util.Arrays;

/**
 * @author admin
 * @date 2020/8/4
 */
public class Q16 {

    public int threeSumClosest(int[] nums, int target) {
        int sum = nums[0] + nums[1] + nums[2] - target;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int newSum = nums[i] + nums[left] + nums[right] - target;
                if (newSum == 0) {
                    return target;
                }
                if (Math.abs(newSum) < Math.abs(sum)) {

                    sum = newSum;
                }
                if (newSum < 0) {
                    left++;
                } else {
                    right--;
                }

            }
        }
        return sum + target;
    }

}
