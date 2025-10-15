class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0,r=nums.length-1,x=nums.length-1;
        int[] ans=new int[nums.length];
        while(l<=r){
            int left=nums[l];
            int right=nums[r];
            if(Math.abs(left)>Math.abs(right)){
                ans[x]=left*left;
                l++;
            }
            else{
                ans[x]=right*right;
                r--;
            }
            x--;
        }
        return ans;
    }
}