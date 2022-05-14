package task_21_40;

/* Տրված են a,b,c և d թվերը, կազմել ծրագիր, եթե տրված թվերից գոնե երկուսը կենտ են, ապա կարտածվի մեկ,
հակառակ դեպքում` երկու։
*/
public class Task_36 {
    public static void main(String[] args) {

        int a = 99, b = 8, c = 3, d = 14;

        if (a % 2 != 0 && b % 2 != 0 || a % 2 != 0 && c % 2 != 0 || a % 2 != 0 && d % 2 != 0
                || b % 2 != 0 && c % 2 != 0 || b % 2 != 0 && d % 2 != 0
                || c % 2 != 0 && d % 2 != 0) {
            System.out.println(1);
        } else System.out.println(2);
    }
}
