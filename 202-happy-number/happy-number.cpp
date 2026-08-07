class Solution {
public:
int digSum(int n)
{
    int sum=0;
    int digit;
    while(n>0)
    {
        digit=n%10;
        n=n/10;
        sum=sum+digit*digit;

    }
    return sum;
}
    bool isHappy(int n) {
      int  slow=digSum(n);
        int fast=digSum(digSum(n));
        while(slow!=fast)
        {
            slow=digSum(slow);
            fast=digSum(digSum(fast));
        }

        
        return slow==1;
    }
};