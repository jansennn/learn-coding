import java.util.*;
import java.util.regex.*;
class SPatternSyntax{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        while(n > 0){
            String s = sc.nextLine();
            try{
                Pattern.compile(s);
                System.out.println("Valid");
            }catch(PatternSyntaxException ex){
                System.out.println("Invalid");
            }
            n--;
        }
    }
}