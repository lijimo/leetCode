public class main {

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] otherNums = {0,0,1,1,1,2,2,3,3,4};

        // expected counter is 5;
        // expected array is [0,1,2,3,4]

        SolutionRemoveDuplicates.printResult(nums);
        SolutionRemoveDuplicates.removeDuplicates(nums);
        SolutionRemoveDuplicates.printResult(nums);


    }
}
