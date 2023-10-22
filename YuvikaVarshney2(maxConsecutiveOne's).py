class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        n=len(nums)
        pos=0
        maxi=0
        for i in range(n):
            if(nums[i]==0):
                maxi=max(maxi,i-pos)
                pos=i+1
        maxi=max(maxi,n-pos)  
        return maxi    
