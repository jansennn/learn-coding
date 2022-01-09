import java.util.*;

class PJavaAnagram{

    static boolean isAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }

        char[] strA = a.toCharArray();
        char[] strB = b.toCharArray();

        Arrays.sort(strA);
        Arrays.sort(strB);

        for(int i = 0; i < a.length() ; i++){
            if(strA[i] != strB[i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        boolean hasil;

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        hasil = isAnagram(a.toLowerCase(), b.toLowerCase());

        if(hasil) {
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
}