class Solution {
    public int triangularSum(int[] nums) {

        while(nums.length>1)
        {
            int[] sum=new int[nums.length-1];
        
        for(int i=0;i<nums.length-1;i++)
        {
            sum[i]=(nums[i]+nums[i+1])%10;    
        }
        nums=sum;

        }
        return nums[0];
    }
}