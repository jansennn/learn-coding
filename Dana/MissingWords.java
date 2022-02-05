import java.util.*;

class MissingWords{

    public static List<String> missingWords(String s, String t){
        List<String> list = new ArrayList<String>();
        String[] str_s = s.split(" ");
        String[] str_t = t.split(" ");
        List<String> list_s = new ArrayList<String>();
        List<String> list_t = new ArrayList<String>();


        for(int i=0;i<str_s.length;i++){
            list_s.add(str_s[i]);
        }
        for(int i=0;i<str_t.length;i++){
            list_t.add(str_t[i]);
        }

        for(int i = 0;i<list_s.size();i++){
            if(!list_t.contains(list_s.get(i))){
                list.add(list_s.get(i).toString());
            }
        }

        return list;
    }

    public static void main(String args[]){
        String s = "I am using hackerrank to improve programming";
        String t = "am hackerrank to improve";

        List<String> ls = missingWords(s, t);
        for(int i = 0; i<ls.size();i++){
            System.out.println(ls.get(i));
        }
    }
}