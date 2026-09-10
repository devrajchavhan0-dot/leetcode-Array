class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increaseing=true;
        boolean decreasing=true;
        for(int i=0; i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                increaseing=false;
            }
            if(nums[i]<nums[i+1]){
                decreasing=false;
            }
        }
        return increaseing||decreasing;
        
    }
}