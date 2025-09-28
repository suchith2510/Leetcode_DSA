class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int res=0;
        while(temp>0){
            int temp1=temp%10;
            res=res*10+temp1;
            temp/=10;
        }
        return (res==x)?true:false;
    }
}