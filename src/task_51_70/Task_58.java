package task_51_70;

/*
Տրված է եռանիշ թիվ։ Սիմվոլային f փոփոխականին վերագրել 'a' արժեքը, եթե եռանիշ թվի տասնավորների և հարյուրավորների
թվանշանների գումարը փոքր է 5-ից, հակառակ դեպքում 'b' արժեքը։ Արտածել f-ի արժեքը։
*/
public class Task_58 {
    public static void main(String[] args) {

        int num = 242;
        char f;
        int a, b, c;
        a = num % 10;
        b = num % 100 / 10;
        c = num % 1000 / 100;

        if (b + c < 5) {
            System.out.println(f = 'a');
        } else {
            System.out.println(f = 'b');
        }
    }
}
