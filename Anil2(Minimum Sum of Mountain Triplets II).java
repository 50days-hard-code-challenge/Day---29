class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int[] leftMin = new int[n];
        int[] rightMin = new int[n];
        
        // find the leftMin of every index
        int min = nums[0];
        for(int i=1;i<n;i++){
            leftMin[i] = min;
            min = Math.min(min,nums[i]);
        }
        
        // Find the rightMin of every index
        min = nums[n-1];
        for(int i = n-2; i>=0; i--){
            rightMin[i] = min;
            min = Math.min(min,nums[i]);
        }
        
        for(int j=1;j<n-1;j++){
            int i = leftMin[j];
            int k = rightMin[j];
            if(i<nums[j] && k<nums[j]){
                int sum = i + nums[j] + k;
                ans = Math.min(ans,sum);
            }
        }
        if(ans == Integer.MAX_VALUE){
            ans = -1;
        }
        return ans;
    }
}

// Time Complexity = O(N)
// Space Complexity = O(N)
