import java.util.*;

class CountBetween{

    public static List<Integer> countBetween(List<Integer> arr, List<Integer> low, List<Integer> high){
        List<Integer> result = new ArrayList<Integer>();
        int count_low = 0;
        int count_high = 0;

        /* Low */
        for(int i=0;i<arr.size();i++){
            if(low.get(0) <= arr.get(i) && arr.get(i) <= low.get(1)){
                count_low++;
            }
        }

        /* High */
        for(int i=0;i<arr.size();i++){
            if(high.get(0) <= arr.get(i) && arr.get(i) <= high.get(1)){
                count_high++;
            }
        }

        result.add(count_low);
        result.add(count_high);

        return result;
    }

    public static void main(String args[]){
        List<Integer> arr = new ArrayList<Integer>();
        List<Integer> low = new ArrayList<Integer>();
        List<Integer> high = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();

        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        low.add(0);
        low.add(2);

        high.add(2);
        high.add(4);

        result = countBetween(arr, low, high);

        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }
}