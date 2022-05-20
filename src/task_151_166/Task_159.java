package task_151_166;

//Տպել բոլոր այն եռանիշ թվերի արտադրյալը, որոնք 3-ի բաժանելիս կմնա 1 մնացորդ, իսկ 4-ի բաժանելիս՝ 2 մնացորդ։
public class Task_159 {
    public static void main(String[] args) {

        int[] arr = new int[110];
        int x = 1;
        int art = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = x;
            x++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 99 && arr[i] % 3 == 1 && arr[i] % 4 == 2) {
                art = art * arr[i];
            }
        }
        System.out.println(art);
    }
}
