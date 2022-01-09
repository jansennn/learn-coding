import java.util.*;

class ChangeValueVariable{

    public static void changeValue(int numA, int numB){
        numA = numA + numB;
        numB = numA - numB;
        numA = numA - numB;

        System.out.println("Value A : " + numA);
        System.out.println("Value B : " + numB);
    }

    public static void main(String args[]){
        int numA = 2;
        int numB = 4;

        changeValue(numA, numB);

    }
}