package task_21_40;

/* Տրված են a,b,c թվերը, կազմել ծրագիր, եթե տրված թվերից գոնե մեկը հավասար է մեկի, ապա կարտածեն true,
հակառակ դեպքում` false
*/
public class Task_23 {
    public static void main(String[] args) {

        boolean t = false;
        int a = 2, b = 13, c = 11;

        if (a == 1 || b == 1 || c == 1) {
            t = true;
            System.out.println(t);
        } else System.out.println(t);
    }
}

