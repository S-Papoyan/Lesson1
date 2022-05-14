package task_21_40;

/* Տրված են a,b,c և d թվերը, կազմել ծրագիր, եթե տրված թվերից երկուսի գումարը հավասար է մյուս երկուսի գումարին,
ապա կարտածեն true, հակառակ դեպքում` false
*/
public class Task_34 {
    public static void main(String[] args) {

        int a = 12, b = 8, c = 10, d = 10;
        boolean t = false;

        if (a + b == c + d || a + c == b + d || a + d == b + c) {
            t = true;
            System.out.println(t);
        } else System.out.println(t);
    }
}
