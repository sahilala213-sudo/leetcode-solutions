class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        int start = 0;
        int end = nums.length - 1;
        int p = nums.length - 1;

        while (start <= end) {
            int startSq = nums[start] * nums[start];
            int endSq = nums[end] * nums[end];

            if (startSq > endSq) {
                ans[p] = startSq;
                start++;
            } else {
                ans[p] = endSq;
                end--;
            }

            p--;
        }

        return ans;
    }
}