class Solution {
    public int longestConsecutive(int[] nums) {
        // int min=Integer.MAX_VALUE;
        // HashMap<Integer,Integer> mp = new HashMap<>();
        // for(int i=0;i<=nums.length-1;i++){
        //     if(nums[i]<min){
        //         min=nums[i];
        //     }
        //     if(!mp.containsKey(nums[i])){
        //         mp.put(nums[i],i);
        //     }
        // }       
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     if(mp.containsKey(min+i)){
        //         count++;
        //     }
        // }
        // return count;
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