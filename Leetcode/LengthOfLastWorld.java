import java.util.*;

class LengthOfLastWorld{
    public static int lengthOfLastWord(String s) {
        int startIndex = -1;
        int lastIndex = -1;

        for(int i=s.length()-1 ; i>=0 ;i--){
            char ch = s.charAt(i);

            if(ch == ' ' && lastIndex != -1){
                startIndex = i;
                break;
            }else if(ch != ' ' && lastIndex == -1){
                lastIndex = i;
            }
        }

        return lastIndex - startIndex;
    }

    public static void main(String args[]){
        String s = "a";

        int result = lengthOfLastWord(s);
        System.out.println(result);

    }
}