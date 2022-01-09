import java.util.*;

class LStringIntroduction{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        /* panjang kedua string */
        System.out.println(A.length() + B.length());
        int l = A.length() > B.length() ? B.length() : A.length();

        String str = "";
        for(int i=0;i<l;i++){
            if(A.toLowerCase().charAt(i) > B.toLowerCase().charAt(i)){
                str = "Yes";
                break;
            }else if(A.toLowerCase().charAt(i) < B.toLowerCase().charAt(i)){
                str = "No";
                break;
            }
        }

        if(str == ""){
            if(A.length() > B.length()){
                str = "Yes";
            }else if(A.length() < B.length()){
                str = "No";
            }
        }
        System.out.println(str);
        System.out.println(A.toUpperCase().charAt(0) + A.substring(1,A.length()) + " " + B.toUpperCase().charAt(0) + B.substring(1,B.length()));
    }
}