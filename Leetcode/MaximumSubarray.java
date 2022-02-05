import java.util.*;

class MaximumSubarray{
    public static int maxSubArray(int[] nums) {
        int low = 0;
        int high = 0;
        int max = -100;

        if(nums.length == 1){
            return nums[0];
        }

        if(nums.length == 2){
            if(nums[0] < 0 && nums[1] < 0)
                return nums[0] > nums[1] ? nums[0] : nums[1];
            else if(nums[0] < 0)
                return nums[1];
            else if(nums[1] < 0)
                return nums[0];

        }



        for(int i=0;i<nums.length;i++){
            int count = 0;
            count = count + nums[i];
            if(count > max){
                max = count;
            }
            for(int j=i+1;j<nums.length;j++){
                count = count + nums[j];
                if(count > max){
                    max = count;
                }
            }
        }

        return max;
    }

    public static void main(String args[]){
        int nums[] = {-2,-3,-1};

        int result = maxSubArray(nums);
        System.out.println(result);
    }
}