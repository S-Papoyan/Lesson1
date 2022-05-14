package task_21_40;

/* Տրված են a,b,c թվերը, կազմել ծրագիր, որը կարտածի մեկ, եթե տրված թվերից գոնե մեկը զույգ է,
այլապես՝ երկու:
*/
public class Task_26 {
    public static void main(String[] args) {

        int a = 1, b = 3, c = 10;

        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0){
            System.out.println(1);
        }else System.out.println(2);
    }
}
