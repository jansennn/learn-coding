import java.util.*;

class TwinStrings{

    public static String isTwin(String s, String t){
        if(s.length() != t.length()){
            return "No";
        }

        return checks(s,t,0)&&checks(s,t,1) ? "Yes" : "No";
    }

    public static boolean checks(String s, String t, int start){
        int count[] = new int[256];
        for(int i=start;i<s.length(); i+=2){
            char c = s.charAt(i);
            count[c]++;
        }

        for(int i=start;i<t.length(); i+=2){
            char c = t.charAt(i);
            if(count[c] == 0){
                return false;
            }

            count[c]--;
        }

        return true;
    }

    public static List<String> twins(List<String> a, List<String> b){
        List<String> ls = new ArrayList<String>();
        for(int i=0;i<a.size();i++){
            String hasil = isTwin(a.get(i), b.get(i));

            ls.add(hasil);
        }

        return ls;
    }


    public static void main(String args[]){
        List<String> result = new ArrayList<String>();
        List<String> a = new ArrayList<String>();
        List<String> b = new ArrayList<String>();

        a.add("cdab");
        a.add("dcba");
        a.add("abcd");
        b.add("abcd");
        b.add("abcd");
        b.add("abcdcd");

        result = twins(a,b);
        System.out.println(result);
    }
}