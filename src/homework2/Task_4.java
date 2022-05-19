package homework2;

//Create an array and fill it. Print all elements which can be divided by 5.
public class Task_4 {
    public static void main(String[] args) {

        int[] myArray = new int[100];
        int x = 1;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = x++;
            if (myArray[i] % 5 == 0) {
                System.out.print(myArray[i] + " ");
            }
        }
    }
}