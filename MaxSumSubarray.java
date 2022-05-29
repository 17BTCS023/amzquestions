package amzquestions;

public class MaxSumSubarray {
     // Kadanes algorithm
     // tc - O(n)
    public int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int current_sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            current_sum = Math.max(nums[i]+current_sum, nums[i]);
            max_sum = Math.max(current_sum, max_sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,-2,11};
        int maxSum = Integer.MIN_VALUE;
        System.out.println(array);
        // TC = O(n^2)
        // for(int i = 0; i < array.length; i++){
        //     int sum = 0;
        //     for(int j = i; j < array.length; j++ ){
        //        sum = sum + array[j];
        //        if(sum > maxSum){
        //            maxSum = sum;
        //        }
        //        sum = 0;
        //     }
        // }



        System.out.println(maxSum);
    }
}
