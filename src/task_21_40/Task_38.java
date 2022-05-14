package task_21_40;

/* Տրված են a,b,c և d թվերը, կազմել ծրագիր, որոնք կարտածեն true, եթե տրված թվերը երկրաչափական պրոգրեսիա են կազմում,
հակառակ դեպքում՝ false:
*/
public class Task_38 {
    public static void main(String[] args) {

        int a = 2, b = 4, c = 8, d = 16;
        boolean t = false;

        if (d / c == c / b && b / a == c / b) {
            t = true;
            System.out.println(t);
        } else System.out.println(t);
    }
}
