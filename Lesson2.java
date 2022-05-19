public class Lesson2 {

    public static void main(String[] args) {
        int[] arr = {5, 11, 4, 5, 11};

        int x = 0;

        for (int i = 0; i < arr.length; i++) {

            x = x ^ arr[i];

        }
        System.out.println(x);
    }
}

