package task_21_40;

// Տրված են a,b,c թվերը, կազմել ծրագիր, որտեղ տրված թվերը կարտածվեն ըստ նվազման կարգի հաջորդականության:
public class Task_30 {
    public static void main(String[] args) {

        int a = 730, b = 411, c = 950;

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else System.out.println(c);
        if (a > b && a < c || a < b && a > c) {
            System.out.println(a);
        } else if (b > a && b < c || b < a && b > c) {
            System.out.println(b);
        } else if (c > a && c < b || c < a && c > b) {
            System.out.println(c);
        }
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else System.out.println(c);
    }
}

