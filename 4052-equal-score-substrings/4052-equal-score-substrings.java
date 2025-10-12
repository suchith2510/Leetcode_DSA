class Solution {
    public boolean scoreBalance(String s) {
        int sum1=0,sum2=0;
        for(int i=0;i<s.length();i++){
            sum1+=s.charAt(i)-'a'+1;
        }
        for(int i=0;i<s.length();i++){
            sum2+=s.charAt(i)-'a'+1;
            if(sum2==(sum1-sum2)) return true;
        }
        return false;
    }
}