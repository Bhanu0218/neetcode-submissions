class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        // for(String s : strs) { // O(N)
        //     char[] charArray = s.toCharArray(); // O(K)
        //     Arrays.sort(charArray); // O(k log k)
        //     String sortedS = new String(charArray); // O(K)
        //     map.putIfAbsent(sortedS, new ArrayList<>()); // O(1)

        //     map.get(sortedS).add(s); // O(1)
        // }

        // // O(N) * O(K) + O(k log k) + O(K) = O(N * K log K);

        // return new ArrayList<>(map.values());

        for(String s : strs) {
            int[] count = new int[26];
            for(char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
