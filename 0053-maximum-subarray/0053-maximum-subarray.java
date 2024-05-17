class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,max=0,min=Integer.MIN_VALUE,count=0;
        for(int i=0;i<=nums.length-1;i++){
            sum += nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
            if(nums[i]<0){
                if(min<nums[i]){
                    min=nums[i];
                }
                count++; 
            }
        }
        if(count==nums.length)
            return min;
        else
            return max;
    }
}