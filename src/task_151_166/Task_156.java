package task_151_166;

//Տպել բոլոր այն երկնիշ թվերի արտադրյալը, որոնք բազմապատիկ են 3 և 5 թվերին։
public class Task_156 {
    public static void main(String[] args) {

        int[] arr = new int[30];
        int x = 1;
        int art = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = x;
            x++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 9 && arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                art = art * arr[i];
            }

        }
        System.out.println(art);
    }
}
