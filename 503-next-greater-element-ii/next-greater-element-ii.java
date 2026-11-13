class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res=new int[nums.length];
        Arrays.fill(res,-1);

        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<nums.length;i++)
        {
            if(stack.isEmpty())
            {
                stack.push(i);
                continue;
            }
            int curr=nums[i];

            while(!stack.isEmpty() && curr>nums[stack.peek()])
            {
                int index=stack.pop();
                res[index]=curr;
            }
            stack.push(i);
        }


         for(int i=0;i<nums.length;i++)
        {
            if(stack.isEmpty())
            {
                stack.push(i);
            }
            int curr=nums[i];

            while(!stack.isEmpty() && curr>nums[stack.peek()])
            {
                int index=stack.pop();
                res[index]=curr;
            }
            stack.push(i);
        }
        return res;
        
    }
}