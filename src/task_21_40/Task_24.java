package task_21_40;

/* Տրված են a,b,c թվերը, կազմել ծրագիր, եթե տրված թվերից ճիշտ երկուսը հավասար են երկուսի, ապա կարտածեն true,
հակառակ դեպքում` false
*/
public class Task_24 {
    public static void main(String[] args) {

        int a = 5, b = 2, c = 2;
        boolean t = false;

        if (a == 2 && b == 2 || a == 2 && c == 2 || b == 2 && c == 2) {
            t = true;
            System.out.println(t);
        } else System.out.println(t);
    }
}
