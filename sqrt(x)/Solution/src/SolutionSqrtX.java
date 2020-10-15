public class SolutionSqrtX {

    public static int mySqrt(int x) {
        double squareRoot = 0;
        double i = 1;

        while (i >= 1)  {
            if (squareRoot * squareRoot == x) {
                return (int) squareRoot;
            }
            if (i * i == x) {
                return (int) i;
            }
            if (((i *i) > x) && ((squareRoot * squareRoot) < x)) {
                return (int) squareRoot;
            }
            squareRoot++;
            i++;
        }
        return (int) squareRoot;

    }
}
