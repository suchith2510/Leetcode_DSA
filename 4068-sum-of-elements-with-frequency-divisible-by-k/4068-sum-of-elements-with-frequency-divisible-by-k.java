class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int[] arr=new int[101];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int i=0;i<101;i++){
            if(arr[i]%k==0){
                sum+=(arr[i])*i;
            }
        }
        return sum;
    }
}