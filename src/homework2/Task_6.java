package homework2;

/*
Ունենանք array, որի մեջ կան երկնիշ և ավել թվեր, ունենանք ևս մեկ հատ array, որի երկարությունը կլինի առաջինի չափ:
Երկրորդ array մեջ ստանանք առաջին array-ի թվերի ռեվերս տարբերակը:
*/
public class Task_6 {
    public static void main(String[] args) {
        int[] myArray = {15, 25};
        int[] myArray2 = new int[myArray.length];
        int x = 0;
        for (int i = 0; i < myArray.length; i++) {
            while (myArray[i] != 0) {
                x = x * 10 + myArray[i] % 10;
                myArray[i] = myArray[i] / 10;
                if(myArray[i] == 0){
                    for (int j = 0; j < myArray2.length; j++) {
                        myArray2[j] = x;
                    }
                }
            }
        }
    }
}