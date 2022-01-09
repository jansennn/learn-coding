import java.util.*;


class JJavaIntString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        String s = Integer.toString(t);

        if(t == Integer.parseInt(s)){
            System.out.println("Good Job");
        }
    }
}