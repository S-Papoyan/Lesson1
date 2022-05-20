package task_51_70;

/*
Տրված է եռանիշ թիվ։ Արտածել եռանիշ թվի թվանշանները ըստ աճման կարգի հաջորդականության։
*/
public class Task_59 {
    public static void main(String[] args) {

        int num = 369;
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
        if (a > b && a < c || a < b && a > c) {
            System.out.println(a);
        } else if (b > a && b < c || b < a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
