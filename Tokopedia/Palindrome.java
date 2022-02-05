import java.util.*;

class Palindrome{

    public static int palindrome(String s){
        int count = 0;
        HashSet<String> hs = new HashSet<String>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length()+1;j++){
                String subs = s.substring(i,j);
                StringBuilder subs1 = new StringBuilder();
                subs1.append(subs);
                subs1.reverse();
                if(subs.toString().equals(subs1.toString())){
                    if(!hs.contains(subs.toString())){
                        count++;
                    }
                    hs.add(subs.toString());
                }
            }
        }
        return count;
    }

    public static void main(String args[]){
        String s = "mokkori";

        int result = palindrome(s);
        System.out.println(result);
    }
}