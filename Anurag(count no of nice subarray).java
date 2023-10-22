class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int  count=0;
        int dp[]=new int[n+1];
        int odd=0;
        for(int i=0;i<nums.length;i++)
        {
            dp[odd]++;
            if(nums[i]%2!=0)
            {
              odd++;
            }
             if(odd>=k)
             {
                 count+=dp[odd-k];
             }
            
        }
        return count;
        
    }
}
