class Solution {
    public int longestSubstring(String s, int k) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (freq[ch - 'a'] < k) {
                String left = s.substring(0, i);
                String right = s.substring(i + 1);

                return Math.max(longestSubstring(left, k),
                    longestSubstring(right, k));
            }
        }

        return s.length();
    }
}