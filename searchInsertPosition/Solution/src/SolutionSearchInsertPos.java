public class SolutionSearchInsertPos {

    public static int searchInsert(int[] nums, int target) {
        int position = -1;

        for (int i = 0;  i < nums.length; i++) {
            if (i == 0) {
                if (target < nums[i]) {
                    return 0;
                }
            }
            if (i == (nums.length-1)) {
                if (target > nums[i]) {
                    return nums.length;
                }
            }
            if ((target > nums[i]) && (target < nums[i+1])) {
                position = i+1;
            }
            if (target == nums[i]) {
                position = i;
                return position;
            }
        }
        return position;
    }
}
