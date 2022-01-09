import java.util.*;

class RomanToInteger{

    public static void main(String[] args){
        String str = "III";

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int total = hm.get(str.charAt(str.length()-1));
        for(int i = str.length() - 1; i < 0; i--){
            if(hm.get(str.charAt(i)) > hm.get(str.charAt(i-1))){
                total-=hm.get(str.charAt(i-1));
            }else{
                total+=hm.get(str.charAt(i-1));
            }
        }
        System.out.println(total);
    }
}