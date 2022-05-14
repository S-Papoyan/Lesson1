package task_21_40;

/* Տրված են a,b,c թվերը, կազմել ծրագիր, որոնք կարտածեն true, եթե տրված թվերը թվաբանական պրոգրեսիա են կազմում,
հակառակ դեպքում՝ false:
*/
public class Task_27 {
    public static void main(String[] args) {

        int a = 1, b = 2, c = 3;
        boolean t = false;

        if (c - b == b - a) {
            t = true;
            System.out.println(t);
        } else System.out.println(t);
    }
}
