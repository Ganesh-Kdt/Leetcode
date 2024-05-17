class Solution {
    public int majorityElement(int[] nums) {
       /*
       Using HashMap for storing frequency of each element
       HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for(int i=0;i<=nums.length-1;i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
            }
            else{
                mp.put(nums[i],mp.get(nums[i])+1);
            }
        }
        int number=0;
        for(Map.Entry<Integer,Integer> e : mp.entrySet()){
            if(e.getValue()>(int)(nums.length/2)){
                number=e.getKey();
            }
        }
        return number;
        */
        //Moore Voting Algorithm
        int ME=nums[0];
        int count=1;
        for(int i=1;i<=nums.length-1;i++){
            if(nums[i]==ME){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                ME=nums[i];
                count=1;
            }
        }
        return ME;
    }
}