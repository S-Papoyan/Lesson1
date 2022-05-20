package task_151_166;

//Տպել բոլոր այն եռանիշ թվերի արտադրյալը, որոնք բազմապատիկ չեն 2 և 3 թվերին։
public class Task_158 {
    public static void main(String[] args) {

        int[] arr = new int[200];
        int x = 1;
        int art = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = x;
            x++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 99 && arr[i] % 2 != 0 && arr[i] % 3 != 0) {
                art = art * arr[i];
            }
        }
        System.out.println(art);
    }
}

