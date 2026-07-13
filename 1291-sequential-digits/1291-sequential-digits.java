import java.util.*;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();

        for (int start = 1; start <= 9; start++) {

            int num = start;
            int nextDigit = start + 1;

            while (nextDigit <= 9) {
                num = num * 10 + nextDigit;

                if (num >= low && num <= high) {
                    ans.add(num);
                }

                nextDigit++;
            }
        }

        Collections.sort(ans);
        return ans;
    }
}