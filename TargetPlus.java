import java.util.*;

class TargetPlus{

    static void target(Integer[] arr, int target){
        for (int i =0;i<arr.length;i++){
            int temp = target - arr[i];
            boolean hasil = Arrays.asList(arr).contains(temp);
            if(hasil){
                System.out.println(arr[i] + ", " + temp);
                break;
            }
        }

    }
    static void targetUsingBinarySearch(int[] arr, int target){
        for (int i =0;i<arr.length;i++){
            int temp = target - arr[i];
            int hasil = Arrays.binarySearch(arr, temp);
            boolean result = hasil > 0 ? true : false;
            if(result){
                System.out.println(arr[i] + ", " + temp);
                break;
            }
        }

    }
    public static void main(String[] args){
        Integer arr[] = {10, 2, 3, 4, 5, 6};
        int[] arr1 = {10, 2, 3, 4, 5, 6};
        int target = 6;
        //target(arr, target);
        targetUsingBinarySearch(arr1, target);
    }
}