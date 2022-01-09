import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RJavaRegex{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String s = sc.next();

            String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
            String pattern = num+"."+num+"."+num+"."+num;
            System.out.println(s.matches(pattern));
        }
    }
}