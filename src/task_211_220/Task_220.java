package task_211_220;

/*
Կազմել ծրագիր, որը կհաշվի և կտպի տրված n տարրեր պարունակող միաչափ զանգվածի դրական և բացասական տարրերի քանակը։
*/
public class Task_220 {
    public static void main(String[] args) {

        int[] arr = {15, 250, -60, -40, 58, -105};
        int countMinus = 0;
        int countPlus = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <0) {
                countMinus++;
            }else countPlus++;
        }
        System.out.println("Դրական տարրեր։ " + countPlus);
        System.out.println("Բացասական տարրեր։ " + countMinus);
    }
}
