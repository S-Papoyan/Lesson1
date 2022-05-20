package task_51_70;

/*
Տրված է քառանիշ թիվ։ Արտածել 'y=12' արտահայտությունը, եթե միավորների և տասնավորների թվանշանների արտադրյալը հավասար
է 12-ի, հակառակ դեպքում՝ 'y=0' արտահայտությունը։
*/
public class Task_65 {
    public static void main(String[] args) {

        int num = 8614;
        char y;
        int a, b, c, d;
        a = num % 10;
        b = num % 100 / 10;
        c = num % 1000 / 100;
        d = num % 10000 / 1000;

        if (a * b == 12) {
            System.out.println("y=12");
        } else {
            System.out.println("y=0");
        }
    }
}
