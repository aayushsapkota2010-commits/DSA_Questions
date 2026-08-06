import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2]; 

        for (int f = 0; f < nums.length - 2; f++) {
            int i = f + 1;
            int j = nums.length - 1;

            while (i < j) {
                int sum = nums[f] + nums[i] + nums[j];

                
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                if (sum < target) {
                    i++;
                } else if (sum > target) {
                    j--;
                } else {
                    
                    return sum;
                }
            }
        }
        return closestSum;
    }

    
  
}
