class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]) == 0? b[1] - a[1]: a[0] - b[0]);
        List<int[]> res = new ArrayList();
        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] prev = res.get(res.size() - 1);
            int[] curr = intervals[i];
            if (prev[1] >= curr[1]) continue;
            else if (prev[1] < curr[0]) res.add(curr);
            else prev[1] = Math.max(prev[1], curr[1]);
        }

        return res.toArray(new int[0][]);
    }
}
