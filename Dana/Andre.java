public class Andre {

    public static void main(String[] args) {
//        System.out.println(howMany("he is a   good programmer, he-win 865 competitions, but sometimes he dont, what do you thing? All test-cases should pass, Done-done"));
//        System.out.println(howMany("asd a[sd 1asd ds."));
        System.out.println(howMany("    )}OJR 92ww. z )UPl 49e ]S g. zrZeNQ D. FoKp ]ow 1EceB 3ok }w ]CA? L 3LPbDN! trqJY 0sBmm. Nwn    "));
    }

    public static int howMany(String data){
        int result =0;
        data =  data.replaceAll("," , "")
                .replaceAll("\\.", "")
                .replaceAll("\\?", "")
                .replaceAll("-", "")
                .replaceAll("!", "");
        String [] arr = data.trim().split("\\s+");
        for (String a: arr) {
            if(a.matches("^[a-zA-Z]*$")) {
                System.out.println(a);
                result++;
            }
        }
        return result;
    }
}