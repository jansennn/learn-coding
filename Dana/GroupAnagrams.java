import java.util.*;

class GroupAnagrams{

    public static int getGroupedAnagrams(List<String> words){
        int length = words.size();

        HashSet<String> set = new HashSet<String>();

        for(int i=0;i<=length-1;i++){
            char a[] = words.get(i).toCharArray();
            Arrays.sort(a);
            String strA = new String(a);

            set.add(strA);
        }
        System.out.println(set);

        return set.size();
    }

    public static void main(String []args){
        List<String> words = new ArrayList<String>();

        words.add("cat");
        words.add("listen");
        words.add("silent");
        words.add("kitten");
        words.add("salient");

        int hasil = getGroupedAnagrams(words);

        System.out.println(hasil);
    }
}