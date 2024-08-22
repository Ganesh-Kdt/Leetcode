class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char arr[]=s.toCharArray();
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]=='(' || arr[i]=='{' || arr[i]=='[')
                st.push(arr[i]);
            else{
                if(st.isEmpty())
                    return false;
                char bracket=st.pop();
                if((arr[i]==']' && bracket=='[') || (arr[i]==')' && bracket=='(') || (arr[i]=='}' && bracket=='{'))
                    continue;
                else
                    return false;
            }
        }
        if(st.isEmpty())
            return true;
        return false;
    }
}