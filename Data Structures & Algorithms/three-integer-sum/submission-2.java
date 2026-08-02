class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int length = nums.length;

        // Set<List<Integer>> set = new HashSet<>();

        // for(int i=0; i<length-2; i++) {
        //     for(int j=i+1; j<length-1; j++) {
        //         for(int k=j+1; k<length; k++) {
        //             int sum = nums[i] + nums[j] + nums[k];
        //             if(sum == 0) {
        //                 List<Integer> list = new ArrayList<>();
        //                 list.add(nums[i]);
        //                 list.add(nums[j]);
        //                 list.add(nums[k]);
        //                 Collections.sort(list);
        //                 set.add(list);
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(set);

        Set<List<Integer>> set = new HashSet<>();

        for(int i=0; i<length-1; i++) {
            Set<Integer> tempSet = new HashSet<>();
            for(int j=i+1; j<length; j++) {
                int target = -(nums[i] + nums[j]);
                if(tempSet.contains(target)) {
                    List<Integer> list = Arrays.asList(nums[i], nums[j], target);
                    Collections.sort(list);
                    set.add(list);
                }
                tempSet.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }
}
