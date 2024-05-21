class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0)
            return 0;
        int count=1;
        int maxCount=1;
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-2;i++){
            if(nums[i]+1==nums[i+1]){
                count++;
                if(maxCount<count){
                    maxCount++;
                }
            }
            else if(nums[i]==nums[i+1]){
                continue;
            }
            else{
                count=1;
            }
        }
        return maxCount;
    }
}