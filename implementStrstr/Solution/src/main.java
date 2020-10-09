public class main {

    public static void main(String[] args) {

        String haystack = "hello";
        String needle = "ll";
        int output;

        // expected index is 2
        output = SolutionImplementStrstr.strStr(haystack, needle);
        System.out.println(output);
    }
}
