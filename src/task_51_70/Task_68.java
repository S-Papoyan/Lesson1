package task_51_70;

/*
Տրված է քառանիշ թիվ։ Հաշվել և արտածել քառանիշ թվի միավորների և հարյուրավորների թվանշանների արտադրյալի արժեքը,
եթե միավորների թվանշանը մեծ է տասնավորների թվանշանից, հակառակ դեպքում՝ արտածել 1:
*/
public class Task_68 {
    public static void main(String[] args) {

        int num = 8634;
        int a, b, c, d;
        a = num % 10;
        b = num % 100 / 10;
        c = num % 1000 / 100;
        d = num % 10000 / 1000;

        if (a > b) {
            System.out.println(a * c);
        } else {
            System.out.println(1);
        }
    }
}
