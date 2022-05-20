package task_51_70;

/*
Տրված է քառանիշ թիվ։ Սիմվոլային y փոփոխականին վերագրել 's' արժեքը, եթե քառանիշ թվի միավորների և տասնավորների
թվանշանների գումարը հավասար է 5-ի, հակառակ դեպքում 'd' արժեքը։ Արտածել y-ի արժեքը։
*/
public class Task_64 {
    public static void main(String[] args) {

        int num = 8614;
        char y;
        int a, b, c, d;
        a = num % 10;
        b = num % 100 / 10;
        c = num % 1000 / 100;
        d = num % 10000 / 1000;

        if (a + b == 5) {
            System.out.println(y = 's');
        } else {
            System.out.println(y = 'd');
        }
    }
}
