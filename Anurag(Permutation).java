class Solution {
    public List<Integer> toList(int [] nums)
    {
        List<Integer> ans=new ArrayList<>();
        for(int i: nums)
        {
            ans.add(i);
        }
        return ans;
    }
    public void swap(int i,int j,int[] nums)
    {
       
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
     public void helper(List<List<Integer>> list,int[ ]nums,int l)
     {
         if(l==nums.length)
         {
           list.add(toList(nums));
         }
         for(int i=l;i<nums.length;i++)
         {
             swap(i,l,nums);
             helper(list,nums,l+1 );
             swap(i,l,nums);

         }
     }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        int l=0;
        helper(list,nums,0);
        return list;
        
        
    }
