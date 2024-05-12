class Solution {
    public int missingNumber(int[] nums) {
        int sum1=0,sum2=0;
        for(int i=0;i<=nums.length-1;i++){
            sum1=sum1+nums[i];
        }
        for(int i=0;i<=nums.length;i++){
            sum2=sum2+i;
        }
        return sum2-sum1;
    }
}