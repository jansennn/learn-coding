import java.util.*;

class DStdinStdoutII{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        double d = sc.nextDouble();
        /* ketika int diikuti string, maka sebelum sc.nextLine() harus dibuat lagi sc.nextLine() */
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}