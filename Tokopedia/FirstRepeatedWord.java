import java.util.*;

class FirstRepeatedWord{

    public static String firstRepeatedWord(String sentence){
        String str[] = sentence.split("\\s|-|;|:|,");
        HashSet<String> h = new HashSet<String>();

        for(int i=0;i<str.length-1;i++){
            if(h.contains(str[i])){
                return str[i];
            }else{
                h.add(str[i]);
            }
        }

        return "\0";
    }

    public static void main(String args[]){
        String sentence = "We work hard because hard;work pays";
        String result;

        result = firstRepeatedWord(sentence);
        System.out.println(result);
    }
}