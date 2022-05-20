package task_211_220;

/*
Կազմել ծրագիր, որը կհաշվի և կտպի տրված n տարրեր պարունակող միաչափ զանգվածի զույգ ինդեքս ունեցող տարրերի գումարը։
*/
public class Task_215 {
    public static void main(String[] args) {

        int[] arr = {15, 250, -60, -40, -58, 105};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}

