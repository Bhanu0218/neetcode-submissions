class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int length = numbers.length;

        for(int i=0; i<length-1; i++) {
            for(int j=i+1; j<length; j++) {
                if(numbers[i] + numbers[j] == target) {
                    if(i < j) {
                        return new int[]{++i, ++j};
                    }
                }
            }
        }
        return new int[0];
    }
}
