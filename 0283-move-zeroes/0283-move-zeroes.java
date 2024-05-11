class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=1;
        if(nums.length<=1)
            return;
        while(j<nums.length){
            if(nums[i]==0 && nums[j]!=0){
                nums[i]=nums[j];
                nums[j]=0;
                i++;
            }
            else if(nums[i]!=0){
                 i++;   
            }
            j++;
        }
    }
}