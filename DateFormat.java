import java.util.*;

class DateFormat{
    public static void main(String[] args){
        String date = "10/09/1999";

        String[] d = date.split("/");

        String resutlDate = d[2]+"/"+d[1]+"/"+d[0];

        System.out.println(resutlDate);
    }
}
