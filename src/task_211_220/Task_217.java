package task_211_220;

/*
Կազմել ծրագիր, որը կհաշվի և կտպի տրված n տարրեր պարունակող միաչափ զանգվածի կենտ ինդեքս ունեցող
տարրերի քառակուսիների արտադրյալը։
*/
public class Task_217 {
    public static void main(String[] args) {

        int[] arr = {15, 250, -60, -40, -58, 105};
        int art = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                art = art * arr[i];
            }
        }
        System.out.println(art * art);
    }
}
