class Solution {
    public int addDigits(int num) {
        int sum=0;
        int rem=0;
        int result=0;

        if(num==0)
        {
            return 0;
        }

        if(num%9==0)
        {
            return 9;
        }
        else{
            return num%9;
        }
        
    }
}