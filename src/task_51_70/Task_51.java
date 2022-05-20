package task_51_70;

/*
Տրված է եռանիշ թիվ։ t Տրամաբանական տիպի փոփոխականին վերագրել true արժեք, եթե եռանիշ թվի միավորների թվանշանը
հավասար է տասնավորների և հարյուրավորների թվանշանների գումարին, հակառակ դեպքում՝ false: Արտածել t փոփոխականի արժեքը։
*/
public class Task_51 {
    public static void main(String[] args) {

        int num = 369;
        boolean t = false;
        int a, b, c;
        a = num % 10;
        b = num % 100 / 10;
        c = num % 1000 / 100;

        if (a == b + c) {
            System.out.println(!t);
        } else {
            System.out.println(t);
        }
    }
}
