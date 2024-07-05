class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Character> st = new HashMap<Character,Character>();
        HashMap<Character,Character> ts = new HashMap<Character,Character>();
        for(int i=0;i<=s.length()-1;i++){
            if(!st.containsKey(s.charAt(i))){
                st.put(s.charAt(i),t.charAt(i));
            }    
            else{
                if(st.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }
        }
        for(int i=0;i<=s.length()-1;i++){
            if(!ts.containsKey(t.charAt(i))){
                ts.put(t.charAt(i),s.charAt(i));
            }    
            else{
                if(ts.get(t.charAt(i))!=s.charAt(i))
                    return false;
            }
        }
        return true;
    }
}