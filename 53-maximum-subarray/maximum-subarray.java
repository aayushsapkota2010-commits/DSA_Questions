class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int best=nums[0];
        int ans=nums[0];
        for(int i=1;i<n;i++)
        {
            int a=nums[i];
            int b=nums[i]+best;
            best=Math.max(a,b);
            ans=Math.max(ans,best);


        }
        return ans;
        
    }
}