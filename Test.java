import java.util.*;

class Test{

    public static void main(String args[]){
        List<Integer> li = new ArrayList<Integer>();
        List<String> li2 = new ArrayList<String>();

        li.add(2);
        li.add(3);
        li.add(4);

        li2.add("Jakarta");
        li2.add("Medan");
        li2.add("Kita dekat aja");


        System.out.println(li2);

        li2.remove(1);

        System.out.println(li2);

    }
}
