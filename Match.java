import java.util.*;

class Match {

    public static char cek(String str){
        HashSet<Character> h = new HashSet<Character>();

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);

            if(!h.contains(c)){
                h.add(c);
            }

            if(c == '}'){
                if(h.contains('{'))
                    return '{';
            }
            else if(c == ')'){
                if(h.contains('('))
                    return '(';
            }
            if(c == ']'){
                if(h.contains('['))
                    return '[';
            }
        }

        return 'c';
    }

    public static void main(String args[]){

        String str = "{([[})]";

        char c = cek(str);
        System.out.println(c);
    }
}