package task_21_40;

/* Տրված են a,b,c թվերը, կազմել ծրագիր, որոնք կարտածեն true, եթե տրված թվերը երկրաչափական պրոգրեսիա են կազմում,
հակառակ դեպքում՝ false:
*/
public class Task_28 {
    public static void main(String[] args) {

        int a = 2, b = 4, c = 8;
        boolean t = false;

        if (c / b == b / a) {
            t = true;
            System.out.println(t);
        } else System.out.println(t);
    }
}
