class Solution {
    public boolean hasDuplicate(int[] nums) {
        // int length = nums.length;

        // boolean flag = false;

        // for(int i=0; i<length-1; i++){
        //     for(int j=i+1; j<length; j++) {
        //         if(nums[i] == nums[j]) {
        //             flag = true;
        //             break;
        //         }
        //     }
        //     if(flag) break;
        // }
        // return flag;

        // Set<Integer> set = new HashSet<>();

        // for(int n : nums) {
        //     if(set.contains(n)) return true;
        //     else set.add(n);
        // }
        // return false;

        Arrays.sort(nums);

        int left = 0, right = 1;
        while(right < nums.length) {
            if(nums[left] == nums[right]) return true;
            left++;
            right++;
        }

        return false;
    }
}