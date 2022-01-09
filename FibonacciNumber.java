import java.util.*;
import org.junit.jupiter.api.*;

class FibonacciNumber{
    public static int fibonacci(int n){
        if(n == 0 || n == 1)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fibonacci(n));
    }
}