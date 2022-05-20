package task_151_166;

//Տպել բոլոր այն բնական թվերի արտադրյալը, որոնց վրա տրված n բնական թիվը բաժանելիս կմնա 3 մնացորդ։
public class Task_154 {
    public static void main(String[] args) {

        int[] arr = new int[100];
        int x = 1;
        int n = 50;
        int art = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = x;
            x++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % n == 3) {
                art = art * arr[i];
            }
        }
        System.out.println(art);
    }
}



