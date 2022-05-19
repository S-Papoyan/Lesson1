package homework2;

//Create an array and fill it with odd number from -20:20.
public class Task_3 {
    public static void main(String[] args) {

        int[] myArray = new int[20];
        int x = -19;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = x;
            System.out.print(myArray[i] + " ");
            x += 2;
        }
    }
}
