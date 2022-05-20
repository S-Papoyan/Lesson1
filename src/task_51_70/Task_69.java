package task_51_70;

/*
Տրված է քառանիշ թիվ։ y փոփոխականին վերագրել 1 արժեքը, եթե քառանիշ թվի թվանշանների գումարը մեծ է 20-ից, հակառակ
դեպքում՝ 0 արժեքը։ Արտածել y փոփոխականի արժեքը։
*/
public class Task_69 {
    public static void main(String[] args) {

        int num = 8634;
        int y;
        int a, b, c, d;
        a = num % 10;
        b = num % 100 / 10;
        c = num % 1000 / 100;
        d = num % 10000 / 1000;

        if (a + b + c + d > 20) {
            System.out.println(y = 1);
        } else {
            System.out.println(y = 0);
        }
    }
}
