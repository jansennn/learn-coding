import java.util.*;


class QJavaStringToken{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s = s.trim();
        if(s.length() == 0){
            System.out.println(0);
            return;
        }

        String[] c = s.split("[^a-zA-Z]+");
        System.out.println(c.length);
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}
