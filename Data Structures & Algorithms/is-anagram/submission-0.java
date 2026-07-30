class Solution {
    public boolean isAnagram(String s, String t) {

        int s_length = s.length();
        int t_length = t.length();

        if(s_length != t_length) return false;

        char[] sortS = s.toCharArray();
        char[] sortT = t.toCharArray();
        Arrays.sort(sortS);
        Arrays.sort(sortT);

        return Arrays.equals(sortS, sortT);


    }
}
