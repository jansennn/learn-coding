import java.util.*;

class ReverseInteger{

    static int reverse(int x){
        int result = 0;
        int newResult = 0;
        while(x != 0){
            int tail = x % 10;

            newResult = (result * 10) + tail;

            result = newResult;

            x = x / 10;
        }

        return newResult;
    }

    public static void main(String[] args){
        int x = 321;
        int ans = reverse(x);

        System.out.println("hasilnya : " + ans);


    }
}