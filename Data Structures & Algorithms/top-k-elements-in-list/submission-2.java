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

        // PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        // for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     pq.offer(entry);

        //     if(pq.size() > k) {
        //         pq.poll();
        //     }
        // }

        // int[] resultArr = new int[k];
        // for(int i=0; i<k; i++) {
        //     resultArr[i] = pq.poll().getKey();
        // }
        // return resultArr;

        List<Integer>[] list = new ArrayList[nums.length+1];
        for(int i=0; i<list.length; i++) {
            list[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;

        for(int i=list.length - 1; i>0 && index < k; i--) {
            for(int n : list[i]) {
                res[index++] = n;
                if(index == k) {
                    return res;
                }
            }
        }
        return res;
    } 
}
