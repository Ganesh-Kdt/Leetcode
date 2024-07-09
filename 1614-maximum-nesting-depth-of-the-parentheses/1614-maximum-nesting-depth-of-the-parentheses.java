class Solution {
    public int maxDepth(String s) {
        int count=0,max=0;
        for(int i=0;i<=s.length()-1;i++){
            if(count>max)
                max=count;
            if(s.charAt(i)=='(')
                count++;
            else if(s.charAt(i)==')')
                count--;
        }
        return max;
    }
}