class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos[] = new int[nums.length/2];
        int neg[] = new int[nums.length/2];
        int index=0,posIndex=0,negIndex=0;
        while(index<nums.length){
            if(nums[index]>0){
                pos[posIndex]=nums[index];
                posIndex++;
            }
            if(nums[index]<0){
                neg[negIndex]=nums[index];
                negIndex++;
            }
            index++;
        }
        
        index=0;
        for(int i=0;i<pos.length;i++){
            nums[index]=pos[i];
            nums[index+1]=neg[i];
            index=index+2;
        }
        return nums;
    }
}