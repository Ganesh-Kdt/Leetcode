class Solution {
    public String largestOddNumber(String num) {
        int index=-1;
        for(int i=num.length()-1;i>=0;i--){
            if(Integer.parseInt(String.valueOf(num.charAt(i)))%2!=0){
                index=i;
                break;
            }
        }
        String s="";
        for(int i=0;i<=index;i++){
            s=s+num.charAt(i);
        }
        return s;
    }
}