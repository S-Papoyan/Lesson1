package task_151_166;

//Տպել բոլոր այն եռանիշ թվերի գումարը, որոնք բազմապատիկ չեն 5 թվին։
public class Task_157 {
    public static void main(String[] args) {

        int[] arr = new int[999];
        int x = 1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = x;
            x++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 99 && arr[i] % 5 != 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}
