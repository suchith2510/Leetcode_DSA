class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str=new StringBuilder();
        int min=Math.min(word1.length(),word2.length());
        for(int i=0;i<min;i++){
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
        }
        while(min<word1.length()){
            str.append(word1.charAt(min));
            min++;
        }
        while(min<word2.length()){
            str.append(word2.charAt(min));
            min++;
        }
        return str.toString();
    }
}