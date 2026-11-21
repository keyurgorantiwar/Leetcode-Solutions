import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxSelectedElements(int[] nums) {
        // Sort the array so we can build consecutive sequences in increasing order
        Arrays.sort(nums);
        
        // dp.get(x) stores the max length of a consecutive sequence ending at value x
        Map<Integer, Integer> dp = new HashMap<>();
        int maxLen = 0;

        for (int num : nums) {
            // Option 1: Increment 'num' to 'num + 1'
            // Must be updated BEFORE dp.get(num) so we don't reuse the same element twice
            dp.put(num + 1, dp.getOrDefault(num, 0) + 1);
            
            // Option 2: Keep 'num' as is
            dp.put(num, dp.getOrDefault(num - 1, 0) + 1);

            // Track the overall maximum length found so far
            maxLen = Math.max(maxLen, Math.max(dp.get(num), dp.get(num + 1)));
        }

        return maxLen;
    }
}
