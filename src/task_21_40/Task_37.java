package task_21_40;

/* Տրված են a,b,c և d թվերը, կազմել ծրագիր, որոնք կարտածեն true, եթե տրված թվերը թվաբանական պրոգրեսիա են կազմում,
հակառակ դեպքում՝ false:
*/
public class Task_37 {
    public static void main(String[] args) {

        int a = 5, b = 10, c = 15, d = 20;
        boolean t = false;

        if (d - c == c - b && b - a == c - b) {
            t = true;
            System.out.println(t);
        } else System.out.println(t);
    }
}
/*
կամ թվաբանական պրոգրեսիայի աճման չափը հայտարարել փոփոխականով, օրինակ int x = 5;
        int a = 5, b = 10, c = 15, d = 20;
        int x = 5;
        boolean t = false;
        if (a + x == b && b + x == c && c + x == d) {
            t = true;
            System.out.println(t);
        } else System.out.println(t);
 */
