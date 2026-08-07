class Solution {
    public int lengthOfLIS(int[] nums) {
        Set<Integer> st=new TreeSet<>();
        for(int x:nums) st.add(x);
        int[] nums2=new int[st.size()];
        int i=0;
        for(int x: st){
            nums2[i]=x;
            i++;
        }
        int n=nums.length;
        int m=nums2.length;
        int[][] dp=new int[n+1][m+1];
        for(i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(nums[i]==nums2[j]){
                    dp[i][j]=1+dp[i+1][j+1];
                }
                else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        
        }
        return dp[0][0];
    }
}