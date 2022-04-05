import java.util.*;


class Encrypt{

    static void encrypt(String str, int dis){
        int n = str.length();

        for(int i=0;i<n;i++){
            int temp = (int) str.charAt(i) + dis;
            if((temp - 97) > 25){
                temp = temp - 97;
                temp = temp % 26;
                temp =  97 + temp;
            }
            System.out.println((char)temp);
        }
    }

    public static void main(String args[]){

        String str =  "abx";
        int dis = 3;
        encrypt(str, dis);
    }
}