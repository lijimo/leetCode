public class main {

    public static void main(String[] args) {
        int result;
        int[] nums = {1,3,5,6};
        int target = 5;
        int anotherTarget = 7;

        result = SolutionSearchInsertPos.searchInsert(nums, target);
        // expected index is 2
        System.out.println(result);

        // expected index is 4
        result = SolutionSearchInsertPos.searchInsert(nums, anotherTarget);
        System.out.println(result);


    }
}
