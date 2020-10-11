public class main {

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result;

        // expected maximum sum is 6
        result = SolutionMaxSubarray.maxSubArray(nums);
        System.out.println(result);

    }

}
