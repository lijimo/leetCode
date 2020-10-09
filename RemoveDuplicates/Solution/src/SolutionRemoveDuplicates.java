public class SolutionRemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int counter = 0;
        int current = 0;

        if (nums == null) {
            return 0;
        }

        if (nums.length == 0) {
            return 0;
        }

        counter = 1;
        if (nums.length == 1) {
            return counter;
        }

        int limit = nums.length-1;
        current = nums[0];
        int i = 1;

        while (i <= limit) {
            if (nums[i] == current) {
                for (int j = i; j < limit; j++) {
                    nums[j] = nums[j+1];
                }
                nums[limit] = 0;
                limit--;
            } else {
                current = nums[i];
                i++;
                counter++;
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
