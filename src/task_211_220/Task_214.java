package task_211_220;

/*
Կազմել ծրագիր, որը կհաշվի և կտպի տրված n տարրեր պարունակող միաչափ զանգվածի բացասական տարրերի միջին թվաբանականը։
*/
public class Task_214 {
    public static void main(String[] args) {

        int[] arr = {15, 25, -60, -40, -58, 105};
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
                sum = sum + arr[i];
            }
        }
        System.out.println(sum/count);
    }
}