package task_151_166;

//Տպել բոլոր այն երկնիշ թվերի գումարը, որոնք բազմապատիկ են 3 թվին։
public class Task_155 {
    public static void main(String[] args) {

        int[] arr = new int[100];
        int x = 1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = x;
            x++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 9 && arr[i] % 3 == 0) {
                sum = sum + arr[i];
            }

        }
        System.out.println(sum);
    }
}
