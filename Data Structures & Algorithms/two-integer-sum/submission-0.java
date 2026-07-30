class Solution {
    public int[] twoSum(int[] nums, int target) {

        int length = nums.length;
        int[] resultArr = new int[2];

        for(int i=0; i<length-1; i++) {
            for(int j=i+1; j<length; j++) {
                if(nums[i] + nums[j] == target) {
                    resultArr[0] = i;
                    resultArr[1] = j;
                    return resultArr;
                }
            }
        }
        return resultArr;
    }
}
