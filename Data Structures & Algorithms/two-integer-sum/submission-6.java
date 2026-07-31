class Solution {
    public int[] twoSum(int[] nums, int target) {

        int length = nums.length;
        // int[] resultArr = new int[2];

        // for(int i=0; i<length-1; i++) {
        //     for(int j=i+1; j<length; j++) {
        //         if(nums[i] + nums[j] == target) {
        //             resultArr[0] = i;
        //             resultArr[1] = j;
        //             return resultArr;
        //         }
        //     }
        // }

        Map<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<length; i++) {
        //     map.put(nums[i], i);
        // }
        
        // for(int i=0; i<length; i++) {
        //     int diff = target - nums[i];
        //     if(map.containsKey(diff) && map.get(diff) != i) {
        //         return new int[] {i, map.get(diff)};
        //     }
        // }
        // return new int[0];

        for(int i=0; i<length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
