package task_151_166;

//Տպել բոլոր այն բնական թվերի գումարը, որոնց վրա առանց մնացորդի բաժանվում է տրված n բնական թիվը։
public class Task_151 {
    public static void main(String[] args) {

        int[] arr = new int[100];
        int x = 1;
        int n = 30;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = x;
            x++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % n == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}


