class Solution {
    public String largestOddNumber(String num) {
        String arr[] = num.split("");
        int index=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(Integer.parseInt(arr[i])%2!=0){
                index=i;
                break;
            }
        }
        String s="";
        for(int i=0;i<=index;i++){
            s=s+arr[i];
        }
        return s;
    }
}