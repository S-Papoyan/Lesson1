package task_21_40;

// Տրված են a,b,c և d թվերը, կազմել ծրագիր, որտեղ տրված թվերը կարտածվեն ըստ աճման կարգի հաջորդականության:
public class Task_39 {
    public static void main(String[] args) {

        int a = 205, b = 400, c = 84, d = 201;

        if (a < b && a < c && a < d) {
            System.out.println(a);
        } else if (b < a && b < c && b < d) {
            System.out.println(b);
        } else if (c < a && c < b && c < d) {
            System.out.println(c);
        } else System.out.println(d);

        if (a > b && a < c && a < d || a > c && a < b && a < d || a > d && a < b && a < c) {
            System.out.println(a);
        } else if (b > a && b < c && b < d || b > c && b < a && b < d || b > d && b < a && b < c) {
            System.out.println(b);
        } else if (c > a && c < b && c < d || c > b && c < a && c < d || c > d && c < a && a < b) {
            System.out.println(c);
        } else System.out.println(d);

        if (a > b && a > c && a < d || a > b && a > d && a < c || a > c && a > d && a < b) {
            System.out.println(a);
        } else if (b > a && b > c && b < d || b > a && b > d && b < c || b > c && b > d && b < a) {
            System.out.println(b);
        } else if (c > a && c > b && c < d || c > a && a > d && c < b || c > b && c > d && c < a) {
            System.out.println(c);
        } else System.out.println(d);

        if (a > b && a > c && a > d) {
            System.out.println(a);
        } else if (b > a && b > c && b > d) {
            System.out.println(b);
        } else if (c > a && c > b && c > d) {
            System.out.println(c);
        } else System.out.println(d);
    }
}
