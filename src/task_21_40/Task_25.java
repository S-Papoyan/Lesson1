package task_21_40;

/* Տրված են a,b,c թվերը, կազմել ծրագիր, եթե այդպիսի երկարություն ունեցող հատվածներով հնարավոր է
կառուցել եռանկյունի, ապա կարտածեն 'y = 1', հակառակ դեպքում` 'y = 2' արտահայտությունը։
*/
public class Task_25 {
    public static void main(String[] args) {

        int a = 1, b = 2, c = 3;

        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("'y = 1'");
        } else System.out.println("'y = 2'");
    }
}
