package task_211_220;

/*
Կազմել ծրագիր, որը կհաշվի և կտպի տրված n տարրեր պարունակող միաչափ զանգվածի տրված k թվին բազմապատիկ ինդեքս ունեցող
տարրերի քանակը։
*/
public class Task_219 {
    public static void main(String[] args) {

        int[] arr = {15, 250, -60, -40, 58, -105};
        int k = 12;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
