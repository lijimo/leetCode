public class main {

    public static void main(String[] args) {

        int val = 3;
        int[] nums = {3,2,2,3};
        int counter;

        // expected counter is 2
        // expected array is [2, 2]
        SolutionRemoveElement.printResult(nums);
        counter = SolutionRemoveElement.removeElement(nums, val);
        System.out.println(counter);
        SolutionRemoveElement.printResult(nums);

    }
}
