class Solution {
    public String frequencySort(String st) {
		int charArr[] = new int[127];
        for(int i=0;i<=st.length()-1;i++){
            charArr[st.charAt(i)-'0']++;
        }
        TreeMap<Integer,ArrayList<Character>> mp = new TreeMap<>();
        for(int i=0;i<=charArr.length-1;i++){
            if(!mp.containsKey(charArr[i])){
                ArrayList<Character> al = new ArrayList<Character>();
                al.add((char)(i+'0'));
                mp.put(charArr[i],al);
            }
            else{
                ArrayList<Character> al = mp.get(charArr[i]);
                al.add((char)(i+'0'));
                mp.put(charArr[i],al);
            }
            
        }
        
        StringBuilder s = new StringBuilder();
        for(int num:mp.keySet()){
            if(num==0)
            continue;
            ArrayList<Character> values = mp.get(num); 
            
            for(char c:values){
                for(int i=0;i<num;i++){
                s.append(c);
                }
            }
        }
        return s.reverse().toString();
        
    }
}