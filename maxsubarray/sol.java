class Solution {
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
        int local_max = 0; // init local max
        int global_max = Integer.MIN_VALUE; // init 

        if (n==0){return 0;}
        
        if (n==1){return nums[0];}
        
        for (int i = 0; i < n; i++){
            
            local_max = Math.max(nums[i], nums[i] + local_max);
            if (local_max > global_max){
                global_max = local_max;
            }

        }

        return global_max;
        

    }
}
