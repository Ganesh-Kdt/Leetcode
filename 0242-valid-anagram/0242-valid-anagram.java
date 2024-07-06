class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        else{
            HashMap<Character,Integer> mp1 = new HashMap<>();
            for(int i=0;i<=s.length()-1;i++){
                if(!mp1.containsKey(s.charAt(i))){
                    mp1.put(s.charAt(i),1);
                }
                else{
                    mp1.put(s.charAt(i),mp1.get(s.charAt(i))+1);
                }
            }
             HashMap<Character,Integer> mp2 = new HashMap<>();
            for(int i=0;i<=t.length()-1;i++){
                if(!mp2.containsKey(t.charAt(i))){
                    mp2.put(t.charAt(i),1);
                }
                else{
                    mp2.put(t.charAt(i),mp2.get(t.charAt(i))+1);
                }
            }
            
            for(int i=0;i<=s.length()-1;i++){
if(mp2.get(s.charAt(i))==null || !Integer.toString(mp1.get(s.charAt(i))).equals(Integer.toString(mp2.get(s.charAt(i)))))
                    return false;
            }
            return true;
            
        }
    }
}