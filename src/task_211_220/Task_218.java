package task_211_220;

/*
Կազմել ծրագիր, որը կհաշվի և կտպի տրված n տարրեր պարունակող միաչափ զանգվածի կենտ ինդեքս ունեցող
տարրերի բացարձակ արժեքների գումարը։
*/
public class Task_218 {
    public static void main(String[] args) {

        int[] arr = {15, 250, -60, -40, 58, -105};
        int sum = 0;
        int a = 0; //<- բացարձակ արժեք պարունակող փոփոխական
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] < 0) {
                a = arr[i] - arr[i] * 2;
            }
            if (arr[i] > 0 && arr[i] % 2 != 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum + a);
    }
}