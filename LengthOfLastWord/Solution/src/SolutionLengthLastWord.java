public class SolutionLengthLastWord {

    public static int lengthOfLastWord(String s) {
        int counter = 0;
        int max = 0;

        if ((s == null) || (s.length() == 0)) {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == ' ')) {
                counter++;
                max = counter;
            } else {
                counter = 0;
            }
        }
        return max;
    }
}
