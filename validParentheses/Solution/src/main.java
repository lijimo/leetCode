public class main {

    public static void main(String[] args) {

        String first = "(){}[]";
        String second = "([)]";
        String third = "([{}])";
        String fourth = "[([]])";
        boolean x;

        // expected true
        x = SolutionValidParentheses.isValid(first);
        System.out.println(x);
        // expected false;
        x = SolutionValidParentheses.isValid(second);
        System.out.println(x);
        // expected true;
        x = SolutionValidParentheses.isValid(third);
        System.out.println(x);
        //expected false;
        x = SolutionValidParentheses.isValid(fourth);
        System.out.println(x);
    }
}
