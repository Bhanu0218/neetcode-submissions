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

        // int[] countArray = new int[26];
        
        // for(char c : s.toCharArray()) {
        //     countArray[c - 'a']++;
        // }

        // for(char c : t.toCharArray()) {
            
        // }

        // for(int i=0; i<s_length; i++) {
        //     countArray[s.charAt(i) - 'a']++;
        //     countArray[t.charAt(i) - 'a']--;
        // }

        // for(int x : countArray) {
        //     if(x != 0) return false;
        // }
        // return true;

        HashMap<Character, Integer> s_hash = new HashMap<>();
        HashMap<Character, Integer> t_hash = new HashMap<>();

        for(int i=0; i<s_length; i++) {
            s_hash.put(s.charAt(i), s_hash.getOrDefault(s.charAt(i), 0) + 1);
            t_hash.put(t.charAt(i), t_hash.getOrDefault(t.charAt(i), 0) + 1);
        }

        return s_hash.equals(t_hash);
    }
}
