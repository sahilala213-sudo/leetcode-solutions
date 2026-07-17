class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int max = 0;
        for (int x : nums) max = Math.max(max, x);

        int[] freq = new int[max + 1];
        for (int x : nums) freq[x]++;

        long[] divisible = new long[max + 1];

        // count numbers divisible by d
        for (int d = 1; d <= max; d++) {
            for (int m = d; m <= max; m += d) {
                divisible[d] += freq[m];
            }
        }

        long[] exact = new long[max + 1];

        // pairs with gcd exactly d
        for (int d = max; d >= 1; d--) {
            long c = divisible[d];
            long pairs = c * (c - 1) / 2;

            for (int m = d * 2; m <= max; m += d) {
                pairs -= exact[m];
            }

            exact[d] = pairs;
        }

        // prefix frequencies of gcd values
        long[] prefix = new long[max + 1];
        for (int d = 1; d <= max; d++) {
            prefix[d] = prefix[d - 1] + exact[d];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            long k = queries[i] + 1; // 1-based position

            int l = 1, r = max;
            while (l < r) {
                int mid = l + (r - l) / 2;

                if (prefix[mid] >= k) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }

            ans[i] = l;
        }

        return ans;
    }
}