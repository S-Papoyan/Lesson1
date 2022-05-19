package homework2;

//Create an array and fill it with 2 number.
public class Task_1 {
    public static void main(String[] args) {

        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = 2;
            System.out.print(myArray[i] + " ");
        }
    }
}
