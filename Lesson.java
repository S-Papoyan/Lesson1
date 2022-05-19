public class Lesson {

    public static void main(String[] args) {

        int[] array = {20, 50, 125, 130, 200, 999};
        int[] reverseArray = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArray[j] = array[i];
        }
        for (int i = 0; i < reverseArray.length; i++) {
            System.out.print(reverseArray[i] + " ");
        }
    }
}
