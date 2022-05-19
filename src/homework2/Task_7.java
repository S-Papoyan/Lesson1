package homework2;

/*Given in integer, 0 < N < 21, print its first 10 multiples, Each multiple N x i (where 0 < i < 11) should be
printed on a new line in the form: N x i = result.
 */
public class Task_7 {
    public static void main(String[] args) {

        int n = 8;
        int result;
        for (int i = 1; i > 0 && i < 11; i++) {
            result = i * n;
            System.out.println(n + " * " + i + " = " + result);
        }
    }
}

