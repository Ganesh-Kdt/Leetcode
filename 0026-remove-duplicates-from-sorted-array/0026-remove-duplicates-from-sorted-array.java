class Solution {
    public int removeDuplicates(int[] nums) {
        int counter=0;
        int j=1,i=0;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                counter++;
                i++;
            }
            j++;
        }
        return counter+1;
    }    
}