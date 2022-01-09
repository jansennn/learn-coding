import java.util.*;

class String1{
    //charat
    static char charat(String ar){
        return ar.charAt(0);
    }
    //length
    static int panjang(String ar){
        return ar.length();
    }
    //substring
    static String substr(String ar){
        return ar.substring(2,7);
    }
    //concat
    static String concatt(String ar){
        String marga = " Tampubolon";
        return ar.concat(marga);
    }
    //compare
    static int compare(String ar){
        String marga = "Andreas";
        return ar.compareTo(marga);
    }
    //contains
    static boolean containss(String ar){
        String nama ="andre";
        ar = ar.toLowerCase();
        return ar.contains(nama);
    }
    //indexof
    static int indexof(String ar){
        String name = "2";
        return ar.indexOf(name);
    }
    //replace
    static String replacee(String ar){
        return ar.replace("a", "b");
    }
    public static void main(String[] args){
        String str = "Andreas";
        //charat
        System.out.println("char at 0 : " + charat(str));
        //length
        System.out.println("panjang : " + panjang(str));
        //substring
        System.out.println("substring 2,7 :" + substr(str));
        //concat
        System.out.println("concat : " + concatt(str));
        //compareto
        System.out.println("compareto : " + compare(str));
        //contain
        System.out.println("contain Andreas -> andre : " + containss(str));
        //indexof
        System.out.println("indexof Andreas -> d : " + indexof(str));
        //trim
        System.out.println("trim : " + str.trim());
        //replace
        System.out.println("replace : " + replacee(str));
    }

}
