class Solution {
    public void rotate(int[] nums, int k) {
        int newk=k%nums.length;
        int index=nums.length-newk;
        int j=0;
        int newArr[] = new int[newk];
        if(nums.length<=1){
            return;
        }
        while(index<=nums.length-1){
            newArr[j]=nums[index];
            index++;
            j++;
        }
        
        for(int i=nums.length-1-newk;i>=0;i--){
            nums[i+newk]=nums[i];
        }
        
        for(int i=0;i<newk;i++){
            nums[i]=newArr[i];
        }
        
    }
}