class Solution {
public:
    int findDuplicate(vector<int>& nums) {

        // Step 01: Sort nums
        sort(nums.begin(), nums.end());

        // Step 02: Iterate sorted array
        int duplicate=-1;
        for(int i=0;i<nums.size()-1;i++){
          	// Check duplicate number
            if(nums[i]==nums[i+1]){
                duplicate = nums[i];
                break;
            }
        }
        return duplicate;
    }
};
