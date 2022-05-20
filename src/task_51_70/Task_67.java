package task_51_70;

/*
Տրված է քառանիշ թիվ։ Արտածել 'YES' հաղորդագրությունը, եթե քառանիշ թիվը հավասար է իր թվանշանների գումարի քառակուսուն,
հակառակ դեպքում՝ 'NO' հաղորդագրությունը։
*/
public class Task_67 {
    public static void main(String[] args) {

        int num = 8634;
        int a, b, c, d;
        a = num % 10;
        b = num % 100 / 10;
        c = num % 1000 / 100;
        d = num % 10000 / 1000;

        if ((a + b + c + d) * (a + b + c + d) == num) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
