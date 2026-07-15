class Solution {
    public int maxDiff(int num) {
        String s = String.valueOf(num);

        // Maximum number
        String maxStr = s;
        for (char c : s.toCharArray()) {
            if (c != '9') {
                maxStr = s.replace(c, '9');
                break;
            }
        }

        // Minimum number
        String minStr = s;

        if (s.charAt(0) != '1') {
            char ch = s.charAt(0);
            minStr = s.replace(ch, '1');
        } else {
            for (int i = 1; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch != '0' && ch != '1') {
                    minStr = s.replace(ch, '0');
                    break;
                }
            }
        }

        return Integer.parseInt(maxStr) - Integer.parseInt(minStr);
    }
}