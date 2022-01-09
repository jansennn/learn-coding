import java.util.*;
import java.time.*;

class KJavaDateTime{

    public static String getDay(String day, String month, String year){
        int d = Integer.parseInt(day);
        int m = Integer.parseInt(month);
        int y = Integer.parseInt(year);

        LocalDate ld = LocalDate.of(y,m,d);
        return ld.getDayOfWeek().name();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String date = sc.nextLine();
        String[] d = date.split(" ");

        String hasil = getDay(d[0], d[1], d[2]);
        System.out.println(hasil);
    }
}