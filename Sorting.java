import java.util.*;

class Sorting{
    public static void main(String[] args){
        List<Integer> li = new ArrayList<Integer>();

        int[] ar;
        ar = new int[5];
        ar[0] ='v';
        ar[1] ='a';
        ar[2] ='z';
        ar[3] ='k';
        ar[4] ='b';

        System.out.println("Array sebelum sorting");
        for (int i =0;i<ar.length;i++){
            System.out.print(ar[i] + ", ");
        }
        Arrays.sort(ar);

        System.out.println("");
        System.out.println("Array setelah sorting");
        for (int i =0;i<ar.length;i++){
            System.out.print(ar[i] + ", ");
        }

//        li.add(2);
//        li.add(1);
//        li.add(5);
//
//        System.out.println(ar);
//        Collections.sort(li);
//
//        System.out.println(li);
    }
}