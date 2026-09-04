class Solution {
    public int calcNext(int[] nums, int curr) {
        return (curr + nums[curr] % nums.length + nums.length) % nums.length;
    }

    public boolean circularArrayLoop(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            Set<Integer> set = new HashSet<>();

            int curr = i;                 // FIX 1
            set.add(curr);

            boolean isPos = nums[i] > 0;

            while (true) {
                int next = calcNext(nums, curr);

                // Cannot change direction
                if (isPos && nums[next] < 0) {
                    break;
                }

                if (!isPos && nums[next] > 0) {
                    break;
                }

                // Found a cycle
                if (set.contains(next)) {
                    if (next != curr) {
                        return true;
                    } else {
                        break;
                    }
                }

                set.add(next);             // FIX 2
                curr = next;
            }
        }

        return false;
    }
}
