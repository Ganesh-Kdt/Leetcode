class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        for(int i=0;i<=s.length()-1;i++){
            char c = s.charAt(i);
            for(int j=1;j<=strs.length-1;j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=c){
                    return s.substring(0,i);
                }
            }
        }
        return s;
    }
}