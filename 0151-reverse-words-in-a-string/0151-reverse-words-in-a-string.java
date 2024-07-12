class Solution {
    public String reverseWords(String s) {
        String rword="";
        String temp="";
        for(int i=0;i<=s.length()-1;i++){
             if(s.charAt(i)!=' '){
                 temp += s.charAt(i);
             }
            else{
                if(temp!=""){
                if(rword!="")
                    rword = temp + " " + rword;
                else
                    rword = temp;
                }
                temp="";
            }
        }
        if(temp!=""){
            if(rword!="")
                rword = temp + " " + rword;
            else
                rword = temp;
        }
        return rword;
    }
}