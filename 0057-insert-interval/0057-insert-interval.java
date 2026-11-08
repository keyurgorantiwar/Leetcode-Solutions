class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> ans = new ArrayList<>();

        int i = 0;

        // Step 1: Add intervals before newInterval
        while(i < intervals.length && intervals[i][1] < newInterval[0]) {
            ans.add(intervals[i]);
            i++;
        }

        // Step 2: Merge overlapping intervals
        while(i < intervals.length && intervals[i][0] <= newInterval[1]) {

            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);

            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);

            i++;
        }

        ans.add(newInterval);

        // Step 3: Add remaining intervals
        while(i < intervals.length) {
            ans.add(intervals[i]);
            i++;
        }

        return ans.toArray(new int[ans.size()][]);
    }
}