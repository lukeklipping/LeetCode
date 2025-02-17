class Solution {

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[idx]){
                idx++;
                nums[idx] = nums[i];
            }
        }
        return idx +1;
    }
}