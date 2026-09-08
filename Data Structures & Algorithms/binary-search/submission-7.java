class Solution {
    public int search(int[] nums, int target) {
        int length = nums.length;

        // for(int i=0; i<length; i++) {
        //     if(nums[i] == target) {
        //         return i;
        //     }
        // }

        // return -1;

        int left = 0, right = length - 1;

        while(left <= right) {
            int mid = left + ((right - left) / 2);

            if(nums[mid] == target) {
                return mid;
            } else if(target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
