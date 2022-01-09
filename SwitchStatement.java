import java.util.*;

class SwitchStatement{
    public static void main(String[] args){
        int day = 2;
        String dayString;

        switch (day){
            case 1:
                dayString = "senin";
                break;
            case 2:
                dayString = "selasa";
                break;
            default:
                dayString = "invalid";
        }

        System.out.println(dayString);
    }
}