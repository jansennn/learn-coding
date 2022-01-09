import java.util.*;

class ArrayListt{
    public static void main(String[] args){
        ArrayList<Integer> arrlistin = new ArrayList<Integer>();
        ArrayList<String> arrliststr = new ArrayList<String>();

        arrlistin.add(1);
        arrliststr.add("andreas");
        arrliststr.add("tampubolon");
        System.out.println("ArrayList Integer : " + arrlistin);
        System.out.println("ArrayList String : " + arrliststr);
        System.out.println("get data from arraylist 0 : "+ arrlistin.get(0));
        System.out.println("size of arraylist : "+ arrlistin.size());
    }
}