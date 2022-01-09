import java.util.*;

class Listt{
    public static void main(String[] args){
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        l2.add(1);
        l2.add(3);
        l2.add(4);

        l1.set(1, 4);
        Collections.sort(l1);
        System.out.println(l1);
        System.out.println(l1.indexOf(3100));
        System.out.println(l1.contains(2));
        System.out.println(l1.equals(l2));
    }
}