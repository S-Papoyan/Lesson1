package task_51_70;

/*
Տրված է քառանիշ թիվ։ y փոփոխականին վերագրել 0 արժեքը, եթե քառանիշ թվի թվանշանների արտադրյալը մեծ է 200-ից, հակառակ
դեպքում՝ 1 արժեքը։ Արտածել y փոփոխականի արժեքը։
*/
public class Task_70 {
    public static void main(String[] args) {

        int num = 8634;
        int y;
        int a, b, c, d;
        a = num % 10;
        b = num % 100 / 10;
        c = num % 1000 / 100;
        d = num % 10000 / 1000;

        if (a * b * c * d > 200) {
            System.out.println(y = 0);
        } else {
            System.out.println(y = 1);
        }
    }
}
