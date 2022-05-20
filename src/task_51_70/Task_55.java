package task_51_70;

/*
Տրված է եռանիշ թիվ։ Հաշվել և արտածել եռանիշ թվի թվանշաններից փոքրագույնի արժեքը։
*/
public class Task_55 {
    public static void main(String[] args) {

        int num = 968;
        int a, b, c;
        a = num % 10;
        b = num % 100 / 10;
        c = num % 1000 / 100;

        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);

        } else {
            System.out.println(c);
        }
    }
}
