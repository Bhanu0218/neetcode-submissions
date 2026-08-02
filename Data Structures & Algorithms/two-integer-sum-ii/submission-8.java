class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int length = numbers.length;

        // for(int i=0; i<length-1; i++) {
        //     for(int j=i+1; j<length; j++) {
        //         if(numbers[i] + numbers[j] == target) {
        //             if(i < j) {
        //                 return new int[]{++i, ++j};
        //             }
        //         }
        //     }
        // }
        // return new int[0];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<length; i++) {
            int temp = i+1;
            map.putIfAbsent(numbers[i], temp);
        }

        for(int i=0; i<length; i++) {
            int index2 = i+1;
            int diff = target - numbers[i];
            if(map.containsKey(diff) && map.get(diff) < index2) {
                int index1 = map.get(diff);
                if(index1 < index2) {
                    return new int[]{index1, index2};
                }
            }
        }
        return new int[0];
    }
}
