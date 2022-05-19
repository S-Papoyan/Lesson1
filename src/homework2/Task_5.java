package homework2;

//Create an array and fill it. Print all elements witch are between 24,12 and 467,23.
public class Task_5 {
    public static void main(String[] args) {

        double[] myArray = new double[470];
        double x = 1;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = x++;
            if (x > 24.12 && x < 467.23) {
                System.out.print(myArray[i] + " ");
            }
        }
    }
}

