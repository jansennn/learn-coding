import java.util.*;

class FJavaLoopsII{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            for(int j=0;j<n;j++){
                a = a + ((int) Math.pow(2,j)*b);
                System.out.printf(a + " ");
            }
        }
    }
}