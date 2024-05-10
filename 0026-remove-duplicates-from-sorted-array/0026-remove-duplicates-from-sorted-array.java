class Solution {
    public int removeDuplicates(int[] nums) {
        int counter=0;
        for(int i=0;i<=nums.length-2;i++){
            if(nums[i]<nums[i+1]){
                counter++;
            }
            else{
                nums[i]=Integer.MAX_VALUE;
            }
        }
        counter++;
        Arrays.sort(nums);
        return counter;
    }
}