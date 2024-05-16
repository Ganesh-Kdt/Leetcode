class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> hashMap = new HashMap<>();
        int [] result = new int[2];
        for(int i=0;i<=nums.length-1;i++){
            int n = target-nums[i];
            if(hashMap.containsKey(n)){
                result[0]=i;
                result[1]=hashMap.get(n);
            }
            else{
                hashMap.put(nums[i],i);
            }
        }
        return result;
    }
}