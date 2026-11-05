class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res=new int[temperatures.length];
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<temperatures.length;i++)
        {
            if(stack.isEmpty())
            {
                stack.push(i);
                continue;
            }
            int curr=temperatures[i];
            while(!stack.isEmpty() && curr>temperatures[stack.peek()])
            {
                int index=stack.pop();
                res[index]=i-index;
            }
            stack.push(i);
        }
      return res;
        
    }
}