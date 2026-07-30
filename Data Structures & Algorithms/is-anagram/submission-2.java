class Solution {
    public boolean isAnagram(String s, String t) {

        int s_length = s.length();
        int t_length = t.length();

        if(s_length != t_length) return false;

        // char[] sortS = s.toCharArray();
        // char[] sortT = t.toCharArray();
        // Arrays.sort(sortS);
        // Arrays.sort(sortT);

        // return Arrays.equals(sortS, sortT);

        int[] countArray = new int[26];
        
        // for(char c : s.toCharArray()) {
        //     countArray[c - 'a']++;
        // }

        // for(char c : t.toCharArray()) {
            
        // }

        for(int i=0; i<s_length; i++) {
            countArray[s.charAt(i) - 'a']++;
            countArray[t.charAt(i) - 'a']--;
        }

        for(int x : countArray) {
            if(x != 0) return false;
        }
        return true;
    }
}
