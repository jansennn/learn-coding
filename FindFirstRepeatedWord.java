import java.util.*;

class FindFirstRepeatedWord{

    static String findFirstRepeatedWord(String s){
        //make String s to array of string divide by space
        String token[] = s.split(" ");

        //define HashMap
        HashMap<String, Integer> hs = new HashMap<String, Integer>();

        for(int i = 0; i<token.length;i++){
            hs.put(token[i], i+1);
        }

        for(int i=0;i<token.length;i++){
            int count = hs.get(token[i]);
            if(count > 1){
                return token[i];
            }
        }

        return "NoRepeatedWord";
    }

    public static void main(String[] args){
        String s = "he had had he";
        String result = findFirstRepeatedWord(s);
        if(result.equals("NoRepeatedWord")){
            System.out.println("No Repeated Word");
        }else{
            System.out.println("Repeated Word is : " + result);
        }

    }
}