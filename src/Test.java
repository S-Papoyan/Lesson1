public class Test {

    public static void main(String[] args) {

        int x = 5, y = 4, z = 11;

        y = x++;

        z = y-- - ++x;

        x = ++z + --y;

        y = z++ + ++y + --x;

        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("Z = " + z);
    }
}

// x = 1, y = 4, z = 0
