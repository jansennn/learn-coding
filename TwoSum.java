import java.util.*;

class TwoSum{
    static int[] twoSum(int[] nums, int target){
        int x=-1,y=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    x=i;
                    y=j;
                }
            }
            if(x!=-1)
                break;
        }
        int[] ans = {x,y};
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {3,2,4};
        int target = 6;
        int[] ans = twoSum(nums, target);
        System.out.println("Hasilnya adalah : "+ ans[0] + ", " + ans[1]);


    }
}