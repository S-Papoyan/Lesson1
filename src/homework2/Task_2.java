package homework2;

//Create an array and fill it with numbers from 1:1000.
public class Task_2 {
    public static void main(String[] args) {

        int[] myArray = new int[1000];
        int x = 1;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = x++;
            System.out.print(myArray[i] + " ");
        }
    }
}
