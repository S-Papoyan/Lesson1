package task_51_70;

/*
Տրված է եռանիշ թիվ։ Տրամաբանական t փոփոխականին վերագրել true արժեք, եթե եռանիշ թվի թվանշանների մեջ կան իրար
հավասար թվանշաններ, հակառակ դեպքում` false։ Արտածել t փոփոխականի արժեքը։
*/
public class Task_52 {
    public static void main(String[] args) {

        int num = 366;
        boolean t = false;
        int a, b, c;
        a = num % 10;
        b = num % 100 / 10;
        c = num % 1000 / 100;

        if (a == b || a == c || b == c) {
            System.out.println(!t);
        } else {
            System.out.println(t);
        }
    }
}
