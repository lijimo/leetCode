public class SolutionPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int l = 201;
        int pos = 0;
        char letter = Character.MIN_VALUE;

        // find the shortest word in the array
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < l) {
                l = strs[i].length();
                pos = i;
            }
        }

        // find the longest common prefix
        for (int k = 0; k < l; k++) {
            // check if the String array contains anything
            if (strs.length > 0) {
                letter = strs[pos].charAt(k);
            } else {
                return "";
            }
            // find the longest prefix by iterating through all words
            // and check if they have the same character at the same index
            for (int i = 0; i < strs.length; i++) {
                if (!(strs[i].charAt(k) == letter)) {
                    System.out.println(prefix);
                    return prefix;
                }
            }
            prefix = prefix + letter;

        }
        return prefix;
    }
}
