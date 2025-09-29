class Solution {
    public int climbStairs(int n) {
        int ans=0;
       if(n==1){
        return 1;
       }
       else if(n==2){
        return 2;
       }
       else{
        int a=1;
        int b=2;
        for(int i=3;i<=n;i++){
            ans=a+b;
            a=b;
            b=ans;
        }
       }
       return ans;

    }
}