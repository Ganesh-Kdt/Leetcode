class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for(int i=0;i<=nums.length-1;i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
                if(mp.get(nums[i])>(int)(nums.length/2)){
                    return nums[i];
                }
            }
            else{
                mp.put(nums[i],mp.get(nums[i])+1);
                if(mp.get(nums[i])>(int)(nums.length/2)){
                    return nums[i];
                }
            }
        }
        return 0;
        // int number=0;
        // for(Map.Entry<Integer,Integer> e : mp.entrySet()){
        //     if(e.getValue()>(int)(nums.length/2)){
        //         number=e.getKey();
        //     }
        // }
        // return number;
    }
}