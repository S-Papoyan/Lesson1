package task_51_70;

//Տրված է քառանիշ թիվ։ Արտածել 1, եթե քառանիշ թվի թվանշանների մեջ կա '1' թվանշանը, հակառակ դեպքում՝ 0։
public class Task_63 {
    public static void main(String[] args) {

        int num = 8614;
        int a, b, c, d;
        a = num % 10;
        b = num % 100 / 10;
        c = num % 1000 / 100;
        d = num % 10000 / 1000;

        if (a == 1 || b == 1 || c == 1 || d == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}


