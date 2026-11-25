class Solution {
    public void helper(int[] nums, int idx, List<List<Integer>> res, List<Integer> curr) {
        if (idx == nums.length) {
            res.add(curr);
            return;
        }

        helper(nums, idx + 1, res, new ArrayList<>(curr));
        curr.add(nums[idx]);
        helper(nums, idx + 1, res, curr);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        // res.add(new ArrayList());;
        // int n = nums.length;
        // for (int size = 1; size <= nums.length; size++) {
        //     for (int start = 0; start <= n - size; start++) {
        //         List<Integer> curr = new ArrayList();
        //         for (int i = start; i < start + size; i++) {
        //             curr.add(nums[i]);
        //         }
        //         res.add(curr);
        //     }
        // }
        helper(nums, 0, res, new ArrayList<>());
        return res;
    }
}
