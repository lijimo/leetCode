public class SolutionImplementStrstr {

    public static int strStr(String haystack, String needle) {
        int indexHaystack = 0;
        int indexNeedle = 0;
        int iterator = 0;

        if (needle.isEmpty()) {
            return 0;
        }

        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
            indexHaystack = -1;
            if (haystack.charAt(i) == needle.charAt(0)) {
                indexHaystack = i;
                iterator = i;
                if ((iterator + needle.length() > haystack.length())) {
                    return -1;
                }
                for (int j = 0; j < needle.length(); j++) {
                    if (iterator < haystack.length()) {
                        if (haystack.charAt(iterator) == needle.charAt(j)) {
                            if (j == (needle.length()-1)) {
                                return indexHaystack;
                            }
                            iterator++;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return indexHaystack;
    }
}
