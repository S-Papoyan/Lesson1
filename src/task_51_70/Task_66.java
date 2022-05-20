package task_51_70;

/*
Տրված է քառանիշ թիվ։ Արտածել 'YES' հաղորդագրությունը, եթե քառանիշ թվի առաջին և վերջին թվանշանների մեջ կա '4'
թվանշանը, հակառակ դեպքում՝ 'NO' հաղորդագրությունը։
*/
public class Task_66 {
    public static void main(String[] args) {

        int num = 8634;
        int a, b, c, d;
        a = num % 10;
        b = num % 100 / 10;
        c = num % 1000 / 100;
        d = num % 10000 / 1000;

        if (b == 4 || a == 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
