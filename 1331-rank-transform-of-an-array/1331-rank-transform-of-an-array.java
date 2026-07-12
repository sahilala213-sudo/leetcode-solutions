class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;

        // Copy array
        int[] sorted = arr.clone();

        // Sort the copy
        Arrays.sort(sorted);

        // Store value -> rank
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        for (int num : sorted) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        // Replace each element with its rank
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }
}