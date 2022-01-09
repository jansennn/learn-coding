import java.util.*;

class LeftRotation{

    public static List<Integer> rofLeft(List<Integer> a, int d){
        for(int i=0;i<d;i++){
            int index_0 = a.get(0);
            for(int j=a.size()-2;j<=0;j--){
                if(j == 0){
                    a.set(a.size()-1, index_0);
                    a.set(j, a.get(j+1));
                    break;
                }
                a.set(j, a.get(j+1));
            }
        }
        System.out.println(a.get(0));

        return a;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        for(int i = 0; i < n ; i++){
            int input = sc.nextInt();
            a.add(input);
        }

        b = rofLeft(a, d);

        for(int i = 0;i < b.size() ; i++){
            System.out.print(b.get(i) + " ");
        }

    }


    @Test

}