package task_21_40;

/* Տրված են a,b,c և d թվերը, կազմել ծրագիր, եթե տրված թվերից մեկը հավասար է մյուս երեք թվերի գումարին,
ապա կարտածեն true, հակառակ դեպքում` false։
*/
public class Task_35 {
    public static void main(String[] args) {

        int a = 12, b = 8, c = 3, d = 1;
        boolean t = false;

        if (a == b + c + d || b == a + c + d || c == a + b + d || d == a + b + c) {
            t = true;
            System.out.println(t);
        } else System.out.println(t);
    }
}
