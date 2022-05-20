package task_51_70;

/*
Տրված է եռանիշ թիվ։ Հաշվել և արտածել եռանիշ թվի թվանշանների գումարի և եռանիշ թվի հարաբերության արժեքը, եթե միավորների
թվանշանը մեծ է տասնավորների թվանշանից, հակառակ դեպքում արտածել եռանիշ թիվը։
*/
public class Task_56 {
    public static void main(String[] args) {

        int num = 985;
        int a, b, c;
        a = num % 10;
        b = num % 100 / 10;
        c = num % 1000 / 100;

        if (a > b) {
            System.out.println((a + b + c) / num);
        } else {
            System.out.println(num);
        }
    }
}



