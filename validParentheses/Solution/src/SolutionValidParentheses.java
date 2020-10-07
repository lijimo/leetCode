public class SolutionValidParentheses {

    public static boolean isValid(String s) {
        int pos = 0;
        char bracket = '0';
        int firstBracketOpening = 0;
        int firstBracketClosing = 0;
        int secondBracketOpening = 0;
        int secondBracketClosing = 0;
        int thirdBracketOpening = 0;
        int thirdBracketClosing = 0;

        // check if there are equal amounts of opening and closing brackets for each bracket type
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '(') {
                firstBracketOpening++;
            }
            if (s.charAt(j) == ')') {
                firstBracketClosing++;
            }
            if (s.charAt(j) == '[') {
                secondBracketOpening++;
            }
            if (s.charAt(j) == ']') {
                secondBracketClosing++;
            }
            if (s.charAt(j) == '{') {
                thirdBracketOpening++;
            }
            if (s.charAt(j) == '}') {
                thirdBracketClosing++;
            }
        }

        if (!((firstBracketOpening == firstBracketClosing) &&
                (secondBracketOpening == secondBracketClosing) &&
                (thirdBracketOpening == thirdBracketClosing))) {
            return false;
        }

        while (!(s.isEmpty())) {
            // find the last opening bracket
            pos = -1;
            for (int i = 0;  i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    pos = i;
                    bracket = '(';
                }
                if (s.charAt(i) == '[') {
                    pos = i;
                    bracket = '[';
                }
                if (s.charAt(i) == '{') {
                    pos = i;
                    bracket = '{';
                }
            }

            // delete correctly opened and closed bracket pairs
                StringBuilder sb = new StringBuilder(s);
            if ((pos+1) == s.length()) {
                return false;
            }
                if (bracket == '(') {
                    if (s.charAt(pos+1) == ')') {
                        sb.deleteCharAt(pos);
                        sb.deleteCharAt(pos);
                        s = sb.toString();
                    } else {
                        return false;
                    }
                }
                if (bracket == '[') {
                    if (s.charAt(pos+1) == ']') {
                        sb.deleteCharAt(pos);
                        sb.deleteCharAt(pos);
                        s = sb.toString();
                    } else {
                        return false;
                    }
                }
                if (bracket == '{') {
                    if (s.charAt(pos+1) == '}') {
                        sb.deleteCharAt(pos);
                        sb.deleteCharAt(pos);
                        s = sb.toString();
                    } else {
                        return false;
                    }
                }
         System.out.println(s);
        }

        // if in the end the String is empty, then it is valid
 return true;
    }

}
