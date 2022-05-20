package task_51_70;

/*
Տրված է եռանիշ թիվ։ Հաշվել և արտածել եռանիշ թվի և իր թվանշանների գումարի հարաբերության արժեքը, եթե եռանիշ թիվը
մեծ է տրված k թվից, հակառակ դեպքում՝ միավորների թվանշանի և եռանիշ թվի հարաբերության արժեքը։
*/
public class Task_53 {
    public static void main(String[] args) {

        int num = 366;
        int k = 200;
        int a, b, c;
        a = num % 10;
        b = num % 100 / 10;
        c = num % 1000 / 100;

        if (num > k) {
            System.out.println(num / (a + b + c));
        } else {
            System.out.println(a / num);
        }
    }
}