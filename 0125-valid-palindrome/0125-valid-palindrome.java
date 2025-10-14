class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
}