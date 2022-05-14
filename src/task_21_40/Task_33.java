package task_21_40;

/* Տրված են a,b,c և d թվերը, կազմել ծրագիր, եթե տրված թվերից գոնե մեկը հավասար է մեկի, ապա կարտածեն true,
հակառակ դեպքում` false
*/
public class Task_33 {
    public static void main(String[] args) {

        int a = 12, b = 23, c = 37, d = 1;
        boolean t = false;

        if (a == 1 || b == 1 || c == 1 || d == 1) {
            t = true;
            System.out.println(t);
        } else System.out.println(t);
    }
}

