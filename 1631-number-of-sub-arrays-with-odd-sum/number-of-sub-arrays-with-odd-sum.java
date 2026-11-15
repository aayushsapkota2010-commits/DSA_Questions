class Solution {
    public int numOfSubarrays(int[] arr) {
         int mod = 1000000007;
       long count=0;
       int sum=0;
       long odd=0;
       long even=1;
       
        for(int num:arr)
        {
            sum=sum+num;

                if(sum%2!=0)
                {
                   count=count+even;
                   odd++;
                }
                else{
                    count=count+odd;
                    even++;
                }
                count%=mod;
            }
        
        return (int) count;
        
    }
}