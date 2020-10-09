public class SolutionRemoveElement {

    public static int removeElement(int[] nums, int val) {

        int counter = 0;
        int limit = nums.length - 1;
        int i = 0;

        if (nums == null) {
            return 0;
        }

        while (i <= limit) {

            if (nums[i] == val) {
                for (int j = i; j < limit; j++) {
                    nums[j] = nums[j+1];
                }
                nums[limit] = 0;
                limit--;
            } else {
                counter++;
                i++;
            }
        }
        return counter;
    }

    public static void printResult(int[] nums) {
        String result = "";
        for (int a : nums) {
            result = result + " " + a;
        }
        System.out.println(result);
    }
}
