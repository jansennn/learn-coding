import java.io.IOException;
import java.util.Scanner;

public class TwinRing {
    //creating method for checking two string
    static boolean[] twins(String[] a, String[] b) {
        boolean[] result = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            String aVal = a[i].toLowerCase();
            String bVal = b[i].toLowerCase();
            String[] aValArray = aVal.split("");
            String[] bValArray = bVal.split("");

            for (String s : aValArray) {
                for (int index = 0; index < aValArray.length; index++) {
                    if (bValArray[index].equals(s)) { // checking whether the index match or not
                        if ((s.indexOf(s) % 2 == 0 && index % 2 == 0) || // checking even values
                                (s.indexOf(s) % 2 != 0 && index % 2 != 0)) {
                            result[i] = false;
                        } else if ((s.indexOf(s) % 2 == 0 && index % 2 != 0)
                                || (s.indexOf(s) % 2 != 0 && index % 2 == 0)) {
                            result[i] = true;
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }

    //main Method
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine().trim());
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLine();
        }

        int m = Integer.parseInt(in.nextLine().trim());
        String[] b = new String[m];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextLine();
        }

        // call twins function
        boolean[] results = twins(a, b);

        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i] ? "Yes" : "No");
        }
    }
}