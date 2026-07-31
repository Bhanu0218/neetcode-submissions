class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // list.sort((a, b) -> b.getValue() - a.getValue());

        // int[] resultArr = new int[k];

        // for(int i=0; i<k; i++) {
        //     resultArr[i] = list.get(i).getKey();
        // }
        // return resultArr;

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(entry);

            if(pq.size() > k) {
                pq.poll();
            }
        }

        int[] resultArr = new int[k];
        for(int i=0; i<k; i++) {
            resultArr[i] = pq.poll().getKey();
        }
        return resultArr;
    } 
}
