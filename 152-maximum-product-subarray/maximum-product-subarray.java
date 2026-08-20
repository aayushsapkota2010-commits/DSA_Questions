class Solution {
    public int maxProduct(int[] nums) {
        int worst=nums[0];
        int best=nums[0];
        int ans=nums[0];
        int n=nums.length;

        for(int i=1;i<n;i++)
        {
            int a=nums[i];
            int b=nums[i]*best;
            int c=nums[i]*worst;
             best=Math.max(a,Math.max(b,c));
             worst=Math.min(a,Math.min(b,c));
             ans=Math.max(ans,best);

        }
        return ans;
    }
}