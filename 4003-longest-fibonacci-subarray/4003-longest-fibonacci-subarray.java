class Solution {
    public int longestSubarray(int[] nums) {
        long sum=0;
        int count=2;
        int max=0;
        for(int i=2;i<nums.length;i++){
            long a=nums[i-2];
            long b=nums[i-1];
            long c=a+b;
            if(c==nums[i]){
                count++;
            }
            else {
                max=Math.max(max,count);
                count=2;
            }
        }
        return Math.max(max,count);
    }
}