import java.util.*;

class Vectorr{
    public static void main(String[] args){
        Vector<Integer> vec = new Vector<Integer>();

        vec.add(1);
        vec.add(20);
        vec.add(10);

        System.out.println("size : " + vec.size());
        System.out.println("vector : " + vec);
        Collections.sort(vec);
        System.out.println("result sort : " + vec);
    }
}