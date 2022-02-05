import java.util.*;

class SmallestString{

    static List<String> smallestString(List<String> a, int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                if((a.get(i) + a.get(j)).compareTo(a.get(j) + a.get(i)) > 0)
                {
                    String s = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, s);
                }
            }
        }

        return a;
    }


    public static void main(String args[]){
        List<String> substrings = new ArrayList<String>();
        List<String> result = new ArrayList<String>();

        substrings.add("c");
        substrings.add("cc");
        substrings.add("cca");
        substrings.add("cccb");


        result = smallestString(substrings, substrings.size());
        String str = "";
        for(int i=0;i<result.size();i++){
            str = str + result.get(i);
        }
        System.out.println(str);
    }
}