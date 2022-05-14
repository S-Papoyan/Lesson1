package task_21_40;

// Տրված են a,b,c թվերը, կազմել ծրագիր, որը կարտածի տրված թվերից մեծի արժեքը։

public class Task_21 {
    public static void main(String[] args) {

        int a = 15, b = 18, c = 11;

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else System.out.println(c);
    }
}