class Solution {
    public int lengthOfLongestSubstring(String s) {

        int maxLen = Integer.MIN_VALUE;

        int length = s.length();

        // for(int i=0; i<length; i++) {
        //     Set<Character> set = new HashSet<>();
        //     for(int j=i; j<length; j++) {
        //         char c = s.charAt(j);
        //         if(!set.contains(c)) {
        //             set.add(c);
        //         } else {
        //             break;
        //         }
        //     }
        //     maxLen = Math.max(maxLen, set.size());
        // }
        // return maxLen == Integer.MIN_VALUE ? 0 : maxLen;

        int left = 0;
        int right = 0;

        Set<Character> set = new HashSet<>();

        while(right < length) {
            char c = s.charAt(right);
            if(!set.contains(c)) {
                set.add(c);
                maxLen = Math.max(maxLen, right-left+1);
                right++;
            } else {
                char leftChar = s.charAt(left);
                while(set.contains(leftChar)) {
                    set.remove(leftChar);
                    left++;
                }
            }
        }
        return maxLen == Integer.MIN_VALUE ? 0 : maxLen;
    }
}
