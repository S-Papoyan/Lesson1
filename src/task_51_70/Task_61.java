package task_51_70;

/*
Տրված է քառանիշ թիվ։ t Տրամաբանական տիպի փոփոխականին վերագրել true արժեք, եթե թվի միավորների և տասնավորների թվանշանների
գումարը հավասար է հարյուրավորների և հազարավորների թվանշանների գումարին, հակառակ դեպքում՝ false:
Արտածել t փոփոխականի արժեքը։
*/
public class Task_61 {
    public static void main(String[] args) {

        int num = 8694;
        boolean t = false;
        int a, b, c, d;
        a = num % 10;
        b = num % 100 / 10;
        c = num % 1000 / 100;
        d = num % 10000 / 1000;

        if (a + b == c + d) {
            System.out.println(!t);
        } else {
            System.out.println(t);
        }
    }
}
