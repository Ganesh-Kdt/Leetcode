class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0,max=0;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]==1){
                sum++;
            }
            if(nums[i]==0 || i==nums.length-1){
                if(max<sum){
                    max=sum;
                }
                sum=0;
            }
        }
        return max;
    }
}