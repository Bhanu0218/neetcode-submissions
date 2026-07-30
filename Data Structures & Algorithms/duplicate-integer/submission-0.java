class Solution {
    public boolean hasDuplicate(int[] nums) {
        int length = nums.length;

        boolean flag = false;

        for(int i=0; i<length-1; i++){
            for(int j=i+1; j<length; j++) {
                if(nums[i] == nums[j]) {
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }
        return flag;
    }
}