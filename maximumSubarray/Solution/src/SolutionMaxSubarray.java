public class SolutionMaxSubarray {

    public static int maxSubArray(int[] nums) {
        int maxSum;
        int current = 0;

        if ((nums == null) || (nums.length == 0)) {
            return 0;
        }

        maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            current = nums[i];
            if (current >= maxSum) {
                maxSum = current;
            }
            for (int j = (i+1); j < nums.length; j++) {
                current = current + nums[j];
                    if (current >= maxSum) {
                        maxSum = current;
                    }
                }
        }
        return maxSum;
    }
}
