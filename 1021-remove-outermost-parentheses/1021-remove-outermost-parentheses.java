class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int c=0;
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)=='('){
                if(c>0)
                    sb.append("(");
                c++;
            }
            else if(s.charAt(i)==')'){
                c--;
                if(c>0)
                    sb.append(")");
            }
        }
        return sb.toString();
    }
}