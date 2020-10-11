public class SolutionPlusOne {

    public static int[] plusOne(int[] digits) {

        int lastIndex = digits.length - 1;
        int[] newDigits;

        for (int i = lastIndex; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
                if (i == 0) {
                    newDigits = new int[digits.length + 1];
                    newDigits[0] = 1;
                    for (int k = 1; k < newDigits.length; k++) {
                        newDigits[k] = digits[k-1];
                    }
                    return newDigits;
                }
            }
        }
        return digits;
    }

    public static void printArray(int[] digits) {
        String print = "";
        for (int a : digits) {
            print = print + " " + a;
        }
        System.out.println(print);
    }
}
