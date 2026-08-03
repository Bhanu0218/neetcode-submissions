class Solution {
    public int characterReplacement(String s, int k) {

        int length = s.length();

        int maxLen = 0;

        // for(int i=0; i<length; i++) {
        //     Map<Character, Integer> map = new HashMap<>();
        //     for(int j=i; j<length; j++) {
        //         map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
        //         int maxFreq = Collections.max(map.values());
        //         int currLen = j-i+1;
        //         if(currLen - maxFreq <= k) {
        //             maxLen = Math.max(maxLen, currLen);
        //         }
        //     }
        // }
        // return maxLen;

        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;

        while(right < length) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            int currLen = right-left+1;
            int maxFreq = Collections.max(map.values());
            if(currLen - maxFreq <= k) {
                maxLen = Math.max(maxLen, currLen);
            }
            while(currLen - maxFreq > k) {
                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) - 1);
                left++;
                currLen = right - left + 1;
                maxFreq = Collections.max(map.values());
            }
            right++;
        }
        return maxLen;
    }
}
