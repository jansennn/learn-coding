import java.util.*;

class  FunWithAnagram{

    static boolean isAnagram(char[] str1, char[] str2){
        if(str1.length != str2.length){
            return false;
        }

        Arrays.sort(str1);
        Arrays.sort(str2);

        for(int i=0;i<str1.length;i++)
            if(str1[i] != str2[i])
                return false;

        return true;
    }

    public static void main(String[] args){
        String str1 = "andreas";
        String str2 = "asandre1";
        boolean hasil;
        hasil = isAnagram(str1.toCharArray(), str2.toCharArray());

        if(hasil == true){
            System.out.println("anagram");
        }else{
            System.out.println("not anagram");
        }
    }
}