class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0,high=nums.length-1,mid=0;
        int index=0;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
                index=high+1;
            }
            else{
                low=mid+1;
                index=low;
            }
        }
        return index;
    }
}