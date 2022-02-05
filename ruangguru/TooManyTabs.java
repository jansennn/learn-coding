import java.util.*;


class TooManyTabs{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            String arr[] = str.split(" ");
            HashSet<String> hs = new HashSet<String>();
            for(int j=0;j<arr.length;j++){
                int a = -1;
                if(arr[j].indexOf(".co") >= 0){
                    a = arr[j].indexOf(".co");
                }
                if(arr[j].indexOf(".org") >= 0){
                    a = arr[j].indexOf(".org");
                }
                if(a < 0){
                    break;
                }
                String c = arr[j].substring(0, a);
                hs.add(c);
            }

            System.out.println(hs.size());
        }
    }
}