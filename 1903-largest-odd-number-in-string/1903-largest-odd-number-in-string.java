class Solution {
    public String largestOddNumber(String num) {
        int index=-1;
        for(int i=num.length()-1;i>=0;i--){
            if(Integer.parseInt(String.valueOf(num.charAt(i)))%2!=0){
                return num.substring(0,i+1); 
            }
        }
        return "";
    }
}