import java.util.*;
class Solution
{
    long substrCount (String S, int K) {
        if(K<=0)
        return 0;
        else
            return CountofSubstring(S,K)-CountofSubstring(S,K-1);
    }
    	public int CountofSubstring(String s, int k){
	    HashMap<Character,Integer> mp = new HashMap<Character,Integer>();
	    int i=0,j=0,count=0;
	    while(j<s.length()){
            
            if(!mp.containsKey(s.charAt(j))){
                mp.put(s.charAt(j),1);
                // System.out.println("doesn not exist "+mp.toString());
            }
            else{
                mp.put(s.charAt(j),mp.get(s.charAt(j))+1);
                // System.out.println(mp.toString());
            }
            
            while(mp.size()>k){
                if(mp.containsKey(s.charAt(i)) && mp.get(s.charAt(i))==1)
                    mp.remove(s.charAt(i));
                else
                    mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                i++;    
            }
            
            if(mp.size()<=k)
                count=count+j-i+1;
                
            j++;
	    }
	    return count;
    	}
}
