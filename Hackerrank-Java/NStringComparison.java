import java.util.*;


class NStringComparison{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int i = 0;
        List<String> strarr = new ArrayList<String>();
        while(i + n <= str.length()){
            strarr.add(str.substring(i, i+ n));
            i++;
        }
        Collections.sort(strarr);
        System.out.println(strarr.get(0));
        System.out.println(strarr.get(strarr.size()-1));
    }
}