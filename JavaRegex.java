import java.util.*;
import java.util.regex.*;
class JavaRegex {

    public static void main(String args[]){
        String str = "andreas?";

        System.out.println(str.replaceAll("\\?", ""));

        System.out.println(Pattern.matches("[a-xA-Z]*", "aaax"));
    }
}