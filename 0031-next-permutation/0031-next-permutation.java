class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-1;i>=1;i--){
            if(nums[i]>nums[i-1]){
                index = i-1;
                break;
            }
        }
        
        if(index==-1){
            Arrays.sort(nums);
            return;
        }
        int temp=0;
        for(int i=nums.length-1;i>index;i--){
            if(nums[i]>nums[index]){
                temp=nums[index];
                nums[index]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        
        Arrays.sort(nums,index+1,nums.length);
      
    }
}