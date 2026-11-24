class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int best = 0;

        for (int i = 0; i < n; i++) {
            long prod = 1, g = 0, l = 1;

            for (int j = i; j < n; j++) {
                long x = nums[j];
                prod = prod * x;
                g = gcd(g, x);
                l = lcm(l, x);

                if (prod == l * g) {
                    best = Math.max(best, j - i + 1);
                }
            }
        }
        return best;
    }

    long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}