class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int sum =  0;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n;j++){
                for(int k = j+1; k<n; k++){
                    if(nums[i]<nums[j] && nums[k]<nums[j]){
                          sum = nums[i]+nums[j]+nums[k];
                        min = Math.min(sum,min);
                    }
                }
            }
        }
        if(min == Integer.MAX_VALUE){
            min = -1;
        }
       return min;
    }
}

// It is a Brutforce Approach 
// Time Complexity = O(N^3) & S.C = O(1)
