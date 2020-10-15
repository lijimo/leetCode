public class SolutionAddBinary {

    public static String addBinary(String a, String b) {

        String addition = "";
        int passOn = 0;
        int length;


        // determine which binary is longer
        if (a.length() >= b.length()) {
            length = a.length();
        } else {
            length = b.length();
        }

        int k = a.length() - 1;
        int j = b.length() - 1;


        // addition
        while ((k >= 0) || (j >= 0)) {

            if (k < 0) {
                k++;
                a = "0" + a;
            }

            if (j < 0) {
                j++;
                b = "0" + b;
            }


            if (a.charAt(k) == '1') {
                if (b.charAt(j) == '1') {
                    if (passOn == 1) {
                        addition = "1" + addition;
                        passOn = 1;
                    } else {
                        addition = "0" + addition;
                        passOn = 1;
                    }
                } else {
                    if (passOn == 1) {
                        addition = "0" + addition;
                        passOn = 1;
                    } else {
                        addition = "1" + addition;
                        passOn = 0;
                    }
                }
            } else {
                if (b.charAt(j) == '1') {
                    if (passOn == 1) {
                        addition = "0" + addition;
                        passOn = 1;
                    } else {
                        addition = "1" + addition;
                        passOn = 0;
                    }
                } else {
                    if (passOn == 1) {
                        addition = "1" + addition;
                        passOn = 0;
                    } else {
                        addition = "0" + addition;
                        passOn = 0;
                    }
                }
            }
            k--;
            j--;
        }

        if (passOn == 1) {
            if (addition.charAt(0) == 0) {
                addition = "1" + addition.substring(1);
            } else {
                addition = "1" + addition;
            }
        }

        return addition;
    }
    
}
